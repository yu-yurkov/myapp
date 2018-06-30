package com.example.myapplication;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout myConstraintLayout;
    private TextView myDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        myDescription = (TextView) findViewById(R.id.description);

    }

    public void onRedButtonClick(View view) {
        myDescription.setText(R.string.red);
        myConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

    public void onYellowButtonClick(View view) {
        myDescription.setText(R.string.yellow);
        myConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    }

    public void onGreenButtonClick(View view) {
        myDescription.setText(R.string.green);
        myConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }
}
