package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.example.HAStundenplanApp.Configuration;
import com.example.HAStundenplanApp.DummyConfiguration;
import com.example.HAStundenplanApp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public class ChooseLesson extends Activity {
    public static final String LESSON_NAME = "lessonName";
    private List<String> lessonNames;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_lesson);

        DummyConfiguration dc = new DummyConfiguration();
        Configuration configuration = dc.getConfiguration();
        lessonNames = configuration.getLessonNames();
        lessonNames.add("Fach");


        LinearLayout layout = (LinearLayout) findViewById(R.id.lessonNamesContainer);

        for (int i = 0; i < lessonNames.size(); i++) {
            Button btnTag = new Button(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0,2,0,0);
            btnTag.setLayoutParams(layoutParams);
            btnTag.setTextColor(0xff000000);
            btnTag.setBackgroundResource(R.drawable.button);
            String btnText = lessonNames.get(i);
            btnTag.setText(btnText);
            btnTag.setId(i);
            btnTag.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra(LESSON_NAME, lessonNames.get(v.getId()));
                    setResult(Activity.RESULT_OK, returnIntent);
                    finish();
                }
            });
            layout.addView(btnTag);
        }
    }
}