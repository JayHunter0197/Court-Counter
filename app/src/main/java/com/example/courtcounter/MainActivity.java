package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int score=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void display3(View view)
    {
        score+=3;
        displayForTeamA(score);
    }

    public void display2(View view)
    {
        score+=2;
        displayForTeamA(score);
    }

    public void display(View view)
    {
        score+=1;
        displayForTeamA(score);
    }

    public void display3B(View view)
    {
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void display2B(View view)
    {
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void displayB(View view)
    {
        scoreB+=1;
        displayForTeamB(scoreB);
    }


    public void reset(View view)
    {
        score=0;
        scoreB=0;
        displayForTeamA(0);
        displayForTeamB(0);

    }


    public void displayForTeamA(int score)
    {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
