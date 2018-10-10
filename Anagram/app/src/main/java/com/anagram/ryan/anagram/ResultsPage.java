package com.anagram.ryan.anagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultsPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);

        configureHomeButton();
    }

    private void configureHomeButton() {
        Button homeButton = findViewById(R.id.homeButton2);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    // TODO: You should be able to end the gameplay activity from within the results_page activity
    // Basically, this activity should send a signal to it's parent activity, which tells it to terminate.
    @Override
    protected void onStop() {
        setResult(1024);
        super.onStop();
    }
    // TODO: You should be able to end the gameplay activity from within the results_page activity
    @Override
    protected void onDestroy() {
        setResult(1024);
        super.onDestroy();
    }
}
