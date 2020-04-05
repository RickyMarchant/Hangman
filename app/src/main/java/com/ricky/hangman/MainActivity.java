package com.ricky.hangman;

//Hangman by Ricky
//Created by Ricky Marchant.
//March 28, 2020
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    private TextView title;
    private Spinner jokeTypeSelectSpinner;
    private Button submitButton;
    private TextView setupBox;
    private RequestQueue mQueue;
    private TextView punchlineBox;
    private Button musicButton;
    public static MediaPlayer backgroundMusic;
    private Button openHangmanButton;
    private Button openCreditsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.title);
        //title animation
        YoYo.with(Techniques.FadeIn).duration(4000).playOn(title);
        addListenerOnButton();
        mQueue = Volley.newRequestQueue(this);
        musicButton = findViewById(R.id.musicButton);
        jokeTypeSelectSpinner = findViewById(R.id.jokeSpinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.possibleSelects, R.layout.color_spinner_layout);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        jokeTypeSelectSpinner.setAdapter(adapter);
        jokeTypeSelectSpinner.setOnItemSelectedListener(this);

        //change state of music button depending on status.
        if (backgroundMusic != null)
        {
            if (backgroundMusic.isPlaying())
            {
                musicButton.setText("MUSIC: ON");
                musicButton.setTextColor(Color.parseColor("#000000"));
            }

            else
            {
                musicButton.setText("MUSIC: OFF");
                musicButton.setTextColor(Color.parseColor("#808080"));
            }
        }
        openHangmanButton = findViewById(R.id.takeMeToHangmanButton);
        openHangmanButton.setOnClickListener(new View.OnClickListener()
    {
    @Override
    public void onClick(View v)
        {
            openHangmanPage();
        }
    });
        openCreditsButton = findViewById(R.id.takeMeToCredits);
        openCreditsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openCreditsPage();
            }
        });
    }

public void toggleMusic(View v)
{
    if (backgroundMusic== null)
    {
        backgroundMusic = MediaPlayer.create(this, R.raw.sappheiros_dawn);
    }

    if (backgroundMusic.isPlaying())
    {
        backgroundMusic.pause();
        musicButton.setText("MUSIC: OFF");
        musicButton.setTextColor(Color.parseColor("#808080"));
    }
    else
    {
        backgroundMusic.start();
        musicButton.setText("MUSIC: ON");
        musicButton.setTextColor(Color.parseColor("#000000"));
    }
}
    private void openCreditsPage()
    {
        Intent intent = new Intent(this, CreditsPage.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void openHangmanPage()
    {
        Intent intent =new Intent(this,Activity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void addListenerOnButton() {
        submitButton = findViewById(R.id.buttonSubmit);
        setupBox = findViewById(R.id.setup);
        punchlineBox = findViewById(R.id.punchlineBox);
        submitButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupBox.setText("");
                punchlineBox.setText("");
                //jsonParse();
                if (jokeTypeSelectSpinner.getSelectedItem().equals("Joke"))
                {
                    JokesData.retrieveGeneralJoke();

                }
                else if (jokeTypeSelectSpinner.getSelectedItem().equals("Programming Joke"))
                {
                    JokesData.retrieveProgrammingJoke();
                }
                else if (jokeTypeSelectSpinner.getSelectedItem().equals("Animal Fact"))
                {
                    JokesData.retrieveAnimalFact();
                }
                else if (jokeTypeSelectSpinner.getSelectedItem().equals("Dwight's Bear Fact"))
                {
                    System.out.println("GETTING HERE?");
                    JokesData.retrieveBearFact();
                }
                else
                {
                    setupBox.append("BROKEN LINK");
                    punchlineBox.append("GAH");
                }
                setupBox.append(JokesData.jokeSetup);
                punchlineBox.append(JokesData.jokePunchline);

                YoYo.with(Techniques.ZoomIn).duration(1700).playOn(setupBox);

                YoYo.with(Techniques.ZoomIn).duration(1700).playOn(punchlineBox);
                Toast.makeText(MainActivity.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : " + (jokeTypeSelectSpinner.getSelectedItem()),

                        Toast.LENGTH_SHORT).show();
            }
        }));

    }

    //String url = "https://gist.githubusercontent.com/RickyMarchant/a5dfce44f89986b7ad98b9b275cc77b3/raw/72fe436a0d622f654b6c655152e278f386cd4935/jokes_facts.json";
    public void jsonParse() {
        //Site has been down for over a week.
        //Use alternative method to get JSON.
        String url = "https://gist.githubusercontent.com/RickyMarchant/a5dfce44f89986b7ad98b9b275cc77b3/raw/72fe436a0d622f654b6c655152e278f386cd4935/jokes_facts.json";
       // String url = "https://api.myjson.com/bins/1f50j4";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    String jsonStringSelected = (String)jokeTypeSelectSpinner.getSelectedItem();
                    JSONArray json = response.getJSONArray(jsonStringSelected);
                    Random rand = new Random();
                    JSONObject joke = json.getJSONObject(rand.nextInt(json.length()));
                    String setup = joke.getString("setup");
                    String punchline = joke.getString("punchline");
                    setupBox.append(setup);
                    punchlineBox.append(punchline);

                    YoYo.with(Techniques.ZoomIn).duration(1700).playOn(setupBox);

                    YoYo.with(Techniques.ZoomIn).duration(1700).playOn(punchlineBox);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }

        });
        //mQueue.add(request);
        setupBox.append("myjson.com is down currently.");
        punchlineBox.append("Sorry, friend.");
        YoYo.with(Techniques.ZoomIn).duration(1700).playOn(setupBox);

        YoYo.with(Techniques.ZoomIn).duration(1700).playOn(punchlineBox);

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
    {
        Toast.makeText(this,adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }

}


