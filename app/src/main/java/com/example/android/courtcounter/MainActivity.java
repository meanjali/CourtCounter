package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
int score=0;
int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threePoints(View v) {
        score=score+3;
        displayForTeamA(score);
    }
    public void twoPoints(View v) {

        score=score+2;
        displayForTeamA(score);
    }
    public void freeThrow(View v) {

        score=score+1;
        displayForTeamA(score);
    }
    public void reset(View v) {

        score=0;
        displayForTeamA(score);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void threePointsB(View v) {
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void twoPointsB(View v) {

        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void freeThrowB(View v) {

        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void resetB(View V){
                scoreB=0;
        displayForTeamB(scoreB);
    }
public void checkList(View v){
        Intent i=new Intent(this,CheckListActivity.class);
        startActivity(i);
}
}
