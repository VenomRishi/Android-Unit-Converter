package com.example.acer.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button convertWeightButton;
    private Button convertVolumeButton;
    private Button convertLengthButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertWeightButton=(Button) findViewById(R.id.convertWeightButton);
        convertVolumeButton=(Button) findViewById(R.id.convertVolumeButton);
        convertLengthButton=(Button) findViewById(R.id.convertLengthButton);

        convertWeightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ConvertWeightActivity.class);
                startActivity(intent);
            }
        });
        convertVolumeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ConvertVolumeActivity.class);
                startActivity(intent);
            }
        });
        convertLengthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ConvertLengthActivity.class);
                startActivity(intent);
            }
        });
    }
}
