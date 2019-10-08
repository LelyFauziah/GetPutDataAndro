package com.example.user.sem7pertemuan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {


    EditText nimedit, namaedit; //variable id editText
    Button btnbiodata;  //variable id button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nimedit = (EditText) findViewById(R.id.nimedit); //instansiasi nimedit
        namaedit = (EditText) findViewById(R.id.namaedit);  ////instansiasi namaedit

        btnbiodata = (Button) findViewById(R.id.btnbiodata);

        btnbiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama=namaedit.getText().toString(); // mengambil nilai nama edit untuk di jadikan string

                Intent i = new Intent(getApplicationContext(),Main3Activity.class); // pindah halaman Main3Activity

                i.putExtra("Nama",nama);    // mengirim variable Nama

                startActivity(i);
            }
        });

    }
}
