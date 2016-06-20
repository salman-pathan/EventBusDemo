package com.codiodes.eventbusdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (findViewById(R.id.score_fragment_container) != null && findViewById(R.id.increment_fragment_container) != null) {
            if (savedInstanceState == null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.increment_fragment_container, new IncrementFragment())
                        .add(R.id.score_fragment_container, new ScoreFragment())
                        .commit();
            }
        }
    }
}
