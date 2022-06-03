package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue,etSecondValue;
    TextView tvAns;
    Button Add,Sub,Multiply,Divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstValue=findViewById(R.id.etFirstValue);
        etSecondValue=findViewById(R.id.etSecondValue);
        tvAns=findViewById(R.id.tvAns);
        Add=findViewById(R.id.btnAdd);
        Sub=findViewById(R.id.btnSub);
        Multiply=findViewById(R.id.btnMultiply);
        Divide=findViewById(R.id.btnDivide);
Add.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int firstValue,secondValue,ans;
        firstValue=Integer.parseInt(etFirstValue.getText().toString());
        secondValue=Integer.parseInt(etSecondValue.getText().toString());
       ans=firstValue+secondValue;
       tvAns.setText(" Answer is " + ans);
    }
});

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue-secondValue;
                tvAns.setText(" Answer is " + ans);
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue*secondValue;
                tvAns.setText(" Answer is " + ans);
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue/secondValue;
                tvAns.setText(" Answer is " + ans);
            }
        });

//        Reset.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                if (v==Reset) {
//                    startActivity(new Intent(MainActivity.this, MainActivity.class));
//                }
//            }
//        });





    }
}