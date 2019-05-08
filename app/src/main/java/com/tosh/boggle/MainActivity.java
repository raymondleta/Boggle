package com.tosh.boggle;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] boggleLetters = new String[]{
            "T","T","L","J", "R", "R","A","B","E","F","O","E","E","D","O","F"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/billow/theBillow.ttf"); //change
        gridView = (GridView) findViewById(R.id.baseGridView);
        gridView.setAdapter(new BoggleAdapter(this, boggleLetters, typeface));
    }
}
