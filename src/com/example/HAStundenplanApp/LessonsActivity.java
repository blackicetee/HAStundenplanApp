package com.example.HAStundenplanApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import static com.example.HAStundenplanApp.DigitalScheduleMainActivity.*;

/**
 * Created by Thilo S. on 01.08.2016.
 */
public class LessonsActivity extends AppCompatActivity {
    ArrayList<ImplLessonParcel> lessons;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessons);

        Intent receivedIntent = getIntent();
        Bundle b = receivedIntent.getBundleExtra(LESSONS_BUNDLE);
        lessons = b.getParcelableArrayList(LESSONS);

    }
}