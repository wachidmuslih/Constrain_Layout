package com.example.constrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {

    //Deklarasi variabel dengan tipe dara EditText
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtRepass;

    //Deklarasi variabel dengan tipe dara floating Action Button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabSimpan);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtRepass.getText().toString().isEmpty())
                {
                    //Menampilkan pesan notifikasi jika seluruh EditText wajib diisi
                    Snackbar.make(v, "Wajib isi data seluruh Data!!", Snackbar.LENGTH_LONG).show();
                }

                else
                {
                    //Membuat kondisi untuk mengecek apakah isi dari EditText password dan EditText repassword
                    //sama atau tidak
                    if (edtPassword.getText().toString().equals(edtRepass.getText().toString()))
                    {
                        //Menampilkan pesan notifikasi jika pendaftaran berhasil
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil...", Toast.LENGTH_LONG).show();

                        //method untuk kembali ke activity Main
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        //Menampilkan pesan bahwa isi dari Edittext password dan Edittext repassword
                        //tidak sama
                        Snackbar.make(v, "Password dan Repassword harus sama!!!!", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}