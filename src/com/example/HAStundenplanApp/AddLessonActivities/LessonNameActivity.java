package com.example.HAStundenplanApp.AddLessonActivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.example.HAStundenplanApp.R;

/**
 * Created by Thilo S. on 13.07.2016.
 */
public class LessonNameActivity extends Activity {
    private EditText etLessonName;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessonname);
        etLessonName = (EditText) findViewById(R.id.etLessonName);
    }

    @Override
    public void onBackPressed() {
        String lessonName = etLessonName.getText().toString();
        if (!lessonName.equals("zumBeispiel: Deutsch")) {
            Intent returnIntent = new Intent();
            returnIntent.putExtra("lessonName", lessonName);
            setResult(Activity.RESULT_OK, returnIntent);
            finish();
        }
        else {
            Toast.makeText(this, "Bitte gib den Namen der Unterrichtsstunde ein!", Toast.LENGTH_LONG).show();
        }
    }
}