package com.example.HAStundenplanApp.AddLessonActivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.HAStundenplanApp.R;

/**
 * Created by Thilo S. on 13.07.2016.
 */
public class TeacherNameActivity extends Activity implements View.OnClickListener {
    private EditText etTeacherName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teachername);

        etTeacherName = (EditText) findViewById(R.id.etTeacherName);
        Button btnSaveTeacherName = (Button) findViewById(R.id.btnSaveTeacherName);
        btnSaveTeacherName.setOnClickListener(this);

        Intent teacherNameIntent = getIntent();
        if(teacherNameIntent.hasExtra("teacherName")) {
            try {
                etTeacherName.setText(teacherNameIntent.getStringExtra("teacherName"));
            } catch (NullPointerException e) {
                e.printStackTrace();
                Log.e("Catch block", Log.getStackTraceString(e));
            }
        }
    }

    //@Override public void onBackPressed() {}

    @Override
    public void onClick(View v) {
        String teacherName = etTeacherName.getText().toString();
        if (!teacherName.equals("zumBeispiel: Frau Schuster")) {
            Intent returnIntent = new Intent();
            returnIntent.putExtra("teacherName", teacherName);
            setResult(Activity.RESULT_OK, returnIntent);
            finish();
        }
        else {
            Toast.makeText(this, "Bitte gib den Namen des Lehrers ein!", Toast.LENGTH_LONG).show();
        }
    }
}