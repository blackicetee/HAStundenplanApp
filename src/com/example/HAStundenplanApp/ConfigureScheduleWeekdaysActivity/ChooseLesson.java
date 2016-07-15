package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import com.example.HAStundenplanApp.Configuration;
import com.example.HAStundenplanApp.DummyConfiguration;
import com.example.HAStundenplanApp.R;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public class ChooseLesson extends Activity {
    private List<String> lessonNames;
    private List<Button> lessonNameButtons = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_lesson);

        DummyConfiguration dc = new DummyConfiguration();
        Configuration configuration = dc.getConfiguration();
        lessonNames = configuration.getLessonNames();


        LinearLayout layout = (LinearLayout) findViewById(R.id.lessonNamesContainer);
        
        for (int i = 0; i < lessonNames.size(); i++) {
            Button btnTag = new Button(this);
            btnTag.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            String btnText = lessonNames.get(i);
            btnTag.setText(btnText);
            btnTag.setId(1 + i);
            lessonNameButtons.add(btnTag);
            layout.addView(btnTag);
        }
    }
}