package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, result_text;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_text = findViewById(R.id.welcome_textView);
        result_text = findViewById(R.id.result_textView);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);

        // Adding the Functionalities

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get kilos from user input (convert to double)
                double kilos_entered = Double.parseDouble(editText.getText().toString());

                // convert to string
                // ""+convertToPounds(kilos_entered)
                result_text.setText(String.format("%s lb",convertToPounds(kilos_entered)));
            }
        });
    }

    public double convertToPounds(double kilos) {
        return kilos * 2.20462;
    }

}