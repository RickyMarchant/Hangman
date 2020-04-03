package com.ricky.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class LoseScreen extends AppCompatActivity
{
    private TextView loseResults;
    private Button restartHangmanButton;
    private Button jokeHomescreen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_screen);
        loseResults = findViewById(R.id.loseResults);
        loseResults.setText("D'OH! The answer was: \n" + Guess.password+"\nBetter luck next time.");
        YoYo.with(Techniques.BounceIn).duration(2300).playOn(loseResults);

        restartHangmanButton = findViewById(R.id.restartHangmanButton1);
        restartHangmanButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                restartHangman();
            }
        });
        jokeHomescreen = findViewById(R.id.jokesHomeScreen1);
        jokeHomescreen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                toJokeHomeScreen();
            }
        });

    }

    private void toJokeHomeScreen()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void restartHangman()
    {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}

