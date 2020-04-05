package com.ricky.hangman;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.util.AttributeSet;


public class AnswerResultsArea extends LinearLayout
{
    public TextView firstLetterOfAnswer, secondLetterOfAnswer, thirdLetterOfAnswer, fourthLetterOfAnswer, fifthLetterOfAnswer,sixthLetterOfAnswer, seventhLetterOfAnswer;
    private SparseArray < String> keyValues = new SparseArray<>();
    public AnswerResultsArea(Context context)
    {
        this(context, null, 0);
    }

    public AnswerResultsArea(Context context, AttributeSet attSet)
    {
        this(context, attSet, 0);
    }

    public AnswerResultsArea(Context context, AttributeSet attSet, int defStyleAttr)
    {
        super(context, attSet, defStyleAttr);
        init(context, attSet);
    }
    private void init (Context context, AttributeSet attributeSet)
    {
        LayoutInflater.from(context).inflate(R.layout.answer_area_box, this, true);

        firstLetterOfAnswer = findViewById(R.id.first_letter);
        secondLetterOfAnswer = findViewById(R.id.second_letter);
        thirdLetterOfAnswer = findViewById(R.id.third_letter);
        fourthLetterOfAnswer = findViewById(R.id.fourth_letter);
        fifthLetterOfAnswer = findViewById(R.id.fifth_letter);
        sixthLetterOfAnswer = findViewById(R.id.sixth_letter);
        seventhLetterOfAnswer = findViewById(R.id.seventh_letter);
    }

}