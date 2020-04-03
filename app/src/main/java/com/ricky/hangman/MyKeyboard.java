package com.ricky.hangman;

//Created by Ricky Marchant.
//March 28, 2020
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.GridLayout;
import android.view.View;
import android.os.Handler;

import java.util.HashSet;


public class MyKeyboard extends GridLayout implements View.OnClickListener
{
    final Handler handler = new Handler();
    private SparseArray<String> keyValues = new SparseArray<>();
    public Button letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ,
            letterK, letterL, letterM, letterN, letterO, letterP, letterQ, letterR, letterS, letterT,
            letterU, letterV, letterW, letterX, letterY, letterZ;
    private InputConnection inputConnection;
    public static int numberCorrect;
    public static boolean allCorrect = false;
    public int backgroundColor = 0;
    public static boolean disableHintButton = false;

    //audio thingies:
    public int winApplause, correctDing, boo, wrongDing;
    private static SoundPool soundPool;


    //Constructors for the keyboard:
    public MyKeyboard(Context context)
    {
        this(context, null, 0);
    }

    public MyKeyboard(Context context, AttributeSet attSet)
    {
        this(context, attSet, 0);
    }

    public MyKeyboard(Context context, AttributeSet attSet, int defStyleAttr)
    {
        super(context, attSet, defStyleAttr);
        init(context, attSet);
    }

    private void init(Context context, AttributeSet attSet)
    {
        LayoutInflater.from(context).inflate(R.layout.keyboard, this, true);
        letterA = findViewById(R.id.letter_A);
        letterA.setOnClickListener(this);
        letterB = findViewById(R.id.letter_B);
        letterB.setOnClickListener(this);
        letterC = findViewById(R.id.letter_C);
        letterC.setOnClickListener(this);
        letterD = findViewById(R.id.letter_D);
        letterD.setOnClickListener(this);
        letterE = findViewById(R.id.letter_E);
        letterE.setOnClickListener(this);
        letterF = findViewById(R.id.letter_F);
        letterF.setOnClickListener(this);
        letterG = findViewById(R.id.letter_G);
        letterG.setOnClickListener(this);
        letterH = findViewById(R.id.letter_H);
        letterH.setOnClickListener(this);
        letterI = findViewById(R.id.letter_I);
        letterI.setOnClickListener(this);
        letterJ = findViewById(R.id.letter_J);
        letterJ.setOnClickListener(this);
        letterK = findViewById(R.id.letter_K);
        letterK.setOnClickListener(this);
        letterL = findViewById(R.id.letter_L);
        letterL.setOnClickListener(this);
        letterM = findViewById(R.id.letter_M);
        letterM.setOnClickListener(this);
        letterN = findViewById(R.id.letter_N);
        letterN.setOnClickListener(this);
        letterO = findViewById(R.id.letter_O);
        letterO.setOnClickListener(this);
        letterP = findViewById(R.id.letter_P);
        letterP.setOnClickListener(this);
        letterQ = findViewById(R.id.letter_Q);
        letterQ.setOnClickListener(this);
        letterR = findViewById(R.id.letter_R);
        letterR.setOnClickListener(this);
        letterS = findViewById(R.id.letter_S);
        letterS.setOnClickListener(this);
        letterT = findViewById(R.id.letter_T);
        letterT.setOnClickListener(this);
        letterU = findViewById(R.id.letter_U);
        letterU.setOnClickListener(this);
        letterV = findViewById(R.id.letter_V);
        letterV.setOnClickListener(this);
        letterW = findViewById(R.id.letter_W);
        letterW.setOnClickListener(this);
        letterX = findViewById(R.id.letter_X);
        letterX.setOnClickListener(this);
        letterY = findViewById(R.id.letter_Y);
        letterY.setOnClickListener(this);
        letterZ = findViewById(R.id.letter_Z);
        letterZ.setOnClickListener(this);

        keyValues.put(R.id.letter_A, "A");
        keyValues.put(R.id.letter_B, "B");
        keyValues.put(R.id.letter_C, "C");
        keyValues.put(R.id.letter_D, "D");
        keyValues.put(R.id.letter_E, "E");
        keyValues.put(R.id.letter_F, "F");
        keyValues.put(R.id.letter_G, "G");
        keyValues.put(R.id.letter_H, "H");
        keyValues.put(R.id.letter_I, "I");
        keyValues.put(R.id.letter_J, "J");
        keyValues.put(R.id.letter_K, "K");
        keyValues.put(R.id.letter_L, "L");
        keyValues.put(R.id.letter_M, "M");
        keyValues.put(R.id.letter_N, "N");
        keyValues.put(R.id.letter_O, "O");
        keyValues.put(R.id.letter_P, "P");
        keyValues.put(R.id.letter_Q, "Q");
        keyValues.put(R.id.letter_R, "R");
        keyValues.put(R.id.letter_S, "S");
        keyValues.put(R.id.letter_T, "T");
        keyValues.put(R.id.letter_U, "U");
        keyValues.put(R.id.letter_V, "V");
        keyValues.put(R.id.letter_W, "W");
        keyValues.put(R.id.letter_X, "X");
        keyValues.put(R.id.letter_Y, "Y");
        keyValues.put(R.id.letter_Z, "Z");

        createSounds();
    }

