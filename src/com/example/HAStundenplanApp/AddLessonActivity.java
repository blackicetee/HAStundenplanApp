package com.example.HAStundenplanApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.example.HAStundenplanApp.AddLessonActivities.*;
import android.widget.LinearLayout.LayoutParams;

import java.util.*;

/**
 * Created by Thilo S. on 13.07.2016.
 */
public class AddLessonActivity extends Activity implements View.OnClickListener {
    private String lessonName = null;
    private String teacherName = null;
    private String location = null;
    private int lessonTerminationDateDay = 0;
    private int lessonTerminationDateMonth = 0;
    private int lessonTerminationDateYear = 0;
    private int appointmentAmount = 0;

    private Button btnLessonName;
    private Button btnTeacherName;
    private Button btnLocation;
    private Button btnLessonTerminationDate;
    private Button btnAppointmentAmount;
    private List<Button> appointmentButtons = new ArrayList<>();
    private boolean buttonON = false;


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
                if (lessonName == null) {
                    startActivityForResult(lessonNameIntent, 0);
                }
                else {
                    lessonNameIntent.putExtra("lessonName", lessonName);
                    startActivityForResult(lessonNameIntent, 0);
                }
                break;
            case R.id.btnTeacherName:
                Intent teacherNameIntent = new Intent(this, TeacherNameActivity.class);
                if (teacherName == null) {
                    startActivityForResult(teacherNameIntent, 1);
                }
                else {
                    teacherNameIntent.putExtra("teacherName", teacherName);
                    startActivityForResult(teacherNameIntent, 1);
                }
                break;
            case R.id.btnLocation:
                Intent locationIntent = new Intent(this, LocationActivity.class);
                if (location == null) {
                    startActivityForResult(locationIntent, 2);
                }
                else {
                    locationIntent.putExtra("location", location);
                    startActivityForResult(locationIntent, 2);
                }
                break;
            case R.id.btnLessonTerminationDate:
                Intent lessonTerminationDateIntent = new Intent(this, LessonTerminationDateActivity.class);
                if (lessonTerminationDateYear == 0) {
                    startActivityForResult(lessonTerminationDateIntent, 3);
                }
                else {
                    lessonTerminationDateIntent.putExtra("lessonTerminationDateDay", lessonTerminationDateDay);
                    lessonTerminationDateIntent.putExtra("lessonTerminationDateMonth", lessonTerminationDateMonth);
                    lessonTerminationDateIntent.putExtra("lessonTerminationDateYear", lessonTerminationDateYear);
                    startActivityForResult(lessonTerminationDateIntent, 3);
                }
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
                String newBtnText = "Unterrichtsstunde: " + lessonName;
                btnLessonName.setText(newBtnText);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Der Vorgang: \"Benenne die Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();
            }
        }
        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                teacherName = data.getStringExtra("teacherName");
                String newBtnText = "Lehrer: " + teacherName;
                btnTeacherName.setText(newBtnText);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Der Vorgang: \"Benenne den Lehrer der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();
            }
        }
        if (requestCode == 2) {
            if(resultCode == Activity.RESULT_OK){
                location = data.getStringExtra("location");
                String newBtnText = "Raum/Ort: " + location;
                btnLocation.setText(newBtnText);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Der Vorgang: \"Benenne den Raum/Ort der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();
            }
        }
        if (requestCode == 3) {
            if(resultCode == Activity.RESULT_OK){
                lessonTerminationDateDay = data.getIntExtra("lessonTerminationDateDay", 0);
                lessonTerminationDateMonth = data.getIntExtra("lessonTerminationDateMonth", 0);
                lessonTerminationDateYear = data.getIntExtra("lessonTerminationDateYear", 0);
                String newBtnText = "Letzte Stunde am: " + lessonTerminationDateDay + "." + (lessonTerminationDateMonth+1) + "." + lessonTerminationDateYear;
                btnLessonTerminationDate.setText(newBtnText);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Der Vorgang: \"Benenne das Datum der letzten Unterrichtsstunde vor den Ferien\" wurde abgebrochen!", Toast.LENGTH_LONG).show();
            }
        }
        if (requestCode == 4) {
            if(resultCode == Activity.RESULT_OK){
                LinearLayout layout = (LinearLayout) findViewById(R.id.appointmentButtonContainer);
                layout.setOrientation(LinearLayout.VERTICAL);

                if (buttonON) {
                    for (int i = 0; i < appointmentAmount; i++) {
                        Button btn = appointmentButtons.get(i);
                        layout.removeView(btn);
                    }
                    appointmentButtons.clear();
                    buttonON = false;
                }

                appointmentAmount = data.getIntExtra("appointmentAmount", 0);
                String newBtnText = "Anzahl Wochenstunden: " + appointmentAmount;
                btnAppointmentAmount.setText(newBtnText);

                if (!buttonON) {
                    for (int i = 0; i < appointmentAmount; i++) {
                        Button btnTag = new Button(this);
                        btnTag.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
                        String btnText = "Termin " + (1 + (i));
                        btnTag.setText(btnText);
                        btnTag.setId(1 + i);
                        appointmentButtons.add(btnTag);
                        layout.addView(btnTag);
                    }
                    buttonON = true;
                }
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
            returnIntent.putExtra("lessonTerminationDateDay", lessonTerminationDateDay);
            returnIntent.putExtra("lessonTerminationDateMonth", lessonTerminationDateMonth);
            returnIntent.putExtra("lessonTerminationDateYear", lessonTerminationDateYear);
            returnIntent.putExtra("appointmentAmount", appointmentAmount);
            setResult(Activity.RESULT_OK, returnIntent);
            finish();
    }
}