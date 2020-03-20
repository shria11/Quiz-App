package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {

    private RadioGroup r1, r2, r3, r4, r5, r6, r7, r8, r9;
    private Button submitButton;
    private int score = 0;
    private EditText editText;
    private CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        submitButton = findViewById(R.id.submit_button);

//        TEXT ENTERING
        editText = findViewById(R.id.Question11Ans);

//        CHECKBOX
        cb1 = findViewById(R.id.correct1);
        cb2 = findViewById(R.id.correct2);
        cb3 = findViewById(R.id.incorrect1);
        cb4 = findViewById(R.id.incorrect2);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TEXTBOX ANSWER
                String answer = editText.getText().toString();
                if (answer.equalsIgnoreCase("54")) {
                    score += 1;
                }

                //CHECKBOX ANSWER
                if (cb1.isChecked() && cb2.isChecked() && !cb3.isChecked() && !cb4.isChecked()) {
                    score += 1;
                }

                Intent intent1 = new Intent(QuizActivity.this, ScoreActivity.class);
                intent1.putExtra("SCORE", score + "/10");
                startActivity(intent1);
            }
        });

        //  QUESTION 1 Radio Button
        r1 = findViewById(R.id.Question1);
        r1.clearCheck();
        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Question1Ans)
                    score += 1;
            }
        });


        //  QUESTION 2 Radio Button
        r2 = findViewById(R.id.Question2);
        r2.clearCheck();
        r2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Question2Ans)
                    score += 1;
            }
        });


        //  QUESTION 3 Radio Button
        r3 = findViewById(R.id.Question3);
        r3.clearCheck();
        r3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Question3Ans)
                    score += 1;
            }
        });


        //  QUESTION 4 Radio Button
        r4 = findViewById(R.id.Question4);
        r4.clearCheck();
        r4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Question4Ans)
                    score += 1;
            }
        });

        //  QUESTION 5 Radio Button
        r5 = findViewById(R.id.Question5);
        r5.clearCheck();
        r5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Question5Ans)
                    score += 1;
            }
        });

        //  QUESTION 6 Radio Button
        r6 = findViewById(R.id.Question6);
        r6.clearCheck();
        r6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Question6Ans)
                    score += 1;
            }
        });

        //  QUESTION 7 Radio Button
        r7 = findViewById(R.id.Question7);
        r7.clearCheck();
        r7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Question7Ans)
                    score += 1;
            }
        });

        //  QUESTION 8 Radio Button
        r8 = findViewById(R.id.Question8);
        r8.clearCheck();
        r8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Question8Ans)
                    score += 1;
            }
        });

        //  QUESTION 9 Radio Button
        r9 = findViewById(R.id.Question9);
        r9.clearCheck();
        r9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Question9Ans)
                    score += 1;
            }
        });
    }
}
