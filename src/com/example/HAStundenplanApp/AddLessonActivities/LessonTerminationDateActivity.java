package com.example.HAStundenplanApp.AddLessonActivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import com.example.HAStundenplanApp.R;

/**
 * Created by Thilo S. on 13.07.2016.
 */
public class LessonTerminationDateActivity extends Activity implements View.OnClickListener {
    private DatePicker lessonTerminationDatePicker;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessonterminationdate);

        lessonTerminationDatePicker = (DatePicker) findViewById(R.id.lessonTerminationDatePicker);
        Button btnSaveLessonTerminationDate = (Button) findViewById(R.id.btnSaveLessonTerminationDate);

        btnSaveLessonTerminationDate.setOnClickListener(this);

        Intent lessonTerminationDate = getIntent();
        if(lessonTerminationDate.hasExtra("lessonTerminationDateDay") && lessonTerminationDate.hasExtra("lessonTerminationDateMonth") && lessonTerminationDate.hasExtra("lessonTerminationDateYear")) {
            try {
                lessonTerminationDatePicker.init(lessonTerminationDate.getIntExtra("lessonTerminationDateYear", 0), lessonTerminationDate.getIntExtra("lessonTerminationDateMonth", 0), lessonTerminationDate.getIntExtra("lessonTerminationDateDay", 0), new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        
                    }
                });
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onClick(View v) {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("lessonTerminationDateDay", lessonTerminationDatePicker.getDayOfMonth());
        returnIntent.putExtra("lessonTerminationDateMonth", lessonTerminationDatePicker.getMonth());
        returnIntent.putExtra("lessonTerminationDateYear", lessonTerminationDatePicker.getYear());
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}