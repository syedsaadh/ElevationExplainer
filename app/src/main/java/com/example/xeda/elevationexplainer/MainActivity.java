package com.example.xeda.elevationexplainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout material;
    SeekBar seekBar;
    SeekBar rotationZ;
    TextView seekbarValue,rotationZValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        material = (LinearLayout) findViewById(R.id.material);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        rotationZ = (SeekBar) findViewById(R.id.rotationZ);

        seekbarValue = (TextView) findViewById(R.id.seekBar_value);
        rotationZValue = (TextView) findViewById(R.id.rotationZ_value);


        seekBar.setMax(100);
        rotationZ.setMax(360);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                material.setElevation((float) progress);
                seekbarValue.setText(progress+" - Elevation");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        rotationZ.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                material.setZ(progress);
                rotationZValue.setText(progress+" - Z");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
