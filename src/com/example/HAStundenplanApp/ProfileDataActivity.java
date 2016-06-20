package com.example.HAStundenplanApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;

/**
 * Created by MrT on 13.06.2016.
 */
public class ProfileDataActivity extends Activity implements View.OnClickListener {
    final static String LOG_TAG = "myProfileDataLogs";
    private SpinnerGradeActivity spinnerGradeActivity = new SpinnerGradeActivity();
    private SpinnerClassSpecificationActivity spinnerClassSpecificationActivity = new SpinnerClassSpecificationActivity();
    private EditText etFirstName;
    private EditText etLastName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profiledata);
        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        Button btnCheckProfileData = (Button) findViewById(R.id.btnCheckProfileData);

        btnCheckProfileData.setOnClickListener(this);

        Log.d(LOG_TAG, "__Selected spinner options__");

        //Create spinner grade
        Spinner spinnerGrade = (Spinner) findViewById(R.id.spinnerGrade);
        ArrayAdapter<CharSequence> adapterGrade = ArrayAdapter.createFromResource(this,
                R.array.grade, android.R.layout.simple_spinner_dropdown_item);
        spinnerGrade.setAdapter(adapterGrade);
        spinnerGrade.setOnItemSelectedListener(spinnerGradeActivity);

        //Create spinner classSpecification
        Spinner spinnerClassSpecification = (Spinner) findViewById(R.id.spinnerClassSpecification);
        ArrayAdapter<CharSequence> adapterClassSpecification = ArrayAdapter.createFromResource(this,
                R.array.classSpecification, android.R.layout.simple_spinner_dropdown_item);
        spinnerClassSpecification.setAdapter(adapterClassSpecification);
        spinnerClassSpecification.setOnItemSelectedListener(spinnerClassSpecificationActivity);
    }

    @Override
    public void onClick(View v) {
        Boolean vornameOK;
        Boolean nachnameOK;


        //Regulaerer Ausdruck fuer einen grossen Buchstaben und dann beliebig viele grosse und kleine Buchstaben [A-Z][a-zA-Z]*
        if (!etFirstName.getText().toString().matches("[a-zA-z]+([ '-][a-zA-Z]+)*") || etFirstName.getText().toString().equals("Vorname") || etFirstName.getText().toString().equals("")) {
            etFirstName.setText("");
            vornameOK = false;
            Toast.makeText(getApplicationContext(), "Der Vorname darf nur aus Buchstaben und Bindestrichen bestehen!", Toast.LENGTH_LONG).show();
        } else {
            vornameOK = true;
        }
        if (!etLastName.getText().toString().matches("[a-zA-z]+([ '-][a-zA-Z]+)*") || etLastName.getText().toString().equals("Nachname") || etLastName.getText().toString().equals("")) {
            etLastName.setText("");
            nachnameOK = false;
            Toast.makeText(getApplicationContext(), "Der Nachname darf nur aus Buchstaben und Bindestrichen bestehen!", Toast.LENGTH_LONG).show();
        } else {
            nachnameOK = true;
        }

        Intent intent = new Intent();

        if (nachnameOK && vornameOK) {
            intent.putExtra("FirstName", etFirstName.getText().toString());
            intent.putExtra("LastName", etLastName.getText().toString());
            intent.putExtra("Grade", spinnerGradeActivity.getSelectedItem());
            Log.d(LOG_TAG, "SelectedGrade from spinnerGradeActivity: " + spinnerGradeActivity.getSelectedItem());
            intent.putExtra("ClassSpecification", spinnerClassSpecificationActivity.getSelectedItem());
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}

class SpinnerGradeActivity extends Activity implements OnItemSelectedListener {
    private String selectedItem;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //An item was selected. You can retrieve the selected item using parent.getItemAtPosition(pos)
        //On selecting a spinner item
        selectedItem = parent.getItemAtPosition(position).toString();

        //Showing selected spinner item
        Log.d(ProfileDataActivity.LOG_TAG, "Selected: " + selectedItem);
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

class SpinnerClassSpecificationActivity extends Activity implements OnItemSelectedListener {
    private String selectedItem;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //An item was selected. You can retrieve the selected item using parent.getItemAtPosition(pos)
        //On selecting a spinner item
        selectedItem = parent.getItemAtPosition(position).toString();

        //Showing selected spinner item
        Log.d(ProfileDataActivity.LOG_TAG, "Selected: " + selectedItem);
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
