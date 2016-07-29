package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.example.HAStundenplanApp.R;

import java.util.ArrayList;

import static com.example.HAStundenplanApp.DigitalScheduleMainActivity.METADATA_BUNDLE;
import static com.example.HAStundenplanApp.DigitalScheduleMainActivity.LESSON_NAMES;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public class ChooseLesson extends Activity {
    public static final String LESSON_NAME = "lessonName";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_lesson);

        ArrayList<String> lessonNames = getIntent().getBundleExtra(METADATA_BUNDLE).getStringArrayList(LESSON_NAMES);
        try {
            lessonNames.add("Fach");
        } catch (NullPointerException nE) {
            throw new NullPointerException("LessonNames is Null: getIntent().getBundleExtra(METADATA_BUNDLE).getStringArrayList(LESSON_NAMES)");
        }

        LinearLayout layout = (LinearLayout) findViewById(R.id.lessonNamesContainer);

        createDynamicButtons(lessonNames, this, LESSON_NAME, layout);
    }

    public static void createDynamicButtons(ArrayList<String> stringArrayList, Activity activity, String intentKey, LinearLayout layout) {
        for (int i = 0; i < stringArrayList.size(); i++) {
            Button btnTag = new Button(activity);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0,2,0,0);
            btnTag.setLayoutParams(layoutParams);
            btnTag.setTextColor(0xff000000);
            btnTag.setBackgroundResource(R.drawable.button);
            String btnText = stringArrayList.get(i);
            btnTag.setText(btnText);
            btnTag.setId(i);
            btnTag.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra(intentKey, stringArrayList.get(v.getId()));

                    activity.setResult(Activity.RESULT_OK, returnIntent);
                    activity.finish();
                }
            });
            layout.addView(btnTag);
        }
    }
}