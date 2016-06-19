package com.example.HAStundenplanApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Jason on 19.06.2016.
 */
public class SettingsActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);


        createSpinner(R.id.spinnerStundenplanAnsicht, R.array.stundenplanAnsicht, new SpinnerStundenplanAnsichtActivity());
        createSpinner(R.id.spinnerTeilOptionen, R.array.teilOptionen, new SpinnerTeilOptionenActivity());
    }
}


class SpinnerStundenplanAnsichtActivity extends Activity implements AdapterView.OnItemSelectedListener {

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //An item was selected. You can retrieve the selected item using parent.getItemAtPosition(pos)
        //On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        //Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Another interface callback
        Toast.makeText(parent.getContext(), "Nothing was selected!", Toast.LENGTH_LONG).show();
    }
}

class SpinnerTeilOptionenActivity extends Activity implements AdapterView.OnItemSelectedListener {

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //An item was selected. You can retrieve the selected item using parent.getItemAtPosition(pos)
        //On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        //Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Another interface callback
        Toast.makeText(parent.getContext(), "Nothing was selected!", Toast.LENGTH_LONG).show();
    }
}