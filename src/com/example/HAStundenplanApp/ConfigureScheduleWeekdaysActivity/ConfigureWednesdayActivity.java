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
public class ConfigureWednesdayActivity extends Activity implements View.OnClickListener {
    private String[] wednesdayLessonNames = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] wednesdayTeachers = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] wednesdayRooms = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] wednesdayPeriods = new String[] {"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    private static final String CANCEL_MSG_CONFIGURE_THURSDAY = "Der Vorgang: \"Erstellen des Stundenplans am Donnerstag\" wurde abgebrochen!";

    public static final String WEDNESDAY_LESSON_NAMES = "wednesdayLessonNames";
    public static final String WEDNESDAY_TEACHER_NAMES = "wednesdayTeachers";
    public static final String WEDNESDAY_ROOMS = "wednesdayRooms";
    public static final String WEDNESDAY_PERIODS = "wednesdayPeriods";

    private Button btnWednesdayLessonZeroLessonName;
    private Button btnWednesdayLessonOneLessonName;
    private Button btnWednesdayLessonTwoLessonName;
    private Button btnWednesdayLessonThreeLessonName;
    private Button btnWednesdayLessonFourLessonName;
    private Button btnWednesdayLessonFiveLessonName;
    private Button btnWednesdayLessonSixLessonName;
    private Button btnWednesdayLessonSevenLessonName;
    private Button btnWednesdayLessonEightLessonName;
    private Button btnWednesdayLessonNineLessonName;

    private Button btnWednesdayLessonZeroTeacher;
    private Button btnWednesdayLessonOneTeacher;
    private Button btnWednesdayLessonTwoTeacher;
    private Button btnWednesdayLessonThreeTeacher;
    private Button btnWednesdayLessonFourTeacher;
    private Button btnWednesdayLessonFiveTeacher;
    private Button btnWednesdayLessonSixTeacher;
    private Button btnWednesdayLessonSevenTeacher;
    private Button btnWednesdayLessonEightTeacher;
    private Button btnWednesdayLessonNineTeacher;

    private Button btnWednesdayLessonZeroRoom;
    private Button btnWednesdayLessonOneRoom;
    private Button btnWednesdayLessonTwoRoom;
    private Button btnWednesdayLessonThreeRoom;
    private Button btnWednesdayLessonFourRoom;
    private Button btnWednesdayLessonFiveRoom;
    private Button btnWednesdayLessonSixRoom;
    private Button btnWednesdayLessonSevenRoom;
    private Button btnWednesdayLessonEightRoom;
    private Button btnWednesdayLessonNineRoom;

    private Button btnWednesdayLessonZeroPeriod;
    private Button btnWednesdayLessonOnePeriod;
    private Button btnWednesdayLessonTwoPeriod;
    private Button btnWednesdayLessonThreePeriod;
    private Button btnWednesdayLessonFourPeriod;
    private Button btnWednesdayLessonFivePeriod;
    private Button btnWednesdayLessonSixPeriod;
    private Button btnWednesdayLessonSevenPeriod;
    private Button btnWednesdayLessonEightPeriod;
    private Button btnWednesdayLessonNinePeriod;

    private Button btnWednesdaySave;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_wednesday);

        btnWednesdayLessonZeroLessonName = (Button) findViewById(R.id.btnWednesdayLessonZeroLessonName);
        btnWednesdayLessonOneLessonName = (Button) findViewById(R.id.btnWednesdayLessonOneLessonName);
        btnWednesdayLessonTwoLessonName = (Button) findViewById(R.id.btnWednesdayLessonTwoLessonName);
        btnWednesdayLessonThreeLessonName = (Button) findViewById(R.id.btnWednesdayLessonThreeLessonName);
        btnWednesdayLessonFourLessonName = (Button) findViewById(R.id.btnWednesdayLessonFourLessonName);
        btnWednesdayLessonFiveLessonName = (Button) findViewById(R.id.btnWednesdayLessonFiveLessonName);
        btnWednesdayLessonSixLessonName = (Button) findViewById(R.id.btnWednesdayLessonSixLessonName);
        btnWednesdayLessonSevenLessonName = (Button) findViewById(R.id.btnWednesdayLessonSevenLessonName);
        btnWednesdayLessonEightLessonName = (Button) findViewById(R.id.btnWednesdayLessonEightLessonName);
        btnWednesdayLessonNineLessonName = (Button) findViewById(R.id.btnWednesdayLessonNineLessonName);

        btnWednesdayLessonZeroLessonName.setOnClickListener(this);
        btnWednesdayLessonOneLessonName.setOnClickListener(this);
        btnWednesdayLessonTwoLessonName.setOnClickListener(this);
        btnWednesdayLessonThreeLessonName.setOnClickListener(this);
        btnWednesdayLessonFourLessonName.setOnClickListener(this);
        btnWednesdayLessonFiveLessonName.setOnClickListener(this);
        btnWednesdayLessonSixLessonName.setOnClickListener(this);
        btnWednesdayLessonSevenLessonName.setOnClickListener(this);
        btnWednesdayLessonEightLessonName.setOnClickListener(this);
        btnWednesdayLessonNineLessonName.setOnClickListener(this);

        btnWednesdayLessonZeroTeacher = (Button) findViewById(R.id.btnWednesdayLessonZeroTeacher);
        btnWednesdayLessonOneTeacher = (Button) findViewById(R.id.btnWednesdayLessonOneTeacher);
        btnWednesdayLessonTwoTeacher = (Button) findViewById(R.id.btnWednesdayLessonTwoTeacher);
        btnWednesdayLessonThreeTeacher = (Button) findViewById(R.id.btnWednesdayLessonThreeTeacher);
        btnWednesdayLessonFourTeacher = (Button) findViewById(R.id.btnWednesdayLessonFourTeacher);
        btnWednesdayLessonFiveTeacher = (Button) findViewById(R.id.btnWednesdayLessonFiveTeacher);
        btnWednesdayLessonSixTeacher = (Button) findViewById(R.id.btnWednesdayLessonSixTeacher);
        btnWednesdayLessonSevenTeacher = (Button) findViewById(R.id.btnWednesdayLessonSevenTeacher);
        btnWednesdayLessonEightTeacher = (Button) findViewById(R.id.btnWednesdayLessonEightTeacher);
        btnWednesdayLessonNineTeacher = (Button) findViewById(R.id.btnWednesdayLessonNineTeacher);

        btnWednesdayLessonZeroTeacher.setOnClickListener(this);
        btnWednesdayLessonOneTeacher.setOnClickListener(this);
        btnWednesdayLessonTwoTeacher.setOnClickListener(this);
        btnWednesdayLessonThreeTeacher.setOnClickListener(this);
        btnWednesdayLessonFourTeacher.setOnClickListener(this);
        btnWednesdayLessonFiveTeacher.setOnClickListener(this);
        btnWednesdayLessonSixTeacher.setOnClickListener(this);
        btnWednesdayLessonSevenTeacher.setOnClickListener(this);
        btnWednesdayLessonEightTeacher.setOnClickListener(this);
        btnWednesdayLessonNineTeacher.setOnClickListener(this);

        btnWednesdayLessonZeroRoom = (Button) findViewById(R.id.btnWednesdayLessonZeroRoom);
        btnWednesdayLessonOneRoom = (Button) findViewById(R.id.btnWednesdayLessonOneRoom);
        btnWednesdayLessonTwoRoom = (Button) findViewById(R.id.btnWednesdayLessonTwoRoom);
        btnWednesdayLessonThreeRoom = (Button) findViewById(R.id.btnWednesdayLessonThreeRoom);
        btnWednesdayLessonFourRoom = (Button) findViewById(R.id.btnWednesdayLessonFourRoom);
        btnWednesdayLessonFiveRoom = (Button) findViewById(R.id.btnWednesdayLessonFiveRoom);
        btnWednesdayLessonSixRoom = (Button) findViewById(R.id.btnWednesdayLessonSixRoom);
        btnWednesdayLessonSevenRoom = (Button) findViewById(R.id.btnWednesdayLessonSevenRoom);
        btnWednesdayLessonEightRoom = (Button) findViewById(R.id.btnWednesdayLessonEightRoom);
        btnWednesdayLessonNineRoom = (Button) findViewById(R.id.btnWednesdayLessonNineRoom);

        btnWednesdayLessonZeroRoom.setOnClickListener(this);
        btnWednesdayLessonOneRoom.setOnClickListener(this);
        btnWednesdayLessonTwoRoom.setOnClickListener(this);
        btnWednesdayLessonThreeRoom.setOnClickListener(this);
        btnWednesdayLessonFourRoom.setOnClickListener(this);
        btnWednesdayLessonFiveRoom.setOnClickListener(this);
        btnWednesdayLessonSixRoom.setOnClickListener(this);
        btnWednesdayLessonSevenRoom.setOnClickListener(this);
        btnWednesdayLessonEightRoom.setOnClickListener(this);
        btnWednesdayLessonNineRoom.setOnClickListener(this);

        btnWednesdayLessonZeroPeriod = (Button) findViewById(R.id.btnWednesdayLessonZeroPeriod);
        btnWednesdayLessonOnePeriod = (Button) findViewById(R.id.btnWednesdayLessonOnePeriod);
        btnWednesdayLessonTwoPeriod = (Button) findViewById(R.id.btnWednesdayLessonTwoPeriod);
        btnWednesdayLessonThreePeriod = (Button) findViewById(R.id.btnWednesdayLessonThreePeriod);
        btnWednesdayLessonFourPeriod = (Button) findViewById(R.id.btnWednesdayLessonFourPeriod);
        btnWednesdayLessonFivePeriod = (Button) findViewById(R.id.btnWednesdayLessonFivePeriod);
        btnWednesdayLessonSixPeriod = (Button) findViewById(R.id.btnWednesdayLessonSixPeriod);
        btnWednesdayLessonSevenPeriod = (Button) findViewById(R.id.btnWednesdayLessonSevenPeriod);
        btnWednesdayLessonEightPeriod = (Button) findViewById(R.id.btnWednesdayLessonEightPeriod);
        btnWednesdayLessonNinePeriod = (Button) findViewById(R.id.btnWednesdayLessonNinePeriod);

        btnWednesdayLessonZeroPeriod.setOnClickListener(this);
        btnWednesdayLessonOnePeriod.setOnClickListener(this);
        btnWednesdayLessonTwoPeriod.setOnClickListener(this);
        btnWednesdayLessonThreePeriod.setOnClickListener(this);
        btnWednesdayLessonFourPeriod.setOnClickListener(this);
        btnWednesdayLessonFivePeriod.setOnClickListener(this);
        btnWednesdayLessonSixPeriod.setOnClickListener(this);
        btnWednesdayLessonSevenPeriod.setOnClickListener(this);
        btnWednesdayLessonEightPeriod.setOnClickListener(this);
        btnWednesdayLessonNinePeriod.setOnClickListener(this);

        btnWednesdaySave = (Button) findViewById(R.id.btnWednesdaySave);
        btnWednesdaySave.setOnClickListener(this);
    }

    private boolean checkScheduleRow(int row) {
        return !wednesdayLessonNames[row].equals("") && !wednesdayTeachers[row].equals("") && !wednesdayRooms[row].equals("");
    }

    @Override
    public void onClick(View v) {
        Intent wednesdayLessonNameIntent = new Intent(this, ChooseLesson.class);
        Intent wednesdayTeacherIntent = new Intent(this, ChooseTeacher.class);
        Intent wednesdayRoomIntent = new Intent(this, ChooseRoom.class);
        Intent wednesdayPeriodIntent = new Intent(this, ChoosePeriod.class);
        switch (v.getId()) {
            case R.id.btnWednesdayLessonZeroLessonName:
                startActivityForResult(wednesdayLessonNameIntent, 10);
                break;
            case R.id.btnWednesdayLessonOneLessonName:
                startActivityForResult(wednesdayLessonNameIntent, 11);
                break;
            case R.id.btnWednesdayLessonTwoLessonName:
                startActivityForResult(wednesdayLessonNameIntent, 12);
                break;
            case R.id.btnWednesdayLessonThreeLessonName:
                startActivityForResult(wednesdayLessonNameIntent, 13);
                break;
            case R.id.btnWednesdayLessonFourLessonName:
                startActivityForResult(wednesdayLessonNameIntent, 14);
                break;
            case R.id.btnWednesdayLessonFiveLessonName:
                startActivityForResult(wednesdayLessonNameIntent, 15);
                break;
            case R.id.btnWednesdayLessonSixLessonName:
                startActivityForResult(wednesdayLessonNameIntent, 16);
                break;
            case R.id.btnWednesdayLessonSevenLessonName:
                startActivityForResult(wednesdayLessonNameIntent, 17);
                break;
            case R.id.btnWednesdayLessonEightLessonName:
                startActivityForResult(wednesdayLessonNameIntent, 18);
                break;
            case R.id.btnWednesdayLessonNineLessonName:
                startActivityForResult(wednesdayLessonNameIntent, 19);
                break;
            case R.id.btnWednesdayLessonZeroTeacher:
                startActivityForResult(wednesdayTeacherIntent, 20);
                break;
            case R.id.btnWednesdayLessonOneTeacher:
                startActivityForResult(wednesdayTeacherIntent, 21);
                break;
            case R.id.btnWednesdayLessonTwoTeacher:
                startActivityForResult(wednesdayTeacherIntent, 22);
                break;
            case R.id.btnWednesdayLessonThreeTeacher:
                startActivityForResult(wednesdayTeacherIntent, 23);
                break;
            case R.id.btnWednesdayLessonFourTeacher:
                startActivityForResult(wednesdayTeacherIntent, 24);
                break;
            case R.id.btnWednesdayLessonFiveTeacher:
                startActivityForResult(wednesdayTeacherIntent, 25);
                break;
            case R.id.btnWednesdayLessonSixTeacher:
                startActivityForResult(wednesdayTeacherIntent, 26);
                break;
            case R.id.btnWednesdayLessonSevenTeacher:
                startActivityForResult(wednesdayTeacherIntent, 27);
                break;
            case R.id.btnWednesdayLessonEightTeacher:
                startActivityForResult(wednesdayTeacherIntent, 28);
                break;
            case R.id.btnWednesdayLessonNineTeacher:
                startActivityForResult(wednesdayTeacherIntent, 29);
                break;
            case R.id.btnWednesdayLessonZeroRoom:
                startActivityForResult(wednesdayRoomIntent, 30);
                break;
            case R.id.btnWednesdayLessonOneRoom:
                startActivityForResult(wednesdayRoomIntent, 31);
                break;
            case R.id.btnWednesdayLessonTwoRoom:
                startActivityForResult(wednesdayRoomIntent, 32);
                break;
            case R.id.btnWednesdayLessonThreeRoom:
                startActivityForResult(wednesdayRoomIntent, 33);
                break;
            case R.id.btnWednesdayLessonFourRoom:
                startActivityForResult(wednesdayRoomIntent, 34);
                break;
            case R.id.btnWednesdayLessonFiveRoom:
                startActivityForResult(wednesdayRoomIntent, 35);
                break;
            case R.id.btnWednesdayLessonSixRoom:
                startActivityForResult(wednesdayRoomIntent, 36);
                break;
            case R.id.btnWednesdayLessonSevenRoom:
                startActivityForResult(wednesdayRoomIntent, 37);
                break;
            case R.id.btnWednesdayLessonEightRoom:
                startActivityForResult(wednesdayRoomIntent, 38);
                break;
            case R.id.btnWednesdayLessonNineRoom:
                startActivityForResult(wednesdayRoomIntent, 39);
                break;
            case R.id.btnWednesdayLessonZeroPeriod:
                startActivityForResult(wednesdayPeriodIntent, 40);
                break;
            case R.id.btnWednesdayLessonOnePeriod:
                startActivityForResult(wednesdayPeriodIntent, 41);
                break;
            case R.id.btnWednesdayLessonTwoPeriod:
                startActivityForResult(wednesdayPeriodIntent, 42);
                break;
            case R.id.btnWednesdayLessonThreePeriod:
                startActivityForResult(wednesdayPeriodIntent, 44);
                break;
            case R.id.btnWednesdayLessonFourPeriod:
                startActivityForResult(wednesdayPeriodIntent, 44);
                break;
            case R.id.btnWednesdayLessonFivePeriod:
                startActivityForResult(wednesdayPeriodIntent, 45);
                break;
            case R.id.btnWednesdayLessonSixPeriod:
                startActivityForResult(wednesdayPeriodIntent, 46);
                break;
            case R.id.btnWednesdayLessonSevenPeriod:
                startActivityForResult(wednesdayPeriodIntent, 47);
                break;
            case R.id.btnWednesdayLessonEightPeriod:
                startActivityForResult(wednesdayPeriodIntent, 48);
                break;
            case R.id.btnWednesdayLessonNinePeriod:
                startActivityForResult(wednesdayPeriodIntent, 49);
                break;
            case R.id.btnWednesdaySave:
                Intent configureScheduleIntent = new Intent(this, ConfigureThursdayActivity.class);
                startActivityForResult(configureScheduleIntent, 100);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 10:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWednesdayLessonZeroLessonName.setText(wednesdayLessonName);
                    wednesdayLessonNames[0] = wednesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {
                    Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 11:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWednesdayLessonOneLessonName.setText(wednesdayLessonName);
                    wednesdayLessonNames[1] = wednesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 12:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWednesdayLessonTwoLessonName.setText(wednesdayLessonName);
                    wednesdayLessonNames[2] = wednesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 13:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWednesdayLessonThreeLessonName.setText(wednesdayLessonName);
                    wednesdayLessonNames[3] = wednesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 14:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWednesdayLessonFourLessonName.setText(wednesdayLessonName);
                    wednesdayLessonNames[4] = wednesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 15:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWednesdayLessonFiveLessonName.setText(wednesdayLessonName);
                    wednesdayLessonNames[5] = wednesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 16:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWednesdayLessonSixLessonName.setText(wednesdayLessonName);
                    wednesdayLessonNames[6] = wednesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 17:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWednesdayLessonSevenLessonName.setText(wednesdayLessonName);
                    wednesdayLessonNames[7] = wednesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 18:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWednesdayLessonEightLessonName.setText(wednesdayLessonName);
                    wednesdayLessonNames[8] = wednesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 19:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWednesdayLessonNineLessonName.setText(wednesdayLessonName);
                    wednesdayLessonNames[9] = wednesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 20:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnWednesdayLessonZeroTeacher.setText(wednesdayTeacher);
                    wednesdayTeachers[0] = wednesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 21:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnWednesdayLessonOneTeacher.setText(wednesdayTeacher);
                    wednesdayTeachers[1] = wednesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 22:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnWednesdayLessonTwoTeacher.setText(wednesdayTeacher);
                    wednesdayTeachers[2] = wednesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 23:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnWednesdayLessonThreeTeacher.setText(wednesdayTeacher);
                    wednesdayTeachers[3] = wednesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 24:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnWednesdayLessonFourTeacher.setText(wednesdayTeacher);
                    wednesdayTeachers[4] = wednesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 25:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnWednesdayLessonFiveTeacher.setText(wednesdayTeacher);
                    wednesdayTeachers[5] = wednesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 26:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnWednesdayLessonSixTeacher.setText(wednesdayTeacher);
                    wednesdayTeachers[6] = wednesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 27:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnWednesdayLessonSevenTeacher.setText(wednesdayTeacher);
                    wednesdayTeachers[7] = wednesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 28:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnWednesdayLessonEightTeacher.setText(wednesdayTeacher);
                    wednesdayTeachers[8] = wednesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 29:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnWednesdayLessonNineTeacher.setText(wednesdayTeacher);
                    wednesdayTeachers[9] = wednesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 30:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnWednesdayLessonZeroRoom.setText(wednesdayRoom);
                    wednesdayRooms[0] = wednesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 31:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnWednesdayLessonOneRoom.setText(wednesdayRoom);
                    wednesdayRooms[1] = wednesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 32:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnWednesdayLessonTwoRoom.setText(wednesdayRoom);
                    wednesdayRooms[2] = wednesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 33:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnWednesdayLessonThreeRoom.setText(wednesdayRoom);
                    wednesdayRooms[3] = wednesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 34:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnWednesdayLessonFourRoom.setText(wednesdayRoom);
                    wednesdayRooms[4] = wednesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 35:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnWednesdayLessonFiveRoom.setText(wednesdayRoom);
                    wednesdayRooms[5] = wednesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 36:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnWednesdayLessonSixRoom.setText(wednesdayRoom);
                    wednesdayRooms[6] = wednesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 37:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnWednesdayLessonSevenRoom.setText(wednesdayRoom);
                    wednesdayRooms[7] = wednesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 38:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnWednesdayLessonEightRoom.setText(wednesdayRoom);
                    wednesdayRooms[8] = wednesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 39:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnWednesdayLessonNineRoom.setText(wednesdayRoom);
                    wednesdayRooms[9] = wednesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;

            case 40:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnWednesdayLessonZeroPeriod.setText(wednesdayPeriod);
                    wednesdayPeriods[0] = wednesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 41:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnWednesdayLessonOnePeriod.setText(wednesdayPeriod);
                    wednesdayPeriods[1] = wednesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 42:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnWednesdayLessonTwoPeriod.setText(wednesdayPeriod);
                    wednesdayPeriods[2] = wednesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 43:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnWednesdayLessonThreePeriod.setText(wednesdayPeriod);
                    wednesdayPeriods[3] = wednesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 44:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnWednesdayLessonFourPeriod.setText(wednesdayPeriod);
                    wednesdayPeriods[4] = wednesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 45:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnWednesdayLessonFivePeriod.setText(wednesdayPeriod);
                    wednesdayPeriods[5] = wednesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 46:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnWednesdayLessonSixPeriod.setText(wednesdayPeriod);
                    wednesdayPeriods[6] = wednesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 47:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnWednesdayLessonSevenPeriod.setText(wednesdayPeriod);
                    wednesdayPeriods[7] = wednesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 48:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnWednesdayLessonEightPeriod.setText(wednesdayPeriod);
                    wednesdayPeriods[8] = wednesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 49:
                if(resultCode == Activity.RESULT_OK){
                    String wednesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnWednesdayLessonNinePeriod.setText(wednesdayPeriod);
                    wednesdayPeriods[9] = wednesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 100:
                if(resultCode == Activity.RESULT_OK){
                    data.putExtra(WEDNESDAY_LESSON_NAMES, wednesdayLessonNames);
                    data.putExtra(WEDNESDAY_TEACHER_NAMES, wednesdayTeachers);
                    data.putExtra(WEDNESDAY_ROOMS, wednesdayRooms);
                    data.putExtra(WEDNESDAY_PERIODS, wednesdayPeriods);
                    setResult(Activity.RESULT_OK, data);
                    finish();
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CONFIGURE_THURSDAY, Toast.LENGTH_LONG).show();}
                break;
        }
    }
}