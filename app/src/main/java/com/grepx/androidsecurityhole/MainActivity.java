package com.grepx.androidsecurityhole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ServiceInstaller.installServices(this);

        setContentView(R.layout.activity_main);

        ImageView kitten1 = (ImageView) findViewById(R.id.kitten1);
        ImageView kitten2 = (ImageView) findViewById(R.id.kitten2);
        ImageView kitten3 = (ImageView) findViewById(R.id.kitten3);

        Picasso.with(this)
                .load("http://i.imgur.com/09jrz7h.jpg")
                .into(kitten1);
        Picasso.with(this)
                .load("http://i.imgur.com/Oo5QCkA.jpg")
                .into(kitten2);
        Picasso.with(this)
                .load("http://i.imgur.com/9QkX4Jy.png")
                .into(kitten3);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LogActivity.class);
                startActivity(intent);
            }
        });
    }
}
