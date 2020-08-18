package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER="com.example.intentsproj.EXTRA_NUMBER";
    public static final String EXTRA_NUMBER2="com.example.intentsproj.EXTRA_NUMBER2";


    Button button;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater li=getLayoutInflater();
                View layout = li.inflate(R.layout.custom_dialog, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));

                TextView toastText=layout.findViewById(R.id.custom_toast_message);
                toastText.setText(("Opening calculating..."));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
                toast.setView(layout);
                toast.show();

                TextView textView=(TextView) findViewById(R.id.textView);
                TextView textView1=(TextView) findViewById(R.id.textView2);
                int number2=Integer.parseInt(textView.getText().toString());
                int number1=Integer.parseInt(textView1.getText().toString());

                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra(EXTRA_NUMBER,number1);
                intent.putExtra(EXTRA_NUMBER2,number2);
                startActivity(intent);
            }
        });
    }


}