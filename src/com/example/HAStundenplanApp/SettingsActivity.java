package com.example.HAStundenplanApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

/**
 * Created by Jason on 19.06.2016.
 */
public class SettingsActivity extends Activity implements View.OnClickListener {
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