package com.example.HAStundenplanApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.HAStundenplanApp.AddLessonActivities.*;

import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

/**
 * Created by Thilo S. on 13.07.2016.
 */
public class AddLessonActivity extends Activity implements View.OnClickListener {
    private String lessonName = null;
    private String teacherName = null;
    private String location = null;
    private long lessonTerminationDate = 0;
    private int appointmentAmount = 0;

    private Button btnLessonName;
    private Button btnTeacherName;
    private Button btnLocation;
    private Button btnLessonTerminationDate;
    private Button btnAppointmentAmount;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addlesson);

        btnLessonName = (Button) findViewById(R.id.btnLessonName);
        btnTeacherName = (Button) findViewById(R.id.btnTeacherName);
        btnLocation = (Button) findViewById(R.id.btnLocation);
        btnLessonTerminationDate = (Button) findViewById(R.id.btnLessonTerminationDate);
        btnAppointmentAmount = (Button) findViewById(R.id.btnAppointmentAmount);

        btnLessonName.setOnClickListener(this);
        btnTeacherName.setOnClickListener(this);
        btnLocation.setOnClickListener(this);
        btnLessonTerminationDate.setOnClickListener(this);
        btnAppointmentAmount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLessonName:
                Intent lessonNameIntent = new Intent(this, LessonNameActivity.class);
                startActivityForResult(lessonNameIntent, 0);
                break;
            case R.id.btnTeacherName:
                Intent teacherNameIntent = new Intent(this, TeacherNameActivity.class);
                startActivityForResult(teacherNameIntent, 1);
                break;
            case R.id.btnLocation:
                Intent locationIntent = new Intent(this, LocationActivity.class);
                startActivityForResult(locationIntent, 2);
                break;
            case R.id.btnLessonTerminationDate:
                Intent lessonTerminationDateIntent = new Intent(this, LessonTerminationDateActivity.class);
                startActivityForResult(lessonTerminationDateIntent, 3);
                break;
            case R.id.btnAppointmentAmount:
                Intent appointmentAmountIntent = new Intent(this, AppointmentAmountActivity.class);
                startActivityForResult(appointmentAmountIntent, 4);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0) {
            if(resultCode == Activity.RESULT_OK){
                lessonName = data.getStringExtra("lessonName");
                String newBtnText = btnLessonName.getText().toString() + ": " + lessonName;
                btnLessonName.setText(newBtnText);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Der Vorgang: \"Benenne die Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();
            }
        }
        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                teacherName = data.getStringExtra("teacherName");
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Der Vorgang: \"Benenne den Lehrer der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();
            }
        }
        if (requestCode == 2) {
            if(resultCode == Activity.RESULT_OK){
                location = data.getStringExtra("location");
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Der Vorgang: \"Benenne den Ort/Raum der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();
            }
        }
        if (requestCode == 3) {
            if(resultCode == Activity.RESULT_OK){
                lessonTerminationDate = data.getLongExtra("lessonTerminationDate", 0);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Der Vorgang: \"Benenne das Datum der letzten Unterrichtsstunde vor den Ferien\" wurde abgebrochen!", Toast.LENGTH_LONG).show();
            }
        }
        if (requestCode == 4) {
            if(resultCode == Activity.RESULT_OK){
                appointmentAmount = data.getIntExtra("appointmentAmount", 0);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Der Vorgang: \"Benenne die Anzahl der Unterrichtsstunden pro Woche\" wurde abgebrochen!", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onBackPressed() {
            Intent returnIntent = new Intent();
            returnIntent.putExtra("lessonName", lessonName);
            returnIntent.putExtra("teacherName", teacherName);
            returnIntent.putExtra("location", location);
            returnIntent.putExtra("lessonTerminationDate", lessonTerminationDate);
            returnIntent.putExtra("appointmentAmount", appointmentAmount);
            setResult(Activity.RESULT_OK, returnIntent);
            finish();
    }
}