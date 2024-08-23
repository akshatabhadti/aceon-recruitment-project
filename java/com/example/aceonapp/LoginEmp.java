package com.example.aceonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.ParcelableSpan;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginEmp extends AppCompatActivity {

    private EditText userName, Password;
    private Button LoginBtn,LoginBtn2,Btnreg;
    DBEmp DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_emp);

        userName = findViewById(R.id.empUser);
        Password = findViewById(R.id.empPass);

        DB=new DBEmp(this);

        Btnreg=findViewById(R.id.BtnReg);
        Btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SignUpEmp.class);
                startActivity(i);
            }
        });

        LoginBtn2 = findViewById(R.id.BtnUser);
        LoginBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
        });

        LoginBtn=findViewById(R.id.BtnLogin);
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emp = userName.getText().toString();
                String pass = Password.getText().toString();

                if(emp.equals("")||pass.equals(""))
                    Toast.makeText(LoginEmp.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkEmppass = DB.checkempusernamepassword(emp, pass);
                    if(checkEmppass==true){
                        Toast.makeText(LoginEmp.this, "Sign in successful", Toast.LENGTH_SHORT).show();
                        Intent intent  = new Intent(getApplicationContext(), HomeActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(LoginEmp.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }

                    EmployerUser(emp,pass);
                }

//                String username = userName.getText().toString();
//                String password = Password.getText().toString();
//
//                if (TextUtils.isEmpty(username) && TextUtils.isEmpty(password)) {
//                    Toast.makeText(emplogin.this, "Please enter user name and password", Toast.LENGTH_SHORT).show();
//                    LoginBtn.setEnabled(false);
//                } else {
//                    LoginBtn.setEnabled(true);
//                    EmployerUser(username,password);
//                    Intent i = new Intent(emplogin.this, EmployerActivity.class);
//                    startActivity(i);
//                }

                userName.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                        LoginBtn.setEnabled(true);
                        return false;
                    }
                });

                Password.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                        LoginBtn.setEnabled(true);
                        return false;
                    }
                });
            }
        });

    }

    private void EmployerUser(String username,String Password){
        if (username != null && Password != null) {
            Toast.makeText(this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), EmployerActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(LoginEmp.this, "enter valid details", Toast.LENGTH_LONG).show();
        }
    }
}

