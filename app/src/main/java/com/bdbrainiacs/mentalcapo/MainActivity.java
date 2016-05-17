package com.bdbrainiacs.mentalcapo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Spinner mSpinner1;
    private Spinner mSpinner2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mDoMagicButton = (Button) findViewById(R.id.button);
        mDoMagicButton.setOnClickListener(buttonClickListener);

        // Spinner element astea se definesc ca variabile globale. (pe viitor)
        mSpinner1 = (Spinner) findViewById(R.id.keys_spinner_1);
        mSpinner2 = (Spinner) findViewById(R.id.keys_spinner_2);

        // Spinner Drop down elements
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
        mSpinner1.setAdapter(dataAdapter);
        mSpinner2.setAdapter(dataAdapter);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ImageView img1 = (ImageView) findViewById(R.id.key1);
            ImageView img2 = (ImageView) findViewById(R.id.key2);

            String spinner1Value = mSpinner1.getSelectedItem().toString();
            String spinner2Value = mSpinner2.getSelectedItem().toString();

            switch (spinner1Value) {
                case "A":
                    img1.setImageResource(R.drawable.a);
                    break;
                case "A#":
                    img1.setImageResource(R.drawable.bb);
                    break;
                case "B":
                    img1.setImageResource(R.drawable.b);
                    break;
                case "C":
                    img1.setImageResource(R.drawable.c);
                    break;
                case "C#":
                    img1.setImageResource(R.drawable.db);
                    break;
                case "D":
                    img1.setImageResource(R.drawable.d);
                    break;
                case "D#":
                    img1.setImageResource(R.drawable.eb);
                    break;
                case "E":
                    img1.setImageResource(R.drawable.e);
                    break;
                case "F":
                    img1.setImageResource(R.drawable.f);
                    break;
                case "F#":
                    img1.setImageResource(R.drawable.f0);
                    break;
                case "G":
                    img1.setImageResource(R.drawable.g);
                    break;
                case "G#":
                    img1.setImageResource(R.drawable.ab);
                    break;
            }

            switch (spinner2Value) {
                case "A":
                    img2.setImageResource(R.drawable.a);
                    break;
                case "A#":
                    img2.setImageResource(R.drawable.bb);
                    break;
                case "B":
                    img2.setImageResource(R.drawable.b);
                    break;
                case "C":
                    img2.setImageResource(R.drawable.c);
                    break;
                case "C#":
                    img2.setImageResource(R.drawable.db);
                    break;
                case "D":
                    img2.setImageResource(R.drawable.d);
                    break;
                case "D#":
                    img2.setImageResource(R.drawable.eb);
                    break;
                case "E":
                    img2.setImageResource(R.drawable.e);
                    break;
                case "F":
                    img2.setImageResource(R.drawable.f);
                    break;
                case "F#":
                    img2.setImageResource(R.drawable.f0);
                    break;
                case "G":
                    img2.setImageResource(R.drawable.g);
                    break;
                case "G#":
                    img2.setImageResource(R.drawable.ab);
                    break;
            }
        }
    };
}
