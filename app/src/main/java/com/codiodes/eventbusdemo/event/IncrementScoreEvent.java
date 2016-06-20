package com.codiodes.eventbusdemo.event;

/**
 * Created by Salman on 6/20/2016.
 */
public class IncrementScoreEvent {

    private int score;

    public IncrementScoreEvent(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
