package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
         Button buttonAdd,buttonMin,buttonMul,buttonDiv;
         TextView txtview;
         EditText edttxt1,edttxt2;
         int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd=findViewById(R.id.btadd);
        buttonMin=findViewById(R.id.btmin);
        buttonMul=findViewById(R.id.btmul);
        buttonDiv=findViewById(R.id.btdiv);
        edttxt1=findViewById(R.id.edittext1);
        edttxt2=findViewById(R.id.edittext2);
        txtview=findViewById(R.id.result);
      buttonAdd.setOnClickListener(this);
      buttonMin.setOnClickListener(this);
      buttonMul.setOnClickListener(this);
      buttonDiv.setOnClickListener(this);


    }
    public int getValue(EditText edttxt)
    {
        if(edttxt.getText().toString().equals(""))
        {
            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
            return 0;

        }
        else{

            return Integer.parseInt(edttxt.getText().toString());
        }


    }

    @Override
    public void onClick(View view) {

        num1=getValue(edttxt1);
        num2=getValue(edttxt2);
        if (view.getId() == R.id.btadd) {
            txtview.setText("Answer = " +(num1 + num2));
        } else if (view.getId() == R.id.btmin) {
            txtview.setText("Answer = " +(num1 - num2));
        } else if (view.getId() == R.id.btmul) {
            txtview.setText("Answer = " +(num1 * num2));
        } else if (view.getId() == R.id.btdiv) {
            txtview.setText("Answer = " +((float)num1 / (float)num2));
        }


    }
}