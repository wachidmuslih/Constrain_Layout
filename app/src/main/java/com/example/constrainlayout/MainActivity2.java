package com.example.constrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    //deklarasi variabel dengan tipe data TextView
    TextView txEmail, txPswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Menghubungkan variabel txEmail dengan componen Textview pada  Layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variabel txEmail dengan componen Textview pada  Layout
        txPswd = findViewById(R.id.tvPwd);

        //Deklarasi variabel bundel yang akan digunakan untuk mengambil pesan yang dikirim melallaui method intent

        Bundle bundle = getIntent().getExtras();

        //Membuat variavel string yang digunakan untuk menyimpan data yang dikirim ke dari actvt sebelumnya dengan kunci"a"
        String email = bundle.getString("a");

        //Membuat variavel string yang digunakan untuk menyimpan data yang dikirim ke dari actvt sebelumnya dengan kunci"b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txemail
        txEmail.setText(email);

        //menampilkan value dari variabel email kedalam txemail
        txPswd.setText(pass);


    }
}