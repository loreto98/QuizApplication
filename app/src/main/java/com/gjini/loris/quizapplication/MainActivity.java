package com.gjini.loris.quizapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int score = 0;


    String rightAnswerQuestionFourth = "Hawking";
    String rightAnswerQuestionSixth = "8 minutes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
