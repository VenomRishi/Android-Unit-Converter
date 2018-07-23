package com.example.acer.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConvertWeightActivity extends AppCompatActivity {

    private Button convertGramButton;
    private Button convertPoundButton;
    private EditText valueEditText;
    private TextView outputGramTextView;
    private TextView outputPoundTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_weight);

        valueEditText=(EditText) findViewById(R.id.valueEditText);
        convertGramButton=(Button) findViewById(R.id.convertGramButton);
        convertPoundButton=(Button) findViewById(R.id.convertPoundButton);
        outputGramTextView=(TextView) findViewById(R.id.outputGramTextView);
        outputPoundTextView=(TextView) findViewById(R.id.outputPoundTextView);


        convertPoundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueInString=valueEditText.getText().toString();
                double valueInInt=Integer.parseInt(valueInString);
                double total=valueInInt*2.20462;
                String output= String.valueOf(total);
                outputPoundTextView.setText(output);
            }
        });
        convertGramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueInString=valueEditText.getText().toString();
                double valueInInt=Integer.parseInt(valueInString);
                double total=valueInInt*1000;
                String output= String.valueOf(total);
                outputGramTextView.setText(output);
            }
        });
        

    }
}
