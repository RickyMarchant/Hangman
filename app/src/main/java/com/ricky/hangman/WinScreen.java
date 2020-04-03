package com.ricky.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class WinScreen extends AppCompatActivity
{
    private TextView answer;

    private Button jokeHomescreen, restartHangmanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_screen);

        answer = findViewById(R.id.answerText);
        answer.setText("Congrats!\nThe winning word was:\n"+Guess.password);
        YoYo.with(Techniques.BounceIn).duration(2300).playOn(answer);
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
