package com.example.HAStundenplanApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Thilo S. on 13.07.2016.
 */
public class ScheduleActivity extends Activity implements View.OnClickListener {

    private Button btnAddLesson;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);


        btnAddLesson = (Button) findViewById(R.id.btnAddLesson);

        btnAddLesson.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnAddLesson:
                Intent addLessonIntent = new Intent(this, AddLessonActivity.class);
                startActivityForResult(addLessonIntent, 0);
                break;
        }
    }
}