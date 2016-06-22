package com.example.HAStundenplanApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;


import java.util.Arrays;
import java.util.List;

/**
 * Created by Jason on 19.06.2016.
 */
public class SettingsActivity extends Activity implements View.OnClickListener, MultiSpinner.MultiSpinnerListener {
    final static String LOG_TAG = "mySettingsLogs";
    private SpinnerScheduleViewActivity spinnerScheduleViewActivityObj = new SpinnerScheduleViewActivity();
    private SpinnerShareOptionsActivity spinnerShareOptionsActivityObj = new SpinnerShareOptionsActivity();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        Button btnCheckSettings = (Button) findViewById(R.id.btnCheckSettings);

        btnCheckSettings.setOnClickListener(this);

        Log.d(LOG_TAG, "__Selected spinner options__");

        //Create spinner scheduleView
        Spinner spinnerScheduleView = (Spinner) findViewById(R.id.spinnerScheduleView);
        ArrayAdapter<CharSequence> adapterScheduleView = ArrayAdapter.createFromResource(this,
                R.array.scheduleView, android.R.layout.simple_spinner_dropdown_item);
        spinnerScheduleView.setAdapter(adapterScheduleView);
        spinnerScheduleView.setOnItemSelectedListener(spinnerScheduleViewActivityObj);

        //Create spinner shareOptions
        Spinner spinnerShareOptions = (Spinner) findViewById(R.id.spinnerShareOptions);
        ArrayAdapter<CharSequence> adapterShareOptions = ArrayAdapter.createFromResource(this,
                R.array.shareOptions, android.R.layout.simple_spinner_dropdown_item);
        spinnerShareOptions.setAdapter(adapterShareOptions);
        spinnerShareOptions.setOnItemSelectedListener(spinnerShareOptionsActivityObj);

        List<String> items = Arrays.asList("Hausaufgaben anzeigen", "Unterrichtsstunden anzeigen", "Tests anzeigen", "Klassenarbeiten anzeigen", "Andere anzeigen");
        MultiSpinner multiSpinner = (MultiSpinner) findViewById(R.id.multi_spinner);
        multiSpinner.setItems(items, "Alles anzeigen", this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("ScheduleView", spinnerScheduleViewActivityObj.getSelectedItem());
        //Log.d(ProfileDataActivity.LOG_TAG, "SelectedItem of object spinnerScheduleViewActivity: " + spinnerScheduleViewActivityObj.getSelectedItem());
        intent.putExtra("ShareOptions", spinnerShareOptionsActivityObj.getSelectedItem());
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    public void onItemsSelected(boolean[] selected) {
        if (selected[0]) {
            Log.d(LOG_TAG, "Show homework!");
        }
        else {
            Log.d(LOG_TAG, "Don`t show homework!");
        }
        if (selected[1]) {
            Log.d(LOG_TAG, "Show lessons!");
        }
        else {
            Log.d(LOG_TAG, "Don`t show lessons!");
        }
        if (selected[2]) {
            Log.d(LOG_TAG, "Show tests!");
        }
        else {
            Log.d(LOG_TAG, "Don`t show tests!");
        }
        if (selected[3]) {
            Log.d(LOG_TAG, "Show exams!");
        }
        else {
            Log.d(LOG_TAG, "Don`t show exams!");
        }
        if (selected[4]) {
            Log.d(LOG_TAG, "Show other!");
        }
        else {
            Log.d(LOG_TAG, "Don`t show other!");
        }
    }
}


class SpinnerScheduleViewActivity extends Activity implements AdapterView.OnItemSelectedListener {
    private String selectedItem;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //An item was selected. You can retrieve the selected item using parent.getItemAtPosition(pos)
        //On selecting a spinner item
        selectedItem = parent.getItemAtPosition(position).toString();

        //Showing selected spinner item
        Log.d(SettingsActivity.LOG_TAG, "Selected: " + selectedItem);
    }

    String getSelectedItem() {
        return selectedItem;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Another interface callback
        Toast.makeText(parent.getContext(), "Nothing was selected!", Toast.LENGTH_LONG).show();
    }
}

class SpinnerShareOptionsActivity extends Activity implements AdapterView.OnItemSelectedListener {
    private String selectedItem;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //An item was selected. You can retrieve the selected item using parent.getItemAtPosition(pos)
        //On selecting a spinner item
        selectedItem = parent.getItemAtPosition(position).toString();

        //Showing selected spinner item
        Log.d(SettingsActivity.LOG_TAG, "Selected: " + selectedItem);
    }

    String getSelectedItem() {
        return selectedItem;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Another interface callback
        Toast.makeText(parent.getContext(), "Nothing was selected!", Toast.LENGTH_LONG).show();
    }
}
