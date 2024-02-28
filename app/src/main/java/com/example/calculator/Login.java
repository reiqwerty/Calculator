package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    EditText Username;
    EditText Password;
    Button btnLogin;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = findViewById(R.id.Username);
        Password = findViewById(R.id.Password);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String username = Username.getText().toString();
                    String password = Password.getText().toString();

                    if (username.equals("admin") && password.equals("admin")) {
                        Intent loginPage = new Intent(Login.this,Home.class);
                        startActivity(loginPage);
                    }
                    else {
                        Toast.makeText(Login.this, "Gagal Login", Toast.LENGTH_LONG).show();
                    }
                }
        });
        }
}