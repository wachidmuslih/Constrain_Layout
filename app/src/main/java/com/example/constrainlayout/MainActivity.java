package com.example.constrainlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Membuat kondisi jika yang dipilih adalah id mnDaftar
        if (item.getItemId() == R.id.mnDaftar)
        {
            //Method untuk memanggil activity
            Intent i = new Intent(getApplicationContext(), Home_Activity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Method untuk menampilkan menu.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


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

                //mensetting email yang benar
                String email = "wachidmm@gmail.com";

                //mensetting password yang benar
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

                    //membuat  objek bundel
                    Bundle b = new Bundle();

                    //memasukkan value dari variabel email dengan kunci "a" kedalam bundel
                    b.putString("a",Email);

                    //memasukkan value dari variabel password dengan kunci "b" kedalam bundel
                    b.putString("b",Password);

                    //membuat objek intent berpindah activity dari mainactivity ke activity2
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);

                    //memasukkan bundel kedalam intent untuk dikirim ke Activity2
                    i.putExtras(b);

                    //berpindah ke activity2
                    startActivity(i);
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