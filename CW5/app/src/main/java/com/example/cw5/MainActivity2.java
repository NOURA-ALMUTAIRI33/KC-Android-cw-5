package com.example.cw5;

   import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

     public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Tv1Textview = findViewById(R.id.Ed1);
        TextView Tv2Textview = findViewById(R.id.Ed2);


        Bundle bundle = getIntent().getExtras();


        String name = bundle.getString("name");
        Tv1Textview.setText(name);

        int Tv2 = bundle.getInt("Tv2Textview");
        Tv2Textview.setText(String.valueOf(Tv2));



    }
}
