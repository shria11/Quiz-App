package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView score_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        score_display = findViewById(R.id.score_display);

        Intent intent3 = getIntent();
        String score = intent3.getStringExtra("SCORE");
        score_display.setText(score);


    }

    public void gotoStart(View view) {
        Intent intent4 = new Intent(ScoreActivity.this, MainActivity.class);
        startActivity(intent4);
    }
}
