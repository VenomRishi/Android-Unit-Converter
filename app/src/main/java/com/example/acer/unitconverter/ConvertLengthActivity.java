package com.example.acer.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConvertLengthActivity extends AppCompatActivity {

    private Button convertMeterButton;
    private Button convertCentiMeterButton;
    private EditText valueEditText;
    private TextView outputMeterTextView;
    private TextView outputCentiMeterTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_length);

        convertMeterButton=(Button) findViewById(R.id.convertMeterButton);
        convertCentiMeterButton=(Button) findViewById(R.id.convertCentimeterButton);
        valueEditText=(EditText) findViewById(R.id.valueEditText);
        outputMeterTextView=(TextView) findViewById(R.id.outputMeterTextView);
        outputCentiMeterTextView=(TextView) findViewById(R.id.outputCentimeterTextView);

        convertMeterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueInString=valueEditText.getText().toString();
                double valueInInt=Integer.parseInt(valueInString);
                double total=valueInInt*1000;
                String output= String.valueOf(total);
                outputMeterTextView.setText(output);
            }
        });
        convertCentiMeterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueInString=valueEditText.getText().toString();
                double valueInInt=Integer.parseInt(valueInString);
                double total=valueInInt*100000;
                String output= String.valueOf(total);
                outputCentiMeterTextView.setText(output);
            }
        });
    }
}
