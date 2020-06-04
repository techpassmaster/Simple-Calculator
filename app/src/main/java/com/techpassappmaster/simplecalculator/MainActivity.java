package com.techpassappmaster.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText first_no,second_no;
    TextView txt_result;
    Button add, sub, multi, divide;


    int first,second;
    float result_divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Connect xlm view to java by findviewbyid

//        EditText
        first_no = findViewById(R.id.first_edt_txt);
        second_no = findViewById(R.id.second_edt_txt);

//        TextView
        txt_result = findViewById(R.id.txt_result);

//        button
        add = findViewById(R.id.btn_add);
        sub = findViewById(R.id.btn_sub);
        multi = findViewById(R.id.btn_multi);
        divide = findViewById(R.id.btn_divide);

//        Now set click listen on view for click event

        //        for adding two number
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=Integer.parseInt(first_no.getText().toString());
                second=Integer.parseInt(second_no.getText().toString());

                txt_result.setText(String.valueOf(first+second));

            }
        });


        //        for subtraction two number
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=Integer.parseInt(first_no.getText().toString());
                second=Integer.parseInt(second_no.getText().toString());

                txt_result.setText(String.valueOf(first-second));

            }
        });

        //        for Multiplication two number
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=Integer.parseInt(first_no.getText().toString());
                second=Integer.parseInt(second_no.getText().toString());

                txt_result.setText(String.valueOf(first*second));

            }
        });

        //        for Divide two number
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=Integer.parseInt(first_no.getText().toString());
                second=Integer.parseInt(second_no.getText().toString());

                result_divide =first / second;
                txt_result.setText(String.valueOf(result_divide));

            }
        });
    }
}
