package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.example.HAStundenplanApp.R;

import java.util.ArrayList;

import static com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity.ChooseLesson.createDynamicButtons;
import static com.example.HAStundenplanApp.DigitalScheduleMainActivity.METADATA_BUNDLE;
import static com.example.HAStundenplanApp.DigitalScheduleMainActivity.TEACHERS;

/**
 * Created by Thilo S. on 18.07.2016.
 */
public class ChooseTeacher extends Activity {
    public static final String TEACHER_NAME = "teacher";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_teacher);

        ArrayList<String> teachers = getIntent().getBundleExtra(METADATA_BUNDLE).getStringArrayList(TEACHERS);
        try {
            teachers.add("Lehrer");
        } catch (NullPointerException nE) {
            throw new NullPointerException("Teachers is Null: getIntent().getBundleExtra(METADATA_BUNDLE).getStringArrayList(TEACHERS)");
        }

        LinearLayout layout = (LinearLayout) findViewById(R.id.teachersContainer);

        createDynamicButtons(teachers, this, TEACHER_NAME, layout);
    }
}