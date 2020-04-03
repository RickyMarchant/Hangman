package com.ricky.hangman;

//Created by Ricky Marchant.
//March 28, 2020
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Activity2 extends AppCompatActivity
{

    private Button homeScreenButton;
    private String password = Guess.setPassword();
    private char[] answerArray = new char[password.length()];
    public static List<Character> hintList = new ArrayList<>();
    private char guess = 'Z';
    private EditText editText;
    private MyKeyboard keyboard;
    public static AnswerResultsArea answerResultsArea;
    public static ImageView batteryLevel;
    public static ImageView knight;
    public static ImageView ogre;
    private ImageView platform;
    public static Button hintButton;
    public static ImageView checkmark1;
    public static ImageView checkmark2;
    private TextView cloud;
    private int hintsGiven = 0;
    public static Character revealThisLetter = 'z';


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        MyKeyboard.numberCorrect = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        hintList.clear();
        homeScreenButton = findViewById(R.id.backToHomeScreenButton);
        homeScreenButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openMainActivity();
            }
        });
        hintButton = findViewById(R.id.hintBox);
        checkmark1 = findViewById(R.id.checkmarksBox);
        checkmark2 = findViewById(R.id.checkmarksBox2);
        cloud = findViewById(R.id.clueBoxAnswer);
        cloud.setText(Guess.categoryOfAnswer);
        hintButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                revealHint();
            }
        });
        editText = findViewById(R.id.editText);
        keyboard = findViewById(R.id.keyboard);
        answerResultsArea = findViewById(R.id.answerResultsArea);
        initalizeLayout();

    }

    private void revealHint()
    {
        cloud.setBackgroundResource(0);
        if (hintsGiven == 0)
        {
            checkmark1.setImageResource(R.drawable.block_logo);
            cloud.setBackgroundResource(0);
        } else if (hintsGiven == 1)
        {
            checkmark2.setImageResource(R.drawable.block_logo);
            revealLetter();
            hintButton.setEnabled(false);

        }

        hintsGiven++;

    }


    private void revealLetter()
    {
        Random randomLetterFromHintList = new Random();
        revealThisLetter = hintList.get(randomLetterFromHintList.nextInt(hintList.size()));

        //REMOVING LETTERS FROM keyboard.xml
        if (revealThisLetter == 'A')
        {
            keyboard.letterA.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'B')
        {
            keyboard.letterB.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'C')
        {
            keyboard.letterC.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'D')
        {
            keyboard.letterD.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'E')
        {
            keyboard.letterE.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'F')
        {
            keyboard.letterF.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'G')
        {
            keyboard.letterG.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'H')
        {
            keyboard.letterH.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'I')
        {
            keyboard.letterI.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'J')
        {
            keyboard.letterJ.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'K')
        {
            keyboard.letterK.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'L')
        {
            keyboard.letterL.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'M')
        {
            keyboard.letterM.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'N')
        {
            keyboard.letterN.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'O')
        {
            keyboard.letterO.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'P')
        {
            keyboard.letterP.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'Q')
        {
            keyboard.letterQ.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'R')
        {
            keyboard.letterR.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'S')
        {
            keyboard.letterS.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'T')
        {
            keyboard.letterT.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'U')
        {
            keyboard.letterU.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'V')
        {
            keyboard.letterV.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'W')
        {
            keyboard.letterW.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'X')
        {
            keyboard.letterX.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'Y')
        {
            keyboard.letterY.setVisibility(View.GONE);
        }
        if (revealThisLetter == 'Z')
        {
            keyboard.letterZ.setVisibility(View.GONE);
        }


        System.out.println("HINT IS " + revealThisLetter);

        //Reveal the hidden letter
        if ((Guess.password.charAt(0)) == (revealThisLetter))
        {
            Activity2.answerResultsArea.firstLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
            MyKeyboard.numberCorrect++;
        }


        if ((Guess.password.charAt(1)) == (revealThisLetter))
        {
            Activity2.answerResultsArea.secondLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
            MyKeyboard.numberCorrect++;
        }

        if ((Guess.password.charAt(2)) == (revealThisLetter))
        {
            Activity2.answerResultsArea.thirdLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
            MyKeyboard.numberCorrect++;
        }

        if ((Guess.password.charAt(3)) == (revealThisLetter))
        {
            Activity2.answerResultsArea.fourthLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
            MyKeyboard.numberCorrect++;
        }


        if (Guess.password.length() > 4) {
            if ((Guess.password.charAt(4)) == (revealThisLetter))
            {
                Activity2.answerResultsArea.fifthLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
                MyKeyboard.numberCorrect++;
            }

        }

        if (Guess.password.length() > 5) {
            if ((Guess.password.charAt(5)) == (revealThisLetter))
            {
                Activity2.answerResultsArea.sixthLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
                MyKeyboard.numberCorrect++;
            }
        }

        if (Guess.password.length() > 6) {
            if ((Guess.password.charAt(6)) == (revealThisLetter))
            {
                Activity2.answerResultsArea.seventhLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
                MyKeyboard.numberCorrect++;
            }
        }
    }

    //Break down and initialize layout to match the string answer to char letters.
    private void initalizeLayout()
    {
        breakUpAnswerIntoArray();

        answerResultsArea.firstLetterOfAnswer.setText((Character.toString(answerArray[0])));
        answerResultsArea.secondLetterOfAnswer.setText((Character.toString(answerArray[1])));
        answerResultsArea.thirdLetterOfAnswer.setText((Character.toString(answerArray[2])));

        if (password.length() > 3)
            answerResultsArea.fourthLetterOfAnswer.setText((Character.toString(answerArray[3])));
        else
            answerResultsArea.fourthLetterOfAnswer.setVisibility(View.GONE);


        if (password.length() > 4)
            answerResultsArea.fifthLetterOfAnswer.setText((Character.toString(answerArray[4])));
        else
            answerResultsArea.fifthLetterOfAnswer.setVisibility(View.GONE);


        if (password.length() > 5)
            answerResultsArea.sixthLetterOfAnswer.setText((Character.toString(answerArray[5])));
        else
            answerResultsArea.sixthLetterOfAnswer.setVisibility(View.GONE);

        if (password.length() > 6)
            answerResultsArea.seventhLetterOfAnswer.setText((Character.toString(answerArray[6])));
        else
            answerResultsArea.seventhLetterOfAnswer.setVisibility(View.GONE);

        editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
        editText.setTextIsSelectable(true);
        InputConnection ic = editText.onCreateInputConnection(new EditorInfo());
        keyboard.setInputConnection((ic));
        guess = (Guess.userLetterGuess.charAt(0));
        System.out.println("guess" + guess);
        batteryLevel = findViewById(R.id.battery);
        ogre = findViewById(R.id.ogreImage);
        knight = findViewById(R.id.knightImage);
        platform = findViewById(R.id.platform);
        ImageView knight = findViewById(R.id.knightImage);
        knight.setBackgroundResource(R.drawable.knight_attack1);
        ImageView ogre = findViewById(R.id.ogreImage);
        ogre.setBackgroundResource(R.drawable.ogre_attack1);


    }

    private void breakUpAnswerIntoArray()
    {
        for (int i = 0; i < password.length(); i++) {
            answerArray[i] = password.charAt(i);
            hintList.add(password.charAt(i));
        }
    }

    private void openMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
