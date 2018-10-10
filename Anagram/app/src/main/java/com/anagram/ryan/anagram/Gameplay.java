package com.anagram.ryan.anagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gameplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        configureHomeButton();
        configureNextButton();
    }



    private void configureHomeButton(){
        Button homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }

    private void configureNextButton () {

        Button nextButton = (Button) findViewById(R.id.nextButton2);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // TODO: You should be able to end the gameplay activity from within the results_page activity
                startActivityForResult(new Intent(Gameplay.this, ResultsPage.class), 1024);
            }


        });


    }

    // TODO: You should be able to end the gameplay activity from within the results_page activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //matches the result code passed from ChildActivity
        if(resultCode == 1024)
        {
            //kill self
            finish();
        }
    }
}
