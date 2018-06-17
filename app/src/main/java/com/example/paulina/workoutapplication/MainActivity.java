package com.example.paulina.workoutapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;
import java.util.TooManyListenersException;



public class MainActivity extends AppCompatActivity {

    Button btnExercises, btnSetting, btnNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNotes=(Button) findViewById(R.id.btnNotes);
        btnExercises = (Button) findViewById(R.id.btnExercises);
        btnSetting = (Button) findViewById(R.id.btnSetting);

        btnNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Notes.class);
                startActivity(intent);

            }
        });
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SettingPage.class);
                startActivity(intent);

            }
        });

        btnExercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, listExercise.class);
                startActivity(intent);
            }
        });

    }
}
