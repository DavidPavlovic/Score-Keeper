package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;

    private int foulsA = 0;
    private int foulsB = 0;

    private int redA = 0;
    private int redB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method shows score for TEAM A
     * @param scoreA puts value in text view
     */
    public void showScoreA(int scoreA) {
        TextView scoreATextView = (TextView) findViewById(R.id.scoreA_text_view);
        scoreATextView.setText("" + scoreA);
    }

    /**
     * This method shows score for TEAM B
     * @param scoreB puts value in text view
     */

    public void showScoreB(int scoreB) {
        TextView scoreBTextView = (TextView) findViewById(R.id.scoreB_text_view);
        scoreBTextView.setText("" + scoreB);
    }

    /**
     * This method show fouls for TEAM A
     * @param numA puts value in text view
     */
    public void showFoulsA(int numA) {
        TextView showFoulsA = (TextView) findViewById(R.id.foulsA_text_view);
        showFoulsA.setText("" + numA);
    }

    /**
     * This method show fouls for TEAM B
     * @param numB puts value in text view
     */
    public void showFoulsB(int numB) {
        TextView showFoulsB = (TextView) findViewById(R.id.foulsB_text_view);
        showFoulsB.setText("" + numB);
    }

    /**
     * This method show red cards for TEAM A
     * @param num puts value in text view
     */
    public void showRedA(int num) {
        TextView redCardsATextView = (TextView) findViewById(R.id.redA_text_view);
        redCardsATextView.setText("" + num);
    }

    /**
     * This method show red cards for TEAM B
     * @param num puts value in text view
     */
    public void showRedB(int num) {
        TextView redCardsBTextView = (TextView) findViewById(R.id.redB_text_view);
        redCardsBTextView.setText("" + num);
    }


    /**
     * This method calls up showScoreA method on click
     */
    public void updateScoreA(View view) {
        scoreA += 1;
        showScoreA(scoreA);
    }

    /**
     * This method calls up showScoreB method on click
     */
    public void updateScoreB(View view) {
        scoreB += 1;
        showScoreB(scoreB);
    }

    /**
     * This method calls up showFoulsA method on click
     */
    public void updateFoulsA(View view) {
        foulsA += 1;
        showFoulsA(foulsA);
    }

    /**
     * This method calls up showFoulsB method on click
     */
    public void updateFoulsB(View view) {
        foulsB += 1;
        showFoulsB(foulsB);
    }

    /**
     * This method calls up showRedA method on click
     */
    public void updateRedA(View view) {
        redA += 1;
        showRedA(redA);
    }

    /**
     * This method calls up showRedB method on click
     */
    public void updateRedB(View view) {
        redB += 1;
        showRedB(redB);
    }

    /**
     * This method reset all atributes
     */
    public void resetScores(View view) {
        scoreA = 0;
        scoreB = 0;
        foulsA = 0;
        foulsB = 0;
        redA = 0;
        redB = 0;
        showScoreA(scoreA);
        showScoreB(scoreB);
        showFoulsA(foulsA);
        showFoulsB(foulsB);
        showRedA(redA);
        showRedB(redB);
    }
}
