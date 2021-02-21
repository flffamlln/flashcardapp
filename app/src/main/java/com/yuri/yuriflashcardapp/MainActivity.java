package com.yuri.yuriflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.option_one).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                findViewById(R.id.option_one).setBackgroundColor(getResources().getColor(R.color.red, null));
                findViewById(R.id.option_two).setBackgroundColor(getResources().getColor(R.color.green, null));
            }
        });

        findViewById(R.id.option_three).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                findViewById(R.id.option_three).setBackgroundColor(getResources().getColor(R.color.red, null));
                findViewById(R.id.option_two).setBackgroundColor(getResources().getColor(R.color.green, null));
            }
        });

        findViewById(R.id.option_two).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                findViewById(R.id.option_two).setBackgroundColor(getResources().getColor(R.color.green, null));
            }
        });
    }
}