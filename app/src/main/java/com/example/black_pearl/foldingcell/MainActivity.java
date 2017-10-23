package com.example.black_pearl.foldingcell;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import com.ramotion.foldingcell.FoldingCell;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final FoldingCell abc= (FoldingCell) findViewById(R.id.folding_cell);
        abc.initialize(1000, Color.LTGRAY, 2);
// or with camera height parameter
        abc.initialize(30, 1000, Color.LTGRAY, 2);
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abc.toggle(false);
            }
        });





        final FoldingCell card= (FoldingCell) findViewById(R.id.folding_cell_2);
        card.initialize(1000, Color.LTGRAY, 2);
// or with camera height parameter
        card.initialize(30, 1000, Color.LTGRAY, 2);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card.toggle(false);
            }
        });

    }
}
