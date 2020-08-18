package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText eN1;
    EditText eN2;
    Button Add,Sub,Mult,Div;
    float result_num;
    int num1,num2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        final int number1=intent.getIntExtra(FirstActivity.EXTRA_NUMBER,0);
        final int number2=intent.getIntExtra(FirstActivity.EXTRA_NUMBER2,0);
        TextView textView1=(TextView) findViewById(R.id.textView);
        TextView textView2=(TextView) findViewById(R.id.textView2);
        textView1.setText(""+ number1);
        textView2.setText(""+ number2);


        result=findViewById(R.id.text);
      eN1=findViewById(R.id.editTextNumber);
        eN2=findViewById(R.id.editTextNumber2);
        Add=findViewById(R.id.Add);
        Sub=findViewById(R.id.Sub);
        Mult=findViewById(R.id.Mult);
        Div=findViewById(R.id.Div);



        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(eN1.getText().toString());
                num2=Integer.parseInt(eN2.getText().toString());
                result.setText(number1+"+"+number2 + "=" + (num1+num2));
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(eN1.getText().toString());
                num2=Integer.parseInt(eN2.getText().toString());
                result.setText(number1+"-"+number2 + "=" + (num1-num2));
            }
        });
        Mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(eN1.getText().toString());
                num2=Integer.parseInt(eN2.getText().toString());
                result.setText(number1+"*"+number2 + "=" + (num1*num2));
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(eN1.getText().toString());
                num2=Integer.parseInt(eN2.getText().toString());
                result.setText(number1+"/"+number2 + "=" + (num1/num2));
            }
        });
    }
}