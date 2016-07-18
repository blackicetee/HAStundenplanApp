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
public class ConfigureMondayActivity extends Activity implements View.OnClickListener {
    private String[] mondayLessonNames = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] mondayTeachers = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] mondayRooms = new String[] {"", "", "", "", "", "", "", "", "", ""};

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
    }

    @Override
    public void onClick(View v) {
        Intent mondayLessonNameIntent = new Intent(this, ChooseLesson.class);
        Intent mondayTeacherIntent = new Intent(this, ChooseTeacher.class);
        Intent mondayRoomIntent = new Intent(this, ChooseRoom.class);

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
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 10:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra("lessonName");
                    btnMondayLessonZeroLessonName.setText(mondayLessonName);
                    mondayLessonNames[0] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 11:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra("lessonName");
                    btnMondayLessonOneLessonName.setText(mondayLessonName);
                    mondayLessonNames[1] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 12:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra("lessonName");
                    btnMondayLessonTwoLessonName.setText(mondayLessonName);
                    mondayLessonNames[2] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 13:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra("lessonName");
                    btnMondayLessonThreeLessonName.setText(mondayLessonName);
                    mondayLessonNames[3] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 14:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra("lessonName");
                    btnMondayLessonFourLessonName.setText(mondayLessonName);
                    mondayLessonNames[4] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 15:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra("lessonName");
                    btnMondayLessonFiveLessonName.setText(mondayLessonName);
                    mondayLessonNames[5] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 16:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra("lessonName");
                    btnMondayLessonSixLessonName.setText(mondayLessonName);
                    mondayLessonNames[6] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 17:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra("lessonName");
                    btnMondayLessonSevenLessonName.setText(mondayLessonName);
                    mondayLessonNames[7] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 18:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra("lessonName");
                    btnMondayLessonEightLessonName.setText(mondayLessonName);
                    mondayLessonNames[8] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 19:
                if(resultCode == Activity.RESULT_OK){
                    String mondayLessonName = data.getStringExtra("lessonName");
                    btnMondayLessonNineLessonName.setText(mondayLessonName);
                    mondayLessonNames[9] = mondayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 20:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra("teacher");
                    btnMondayLessonZeroTeacher.setText(mondayTeacher);
                    mondayTeachers[0] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 21:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra("teacher");
                    btnMondayLessonOneTeacher.setText(mondayTeacher);
                    mondayTeachers[1] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 22:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra("teacher");
                    btnMondayLessonTwoTeacher.setText(mondayTeacher);
                    mondayTeachers[2] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 23:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra("teacher");
                    btnMondayLessonThreeTeacher.setText(mondayTeacher);
                    mondayTeachers[3] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 24:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra("teacher");
                    btnMondayLessonFourTeacher.setText(mondayTeacher);
                    mondayTeachers[4] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 25:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra("teacher");
                    btnMondayLessonFiveTeacher.setText(mondayTeacher);
                    mondayTeachers[5] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 26:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra("teacher");
                    btnMondayLessonSixTeacher.setText(mondayTeacher);
                    mondayTeachers[6] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 27:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra("teacher");
                    btnMondayLessonSevenTeacher.setText(mondayTeacher);
                    mondayTeachers[7] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 28:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra("teacher");
                    btnMondayLessonEightTeacher.setText(mondayTeacher);
                    mondayTeachers[8] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 29:
                if(resultCode == Activity.RESULT_OK){
                    String mondayTeacher = data.getStringExtra("teacher");
                    btnMondayLessonNineTeacher.setText(mondayTeacher);
                    mondayTeachers[9] = mondayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 30:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra("room");
                    btnMondayLessonZeroRoom.setText(mondayRoom);
                    mondayRooms[0] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 31:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra("room");
                    btnMondayLessonOneRoom.setText(mondayRoom);
                    mondayRooms[1] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 32:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra("room");
                    btnMondayLessonTwoRoom.setText(mondayRoom);
                    mondayRooms[2] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 33:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra("room");
                    btnMondayLessonThreeRoom.setText(mondayRoom);
                    mondayRooms[3] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 34:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra("room");
                    btnMondayLessonFourRoom.setText(mondayRoom);
                    mondayRooms[4] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 35:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra("room");
                    btnMondayLessonFiveRoom.setText(mondayRoom);
                    mondayRooms[5] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 36:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra("room");
                    btnMondayLessonSixRoom.setText(mondayRoom);
                    mondayRooms[6] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 37:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra("room");
                    btnMondayLessonSevenRoom.setText(mondayRoom);
                    mondayRooms[7] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 38:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra("room");
                    btnMondayLessonEightRoom.setText(mondayRoom);
                    mondayRooms[8] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
            case 39:
                if(resultCode == Activity.RESULT_OK){
                    String mondayRoom = data.getStringExtra("room");
                    btnMondayLessonNineRoom.setText(mondayRoom);
                    mondayRooms[9] = mondayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!", Toast.LENGTH_LONG).show();}
                break;
        }
    }
}