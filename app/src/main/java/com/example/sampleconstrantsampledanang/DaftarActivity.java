package com.example.sampleconstrantsampledanang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {
    FloatingActionButton fab;
    //deklarasi variable dengan tipe data edit text
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;
    //deklarasi variable dengan tipe data floating action button

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        fab = (FloatingActionButton) findViewById((R.id.fabSimpan));
        //membuat ,method untuk event dari floating button

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //membuat kondisi untuk mengecek apakah edit text kosong atau tidak
                if (edtNama.getText().toString().isEmpty() ||
                    edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty())
                {
                    //menampilkan pesan notidikasi jika seluruh edit text wajib diisi
                    Snackbar.make(view,"wajib  isi seluruh data!!",
                            Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    //membuat kondisi untuk mengecek apakah edit text kosong atau tidak
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        //menampilkan pesan notifikasi jika pendaftaran berhasil
                        Toast.makeText(getApplicationContext(), "Pendaftaran berhasil...",
                                Toast.LENGTH_LONG).show();
                        //method untuk kembali ke activity Main
                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        //menampilkan pesan bahwa isi dari edit text password dan edit text
                        // respasword tidak sama
                        Snackbar.make(view, "password dan repassword harus sama!!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }



}