    private void createSounds()
    {
        AudioAttributes audioAtts = new AudioAttributes.Builder().
                setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION).setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        soundPool = new SoundPool.Builder().setMaxStreams(6).setAudioAttributes(audioAtts).build();
        winApplause = soundPool.load(getContext(), R.raw.cropped_applause, 1);
        correctDing = soundPool.load(getContext(), R.raw.correct_ding, 1);
        boo = soundPool.load(getContext(), R.raw.boo, 1);
        wrongDing = soundPool.load(getContext(), R.raw.wrong_letter, 1);
    }

    @Override
    public void onClick(View view)
    {
        if (inputConnection == null)
        {
            return;
        }

        if (TextUtils.isEmpty("Ggs"))
        {
            inputConnection.deleteSurroundingText(1, 0);
        } else {

            String value = keyValues.get(view.getId());
            inputConnection.commitText(value, 1);
            Guess.userLetterGuess = keyValues.get(view.getId());

            checkIfAnswerHasGuessedLetter();
            System.out.println("Guess.userLetterGuess" + Guess.userLetterGuess);
            System.out.println("Number COrrect" + numberCorrect);

            resetGuess();
            view.setVisibility(View.GONE);
            System.out.println("HINTLIST: "+ Activity2.hintList);

            //Convert hintLIst to Hashset to quickly remove duplicates.
            HashSet<Character> hintHashSet = new HashSet<Character>();
            for (int i =0 ; i<Activity2.hintList.size();i++ )
            {
                hintHashSet.add(Activity2.hintList.get(i));
            }

            //No hints for the user on last attempt!
            if (hintHashSet.size()==1)
            {
                Activity2.checkmark1.setImageResource(R.drawable.block_logo);
                Activity2.checkmark2.setImageResource(R.drawable.block_logo);
                Activity2.hintButton.setEnabled(false);
            }


            if (numberCorrect == Guess.password.length()) {
                youWinMethod();
            }
        }
    }

    public void youWinMethod()
    {
        allCorrect = true;
        System.out.println("You win bro");
        Activity2.knight.setBackgroundResource(R.drawable.knight_attack7);
        Activity2.ogre.setBackgroundResource(R.drawable.ogre_death03);
        numberCorrect = 0;
        soundPool.play(winApplause, 1, 1, 0, 0, 1);
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Activity2.ogre.setBackgroundResource(R.drawable.ogre_death06);
            }
        }, 1000);

        handler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = new Intent(getContext(), WinScreen.class);
                getContext().startActivity(intent);
            }
        }, 1000);
    }

    private void resetGuess()
    {
        inputConnection.deleteSurroundingText(1, 0);
    }

    //Reveal letter in password if guessed correctly.
    private void checkIfAnswerHasGuessedLetter()
    {
        Boolean letterInPassword = false;
        if ((Guess.password.charAt(0)) == (Guess.userLetterGuess).charAt(0))
        {
            Activity2.answerResultsArea.firstLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
            letterInPassword = true;
            Activity2.hintList.remove(new Character(Guess.password.charAt(0)));
            numberCorrect++;
        }
        if ((Guess.password.charAt(1)) == (Guess.userLetterGuess).charAt(0))
        {
            Activity2.answerResultsArea.secondLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
            letterInPassword = true;
            Activity2.hintList.remove(new Character(Guess.password.charAt(1)));
            numberCorrect++;
        }
        if ((Guess.password.charAt(2)) == (Guess.userLetterGuess).charAt(0))
        {
            Activity2.answerResultsArea.thirdLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
            letterInPassword = true;
            Activity2.hintList.remove(new Character(Guess.password.charAt(2)));
            numberCorrect++;
        }
        if ((Guess.password.charAt(3)) == (Guess.userLetterGuess).charAt(0))
        {
            Activity2.answerResultsArea.fourthLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
            letterInPassword = true;
            Activity2.hintList.remove(new Character(Guess.password.charAt(3)));
            numberCorrect++;
        }

        if (Guess.password.length() > 4)
        {
            if ((Guess.password.charAt(4)) == (Guess.userLetterGuess).charAt(0))
            {
                Activity2.answerResultsArea.fifthLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
                letterInPassword = true;
                Activity2.hintList.remove(new Character(Guess.password.charAt(4)));
                numberCorrect++;
            }
        }

        if (Guess.password.length() > 5)
        {
            if ((Guess.password.charAt(5)) == (Guess.userLetterGuess).charAt(0))
            {
                Activity2.answerResultsArea.sixthLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
                letterInPassword = true;
                Activity2.hintList.remove(new Character(Guess.password.charAt(5)));
                numberCorrect++;
            }
        }

        if (Guess.password.length() > 6)
        {
            if ((Guess.password.charAt(6)) == (Guess.userLetterGuess).charAt(0))
            {

                Activity2.answerResultsArea.seventhLetterOfAnswer.setBackgroundColor(Color.parseColor("white"));
                letterInPassword = true;
                Activity2.hintList.remove(new Character(Guess.password.charAt(6)));
                numberCorrect++;

            }
        }

        if (letterInPassword)
        {
            //numberCorrect++;

            switch (numberCorrect)
            {
                case 1:
                    Activity2.knight.setBackgroundResource(R.drawable.knight_attack1);
                    soundPool.play(correctDing, 1, 1, 0, 0, 1);
                    break;
                case 2:
                    Activity2.knight.setBackgroundResource(R.drawable.knight_attack2);
                    soundPool.play(correctDing, 1, 1, 0, 0, 1);
                    break;
                case 3:
                    Activity2.knight.setBackgroundResource(R.drawable.knight_attack3);
                    soundPool.play(correctDing, 1, 1, 0, 0, 1);
                    break;
                case 4:
                    Activity2.knight.setBackgroundResource(R.drawable.knight_attack4);
                    soundPool.play(correctDing, 1, 1, 0, 0, 1);
                    break;
                case 5:
                    Activity2.knight.setBackgroundResource(R.drawable.knight_attack5);
                    soundPool.play(correctDing, 1, 1, 0, 0, 1);
                    break;
                case 6:
                    Activity2.knight.setBackgroundResource(R.drawable.knight_attack6);
                    soundPool.play(correctDing, 1, 1, 0, 0, 1);
                    break;
            }
        }

        //GETTING THINGS WRONG!!!**
        if (letterInPassword == false)
        {
            backgroundColor++;
            if (backgroundColor == 1)
            {
                Activity2.batteryLevel.setBackgroundResource(R.drawable.battery80);
                Activity2.ogre.setBackgroundResource(R.drawable.ogre_attack2);
                soundPool.play(wrongDing, 1, 1, 0, 0, 1);
            }

            if (backgroundColor == 2)
            {
                Activity2.batteryLevel.setBackgroundResource(R.drawable.battery50);
                Activity2.ogre.setBackgroundResource(R.drawable.ogre_attack3);
                soundPool.play(wrongDing, 1, 1, 0, 0, 1);
            }

            if (backgroundColor == 3)
            {
                Activity2.batteryLevel.setBackgroundResource(R.drawable.battery20);
                Activity2.ogre.setBackgroundResource(R.drawable.ogre_attack4);


                soundPool.play(wrongDing, 1, 1, 0, 0, 1);
            }

            if (backgroundColor == 4)
            {
                Activity2.batteryLevel.setBackgroundResource(R.drawable.battery0);
                Activity2.ogre.setBackgroundResource(R.drawable.ogre_attack5);
                soundPool.play(wrongDing, 1, 1, 0, 0, 1);
            }

            if (backgroundColor == 5)
            {
                Activity2.ogre.setBackgroundResource(R.drawable.ogre_attack6);
                soundPool.play(boo, 1, 1, 0, 0, 1);
                Activity2.knight.setBackgroundResource(R.drawable.death4);
                handler.postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Activity2.knight.setBackgroundResource(R.drawable.death6);

                    }
                }, 1000);
                handler.postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Intent intent = new Intent(getContext(), LoseScreen.class);
                        getContext().startActivity(intent);
                    }
                }, 1000);
            }
        }
        letterInPassword = false;
    }

    public void setInputConnection(InputConnection ic)
    {
        inputConnection = ic;
    }
}
