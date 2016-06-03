package com.bdbrainiacs.mentalcapo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends Activity {

    private Spinner keyOfSongSpinner;
    private Spinner wantedKeySpinner;

    private ImageView keyOfSongImage;
    private ImageView wantedKeyImage;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init magicButton
        Button doMagicButton = (Button) findViewById(R.id.button);
        doMagicButton.setOnClickListener(doMagicButtonClickListener);

        //init spinners
        keyOfSongSpinner = (Spinner) findViewById(R.id.keys_spinner_1);
        wantedKeySpinner = (Spinner) findViewById(R.id.keys_spinner_2);

        //init imageViews
        keyOfSongImage = (ImageView) findViewById(R.id.key1);
        wantedKeyImage = (ImageView) findViewById(R.id.key2);

        // Spinner Drop down elements with major keys (for now)
        List<String> categories = new ArrayList<String>();
        categories.add("A");
        categories.add("A#");
        categories.add("B");
        categories.add("C");
        categories.add("C#");
        categories.add("D");
        categories.add("D#");
        categories.add("E");
        categories.add("F");
        categories.add("F#");
        categories.add("G");
        categories.add("G#");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        keyOfSongSpinner.setAdapter(dataAdapter);
        wantedKeySpinner.setAdapter(dataAdapter);
    }

    private View.OnClickListener doMagicButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            //get spinners selected values
            String spinner1Value = keyOfSongSpinner.getSelectedItem().toString();
            String spinner2Value = wantedKeySpinner.getSelectedItem().toString();

            //show the images according to what the user selected
            switch (spinner1Value) {
                case "A":
                    keyOfSongImage.setImageResource(R.drawable.a);
                    break;
                case "A#":
                    keyOfSongImage.setImageResource(R.drawable.bb);
                    break;
                case "B":
                    keyOfSongImage.setImageResource(R.drawable.b);
                    break;
                case "C":
                    keyOfSongImage.setImageResource(R.drawable.c);
                    break;
                case "C#":
                    keyOfSongImage.setImageResource(R.drawable.db);
                    break;
                case "D":
                    keyOfSongImage.setImageResource(R.drawable.d);
                    break;
                case "D#":
                    keyOfSongImage.setImageResource(R.drawable.eb);
                    break;
                case "E":
                    keyOfSongImage.setImageResource(R.drawable.e);
                    break;
                case "F":
                    keyOfSongImage.setImageResource(R.drawable.f);
                    break;
                case "F#":
                    keyOfSongImage.setImageResource(R.drawable.f0);
                    break;
                case "G":
                    keyOfSongImage.setImageResource(R.drawable.g);
                    break;
                case "G#":
                    keyOfSongImage.setImageResource(R.drawable.ab);
                    break;
            }

            switch (spinner2Value) {
                case "A":
                    wantedKeyImage.setImageResource(R.drawable.a);
                    break;
                case "A#":
                    wantedKeyImage.setImageResource(R.drawable.bb);
                    break;
                case "B":
                    wantedKeyImage.setImageResource(R.drawable.b);
                    break;
                case "C":
                    wantedKeyImage.setImageResource(R.drawable.c);
                    break;
                case "C#":
                    wantedKeyImage.setImageResource(R.drawable.db);
                    break;
                case "D":
                    wantedKeyImage.setImageResource(R.drawable.d);
                    break;
                case "D#":
                    wantedKeyImage.setImageResource(R.drawable.eb);
                    break;
                case "E":
                    wantedKeyImage.setImageResource(R.drawable.e);
                    break;
                case "F":
                    wantedKeyImage.setImageResource(R.drawable.f);
                    break;
                case "F#":
                    wantedKeyImage.setImageResource(R.drawable.f0);
                    break;
                case "G":
                    wantedKeyImage.setImageResource(R.drawable.g);
                    break;
                case "G#":
                    wantedKeyImage.setImageResource(R.drawable.ab);
                    break;
            }
        }
    };
}
