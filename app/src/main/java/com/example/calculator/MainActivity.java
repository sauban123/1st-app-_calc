package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void sum(View v) {
        EditText first =findViewById(R.id.editTextNumber1);
        EditText second = findViewById(R.id.editTextNumber2);
        Button add =findViewById(R.id.buttonAdd);
        String a= first.getText().toString();
        String b= second.getText().toString();
Integer val1= Integer.parseInt(a);
Integer val2=Integer.parseInt(b);
Integer add1= val1 + val2;
        Toast.makeText(getApplicationContext(),"sum =" +add1, Toast.LENGTH_LONG).show();
    }
    public void sub(View v) {
        EditText first =findViewById(R.id.editTextNumber1);
        EditText second = findViewById(R.id.editTextNumber2);
        Button sub =findViewById(R.id.buttonSubtract);
        String a= first.getText().toString();
        String b= second.getText().toString();
        Integer val1= Integer.parseInt(a);
        Integer val2=Integer.parseInt(b);
        Integer add1= val1 - val2;
        Toast.makeText(getApplicationContext(),"sub =" +add1, Toast.LENGTH_LONG).show();
    }
    public void mul(View v) {
        EditText first =findViewById(R.id.editTextNumber1);
        EditText second = findViewById(R.id.editTextNumber2);
        Button mul =findViewById(R.id.buttonMultiply);
        String a= first.getText().toString();
        String b= second.getText().toString();
        Integer val1= Integer.parseInt(a);
        Integer val2=Integer.parseInt(b);
        Integer add1= val1 * val2;
        Toast.makeText(getApplicationContext(),"mul =" +add1, Toast.LENGTH_LONG).show();
    }
    public void div(View v) {
        EditText first =findViewById(R.id.editTextNumber1);
        EditText second = findViewById(R.id.editTextNumber2);
        Button div =findViewById(R.id.buttonDivide);
        String a= first.getText().toString();
        String b= second.getText().toString();
        Integer val1= Integer.parseInt(a);
        Integer val2=Integer.parseInt(b);
        Integer add1= val1 / val2;
        Toast.makeText(getApplicationContext(),"div =" +add1, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

