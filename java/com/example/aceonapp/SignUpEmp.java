package com.example.aceonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpEmp extends AppCompatActivity {

    private EditText CName,email,Password, rePassword;
    private Button bCancel, bProceed,empLogin;
    DBEmp DB;

    boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_emp);

        CName=findViewById(R.id.CName);
        email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        rePassword=findViewById(R.id.rePassword);
        bCancel=findViewById(R.id.cancelButton);
        DB = new DBEmp(this);


        empLogin=findViewById(R.id.empBtn);
        empLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUpEmp.this, LoginEmp.class);
                startActivity(i);
            }
        });

        bProceed = findViewById(R.id.proceedButton);
        bProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isAllFieldsChecked = CheckAllFields();
                if (isAllFieldsChecked) {
                    Intent i = new Intent(SignUpEmp.this, LoginEmp.class);
                    startActivity(i);
                }

                String name = CName.getText().toString();
                String emp = email.getText().toString();
                String pass = Password.getText().toString();
                String repass = rePassword.getText().toString();

                if (name.equals("'") || emp.equals("") || pass.equals("") || repass.equals(""))
                    Toast.makeText(SignUpEmp.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    if (pass.equals(repass)) {
                        Boolean checkEmp = DB.checkempusername(emp);
                        if (checkEmp == false) {
                            Boolean insert = DB.insertEmpData(emp, pass);
                            if (insert == true) {
                                Toast.makeText(SignUpEmp.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Welcome.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(SignUpEmp.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(SignUpEmp.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(SignUpEmp.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        bCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignUpEmp.this.finish();
                System.exit(0);
            }
        });
    }

    private boolean CheckAllFields() {
        if (CName.length() == 0) {
            CName.setError("This field is required");
            return false;
        }

        if (email.length() == 0) {
            email.setError("This field is required");
            return false;
        }

        if (Password.length() == 0) {
            Password.setError("Password is required");
            return false;
        } else if (Password.length() < 8) {
            Password.setError("Password must be minimum 8 characters");
            return false;
        }

        if (Password != rePassword) {
            Password.setError("Password not matching");
            return false;
        }

        // after all validation return true.
        return true;

    }
}