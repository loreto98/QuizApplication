package com.gjini.loris.quizapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int totChecked = 0;

    EditText userSixthQuestion;
    EditText userFourthQuestion;

    int tempFourth = 0;
    int tempSixth = 0;

    String rightAnswerQuestionFourth = "Hawking";
    String rightAnswerQuestionSixth = "8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userFourthQuestion = (EditText) findViewById(R.id.EditTextFourthQuestion);
        userSixthQuestion = (EditText) findViewById(R.id.EditTextSixthQuestion);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
    }

    public void onRadioButtonFirstQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio1FirstQuestion:
                if (checked) {
                    score++;
                    break;
                }
            case R.id.radio2FirstQuestion:
                if (checked)
                    break;
            case R.id.radio3FirstQuestion:
                if (checked)
                    break;
            case R.id.radio4FirstQuestion:
                if (checked)
                    break;
        }
    }

    public void onRadioButtonSecondQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio1SecondQuestion:
                if (checked)
                    break;
            case R.id.radio2SecondQuestion:
                if (checked)
                    break;
            case R.id.radio3SecondQuestion:
                if (checked) {
                    score++;
                    break;
                }
            case R.id.radio4SecondQuestion:
                if (checked)
                    break;
        }
    }

    public void onRadioButtonFifthQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio1FifthQuestion:
                if (checked)
                    break;
            case R.id.radio2FifthQuestion:
                if (checked)
                    break;
            case R.id.radio3FifthQuestion:
                if (checked) {
                    score++;
                    break;
                }
            case R.id.radio4FifthQuestion:
                if (checked)
                    break;
        }
    }

    public void onCheckBoxThirdQuestion(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CheckBox1ThirdQuestion:
                if (checked) {
                    totChecked++;
                    break;
                } else {
                    totChecked = 0;
                    break;
                }
            case R.id.CheckBox2ThirdQuestion:
                if (checked) {
                    totChecked++;
                    break;
                } else {
                    totChecked = 0;
                    break;
                }
            case R.id.CheckBox3ThirdQuestion:
                if (checked) {
                    totChecked++;
                    break;
                } else {
                    totChecked = 0;
                    break;
                }
            case R.id.CheckBox4ThirdQuestion:
                if (checked) {
                    totChecked = 0;
                    break;
                } else
                    break;
        }
        if (totChecked == 3)
            score++;
    }

    private void calculatePoints() {
        if (userFourthQuestion.getText().toString().toLowerCase().equals(rightAnswerQuestionFourth)) {
            tempSixth = 1;
        } else {
            tempSixth = 0;
        }
        if (userSixthQuestion.getText().toString().toLowerCase().equals(rightAnswerQuestionSixth)) {
            tempSixth = 1;
        } else {
            tempSixth = 0;
        }
    }

    public void checkAnswers(View view) {
        calculatePoints();
        score = score + tempSixth + tempFourth;

        display();
    }

    public void display() {
        Context context = getApplicationContext();
        CharSequence text = "You Made " + score + " points of 6" + "\nCongratulations";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}