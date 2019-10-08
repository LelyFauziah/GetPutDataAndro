package com.example.user.sem7pertemuan1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends Activity {

    TextView usertext; // variable id userText
    Button back; // variable id back

    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        usertext = (TextView) findViewById(R.id.usertext); // instansiasi variable

        Intent i = getIntent();
        Bundle extras = getIntent().getExtras(); //memanggil / mengambil variable nama
        nama = i.getStringExtra("Nama");

        usertext.setText(nama);

        back = (Button) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class); // pindah halaman MainActivity
                startActivity(i);
            }
        });
    }

}
