package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

                System.out.println("editText = " + editText.getText());

                String kilos = editText.getText().toString();
                
                if(!kilos.isEmpty()) {
                    // get kilos from user input (convert to double)
                    double kilos_entered = Double.parseDouble(kilos);

                    // convert to string
                    // ""+convertToPounds(kilos_entered)
                    // String.format("%s", value)
                    result_text.setText(""+convertToPounds(kilos_entered) + " lb");
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a valid weight unit", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public double convertToPounds(double kilos) {
        return new Double(kilos * 2.20462).shortValue();
    }

}