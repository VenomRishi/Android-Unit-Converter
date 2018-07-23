package com.example.acer.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConvertVolumeActivity extends AppCompatActivity {

    private Button convertMilliLitreButton;
    private Button convertCubicMeterButton;
    private EditText valueEditText;
    private TextView outputMilliLitreTextView;
    private TextView outputCubicMeterTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_volume);

        valueEditText=(EditText) findViewById(R.id.valueEditText);
        convertMilliLitreButton=(Button) findViewById(R.id.convertMilliLitreButton);
        convertCubicMeterButton=(Button) findViewById(R.id.convertCubicMeterButton);
        outputMilliLitreTextView=(TextView) findViewById(R.id.outputMilliLitreTextView);
        outputCubicMeterTextView=(TextView) findViewById(R.id.outputCubicMeterTextView);

        convertMilliLitreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueInString=valueEditText.getText().toString();
                double valueInInt=Integer.parseInt(valueInString);
                double total=valueInInt*1000;
                String output= String.valueOf(total);
                outputMilliLitreTextView.setText(output);
            }
        });
        convertCubicMeterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueInString=valueEditText.getText().toString();
                double valueInInt=Integer.parseInt(valueInString);
                double total=valueInInt*0.001;
                String output= String.valueOf(total);
                outputCubicMeterTextView.setText(output);
            }
        });
    }
}
