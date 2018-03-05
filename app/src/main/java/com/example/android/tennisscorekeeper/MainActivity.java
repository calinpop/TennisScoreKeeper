package com.example.android.tennisscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int playerA = 00;
    int playerB = 00;
    int set1 = 0;
    int set2 = 0;
    int set3 = 0;
    int set1b = 0;
    int set2b = 0;
    int set3b = 0;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


      outState.putInt("playerA", playerA);
      outState.putInt("playerB", playerB);
      outState.putInt("set1", set1);
      outState.putInt("set2", set2);
      outState.putInt("set3", set3);
      outState.putInt("set1b", set1b);
      outState.putInt("set2b", set2b);
      outState.putInt("set3b", set3b);


    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);

      playerA = saveInstanceState.getInt("playerA");
      playerB = saveInstanceState.getInt("playerB");
      set1 = saveInstanceState.getInt("set1");
      set2 = saveInstanceState.getInt("set2");
      set3 = saveInstanceState.getInt("set3");
      set1b = saveInstanceState.getInt("set1b");
      set2b = saveInstanceState.getInt("set2b");
      set3b = saveInstanceState.getInt("set3b");

    }
    public void onResume () {
        super.onResume();
        displayset1(set1);
        displayset2(set2);
        displayset3(set3);
        displayForPlayerA(playerA);
        displayForPlayerB(playerB);
        displayset1b(set1b);
        displayset2b(set2b);
        displayset3b(set3b);



    }
    //add 1 for sets Player A

    public void set1(View view) {
        set1 = set1 + 1;
        displayset1(set1);
    }

    public void set2(View view) {
        set2 = set2 + 1;
        displayset2(set2);
    }

    public void set3(View view) {
        set3 = set3 + 1;
        displayset3(set3);
    }

    //ad 15 points for player A
    public void playerA(View view) {
        playerA = playerA + 15;
        displayForPlayerA(playerA);
    }


//add 1 for sets Player B

    public void set1b(View view) {
        set1b = set1b + 1;
        displayset1b(set1b);
    }

    public void set2b(View view) {
        set2b = set2b + 1;
        displayset2b(set2b);
    }

    public void set3b(View view) {
        set3b = set3b + 1;
        displayset3b(set3b);
    }


    //ad 15 Points for player B
    public void playerB(View view) {
        playerB = playerB + 15;
        displayForPlayerB(playerB);
    }


    // reset both team score for 0
    public void resetScore(View view) {
        playerB = 0;
        set1 = 0;
        set2 = 0;
        set3 = 0;
        set1b = 0;
        set2b = 0;
        set3b = 0;
        playerA = 0;
        displayset1(set1);
        displayset2(set2);
        displayset3(set3);
        displayForPlayerA(playerA);
        displayForPlayerB(playerB);
        displayset1b(set1b);
        displayset2b(set2b);
        displayset3b(set3b);

    }

    // Displays the given score for Team A.

    public void displayForPlayerA(int score) {
        TextView scoreView =  findViewById(R.id.playerA);
        scoreView.setText(String.valueOf(score));
    }

    //display for set1
    public void displayset1(int score) {
        TextView scoreView =  findViewById(R.id.set1);
        scoreView.setText(String.valueOf(score));
    }

    // display for set2
    public void displayset2(int score) {
        TextView scoreView =  findViewById(R.id.set2);
        scoreView.setText(String.valueOf(score));
    }

    // display for set3
    public void displayset3(int score) {
        TextView scoreView = findViewById(R.id.set3);
        scoreView.setText(String.valueOf(score));
    }

    //display for set1b
    public void displayset1b(int score) {
        TextView scoreView =  findViewById(R.id.set1b);
        scoreView.setText(String.valueOf(score));
    }
//display for set2b

    public void displayset2b(int score) {
        TextView scoreView =  findViewById(R.id.set2b);
        scoreView.setText(String.valueOf(score));
    }

    //display for set3b
    public void displayset3b(int score) {
        TextView scoreView =  findViewById(R.id.set3b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView =  findViewById(R.id.playerB);
        scoreView.setText(String.valueOf(score));
    }
}