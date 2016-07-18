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
public class ConfigureFridayActivity extends Activity implements View.OnClickListener {
    private String[] fridayLessonNames = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] fridayTeachers = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] fridayRooms = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] fridayPeriods = new String[] {"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    private Button btnFridayLessonZeroLessonName;
    private Button btnFridayLessonOneLessonName;
    private Button btnFridayLessonTwoLessonName;
    private Button btnFridayLessonThreeLessonName;
    private Button btnFridayLessonFourLessonName;
    private Button btnFridayLessonFiveLessonName;
    private Button btnFridayLessonSixLessonName;
    private Button btnFridayLessonSevenLessonName;
    private Button btnFridayLessonEightLessonName;
    private Button btnFridayLessonNineLessonName;

    private Button btnFridayLessonZeroTeacher;
    private Button btnFridayLessonOneTeacher;
    private Button btnFridayLessonTwoTeacher;
    private Button btnFridayLessonThreeTeacher;
    private Button btnFridayLessonFourTeacher;
    private Button btnFridayLessonFiveTeacher;
    private Button btnFridayLessonSixTeacher;
    private Button btnFridayLessonSevenTeacher;
    private Button btnFridayLessonEightTeacher;
    private Button btnFridayLessonNineTeacher;

    private Button btnFridayLessonZeroRoom;
    private Button btnFridayLessonOneRoom;
    private Button btnFridayLessonTwoRoom;
    private Button btnFridayLessonThreeRoom;
    private Button btnFridayLessonFourRoom;
    private Button btnFridayLessonFiveRoom;
    private Button btnFridayLessonSixRoom;
    private Button btnFridayLessonSevenRoom;
    private Button btnFridayLessonEightRoom;
    private Button btnFridayLessonNineRoom;

    private Button btnFridayLessonZeroPeriod;
    private Button btnFridayLessonOnePeriod;
    private Button btnFridayLessonTwoPeriod;
    private Button btnFridayLessonThreePeriod;
    private Button btnFridayLessonFourPeriod;
    private Button btnFridayLessonFivePeriod;
    private Button btnFridayLessonSixPeriod;
    private Button btnFridayLessonSevenPeriod;
    private Button btnFridayLessonEightPeriod;
    private Button btnFridayLessonNinePeriod;

    private Button btnFridaySave;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_friday);

        btnFridayLessonZeroLessonName = (Button) findViewById(R.id.btnFridayLessonZeroLessonName);
        btnFridayLessonOneLessonName = (Button) findViewById(R.id.btnFridayLessonOneLessonName);
        btnFridayLessonTwoLessonName = (Button) findViewById(R.id.btnFridayLessonTwoLessonName);
        btnFridayLessonThreeLessonName = (Button) findViewById(R.id.btnFridayLessonThreeLessonName);
        btnFridayLessonFourLessonName = (Button) findViewById(R.id.btnFridayLessonFourLessonName);
        btnFridayLessonFiveLessonName = (Button) findViewById(R.id.btnFridayLessonFiveLessonName);
        btnFridayLessonSixLessonName = (Button) findViewById(R.id.btnFridayLessonSixLessonName);
        btnFridayLessonSevenLessonName = (Button) findViewById(R.id.btnFridayLessonSevenLessonName);
        btnFridayLessonEightLessonName = (Button) findViewById(R.id.btnFridayLessonEightLessonName);
        btnFridayLessonNineLessonName = (Button) findViewById(R.id.btnFridayLessonNineLessonName);

        btnFridayLessonZeroLessonName.setOnClickListener(this);
        btnFridayLessonOneLessonName.setOnClickListener(this);
        btnFridayLessonTwoLessonName.setOnClickListener(this);
        btnFridayLessonThreeLessonName.setOnClickListener(this);
        btnFridayLessonFourLessonName.setOnClickListener(this);
        btnFridayLessonFiveLessonName.setOnClickListener(this);
        btnFridayLessonSixLessonName.setOnClickListener(this);
        btnFridayLessonSevenLessonName.setOnClickListener(this);
        btnFridayLessonEightLessonName.setOnClickListener(this);
        btnFridayLessonNineLessonName.setOnClickListener(this);

        btnFridayLessonZeroTeacher = (Button) findViewById(R.id.btnFridayLessonZeroTeacher);
        btnFridayLessonOneTeacher = (Button) findViewById(R.id.btnFridayLessonOneTeacher);
        btnFridayLessonTwoTeacher = (Button) findViewById(R.id.btnFridayLessonTwoTeacher);
        btnFridayLessonThreeTeacher = (Button) findViewById(R.id.btnFridayLessonThreeTeacher);
        btnFridayLessonFourTeacher = (Button) findViewById(R.id.btnFridayLessonFourTeacher);
        btnFridayLessonFiveTeacher = (Button) findViewById(R.id.btnFridayLessonFiveTeacher);
        btnFridayLessonSixTeacher = (Button) findViewById(R.id.btnFridayLessonSixTeacher);
        btnFridayLessonSevenTeacher = (Button) findViewById(R.id.btnFridayLessonSevenTeacher);
        btnFridayLessonEightTeacher = (Button) findViewById(R.id.btnFridayLessonEightTeacher);
        btnFridayLessonNineTeacher = (Button) findViewById(R.id.btnFridayLessonNineTeacher);

        btnFridayLessonZeroTeacher.setOnClickListener(this);
        btnFridayLessonOneTeacher.setOnClickListener(this);
        btnFridayLessonTwoTeacher.setOnClickListener(this);
        btnFridayLessonThreeTeacher.setOnClickListener(this);
        btnFridayLessonFourTeacher.setOnClickListener(this);
        btnFridayLessonFiveTeacher.setOnClickListener(this);
        btnFridayLessonSixTeacher.setOnClickListener(this);
        btnFridayLessonSevenTeacher.setOnClickListener(this);
        btnFridayLessonEightTeacher.setOnClickListener(this);
        btnFridayLessonNineTeacher.setOnClickListener(this);

        btnFridayLessonZeroRoom = (Button) findViewById(R.id.btnFridayLessonZeroRoom);
        btnFridayLessonOneRoom = (Button) findViewById(R.id.btnFridayLessonOneRoom);
        btnFridayLessonTwoRoom = (Button) findViewById(R.id.btnFridayLessonTwoRoom);
        btnFridayLessonThreeRoom = (Button) findViewById(R.id.btnFridayLessonThreeRoom);
        btnFridayLessonFourRoom = (Button) findViewById(R.id.btnFridayLessonFourRoom);
        btnFridayLessonFiveRoom = (Button) findViewById(R.id.btnFridayLessonFiveRoom);
        btnFridayLessonSixRoom = (Button) findViewById(R.id.btnFridayLessonSixRoom);
        btnFridayLessonSevenRoom = (Button) findViewById(R.id.btnFridayLessonSevenRoom);
        btnFridayLessonEightRoom = (Button) findViewById(R.id.btnFridayLessonEightRoom);
        btnFridayLessonNineRoom = (Button) findViewById(R.id.btnFridayLessonNineRoom);

        btnFridayLessonZeroRoom.setOnClickListener(this);
        btnFridayLessonOneRoom.setOnClickListener(this);
        btnFridayLessonTwoRoom.setOnClickListener(this);
        btnFridayLessonThreeRoom.setOnClickListener(this);
        btnFridayLessonFourRoom.setOnClickListener(this);
        btnFridayLessonFiveRoom.setOnClickListener(this);
        btnFridayLessonSixRoom.setOnClickListener(this);
        btnFridayLessonSevenRoom.setOnClickListener(this);
        btnFridayLessonEightRoom.setOnClickListener(this);
        btnFridayLessonNineRoom.setOnClickListener(this);

        btnFridayLessonZeroPeriod = (Button) findViewById(R.id.btnFridayLessonZeroPeriod);
        btnFridayLessonOnePeriod = (Button) findViewById(R.id.btnFridayLessonOnePeriod);
        btnFridayLessonTwoPeriod = (Button) findViewById(R.id.btnFridayLessonTwoPeriod);
        btnFridayLessonThreePeriod = (Button) findViewById(R.id.btnFridayLessonThreePeriod);
        btnFridayLessonFourPeriod = (Button) findViewById(R.id.btnFridayLessonFourPeriod);
        btnFridayLessonFivePeriod = (Button) findViewById(R.id.btnFridayLessonFivePeriod);
        btnFridayLessonSixPeriod = (Button) findViewById(R.id.btnFridayLessonSixPeriod);
        btnFridayLessonSevenPeriod = (Button) findViewById(R.id.btnFridayLessonSevenPeriod);
        btnFridayLessonEightPeriod = (Button) findViewById(R.id.btnFridayLessonEightPeriod);
        btnFridayLessonNinePeriod = (Button) findViewById(R.id.btnFridayLessonNinePeriod);

        btnFridayLessonZeroPeriod.setOnClickListener(this);
        btnFridayLessonOnePeriod.setOnClickListener(this);
        btnFridayLessonTwoPeriod.setOnClickListener(this);
        btnFridayLessonThreePeriod.setOnClickListener(this);
        btnFridayLessonFourPeriod.setOnClickListener(this);
        btnFridayLessonFivePeriod.setOnClickListener(this);
        btnFridayLessonSixPeriod.setOnClickListener(this);
        btnFridayLessonSevenPeriod.setOnClickListener(this);
        btnFridayLessonEightPeriod.setOnClickListener(this);
        btnFridayLessonNinePeriod.setOnClickListener(this);

        btnFridaySave = (Button) findViewById(R.id.btnFridaySave);
        btnFridaySave.setOnClickListener(this);
    }

    private boolean checkScheduleRow(int row) {
        return !fridayLessonNames[row].equals("") && !fridayTeachers[row].equals("") && !fridayRooms[row].equals("");
    }

    @Override
    public void onClick(View v) {
        Intent fridayLessonNameIntent = new Intent(this, ChooseLesson.class);
        Intent fridayTeacherIntent = new Intent(this, ChooseTeacher.class);
        Intent fridayRoomIntent = new Intent(this, ChooseRoom.class);
        Intent fridayPeriodIntent = new Intent(this, ChoosePeriod.class);
        switch (v.getId()) {
            case R.id.btnFridayLessonZeroLessonName:
                startActivityForResult(fridayLessonNameIntent, 10);
                break;
            case R.id.btnFridayLessonOneLessonName:
                startActivityForResult(fridayLessonNameIntent, 11);
                break;
            case R.id.btnFridayLessonTwoLessonName:
                startActivityForResult(fridayLessonNameIntent, 12);
                break;
            case R.id.btnFridayLessonThreeLessonName:
                startActivityForResult(fridayLessonNameIntent, 13);
                break;
            case R.id.btnFridayLessonFourLessonName:
                startActivityForResult(fridayLessonNameIntent, 14);
                break;
            case R.id.btnFridayLessonFiveLessonName:
                startActivityForResult(fridayLessonNameIntent, 15);
                break;
            case R.id.btnFridayLessonSixLessonName:
                startActivityForResult(fridayLessonNameIntent, 16);
                break;
            case R.id.btnFridayLessonSevenLessonName:
                startActivityForResult(fridayLessonNameIntent, 17);
                break;
            case R.id.btnFridayLessonEightLessonName:
                startActivityForResult(fridayLessonNameIntent, 18);
                break;
            case R.id.btnFridayLessonNineLessonName:
                startActivityForResult(fridayLessonNameIntent, 19);
                break;
            case R.id.btnFridayLessonZeroTeacher:
                startActivityForResult(fridayTeacherIntent, 20);
                break;
            case R.id.btnFridayLessonOneTeacher:
                startActivityForResult(fridayTeacherIntent, 21);
                break;
            case R.id.btnFridayLessonTwoTeacher:
                startActivityForResult(fridayTeacherIntent, 22);
                break;
            case R.id.btnFridayLessonThreeTeacher:
                startActivityForResult(fridayTeacherIntent, 23);
                break;
            case R.id.btnFridayLessonFourTeacher:
                startActivityForResult(fridayTeacherIntent, 24);
                break;
            case R.id.btnFridayLessonFiveTeacher:
                startActivityForResult(fridayTeacherIntent, 25);
                break;
            case R.id.btnFridayLessonSixTeacher:
                startActivityForResult(fridayTeacherIntent, 26);
                break;
            case R.id.btnFridayLessonSevenTeacher:
                startActivityForResult(fridayTeacherIntent, 27);
                break;
            case R.id.btnFridayLessonEightTeacher:
                startActivityForResult(fridayTeacherIntent, 28);
                break;
            case R.id.btnFridayLessonNineTeacher:
                startActivityForResult(fridayTeacherIntent, 29);
                break;
            case R.id.btnFridayLessonZeroRoom:
                startActivityForResult(fridayRoomIntent, 30);
                break;
            case R.id.btnFridayLessonOneRoom:
                startActivityForResult(fridayRoomIntent, 31);
                break;
            case R.id.btnFridayLessonTwoRoom:
                startActivityForResult(fridayRoomIntent, 32);
                break;
            case R.id.btnFridayLessonThreeRoom:
                startActivityForResult(fridayRoomIntent, 33);
                break;
            case R.id.btnFridayLessonFourRoom:
                startActivityForResult(fridayRoomIntent, 34);
                break;
            case R.id.btnFridayLessonFiveRoom:
                startActivityForResult(fridayRoomIntent, 35);
                break;
            case R.id.btnFridayLessonSixRoom:
                startActivityForResult(fridayRoomIntent, 36);
                break;
            case R.id.btnFridayLessonSevenRoom:
                startActivityForResult(fridayRoomIntent, 37);
                break;
            case R.id.btnFridayLessonEightRoom:
                startActivityForResult(fridayRoomIntent, 38);
                break;
            case R.id.btnFridayLessonNineRoom:
                startActivityForResult(fridayRoomIntent, 39);
                break;
            case R.id.btnFridayLessonZeroPeriod:
                startActivityForResult(fridayPeriodIntent, 40);
                break;
            case R.id.btnFridayLessonOnePeriod:
                startActivityForResult(fridayPeriodIntent, 41);
                break;
            case R.id.btnFridayLessonTwoPeriod:
                startActivityForResult(fridayPeriodIntent, 42);
                break;
            case R.id.btnFridayLessonThreePeriod:
                startActivityForResult(fridayPeriodIntent, 44);
                break;
            case R.id.btnFridayLessonFourPeriod:
                startActivityForResult(fridayPeriodIntent, 44);
                break;
            case R.id.btnFridayLessonFivePeriod:
                startActivityForResult(fridayPeriodIntent, 45);
                break;
            case R.id.btnFridayLessonSixPeriod:
                startActivityForResult(fridayPeriodIntent, 46);
                break;
            case R.id.btnFridayLessonSevenPeriod:
                startActivityForResult(fridayPeriodIntent, 47);
                break;
            case R.id.btnFridayLessonEightPeriod:
                startActivityForResult(fridayPeriodIntent, 48);
                break;
            case R.id.btnFridayLessonNinePeriod:
                startActivityForResult(fridayPeriodIntent, 49);
                break;
            case R.id.btnFridaySave:
                Intent resultIntent = new Intent();
                resultIntent.putExtra("fridayLessonNames", fridayLessonNames);
                resultIntent.putExtra("fridayTeachers", fridayTeachers);
                resultIntent.putExtra("fridayRooms", fridayRooms);
                resultIntent.putExtra("fridayPeriods", fridayPeriods);
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 10:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonZeroLessonName.setText(fridayLessonName);
                    fridayLessonNames[0] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {
                    Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 11:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonOneLessonName.setText(fridayLessonName);
                    fridayLessonNames[1] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 12:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonTwoLessonName.setText(fridayLessonName);
                    fridayLessonNames[2] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 13:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonThreeLessonName.setText(fridayLessonName);
                    fridayLessonNames[3] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 14:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonFourLessonName.setText(fridayLessonName);
                    fridayLessonNames[4] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 15:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonFiveLessonName.setText(fridayLessonName);
                    fridayLessonNames[5] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 16:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonSixLessonName.setText(fridayLessonName);
                    fridayLessonNames[6] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 17:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonSevenLessonName.setText(fridayLessonName);
                    fridayLessonNames[7] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 18:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonEightLessonName.setText(fridayLessonName);
                    fridayLessonNames[8] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 19:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonNineLessonName.setText(fridayLessonName);
                    fridayLessonNames[9] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 20:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonZeroTeacher.setText(fridayTeacher);
                    fridayTeachers[0] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 21:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonOneTeacher.setText(fridayTeacher);
                    fridayTeachers[1] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 22:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonTwoTeacher.setText(fridayTeacher);
                    fridayTeachers[2] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 23:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonThreeTeacher.setText(fridayTeacher);
                    fridayTeachers[3] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 24:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonFourTeacher.setText(fridayTeacher);
                    fridayTeachers[4] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 25:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonFiveTeacher.setText(fridayTeacher);
                    fridayTeachers[5] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 26:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonSixTeacher.setText(fridayTeacher);
                    fridayTeachers[6] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 27:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonSevenTeacher.setText(fridayTeacher);
                    fridayTeachers[7] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 28:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonEightTeacher.setText(fridayTeacher);
                    fridayTeachers[8] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 29:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonNineTeacher.setText(fridayTeacher);
                    fridayTeachers[9] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 30:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonZeroRoom.setText(fridayRoom);
                    fridayRooms[0] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 31:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonOneRoom.setText(fridayRoom);
                    fridayRooms[1] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 32:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonTwoRoom.setText(fridayRoom);
                    fridayRooms[2] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 33:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonThreeRoom.setText(fridayRoom);
                    fridayRooms[3] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 34:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonFourRoom.setText(fridayRoom);
                    fridayRooms[4] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 35:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonFiveRoom.setText(fridayRoom);
                    fridayRooms[5] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 36:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonSixRoom.setText(fridayRoom);
                    fridayRooms[6] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 37:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonSevenRoom.setText(fridayRoom);
                    fridayRooms[7] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 38:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonEightRoom.setText(fridayRoom);
                    fridayRooms[8] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 39:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonNineRoom.setText(fridayRoom);
                    fridayRooms[9] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;

            case 40:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonZeroPeriod.setText(fridayPeriod);
                    fridayPeriods[0] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 41:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonOnePeriod.setText(fridayPeriod);
                    fridayPeriods[1] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 42:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonTwoPeriod.setText(fridayPeriod);
                    fridayPeriods[2] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 43:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonThreePeriod.setText(fridayPeriod);
                    fridayPeriods[3] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 44:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonFourPeriod.setText(fridayPeriod);
                    fridayPeriods[4] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 45:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonFivePeriod.setText(fridayPeriod);
                    fridayPeriods[5] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 46:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonSixPeriod.setText(fridayPeriod);
                    fridayPeriods[6] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 47:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonSevenPeriod.setText(fridayPeriod);
                    fridayPeriods[7] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 48:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonEightPeriod.setText(fridayPeriod);
                    fridayPeriods[8] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 49:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonNinePeriod.setText(fridayPeriod);
                    fridayPeriods[9] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
        }
    }
}