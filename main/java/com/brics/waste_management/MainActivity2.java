package com.brics.waste_management;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
Button btn2;
EditText editTextNumber4,editTextNumber5,editTextNumber6,btnName;
RadioButton radioButton,radioBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn2= findViewById(R.id.btn2);
        editTextNumber4 = findViewById(R.id.editTextNumber4);
        editTextNumber5 = findViewById(R.id.editTextNumber5);
        editTextNumber6 = findViewById(R.id.editTextNumber6);
        btnName=findViewById(R.id.btnName);
        radioButton=findViewById(R.id.radioButton);
        radioBtn=findViewById(R.id.radioBtn);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = editTextNumber4.getText().toString();
                String password = editTextNumber5.getText().toString();
                String confirmPass = editTextNumber6.getText().toString();

                if (TextUtils.isEmpty(userName) && TextUtils.isEmpty(password)) {
                    Toast.makeText(MainActivity2.this, "Please enter user name and password", Toast.LENGTH_SHORT).show();
                }
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
                // calling a method to register a user.
            }
        });
    }
}

