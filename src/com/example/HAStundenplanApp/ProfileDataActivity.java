package com.example.HAStundenplanApp;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;

/**
 * Created by MrT on 13.06.2016.
 */
public class ProfileDataActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profiledata);

        EditText etVorname = (EditText) findViewById(R.id.etVorname);
        EditText etNachname = (EditText) findViewById(R.id.etNachname);

        etVorname.addTextChangedListener(new TextValidator(etVorname) {
            @Override public void validate(TextView textView, String text) {
                if (!text.matches( "[A-Z][a-zA-Z]*" )) {
                    textView.setText("");
                    Toast.makeText(getApplicationContext(), "Nur Buchstaben erlaubt!", Toast.LENGTH_LONG).show();
                }
            }
        });

        etNachname.addTextChangedListener(new TextValidator(etNachname) {
            @Override public void validate(TextView textView, String text) {
                if (!text.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" )) {
                    textView.setText("");
                    Toast.makeText(getApplicationContext(), "Nur Buchstaben und Bindestriche erlaubt!", Toast.LENGTH_LONG).show();
                }
            }
        });

        createSpinner(R.id.spinnerKlassenZusatz,R.array.klassenZusatz, new SpinnerKlassenZusatzActivity());
        createSpinner(R.id.spinnerStundenplanAnsicht, R.array.stundenplanAnsicht, new SpinnerStundenplanAnsichtActivity());
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

    public abstract class TextValidator implements TextWatcher {
        private final TextView textView;

        public TextValidator(TextView textView) {
            this.textView = textView;
        }

        public abstract void validate(TextView textView, String text);

        @Override
        final public void afterTextChanged(Editable s) {
            String text = textView.getText().toString();
            validate(textView, text);
        }

        @Override
        final public void beforeTextChanged(CharSequence s, int start, int count, int after) { /* Don't care */ }

        @Override
        final public void onTextChanged(CharSequence s, int start, int before, int count) { /* Don't care */ }
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