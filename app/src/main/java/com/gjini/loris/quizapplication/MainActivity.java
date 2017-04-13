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

    EditText userSixthQuestion;
    EditText userFourthQuestion;

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
        RadioButton correctFirstQuestion = (RadioButton) findViewById(R.id.radio1FirstQuestion);
        boolean iscorrectFirstQuestionChecked = correctFirstQuestion.isChecked();
        if(iscorrectFirstQuestionChecked)
            score+=1;
    }

    public void onRadioButtonSecondQuestion(View view) {
        RadioButton correctSecondQuestion = (RadioButton) findViewById(R.id.radio3SecondQuestion);
        boolean iscorrectSecondQuestionChecked = correctSecondQuestion.isChecked();
        if(iscorrectSecondQuestionChecked)
            score+=1;
    }

    public void onRadioButtonFifthQuestion(View view) {
        RadioButton correctFifthQuestion = (RadioButton) findViewById(R.id.radio3FifthQuestion);
        boolean iscorrectFifthQuestionChecked = correctFifthQuestion.isChecked();
        if(iscorrectFifthQuestionChecked)
            score+=1;
    }

    public void onCheckBoxThirdQuestion(View view) {
        CheckBox questionOne = (CheckBox) findViewById(R.id.CheckBox1ThirdQuestion);
        CheckBox questionTwo = (CheckBox) findViewById(R.id.CheckBox2ThirdQuestion);
        CheckBox questionThree = (CheckBox) findViewById(R.id.CheckBox3ThirdQuestion);
        CheckBox questionFour = (CheckBox) findViewById(R.id.CheckBox4ThirdQuestion);

        boolean isQuestionOneChecked = questionOne.isChecked();
        boolean isQuestionTwoChecked = questionTwo.isChecked();
        boolean isQuestionThreeChecked = questionThree.isChecked();
        boolean isQuestionFourChecked = questionFour.isChecked();

        if (isQuestionOneChecked && isQuestionTwoChecked && isQuestionThreeChecked && !isQuestionFourChecked)
            score++;
    }

    private void calculatePoints() {
        if (userFourthQuestion.getText().toString().toLowerCase().equals(rightAnswerQuestionFourth))
            score++;

        if (userSixthQuestion.getText().toString().toLowerCase().equals(rightAnswerQuestionSixth))
            score++;
    }

    public void checkAnswers(View view) {
        calculatePoints();
        onCheckBoxThirdQuestion(view);
        onRadioButtonFifthQuestion(view);
        onRadioButtonFirstQuestion(view);
        onRadioButtonSecondQuestion(view);
        display();
        score=0;
    }

    public void display() {
        Context context = getApplicationContext();
        CharSequence text = "You Made " + score + " points of 6" + "\nCongratulations";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}