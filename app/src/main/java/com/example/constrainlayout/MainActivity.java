package com.example.constrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //deklarasi variabel untuk button
    Button btnLogin;

    //deklarasi variabel untuk Edittext
    EditText edEmail, edPassword;

    //deklarasi variabel untuk menyimpan email dan password
    String Email, Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin=findViewById(R.id.signinBtn);

        //menghubungkan variabel edemail dengan componen button pada layout
        edEmail = findViewById(R.id.inputEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edPassword = findViewById(R.id.inputPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menyimpan input user di edit text email kedalam variabel nama
                Email = edEmail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                Password = edPassword.getText().toString();

                String email = "wachidmm@gmail.com";
                String pass = "wachid110";

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: "+Email+" dan password anda"+Password+"", Toast.LENGTH_LONG);
                //menampilkan toast
                t.show();

                if(Email.equals(email) && Password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_LONG);
                    t.show();
                }
                else if(!Email.equals(email) && Password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Login Gagal! Email salah!", Toast.LENGTH_LONG);
                    t.show();
                }

                else if(Email.equals(email) && !Password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Login Gagal! Password salah!", Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Login Gagal!", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}