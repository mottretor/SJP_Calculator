package com.mottretor.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView calculatorDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorDisplay = findViewById(R.id.calculator_display);
    }

    public void numericClick(View view){
        Button button = (Button) view;
        if(calculatorDisplay.getText().toString().equals("0")){
            calculatorDisplay.setText(button.getText().toString());
        }else{
            calculatorDisplay.setText(calculatorDisplay.getText().toString()+button.getText().toString());
        }

    }
}