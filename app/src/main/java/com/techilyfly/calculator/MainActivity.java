package com.techilyfly.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Initializing Values:
    EditText editTextFirstValues, editTextSecondValues;
    TextView textViewResult;
    Button addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calling Views by ID:

        //Taking Input by User
        editTextFirstValues = findViewById(R.id.editTextNumberDecimalFirstValues);
        editTextSecondValues = findViewById(R.id.editTextNumberDecimalSecondValues);

        // Showing Results
        textViewResult = findViewById(R.id.textViewResult);

        // Asking for Operations:
        addition = findViewById(R.id.buttonAddition);
        subtraction = findViewById(R.id.buttonSubtraction);
        multiplication = findViewById(R.id.buttonMultiplication);
        division = findViewById(R.id.buttonDivision);

        // Performing Operation:

        // Addition
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float firstValues, secondValues, result;

                firstValues = Float.parseFloat(editTextFirstValues.getText().toString());
                secondValues = Float.parseFloat(editTextSecondValues.getText().toString());

                result = firstValues + secondValues;

                textViewResult.setText("Result: " + result);

            }
        });

        //Subtraction
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float firstValues, secondValues, result;

                firstValues = Float.parseFloat(editTextFirstValues.getText().toString());
                secondValues = Float.parseFloat(editTextSecondValues.getText().toString());

                result = firstValues - secondValues;

                textViewResult.setText("Result: " + result);
            }
        });

        //Multiplication
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float firstValues, secondValues, result;

                firstValues = Float.parseFloat(editTextFirstValues.getText().toString());
                secondValues = Float.parseFloat(editTextSecondValues.getText().toString());

                result = firstValues * secondValues;

                textViewResult.setText("Result: " + result);
            }
        });

        //Division
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float firstValues, secondValues, result;

                firstValues = Float.parseFloat(editTextFirstValues.getText().toString());
                secondValues = Float.parseFloat(editTextSecondValues.getText().toString());

                result = firstValues / secondValues;

                textViewResult.setText("Result: " + result);
            }
        });

    }
}