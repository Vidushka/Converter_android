package com.hsenid.coverter;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double distance;
    private String convertedDistence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertToMiles(View view) {
        EditText kilometers = (EditText) findViewById(R.id.txtKilometer);
        EditText miles = (EditText) findViewById(R.id.txtMile);

        if (!kilometers.getText().toString().matches("")) {
            distance = Double.valueOf(kilometers.getText().toString()) * 1.6;
            convertedDistence = String.valueOf(distance);
            miles.setText(convertedDistence);
        } else {
            kilometers.setHint("Type here");
            kilometers.setHintTextColor(Color.RED);
            Toast.makeText(getApplicationContext(), "No value entered !!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void convertToKm(View view) {
        EditText miles = (EditText) findViewById(R.id.txtMile);
        EditText kilometers = (EditText) findViewById(R.id.txtKilometer);

        if (!miles.getText().toString().matches("")) {
            distance = Double.valueOf(miles.getText().toString()) / 1.6;
            convertedDistence = String.valueOf(distance);
            kilometers.setText(convertedDistence);
        } else {
            miles.setHint("Type here");
            miles.setHintTextColor(Color.RED);
            Toast.makeText(getApplicationContext(), "No value entered !!!", Toast.LENGTH_SHORT).show();
        }
    }
}
