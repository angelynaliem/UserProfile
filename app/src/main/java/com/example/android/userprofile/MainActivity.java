package com.example.android.userprofile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.profile);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Angelyn");

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("05/15/1985");

        TextView country = (TextView) findViewById(R.id.country);
        country.setText("Indonesia");
        country.getResources().getColor(R.color.colorAccent);

    }
}
