package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.HAStundenplanApp.R;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public class ConfigureMondayActivity extends Activity implements View.OnClickListener {
    Button btnLessonOneLesson;
    Button btnLessonTwoLesson;
    Button btnLessonThreeLesson;
    Button btnLessonFourLesson;
    Button btnLessonFiveLesson;
    Button btnLessonSixLesson;
    Button btnLessonSevenLesson;
    Button btnLessonEightLesson;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_monday);

        //this.findViewById(R.id.btnLessonOneLesson);
        btnLessonOneLesson = (Button) findViewById(R.id.btnLessonOneLesson);
        btnLessonTwoLesson = (Button) findViewById(R.id.btnLessonTwoLesson);
        btnLessonThreeLesson = (Button) findViewById(R.id.btnLessonThreeLesson);
        btnLessonFourLesson = (Button) findViewById(R.id.btnLessonFourLesson);
        btnLessonFourLesson = (Button) findViewById(R.id.btnLessonFourLesson);
        btnLessonFiveLesson = (Button) findViewById(R.id.btnLessonFiveLesson);
        btnLessonSixLesson = (Button) findViewById(R.id.btnLessonSixLesson);
        btnLessonSevenLesson = (Button) findViewById(R.id.btnLessonSevenLesson);
        btnLessonEightLesson = (Button) findViewById(R.id.btnLessonEightLesson);

        btnLessonOneLesson.setOnClickListener(this);
        btnLessonTwoLesson.setOnClickListener(this);
        btnLessonThreeLesson.setOnClickListener(this);
        btnLessonFourLesson.setOnClickListener(this);
        btnLessonFiveLesson.setOnClickListener(this);
        btnLessonSixLesson.setOnClickListener(this);
        btnLessonSevenLesson.setOnClickListener(this);
        btnLessonEightLesson.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLessonOneLesson:
                Intent lessonOneLessonIntent = new Intent(this, ChooseLesson.class);
                startActivityForResult(lessonOneLessonIntent, 11);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 11) {
            if(resultCode == Activity.RESULT_OK){
                String lessonName = data.getStringExtra("lessonName");
                String newBtnText = lessonName;
                btnLessonOneLesson.setText(newBtnText);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Der Vorgang: \"Benenne die Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();
            }
        }
    }
}