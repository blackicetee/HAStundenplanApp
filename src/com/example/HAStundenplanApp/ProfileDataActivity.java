package com.example.HAStundenplanApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;

/**
 * Created by MrT on 13.06.2016.
 */
public class ProfileDataActivity extends Activity implements View.OnClickListener {
    EditText etVorname;
    EditText etNachname;
    Button btnBestaetigen;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profiledata);
        etVorname = (EditText) findViewById(R.id.etVorname);
        etNachname = (EditText) findViewById(R.id.etNachname);
        btnBestaetigen = (Button) findViewById(R.id.btnBestaetigen);

        btnBestaetigen.setOnClickListener(this);

        Spinner s1 = createSpinner(R.id.spinnerJahrgangsstufe, R.array.jahrgangsstufe, new SpinnerJahrgangsstufeActivity());
        createSpinner(R.id.spinnerKlassenZusatz, R.array.klassenZusatz, new SpinnerKlassenZusatzActivity());
        createSpinner(R.id.spinnerStundenplanAnsicht, R.array.stundenplanAnsicht, new SpinnerStundenplanAnsichtActivity());
        createSpinner(R.id.spinnerTeilOptionen, R.array.teilOptionen, new SpinnerTeilOptionenActivity());
    }

    private Spinner createSpinner(Integer spinnerViewID, Integer arrayIDinStringXML, OnItemSelectedListener spinnerActivity) {
        //Spinner Element
        Spinner spinner = (Spinner) findViewById(spinnerViewID);

        //Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                arrayIDinStringXML, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //Spinner click Listener
        spinner.setOnItemSelectedListener(spinnerActivity);
        return spinner;
    }

    @Override
    public void onClick(View v) {
        Boolean nachnameOK = false;
        Boolean vornameOK = false;
        if (!etNachname.getText().toString().matches("[a-zA-z]+([ '-][a-zA-Z]+)*") && etNachname.getText().toString() != "Nachname" && etNachname.getText().toString() != "") {
            etNachname.setText("");
            nachnameOK = false;
            Toast.makeText(getApplicationContext(), "Der Nachname darf nur aus Buchstaben und Bindestrichen bestehen!", Toast.LENGTH_LONG).show();
        } else {
            nachnameOK = true;
        }


        //Regulärer Ausdruck für einen großen Buchstaben und dann beliebig viele große und kleine Buchstaben [A-Z][a-zA-Z]*
        if (!etVorname.getText().toString().matches("[a-zA-z]+([ '-][a-zA-Z]+)*") && etVorname.getText().toString() != "Vorname" && etVorname.getText().toString() != "") {
            etVorname.setText("");
            vornameOK = false;
            Toast.makeText(getApplicationContext(), "Der Vorname darf nur aus Buchstaben und Bindestrichen bestehen!", Toast.LENGTH_LONG).show();
        } else {
            vornameOK = true;
        }
        Intent intent = new Intent();

        if (nachnameOK && vornameOK) {
            intent.putExtra("Nachname", etNachname.getText().toString());
            intent.putExtra("Vorname", etVorname.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}

class SpinnerJahrgangsstufeActivity extends Activity implements OnItemSelectedListener {

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

class SpinnerKlassenZusatzActivity extends Activity implements OnItemSelectedListener {

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

class SpinnerStundenplanAnsichtActivity extends Activity implements OnItemSelectedListener {

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

class SpinnerTeilOptionenActivity extends Activity implements OnItemSelectedListener {

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