package com.example.android.soccermatch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreGoalTeamA=0;
    int scoreGoalTeamB=0;
    int scoreFoulTeamA=0;
    int scoreFoulTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void addGoalForTeamA(View v){
        scoreGoalTeamA = scoreGoalTeamA + 1;
        displayGoalForTeamA(scoreGoalTeamA);
    }

    public void addFoulForTeamA(View v){
        scoreFoulTeamA = scoreFoulTeamA + 1;
        displayFoulForTeamA(scoreFoulTeamA);
    }


    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void addGoalForTeamB(View v){
        scoreGoalTeamB = scoreGoalTeamB + 1;
        displayGoalForTeamB(scoreGoalTeamB);
    }

    public void addFoulForTeamB(View v){
        scoreFoulTeamB = scoreFoulTeamB + 1;
        displayFoulForTeamB(scoreFoulTeamB);
    }

    public void resetScore(View v){
        scoreGoalTeamA=0;
        scoreGoalTeamB=0;
        scoreFoulTeamA=0;
        scoreFoulTeamB=0;
        displayGoalForTeamA(scoreGoalTeamA);
        displayGoalForTeamB(scoreGoalTeamB);
        displayFoulForTeamA(scoreFoulTeamA);
        displayFoulForTeamB(scoreFoulTeamB);
    }

}
