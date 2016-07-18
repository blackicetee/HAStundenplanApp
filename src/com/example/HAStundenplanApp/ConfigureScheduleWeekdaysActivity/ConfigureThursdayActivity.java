package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.HAStundenplanApp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public class ConfigureThursdayActivity extends Activity implements View.OnClickListener {
    private String[] thursdayLessonNames = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] thursdayTeachers = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] thursdayRooms = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] thursdayPeriods = new String[] {"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    private Button btnThursdayLessonZeroLessonName;
    private Button btnThursdayLessonOneLessonName;
    private Button btnThursdayLessonTwoLessonName;
    private Button btnThursdayLessonThreeLessonName;
    private Button btnThursdayLessonFourLessonName;
    private Button btnThursdayLessonFiveLessonName;
    private Button btnThursdayLessonSixLessonName;
    private Button btnThursdayLessonSevenLessonName;
    private Button btnThursdayLessonEightLessonName;
    private Button btnThursdayLessonNineLessonName;

    private Button btnThursdayLessonZeroTeacher;
    private Button btnThursdayLessonOneTeacher;
    private Button btnThursdayLessonTwoTeacher;
    private Button btnThursdayLessonThreeTeacher;
    private Button btnThursdayLessonFourTeacher;
    private Button btnThursdayLessonFiveTeacher;
    private Button btnThursdayLessonSixTeacher;
    private Button btnThursdayLessonSevenTeacher;
    private Button btnThursdayLessonEightTeacher;
    private Button btnThursdayLessonNineTeacher;

    private Button btnThursdayLessonZeroRoom;
    private Button btnThursdayLessonOneRoom;
    private Button btnThursdayLessonTwoRoom;
    private Button btnThursdayLessonThreeRoom;
    private Button btnThursdayLessonFourRoom;
    private Button btnThursdayLessonFiveRoom;
    private Button btnThursdayLessonSixRoom;
    private Button btnThursdayLessonSevenRoom;
    private Button btnThursdayLessonEightRoom;
    private Button btnThursdayLessonNineRoom;

    private Button btnThursdayLessonZeroPeriod;
    private Button btnThursdayLessonOnePeriod;
    private Button btnThursdayLessonTwoPeriod;
    private Button btnThursdayLessonThreePeriod;
    private Button btnThursdayLessonFourPeriod;
    private Button btnThursdayLessonFivePeriod;
    private Button btnThursdayLessonSixPeriod;
    private Button btnThursdayLessonSevenPeriod;
    private Button btnThursdayLessonEightPeriod;
    private Button btnThursdayLessonNinePeriod;

    private Button btnThursdaySave;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_thursday);

        btnThursdayLessonZeroLessonName = (Button) findViewById(R.id.btnThursdayLessonZeroLessonName);
        btnThursdayLessonOneLessonName = (Button) findViewById(R.id.btnThursdayLessonOneLessonName);
        btnThursdayLessonTwoLessonName = (Button) findViewById(R.id.btnThursdayLessonTwoLessonName);
        btnThursdayLessonThreeLessonName = (Button) findViewById(R.id.btnThursdayLessonThreeLessonName);
        btnThursdayLessonFourLessonName = (Button) findViewById(R.id.btnThursdayLessonFourLessonName);
        btnThursdayLessonFiveLessonName = (Button) findViewById(R.id.btnThursdayLessonFiveLessonName);
        btnThursdayLessonSixLessonName = (Button) findViewById(R.id.btnThursdayLessonSixLessonName);
        btnThursdayLessonSevenLessonName = (Button) findViewById(R.id.btnThursdayLessonSevenLessonName);
        btnThursdayLessonEightLessonName = (Button) findViewById(R.id.btnThursdayLessonEightLessonName);
        btnThursdayLessonNineLessonName = (Button) findViewById(R.id.btnThursdayLessonNineLessonName);

        btnThursdayLessonZeroLessonName.setOnClickListener(this);
        btnThursdayLessonOneLessonName.setOnClickListener(this);
        btnThursdayLessonTwoLessonName.setOnClickListener(this);
        btnThursdayLessonThreeLessonName.setOnClickListener(this);
        btnThursdayLessonFourLessonName.setOnClickListener(this);
        btnThursdayLessonFiveLessonName.setOnClickListener(this);
        btnThursdayLessonSixLessonName.setOnClickListener(this);
        btnThursdayLessonSevenLessonName.setOnClickListener(this);
        btnThursdayLessonEightLessonName.setOnClickListener(this);
        btnThursdayLessonNineLessonName.setOnClickListener(this);

        btnThursdayLessonZeroTeacher = (Button) findViewById(R.id.btnThursdayLessonZeroTeacher);
        btnThursdayLessonOneTeacher = (Button) findViewById(R.id.btnThursdayLessonOneTeacher);
        btnThursdayLessonTwoTeacher = (Button) findViewById(R.id.btnThursdayLessonTwoTeacher);
        btnThursdayLessonThreeTeacher = (Button) findViewById(R.id.btnThursdayLessonThreeTeacher);
        btnThursdayLessonFourTeacher = (Button) findViewById(R.id.btnThursdayLessonFourTeacher);
        btnThursdayLessonFiveTeacher = (Button) findViewById(R.id.btnThursdayLessonFiveTeacher);
        btnThursdayLessonSixTeacher = (Button) findViewById(R.id.btnThursdayLessonSixTeacher);
        btnThursdayLessonSevenTeacher = (Button) findViewById(R.id.btnThursdayLessonSevenTeacher);
        btnThursdayLessonEightTeacher = (Button) findViewById(R.id.btnThursdayLessonEightTeacher);
        btnThursdayLessonNineTeacher = (Button) findViewById(R.id.btnThursdayLessonNineTeacher);

        btnThursdayLessonZeroTeacher.setOnClickListener(this);
        btnThursdayLessonOneTeacher.setOnClickListener(this);
        btnThursdayLessonTwoTeacher.setOnClickListener(this);
        btnThursdayLessonThreeTeacher.setOnClickListener(this);
        btnThursdayLessonFourTeacher.setOnClickListener(this);
        btnThursdayLessonFiveTeacher.setOnClickListener(this);
        btnThursdayLessonSixTeacher.setOnClickListener(this);
        btnThursdayLessonSevenTeacher.setOnClickListener(this);
        btnThursdayLessonEightTeacher.setOnClickListener(this);
        btnThursdayLessonNineTeacher.setOnClickListener(this);

        btnThursdayLessonZeroRoom = (Button) findViewById(R.id.btnThursdayLessonZeroRoom);
        btnThursdayLessonOneRoom = (Button) findViewById(R.id.btnThursdayLessonOneRoom);
        btnThursdayLessonTwoRoom = (Button) findViewById(R.id.btnThursdayLessonTwoRoom);
        btnThursdayLessonThreeRoom = (Button) findViewById(R.id.btnThursdayLessonThreeRoom);
        btnThursdayLessonFourRoom = (Button) findViewById(R.id.btnThursdayLessonFourRoom);
        btnThursdayLessonFiveRoom = (Button) findViewById(R.id.btnThursdayLessonFiveRoom);
        btnThursdayLessonSixRoom = (Button) findViewById(R.id.btnThursdayLessonSixRoom);
        btnThursdayLessonSevenRoom = (Button) findViewById(R.id.btnThursdayLessonSevenRoom);
        btnThursdayLessonEightRoom = (Button) findViewById(R.id.btnThursdayLessonEightRoom);
        btnThursdayLessonNineRoom = (Button) findViewById(R.id.btnThursdayLessonNineRoom);

        btnThursdayLessonZeroRoom.setOnClickListener(this);
        btnThursdayLessonOneRoom.setOnClickListener(this);
        btnThursdayLessonTwoRoom.setOnClickListener(this);
        btnThursdayLessonThreeRoom.setOnClickListener(this);
        btnThursdayLessonFourRoom.setOnClickListener(this);
        btnThursdayLessonFiveRoom.setOnClickListener(this);
        btnThursdayLessonSixRoom.setOnClickListener(this);
        btnThursdayLessonSevenRoom.setOnClickListener(this);
        btnThursdayLessonEightRoom.setOnClickListener(this);
        btnThursdayLessonNineRoom.setOnClickListener(this);

        btnThursdayLessonZeroPeriod = (Button) findViewById(R.id.btnThursdayLessonZeroPeriod);
        btnThursdayLessonOnePeriod = (Button) findViewById(R.id.btnThursdayLessonOnePeriod);
        btnThursdayLessonTwoPeriod = (Button) findViewById(R.id.btnThursdayLessonTwoPeriod);
        btnThursdayLessonThreePeriod = (Button) findViewById(R.id.btnThursdayLessonThreePeriod);
        btnThursdayLessonFourPeriod = (Button) findViewById(R.id.btnThursdayLessonFourPeriod);
        btnThursdayLessonFivePeriod = (Button) findViewById(R.id.btnThursdayLessonFivePeriod);
        btnThursdayLessonSixPeriod = (Button) findViewById(R.id.btnThursdayLessonSixPeriod);
        btnThursdayLessonSevenPeriod = (Button) findViewById(R.id.btnThursdayLessonSevenPeriod);
        btnThursdayLessonEightPeriod = (Button) findViewById(R.id.btnThursdayLessonEightPeriod);
        btnThursdayLessonNinePeriod = (Button) findViewById(R.id.btnThursdayLessonNinePeriod);

        btnThursdayLessonZeroPeriod.setOnClickListener(this);
        btnThursdayLessonOnePeriod.setOnClickListener(this);
        btnThursdayLessonTwoPeriod.setOnClickListener(this);
        btnThursdayLessonThreePeriod.setOnClickListener(this);
        btnThursdayLessonFourPeriod.setOnClickListener(this);
        btnThursdayLessonFivePeriod.setOnClickListener(this);
        btnThursdayLessonSixPeriod.setOnClickListener(this);
        btnThursdayLessonSevenPeriod.setOnClickListener(this);
        btnThursdayLessonEightPeriod.setOnClickListener(this);
        btnThursdayLessonNinePeriod.setOnClickListener(this);

        btnThursdaySave = (Button) findViewById(R.id.btnThursdaySave);
        btnThursdaySave.setOnClickListener(this);
    }

    private boolean checkScheduleRow(int row) {
        return !thursdayLessonNames[row].equals("") && !thursdayTeachers[row].equals("") && !thursdayRooms[row].equals("");
    }

    @Override
    public void onClick(View v) {
        Intent thursdayLessonNameIntent = new Intent(this, ChooseLesson.class);
        Intent thursdayTeacherIntent = new Intent(this, ChooseTeacher.class);
        Intent thursdayRoomIntent = new Intent(this, ChooseRoom.class);
        Intent thursdayPeriodIntent = new Intent(this, ChoosePeriod.class);
        switch (v.getId()) {
            case R.id.btnThursdayLessonZeroLessonName:
                startActivityForResult(thursdayLessonNameIntent, 10);
                break;
            case R.id.btnThursdayLessonOneLessonName:
                startActivityForResult(thursdayLessonNameIntent, 11);
                break;
            case R.id.btnThursdayLessonTwoLessonName:
                startActivityForResult(thursdayLessonNameIntent, 12);
                break;
            case R.id.btnThursdayLessonThreeLessonName:
                startActivityForResult(thursdayLessonNameIntent, 13);
                break;
            case R.id.btnThursdayLessonFourLessonName:
                startActivityForResult(thursdayLessonNameIntent, 14);
                break;
            case R.id.btnThursdayLessonFiveLessonName:
                startActivityForResult(thursdayLessonNameIntent, 15);
                break;
            case R.id.btnThursdayLessonSixLessonName:
                startActivityForResult(thursdayLessonNameIntent, 16);
                break;
            case R.id.btnThursdayLessonSevenLessonName:
                startActivityForResult(thursdayLessonNameIntent, 17);
                break;
            case R.id.btnThursdayLessonEightLessonName:
                startActivityForResult(thursdayLessonNameIntent, 18);
                break;
            case R.id.btnThursdayLessonNineLessonName:
                startActivityForResult(thursdayLessonNameIntent, 19);
                break;
            case R.id.btnThursdayLessonZeroTeacher:
                startActivityForResult(thursdayTeacherIntent, 20);
                break;
            case R.id.btnThursdayLessonOneTeacher:
                startActivityForResult(thursdayTeacherIntent, 21);
                break;
            case R.id.btnThursdayLessonTwoTeacher:
                startActivityForResult(thursdayTeacherIntent, 22);
                break;
            case R.id.btnThursdayLessonThreeTeacher:
                startActivityForResult(thursdayTeacherIntent, 23);
                break;
            case R.id.btnThursdayLessonFourTeacher:
                startActivityForResult(thursdayTeacherIntent, 24);
                break;
            case R.id.btnThursdayLessonFiveTeacher:
                startActivityForResult(thursdayTeacherIntent, 25);
                break;
            case R.id.btnThursdayLessonSixTeacher:
                startActivityForResult(thursdayTeacherIntent, 26);
                break;
            case R.id.btnThursdayLessonSevenTeacher:
                startActivityForResult(thursdayTeacherIntent, 27);
                break;
            case R.id.btnThursdayLessonEightTeacher:
                startActivityForResult(thursdayTeacherIntent, 28);
                break;
            case R.id.btnThursdayLessonNineTeacher:
                startActivityForResult(thursdayTeacherIntent, 29);
                break;
            case R.id.btnThursdayLessonZeroRoom:
                startActivityForResult(thursdayRoomIntent, 30);
                break;
            case R.id.btnThursdayLessonOneRoom:
                startActivityForResult(thursdayRoomIntent, 31);
                break;
            case R.id.btnThursdayLessonTwoRoom:
                startActivityForResult(thursdayRoomIntent, 32);
                break;
            case R.id.btnThursdayLessonThreeRoom:
                startActivityForResult(thursdayRoomIntent, 33);
                break;
            case R.id.btnThursdayLessonFourRoom:
                startActivityForResult(thursdayRoomIntent, 34);
                break;
            case R.id.btnThursdayLessonFiveRoom:
                startActivityForResult(thursdayRoomIntent, 35);
                break;
            case R.id.btnThursdayLessonSixRoom:
                startActivityForResult(thursdayRoomIntent, 36);
                break;
            case R.id.btnThursdayLessonSevenRoom:
                startActivityForResult(thursdayRoomIntent, 37);
                break;
            case R.id.btnThursdayLessonEightRoom:
                startActivityForResult(thursdayRoomIntent, 38);
                break;
            case R.id.btnThursdayLessonNineRoom:
                startActivityForResult(thursdayRoomIntent, 39);
                break;
            case R.id.btnThursdayLessonZeroPeriod:
                startActivityForResult(thursdayPeriodIntent, 40);
                break;
            case R.id.btnThursdayLessonOnePeriod:
                startActivityForResult(thursdayPeriodIntent, 41);
                break;
            case R.id.btnThursdayLessonTwoPeriod:
                startActivityForResult(thursdayPeriodIntent, 42);
                break;
            case R.id.btnThursdayLessonThreePeriod:
                startActivityForResult(thursdayPeriodIntent, 44);
                break;
            case R.id.btnThursdayLessonFourPeriod:
                startActivityForResult(thursdayPeriodIntent, 44);
                break;
            case R.id.btnThursdayLessonFivePeriod:
                startActivityForResult(thursdayPeriodIntent, 45);
                break;
            case R.id.btnThursdayLessonSixPeriod:
                startActivityForResult(thursdayPeriodIntent, 46);
                break;
            case R.id.btnThursdayLessonSevenPeriod:
                startActivityForResult(thursdayPeriodIntent, 47);
                break;
            case R.id.btnThursdayLessonEightPeriod:
                startActivityForResult(thursdayPeriodIntent, 48);
                break;
            case R.id.btnThursdayLessonNinePeriod:
                startActivityForResult(thursdayPeriodIntent, 49);
                break;
            case R.id.btnThursdaySave:
                Intent configureScheduleIntent = new Intent(this, ConfigureFridayActivity.class);
                startActivityForResult(configureScheduleIntent, 100);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 10:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnThursdayLessonZeroLessonName.setText(thursdayLessonName);
                    thursdayLessonNames[0] = thursdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {
                    Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 11:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnThursdayLessonOneLessonName.setText(thursdayLessonName);
                    thursdayLessonNames[1] = thursdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 12:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnThursdayLessonTwoLessonName.setText(thursdayLessonName);
                    thursdayLessonNames[2] = thursdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 13:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnThursdayLessonThreeLessonName.setText(thursdayLessonName);
                    thursdayLessonNames[3] = thursdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 14:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnThursdayLessonFourLessonName.setText(thursdayLessonName);
                    thursdayLessonNames[4] = thursdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 15:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnThursdayLessonFiveLessonName.setText(thursdayLessonName);
                    thursdayLessonNames[5] = thursdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 16:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnThursdayLessonSixLessonName.setText(thursdayLessonName);
                    thursdayLessonNames[6] = thursdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 17:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnThursdayLessonSevenLessonName.setText(thursdayLessonName);
                    thursdayLessonNames[7] = thursdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 18:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnThursdayLessonEightLessonName.setText(thursdayLessonName);
                    thursdayLessonNames[8] = thursdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 19:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnThursdayLessonNineLessonName.setText(thursdayLessonName);
                    thursdayLessonNames[9] = thursdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 20:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnThursdayLessonZeroTeacher.setText(thursdayTeacher);
                    thursdayTeachers[0] = thursdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 21:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnThursdayLessonOneTeacher.setText(thursdayTeacher);
                    thursdayTeachers[1] = thursdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 22:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnThursdayLessonTwoTeacher.setText(thursdayTeacher);
                    thursdayTeachers[2] = thursdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 23:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnThursdayLessonThreeTeacher.setText(thursdayTeacher);
                    thursdayTeachers[3] = thursdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 24:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnThursdayLessonFourTeacher.setText(thursdayTeacher);
                    thursdayTeachers[4] = thursdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 25:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnThursdayLessonFiveTeacher.setText(thursdayTeacher);
                    thursdayTeachers[5] = thursdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 26:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnThursdayLessonSixTeacher.setText(thursdayTeacher);
                    thursdayTeachers[6] = thursdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 27:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnThursdayLessonSevenTeacher.setText(thursdayTeacher);
                    thursdayTeachers[7] = thursdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 28:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnThursdayLessonEightTeacher.setText(thursdayTeacher);
                    thursdayTeachers[8] = thursdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 29:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnThursdayLessonNineTeacher.setText(thursdayTeacher);
                    thursdayTeachers[9] = thursdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 30:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnThursdayLessonZeroRoom.setText(thursdayRoom);
                    thursdayRooms[0] = thursdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 31:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnThursdayLessonOneRoom.setText(thursdayRoom);
                    thursdayRooms[1] = thursdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 32:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnThursdayLessonTwoRoom.setText(thursdayRoom);
                    thursdayRooms[2] = thursdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 33:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnThursdayLessonThreeRoom.setText(thursdayRoom);
                    thursdayRooms[3] = thursdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 34:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnThursdayLessonFourRoom.setText(thursdayRoom);
                    thursdayRooms[4] = thursdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 35:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnThursdayLessonFiveRoom.setText(thursdayRoom);
                    thursdayRooms[5] = thursdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 36:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnThursdayLessonSixRoom.setText(thursdayRoom);
                    thursdayRooms[6] = thursdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 37:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnThursdayLessonSevenRoom.setText(thursdayRoom);
                    thursdayRooms[7] = thursdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 38:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnThursdayLessonEightRoom.setText(thursdayRoom);
                    thursdayRooms[8] = thursdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 39:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnThursdayLessonNineRoom.setText(thursdayRoom);
                    thursdayRooms[9] = thursdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;

            case 40:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnThursdayLessonZeroPeriod.setText(thursdayPeriod);
                    thursdayPeriods[0] = thursdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 41:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnThursdayLessonOnePeriod.setText(thursdayPeriod);
                    thursdayPeriods[1] = thursdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 42:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnThursdayLessonTwoPeriod.setText(thursdayPeriod);
                    thursdayPeriods[2] = thursdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 43:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnThursdayLessonThreePeriod.setText(thursdayPeriod);
                    thursdayPeriods[3] = thursdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 44:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnThursdayLessonFourPeriod.setText(thursdayPeriod);
                    thursdayPeriods[4] = thursdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 45:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnThursdayLessonFivePeriod.setText(thursdayPeriod);
                    thursdayPeriods[5] = thursdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 46:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnThursdayLessonSixPeriod.setText(thursdayPeriod);
                    thursdayPeriods[6] = thursdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 47:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnThursdayLessonSevenPeriod.setText(thursdayPeriod);
                    thursdayPeriods[7] = thursdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 48:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnThursdayLessonEightPeriod.setText(thursdayPeriod);
                    thursdayPeriods[8] = thursdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 49:
                if(resultCode == Activity.RESULT_OK){
                    String thursdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnThursdayLessonNinePeriod.setText(thursdayPeriod);
                    thursdayPeriods[9] = thursdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 100:
                if(resultCode == Activity.RESULT_OK){
                    data.putExtra("thursdayLessonNames", thursdayLessonNames);
                    data.putExtra("thursdayTeachers", thursdayTeachers);
                    data.putExtra("thursdayRooms", thursdayRooms);
                    data.putExtra("thursdayPeriods", thursdayPeriods);
                    setResult(Activity.RESULT_OK, data);
                    finish();
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Erstellen des Stundenplans am Freitag\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
        }
    }
}