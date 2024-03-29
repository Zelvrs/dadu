package com.gazel.dadu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageviewLeftdice = findViewById(R.id.imageViewLeftdice);
        final ImageView imageviewRightdice = findViewById(R.id.imageviewRightdice);
        Button button = findViewById(R.id.button);
        final int[] diceArray = new int[] {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int indexLeft = new Random().nextInt(6);
                Log.d("dadu","Button diklik");
                imageviewLeftdice.setImageResource(diceArray[indexLeft]);

                int indexRight = new Random().nextInt(6);
                imageviewRightdice.setImageResource(diceArray[indexRight]);
            }
        });
    }
}
