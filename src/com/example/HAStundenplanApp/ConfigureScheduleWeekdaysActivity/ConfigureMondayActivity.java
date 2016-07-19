package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.HAStundenplanApp.MainActivity;
import com.example.HAStundenplanApp.R;
import com.example.HAStundenplanApp.ScheduleWeek;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public class ConfigureMondayActivity extends Activity implements View.OnClickListener {
    private String[] mondayLessonNames = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] mondayTeachers = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] mondayRooms = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] mondayPeriods = new String[] {"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    ScheduleWeek configuredScheduleWeek;

    static final String CANCEL_MSG_CHOOSE_LESSON = "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!";
    static final String CANCEL_MSG_CHOOSE_TEACHER = "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!";
    static final String CANCEL_MSG_CHOOSE_ROOM = "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!";
    static final String CANCEL_MSG_CHOOSE_PERIOD = "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!";
    private static final String CANCEL_MSG_CONFIGURE_TUESDAY = "Der Vorgang: \"Erstellen des Stundenplans am Dienstag\" wurde abgebrochen!";

    public static final String MONDAY_LESSON_NAMES = "mondayLessonNames";
    public static final String MONDAY_TEACHER_NAMES = "mondayTeachers";
    public static final String MONDAY_ROOMS = "mondayRooms";
    public static final String MONDAY_PERIODS = "mondayPeriods";
    
    private Button btnMondayLessonZeroLessonName;
    private Button btnMondayLessonOneLessonName;
    private Button btnMondayLessonTwoLessonName;
    private Button btnMondayLessonThreeLessonName;
    private Button btnMondayLessonFourLessonName;
    private Button btnMondayLessonFiveLessonName;
    private Button btnMondayLessonSixLessonName;
    private Button btnMondayLessonSevenLessonName;
    private Button btnMondayLessonEightLessonName;
    private Button btnMondayLessonNineLessonName;

    private Button btnMondayLessonZeroTeacher;
    private Button btnMondayLessonOneTeacher;
    private Button btnMondayLessonTwoTeacher;
    private Button btnMondayLessonThreeTeacher;
    private Button btnMondayLessonFourTeacher;
    private Button btnMondayLessonFiveTeacher;
    private Button btnMondayLessonSixTeacher;
    private Button btnMondayLessonSevenTeacher;
    private Button btnMondayLessonEightTeacher;
    private Button btnMondayLessonNineTeacher;

    private Button btnMondayLessonZeroRoom;
    private Button btnMondayLessonOneRoom;
    private Button btnMondayLessonTwoRoom;
    private Button btnMondayLessonThreeRoom;
    private Button btnMondayLessonFourRoom;
    private Button btnMondayLessonFiveRoom;
    private Button btnMondayLessonSixRoom;
    private Button btnMondayLessonSevenRoom;
    private Button btnMondayLessonEightRoom;
    private Button btnMondayLessonNineRoom;

    private Button btnMondayLessonZeroPeriod;
    private Button btnMondayLessonOnePeriod;
    private Button btnMondayLessonTwoPeriod;
    private Button btnMondayLessonThreePeriod;
    private Button btnMondayLessonFourPeriod;
    private Button btnMondayLessonFivePeriod;
    private Button btnMondayLessonSixPeriod;
    private Button btnMondayLessonSevenPeriod;
    private Button btnMondayLessonEightPeriod;
    private Button btnMondayLessonNinePeriod;

    private Button btnMondaySave;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_monday);

        btnMondayLessonZeroLessonName = (Button) findViewById(R.id.btnMondayLessonZeroLessonName);
        btnMondayLessonOneLessonName = (Button) findViewById(R.id.btnMondayLessonOneLessonName);
        btnMondayLessonTwoLessonName = (Button) findViewById(R.id.btnMondayLessonTwoLessonName);
        btnMondayLessonThreeLessonName = (Button) findViewById(R.id.btnMondayLessonThreeLessonName);
        btnMondayLessonFourLessonName = (Button) findViewById(R.id.btnMondayLessonFourLessonName);
        btnMondayLessonFiveLessonName = (Button) findViewById(R.id.btnMondayLessonFiveLessonName);
        btnMondayLessonSixLessonName = (Button) findViewById(R.id.btnMondayLessonSixLessonName);
        btnMondayLessonSevenLessonName = (Button) findViewById(R.id.btnMondayLessonSevenLessonName);
        btnMondayLessonEightLessonName = (Button) findViewById(R.id.btnMondayLessonEightLessonName);
        btnMondayLessonNineLessonName = (Button) findViewById(R.id.btnMondayLessonNineLessonName);

        btnMondayLessonZeroLessonName.setOnClickListener(this);
        btnMondayLessonOneLessonName.setOnClickListener(this);
        btnMondayLessonTwoLessonName.setOnClickListener(this);
        btnMondayLessonThreeLessonName.setOnClickListener(this);
        btnMondayLessonFourLessonName.setOnClickListener(this);
        btnMondayLessonFiveLessonName.setOnClickListener(this);
        btnMondayLessonSixLessonName.setOnClickListener(this);
        btnMondayLessonSevenLessonName.setOnClickListener(this);
        btnMondayLessonEightLessonName.setOnClickListener(this);
        btnMondayLessonNineLessonName.setOnClickListener(this);

        btnMondayLessonZeroTeacher = (Button) findViewById(R.id.btnMondayLessonZeroTeacher);
        btnMondayLessonOneTeacher = (Button) findViewById(R.id.btnMondayLessonOneTeacher);
        btnMondayLessonTwoTeacher = (Button) findViewById(R.id.btnMondayLessonTwoTeacher);
        btnMondayLessonThreeTeacher = (Button) findViewById(R.id.btnMondayLessonThreeTeacher);
        btnMondayLessonFourTeacher = (Button) findViewById(R.id.btnMondayLessonFourTeacher);
        btnMondayLessonFiveTeacher = (Button) findViewById(R.id.btnMondayLessonFiveTeacher);
        btnMondayLessonSixTeacher = (Button) findViewById(R.id.btnMondayLessonSixTeacher);
        btnMondayLessonSevenTeacher = (Button) findViewById(R.id.btnMondayLessonSevenTeacher);
        btnMondayLessonEightTeacher = (Button) findViewById(R.id.btnMondayLessonEightTeacher);
        btnMondayLessonNineTeacher = (Button) findViewById(R.id.btnMondayLessonNineTeacher);

        btnMondayLessonZeroTeacher.setOnClickListener(this);
        btnMondayLessonOneTeacher.setOnClickListener(this);
        btnMondayLessonTwoTeacher.setOnClickListener(this);
        btnMondayLessonThreeTeacher.setOnClickListener(this);
        btnMondayLessonFourTeacher.setOnClickListener(this);
        btnMondayLessonFiveTeacher.setOnClickListener(this);
        btnMondayLessonSixTeacher.setOnClickListener(this);
        btnMondayLessonSevenTeacher.setOnClickListener(this);
        btnMondayLessonEightTeacher.setOnClickListener(this);
        btnMondayLessonNineTeacher.setOnClickListener(this);

        btnMondayLessonZeroRoom = (Button) findViewById(R.id.btnMondayLessonZeroRoom);
        btnMondayLessonOneRoom = (Button) findViewById(R.id.btnMondayLessonOneRoom);
        btnMondayLessonTwoRoom = (Button) findViewById(R.id.btnMondayLessonTwoRoom);
        btnMondayLessonThreeRoom = (Button) findViewById(R.id.btnMondayLessonThreeRoom);
        btnMondayLessonFourRoom = (Button) findViewById(R.id.btnMondayLessonFourRoom);
        btnMondayLessonFiveRoom = (Button) findViewById(R.id.btnMondayLessonFiveRoom);
        btnMondayLessonSixRoom = (Button) findViewById(R.id.btnMondayLessonSixRoom);
        btnMondayLessonSevenRoom = (Button) findViewById(R.id.btnMondayLessonSevenRoom);
        btnMondayLessonEightRoom = (Button) findViewById(R.id.btnMondayLessonEightRoom);
        btnMondayLessonNineRoom = (Button) findViewById(R.id.btnMondayLessonNineRoom);

        btnMondayLessonZeroRoom.setOnClickListener(this);
        btnMondayLessonOneRoom.setOnClickListener(this);
        btnMondayLessonTwoRoom.setOnClickListener(this);
        btnMondayLessonThreeRoom.setOnClickListener(this);
        btnMondayLessonFourRoom.setOnClickListener(this);
        btnMondayLessonFiveRoom.setOnClickListener(this);
        btnMondayLessonSixRoom.setOnClickListener(this);
        btnMondayLessonSevenRoom.setOnClickListener(this);
        btnMondayLessonEightRoom.setOnClickListener(this);
        btnMondayLessonNineRoom.setOnClickListener(this);

        btnMondayLessonZeroPeriod = (Button) findViewById(R.id.btnMondayLessonZeroPeriod);
        btnMondayLessonOnePeriod = (Button) findViewById(R.id.btnMondayLessonOnePeriod);
        btnMondayLessonTwoPeriod = (Button) findViewById(R.id.btnMondayLessonTwoPeriod);
        btnMondayLessonThreePeriod = (Button) findViewById(R.id.btnMondayLessonThreePeriod);
        btnMondayLessonFourPeriod = (Button) findViewById(R.id.btnMondayLessonFourPeriod);
        btnMondayLessonFivePeriod = (Button) findViewById(R.id.btnMondayLessonFivePeriod);
        btnMondayLessonSixPeriod = (Button) findViewById(R.id.btnMondayLessonSixPeriod);
        btnMondayLessonSevenPeriod = (Button) findViewById(R.id.btnMondayLessonSevenPeriod);
        btnMondayLessonEightPeriod = (Button) findViewById(R.id.btnMondayLessonEightPeriod);
        btnMondayLessonNinePeriod = (Button) findViewById(R.id.btnMondayLessonNinePeriod);

        btnMondayLessonZeroPeriod.setOnClickListener(this);
        btnMondayLessonOnePeriod.setOnClickListener(this);
        btnMondayLessonTwoPeriod.setOnClickListener(this);
        btnMondayLessonThreePeriod.setOnClickListener(this);
        btnMondayLessonFourPeriod.setOnClickListener(this);
        btnMondayLessonFivePeriod.setOnClickListener(this);
        btnMondayLessonSixPeriod.setOnClickListener(this);
        btnMondayLessonSevenPeriod.setOnClickListener(this);
        btnMondayLessonEightPeriod.setOnClickListener(this);
        btnMondayLessonNinePeriod.setOnClickListener(this);

        btnMondaySave = (Button) findViewById(R.id.btnMondaySave);
        btnMondaySave.setOnClickListener(this);

        Intent configuredScheduleWeekIntent = getIntent();
        configuredScheduleWeek = configuredScheduleWeekIntent.getParcelableExtra(MainActivity.CONFIGURED_SCHEDULE_WEEK);

        initializeScheduleMonday();
    }

    private void initializeScheduleMonday() {
        if (configuredScheduleWeek.getMondayLessonNames()[0] != null) {
            mondayLessonNames[0] = configuredScheduleWeek.getMondayLessonNames()[0];
            btnMondayLessonOneLessonName.setText(configuredScheduleWeek.getMondayLessonNames()[0]);
        }
        if (configuredScheduleWeek.getMondayTeachers()[0] != null) {
            mondayTeachers[0] = configuredScheduleWeek.getMondayTeachers()[0];
            btnMondayLessonOneTeacher.setText(configuredScheduleWeek.getMondayTeachers()[0]);
        }
        if (configuredScheduleWeek.getMondayRooms()[0] != null) {
            mondayRooms[0] = configuredScheduleWeek.getMondayRooms()[0];
            btnMondayLessonOneRoom.setText(configuredScheduleWeek.getMondayRooms()[0]);
        }
        if (configuredScheduleWeek.getMondayPeriods()[0] != null) {
            mondayPeriods[0] = configuredScheduleWeek.getMondayPeriods()[0];
            btnMondayLessonOnePeriod.setText(configuredScheduleWeek.getMondayPeriods()[0]);
        }
    }

    private boolean checkScheduleRow(int row) {
        return !mondayLessonNames[row].equals("") && !mondayTeachers[row].equals("") && !mondayRooms[row].equals("");
    }

    @Override
    public void onClick(View v) {
        Intent mondayLessonNameIntent = new Intent(this, ChooseLesson.class);
        Intent mondayTeacherIntent = new Intent(this, ChooseTeacher.class);
        Intent mondayRoomIntent = new Intent(this, ChooseRoom.class);
        Intent mondayPeriodIntent = new Intent(this, ChoosePeriod.class);
        switch (v.getId()) {
            case R.id.btnMondayLessonZeroLessonName:
                startActivityForResult(mondayLessonNameIntent, 10);
                break;
            case R.id.btnMondayLessonOneLessonName:
                startActivityForResult(mondayLessonNameIntent, 11);
                break;
            case R.id.btnMondayLessonTwoLessonName:
                startActivityForResult(mondayLessonNameIntent, 12);
                break;
            case R.id.btnMondayLessonThreeLessonName:
                startActivityForResult(mondayLessonNameIntent, 13);
                break;
            case R.id.btnMondayLessonFourLessonName:
                startActivityForResult(mondayLessonNameIntent, 14);
                break;
            case R.id.btnMondayLessonFiveLessonName:
                startActivityForResult(mondayLessonNameIntent, 15);
                break;
            case R.id.btnMondayLessonSixLessonName:
                startActivityForResult(mondayLessonNameIntent, 16);
                break;
            case R.id.btnMondayLessonSevenLessonName:
                startActivityForResult(mondayLessonNameIntent, 17);
                break;
            case R.id.btnMondayLessonEightLessonName:
                startActivityForResult(mondayLessonNameIntent, 18);
                break;
            case R.id.btnMondayLessonNineLessonName:
                startActivityForResult(mondayLessonNameIntent, 19);
                break;
            case R.id.btnMondayLessonZeroTeacher:
                startActivityForResult(mondayTeacherIntent, 20);
                break;
            case R.id.btnMondayLessonOneTeacher:
                startActivityForResult(mondayTeacherIntent, 21);
                break;
            case R.id.btnMondayLessonTwoTeacher:
                startActivityForResult(mondayTeacherIntent, 22);
                break;
            case R.id.btnMondayLessonThreeTeacher:
                startActivityForResult(mondayTeacherIntent, 23);
                break;
            case R.id.btnMondayLessonFourTeacher:
                startActivityForResult(mondayTeacherIntent, 24);
                break;
            case R.id.btnMondayLessonFiveTeacher:
                startActivityForResult(mondayTeacherIntent, 25);
                break;
            case R.id.btnMondayLessonSixTeacher:
                startActivityForResult(mondayTeacherIntent, 26);
                break;
            case R.id.btnMondayLessonSevenTeacher:
                startActivityForResult(mondayTeacherIntent, 27);
                break;
            case R.id.btnMondayLessonEightTeacher:
                startActivityForResult(mondayTeacherIntent, 28);
                break;
            case R.id.btnMondayLessonNineTeacher:
                startActivityForResult(mondayTeacherIntent, 29);
                break;
            case R.id.btnMondayLessonZeroRoom:
                startActivityForResult(mondayRoomIntent, 30);
                break;
            case R.id.btnMondayLessonOneRoom:
                startActivityForResult(mondayRoomIntent, 31);
                break;
            case R.id.btnMondayLessonTwoRoom:
                startActivityForResult(mondayRoomIntent, 32);
                break;
            case R.id.btnMondayLessonThreeRoom:
                startActivityForResult(mondayRoomIntent, 33);
                break;
            case R.id.btnMondayLessonFourRoom:
                startActivityForResult(mondayRoomIntent, 34);
                break;
            case R.id.btnMondayLessonFiveRoom:
                startActivityForResult(mondayRoomIntent, 35);
                break;
            case R.id.btnMondayLessonSixRoom:
                startActivityForResult(mondayRoomIntent, 36);
                break;
            case R.id.btnMondayLessonSevenRoom:
                startActivityForResult(mondayRoomIntent, 37);
                break;
            case R.id.btnMondayLessonEightRoom:
                startActivityForResult(mondayRoomIntent, 38);
                break;
            case R.id.btnMondayLessonNineRoom:
                startActivityForResult(mondayRoomIntent, 39);
                break;
            case R.id.btnMondayLessonZeroPeriod:
                startActivityForResult(mondayPeriodIntent, 40);
                break;
            case R.id.btnMondayLessonOnePeriod:
                startActivityForResult(mondayPeriodIntent, 41);
                break;
            case R.id.btnMondayLessonTwoPeriod:
                startActivityForResult(mondayPeriodIntent, 42);
                break;
            case R.id.btnMondayLessonThreePeriod:
                startActivityForResult(mondayPeriodIntent, 44);
                break;
            case R.id.btnMondayLessonFourPeriod:
                startActivityForResult(mondayPeriodIntent, 44);
                break;
            case R.id.btnMondayLessonFivePeriod:
                startActivityForResult(mondayPeriodIntent, 45);
                break;
            case R.id.btnMondayLessonSixPeriod:
                startActivityForResult(mondayPeriodIntent, 46);
                break;
            case R.id.btnMondayLessonSevenPeriod:
                startActivityForResult(mondayPeriodIntent, 47);
                break;
            case R.id.btnMondayLessonEightPeriod:
                startActivityForResult(mondayPeriodIntent, 48);
                break;
            case R.id.btnMondayLessonNinePeriod:
                startActivityForResult(mondayPeriodIntent, 49);
                break;
            case R.id.btnMondaySave:
                Intent configureScheduleIntent = new Intent(this, ConfigureTuesdayActivity.class);
                configuredScheduleWeek.setMondayLessonNames(mondayLessonNames);
                configuredScheduleWeek.setMondayLessonNames(mondayTeachers);
                configuredScheduleWeek.setMondayLessonNames(mondayRooms);
                configuredScheduleWeek.setMondayLessonNames(mondayPeriods);
                configureScheduleIntent.putExtra(MainActivity.CONFIGURED_SCHEDULE_WEEK, configuredScheduleWeek);
                setResult(Activity.RESULT_OK, configureScheduleIntent);
                finish();
                //startActivityForResult(configureScheduleIntent, 100);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 10:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnMondayLessonZeroLessonName.setText(mondayLessonName);
                    mondayLessonNames[0] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 11:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnMondayLessonOneLessonName.setText(mondayLessonName);
                    mondayLessonNames[1] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 12:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnMondayLessonTwoLessonName.setText(mondayLessonName);
                    mondayLessonNames[2] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 13:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnMondayLessonThreeLessonName.setText(mondayLessonName);
                    mondayLessonNames[3] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 14:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnMondayLessonFourLessonName.setText(mondayLessonName);
                    mondayLessonNames[4] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 15:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnMondayLessonFiveLessonName.setText(mondayLessonName);
                    mondayLessonNames[5] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 16:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnMondayLessonSixLessonName.setText(mondayLessonName);
                    mondayLessonNames[6] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 17:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnMondayLessonSevenLessonName.setText(mondayLessonName);
                    mondayLessonNames[7] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 18:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnMondayLessonEightLessonName.setText(mondayLessonName);
                    mondayLessonNames[8] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 19:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnMondayLessonNineLessonName.setText(mondayLessonName);
                    mondayLessonNames[9] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 20:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnMondayLessonZeroTeacher.setText(mondayTeacher);
                    mondayTeachers[0] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 21:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnMondayLessonOneTeacher.setText(mondayTeacher);
                    mondayTeachers[1] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 22:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnMondayLessonTwoTeacher.setText(mondayTeacher);
                    mondayTeachers[2] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 23:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnMondayLessonThreeTeacher.setText(mondayTeacher);
                    mondayTeachers[3] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 24:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnMondayLessonFourTeacher.setText(mondayTeacher);
                    mondayTeachers[4] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 25:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnMondayLessonFiveTeacher.setText(mondayTeacher);
                    mondayTeachers[5] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 26:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnMondayLessonSixTeacher.setText(mondayTeacher);
                    mondayTeachers[6] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 27:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnMondayLessonSevenTeacher.setText(mondayTeacher);
                    mondayTeachers[7] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 28:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnMondayLessonEightTeacher.setText(mondayTeacher);
                    mondayTeachers[8] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 29:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnMondayLessonNineTeacher.setText(mondayTeacher);
                    mondayTeachers[9] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 30:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnMondayLessonZeroRoom.setText(mondayRoom);
                    mondayRooms[0] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 31:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnMondayLessonOneRoom.setText(mondayRoom);
                    mondayRooms[1] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 32:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnMondayLessonTwoRoom.setText(mondayRoom);
                    mondayRooms[2] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 33:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnMondayLessonThreeRoom.setText(mondayRoom);
                    mondayRooms[3] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 34:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnMondayLessonFourRoom.setText(mondayRoom);
                    mondayRooms[4] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 35:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnMondayLessonFiveRoom.setText(mondayRoom);
                    mondayRooms[5] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 36:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnMondayLessonSixRoom.setText(mondayRoom);
                    mondayRooms[6] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 37:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnMondayLessonSevenRoom.setText(mondayRoom);
                    mondayRooms[7] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 38:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnMondayLessonEightRoom.setText(mondayRoom);
                    mondayRooms[8] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 39:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnMondayLessonNineRoom.setText(mondayRoom);
                    mondayRooms[9] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;

            case 40:
                if(resultCode == Activity.RESULT_OK){
                    String mondayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnMondayLessonZeroPeriod.setText(mondayPeriod);
                    mondayPeriods[0] = mondayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 41:
                if(resultCode == Activity.RESULT_OK){
                    String mondayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnMondayLessonOnePeriod.setText(mondayPeriod);
                    mondayPeriods[1] = mondayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 42:
                if(resultCode == Activity.RESULT_OK){
                    String mondayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnMondayLessonTwoPeriod.setText(mondayPeriod);
                    mondayPeriods[2] = mondayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 43:
                if(resultCode == Activity.RESULT_OK){
                    String mondayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnMondayLessonThreePeriod.setText(mondayPeriod);
                    mondayPeriods[3] = mondayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 44:
                if(resultCode == Activity.RESULT_OK){
                    String mondayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnMondayLessonFourPeriod.setText(mondayPeriod);
                    mondayPeriods[4] = mondayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 45:
                if(resultCode == Activity.RESULT_OK){
                    String mondayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnMondayLessonFivePeriod.setText(mondayPeriod);
                    mondayPeriods[5] = mondayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 46:
                if(resultCode == Activity.RESULT_OK){
                    String mondayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnMondayLessonSixPeriod.setText(mondayPeriod);
                    mondayPeriods[6] = mondayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 47:
                if(resultCode == Activity.RESULT_OK){
                    String mondayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnMondayLessonSevenPeriod.setText(mondayPeriod);
                    mondayPeriods[7] = mondayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 48:
                if(resultCode == Activity.RESULT_OK){
                    String mondayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnMondayLessonEightPeriod.setText(mondayPeriod);
                    mondayPeriods[8] = mondayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 49:
                if(resultCode == Activity.RESULT_OK){
                    String mondayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnMondayLessonNinePeriod.setText(mondayPeriod);
                    mondayPeriods[9] = mondayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 100:
                if(resultCode == Activity.RESULT_OK){
                    setResult(Activity.RESULT_OK, data);
                    finish();
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CONFIGURE_TUESDAY, Toast.LENGTH_LONG).show();}
                break;
        }
    }
}