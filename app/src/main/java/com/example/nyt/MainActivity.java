package com.example.nyt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView bookmarkButton1;
    private ImageView bookmarkButton2;
    boolean button1State = false;
    boolean button2State = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout article1 = findViewById(R.id.article1);
        ConstraintLayout article2 = findViewById(R.id.article2);

        bookmarkButton1 = article1.findViewById(R.id.newsSaveButton);
        bookmarkButton2 = article2.findViewById(R.id.newsSaveButton);

        bookmarkButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click1 Registered", Toast.LENGTH_SHORT).show();
                if(!button1State) {
                    bookmarkButton1.setImageResource(R.drawable.ic_bookmark_black_24dp);
                } else {
                    bookmarkButton1.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
                }

                button1State = !button1State;
            }
        });

        bookmarkButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click2 Registered", Toast.LENGTH_SHORT).show();
                if(!button2State) {
                    bookmarkButton2.setImageResource(R.drawable.ic_bookmark_black_24dp);
                } else {
                    bookmarkButton2.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
                }

                button2State = !button2State;
            }
        });
    }
}
