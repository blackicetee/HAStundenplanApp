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
public class AppointmentAmountActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointmentamount);

        Button btnOne = (Button) findViewById(R.id.btnOne);
        Button btnTwo = (Button) findViewById(R.id.btnTwo);
        Button btnThree = (Button) findViewById(R.id.btnThree);
        Button btnFour = (Button) findViewById(R.id.btnFour);
        Button btnFive = (Button) findViewById(R.id.btnFive);
        Button btnSix = (Button) findViewById(R.id.btnSix);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
    }

    //@Override public void onBackPressed() {}

    @Override
    public void onClick(View v) {
        Intent returnIntent = new Intent();
        switch (v.getId()) {
            case R.id.btnOne:
                returnIntent.putExtra("appointmentAmount", 1);
                break;
            case R.id.btnTwo:
                returnIntent.putExtra("appointmentAmount", 2);
                break;
            case R.id.btnThree:
                returnIntent.putExtra("appointmentAmount", 3);
                break;
            case R.id.btnFour:
                returnIntent.putExtra("appointmentAmount", 4);
                break;
            case R.id.btnFive:
                returnIntent.putExtra("appointmentAmount", 5);
                break;
            case R.id.btnSix:
                returnIntent.putExtra("appointmentAmount", 6);
                break;
        }
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}