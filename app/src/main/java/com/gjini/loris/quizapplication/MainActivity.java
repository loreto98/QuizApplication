package com.gjini.loris.quizapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    int points = 0;
    String rightAnswerQuestionFourth = "Hawking";
    String rightAnswerQuestionSixth = "8 minutes";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void RadioGroupFirstQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio1FirstQuestion:
                if (checked) {
                    points++;
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

    public void RadioGroupSecondQuestion(View view) {
        // Is the button now checked?
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
                if (checked){
                    points++;
                    break;
                }
            case R.id.radio4SecondQuestion:
                if (checked)
                    break;
        }
    }

    public void RadioGroupFifthQuestion(View view) {
        // Is the button now checked?
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
                if (checked){
                    points++;
                    break;
                }
            case R.id.radio4FifthQuestion:
                if (checked)
                    break;
        }
    }


    EditText answerQuestionSix = (EditText) findViewById(R.id.EditTextFourthQuestion);
    String userAnswer = answerQuestionSix.getText().toString();

        if (userAnswer.equals(rightAnswerQuestionFourth)) {
        points++;
    }


    EditText answerQuestionSix = (EditText) findViewById(R.id.EditTextSixthQuestion);
    String userAnswer = answerQuestionSix.getText().toString();

        if (userAnswer==(rightAnswerQuestionSixth) ) {
        points++;
    }

    public void CheckAnswer(){

    }
}
