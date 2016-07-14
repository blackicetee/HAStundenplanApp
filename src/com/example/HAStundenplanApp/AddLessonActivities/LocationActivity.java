package com.example.HAStundenplanApp.AddLessonActivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.HAStundenplanApp.R;

/**
 * Created by Thilo S. on 13.07.2016.
 */
public class LocationActivity extends Activity implements View.OnClickListener {
    private EditText etLocation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        etLocation = (EditText) findViewById(R.id.etLocation);
        Button btnSaveLocation = (Button) findViewById(R.id.btnSaveLocation);
        btnSaveLocation.setOnClickListener(this);

        Intent locationIntent = getIntent();
        if(locationIntent.hasExtra("location")) {
            try {
                etLocation.setText(locationIntent.getStringExtra("location"));
            } catch (NullPointerException e) {
                e.printStackTrace();
                Log.e("Catch block", Log.getStackTraceString(e));
            }
        }
    }

    //@Override public void onBackPressed() {}

    @Override
    public void onClick(View v) {
        String location = etLocation.getText().toString();
        if (!location.equals("zumBeispiel: Frau Schuster")) {
            Intent returnIntent = new Intent();
            returnIntent.putExtra("location", location);
            setResult(Activity.RESULT_OK, returnIntent);
            finish();
        }
        else {
            Toast.makeText(this, "Bitte gib den Namen des Lehrers ein!", Toast.LENGTH_LONG).show();
        }
    }
}