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
public class ConfigureTuesdayActivity extends Activity implements View.OnClickListener {
    private String[] tuesdayLessonNames = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] tuesdayTeachers = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] tuesdayRooms = new String[] {"", "", "", "", "", "", "", "", "", ""};
    private String[] tuesdayPeriods = new String[] {"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    private static final String CANCEL_MSG_CONFIGURE_WEDNESDAY = "Der Vorgang: \"Erstellen des Stundenplans am Mittwoch\" wurde abgebrochen!";

    private ScheduleWeek configuredScheduleWeek;

    private Button btnTuesdayLessonZeroLessonName;
    private Button btnTuesdayLessonOneLessonName;
    private Button btnTuesdayLessonTwoLessonName;
    private Button btnTuesdayLessonThreeLessonName;
    private Button btnTuesdayLessonFourLessonName;
    private Button btnTuesdayLessonFiveLessonName;
    private Button btnTuesdayLessonSixLessonName;
    private Button btnTuesdayLessonSevenLessonName;
    private Button btnTuesdayLessonEightLessonName;
    private Button btnTuesdayLessonNineLessonName;

    private Button btnTuesdayLessonZeroTeacher;
    private Button btnTuesdayLessonOneTeacher;
    private Button btnTuesdayLessonTwoTeacher;
    private Button btnTuesdayLessonThreeTeacher;
    private Button btnTuesdayLessonFourTeacher;
    private Button btnTuesdayLessonFiveTeacher;
    private Button btnTuesdayLessonSixTeacher;
    private Button btnTuesdayLessonSevenTeacher;
    private Button btnTuesdayLessonEightTeacher;
    private Button btnTuesdayLessonNineTeacher;

    private Button btnTuesdayLessonZeroRoom;
    private Button btnTuesdayLessonOneRoom;
    private Button btnTuesdayLessonTwoRoom;
    private Button btnTuesdayLessonThreeRoom;
    private Button btnTuesdayLessonFourRoom;
    private Button btnTuesdayLessonFiveRoom;
    private Button btnTuesdayLessonSixRoom;
    private Button btnTuesdayLessonSevenRoom;
    private Button btnTuesdayLessonEightRoom;
    private Button btnTuesdayLessonNineRoom;

    private Button btnTuesdayLessonZeroPeriod;
    private Button btnTuesdayLessonOnePeriod;
    private Button btnTuesdayLessonTwoPeriod;
    private Button btnTuesdayLessonThreePeriod;
    private Button btnTuesdayLessonFourPeriod;
    private Button btnTuesdayLessonFivePeriod;
    private Button btnTuesdayLessonSixPeriod;
    private Button btnTuesdayLessonSevenPeriod;
    private Button btnTuesdayLessonEightPeriod;
    private Button btnTuesdayLessonNinePeriod;

    private Button btnTuesdaySave;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_tuesday);

        btnTuesdayLessonZeroLessonName = (Button) findViewById(R.id.btnTuesdayLessonZeroLessonName);
        btnTuesdayLessonOneLessonName = (Button) findViewById(R.id.btnTuesdayLessonOneLessonName);
        btnTuesdayLessonTwoLessonName = (Button) findViewById(R.id.btnTuesdayLessonTwoLessonName);
        btnTuesdayLessonThreeLessonName = (Button) findViewById(R.id.btnTuesdayLessonThreeLessonName);
        btnTuesdayLessonFourLessonName = (Button) findViewById(R.id.btnTuesdayLessonFourLessonName);
        btnTuesdayLessonFiveLessonName = (Button) findViewById(R.id.btnTuesdayLessonFiveLessonName);
        btnTuesdayLessonSixLessonName = (Button) findViewById(R.id.btnTuesdayLessonSixLessonName);
        btnTuesdayLessonSevenLessonName = (Button) findViewById(R.id.btnTuesdayLessonSevenLessonName);
        btnTuesdayLessonEightLessonName = (Button) findViewById(R.id.btnTuesdayLessonEightLessonName);
        btnTuesdayLessonNineLessonName = (Button) findViewById(R.id.btnTuesdayLessonNineLessonName);

        btnTuesdayLessonZeroLessonName.setOnClickListener(this);
        btnTuesdayLessonOneLessonName.setOnClickListener(this);
        btnTuesdayLessonTwoLessonName.setOnClickListener(this);
        btnTuesdayLessonThreeLessonName.setOnClickListener(this);
        btnTuesdayLessonFourLessonName.setOnClickListener(this);
        btnTuesdayLessonFiveLessonName.setOnClickListener(this);
        btnTuesdayLessonSixLessonName.setOnClickListener(this);
        btnTuesdayLessonSevenLessonName.setOnClickListener(this);
        btnTuesdayLessonEightLessonName.setOnClickListener(this);
        btnTuesdayLessonNineLessonName.setOnClickListener(this);

        btnTuesdayLessonZeroTeacher = (Button) findViewById(R.id.btnTuesdayLessonZeroTeacher);
        btnTuesdayLessonOneTeacher = (Button) findViewById(R.id.btnTuesdayLessonOneTeacher);
        btnTuesdayLessonTwoTeacher = (Button) findViewById(R.id.btnTuesdayLessonTwoTeacher);
        btnTuesdayLessonThreeTeacher = (Button) findViewById(R.id.btnTuesdayLessonThreeTeacher);
        btnTuesdayLessonFourTeacher = (Button) findViewById(R.id.btnTuesdayLessonFourTeacher);
        btnTuesdayLessonFiveTeacher = (Button) findViewById(R.id.btnTuesdayLessonFiveTeacher);
        btnTuesdayLessonSixTeacher = (Button) findViewById(R.id.btnTuesdayLessonSixTeacher);
        btnTuesdayLessonSevenTeacher = (Button) findViewById(R.id.btnTuesdayLessonSevenTeacher);
        btnTuesdayLessonEightTeacher = (Button) findViewById(R.id.btnTuesdayLessonEightTeacher);
        btnTuesdayLessonNineTeacher = (Button) findViewById(R.id.btnTuesdayLessonNineTeacher);

        btnTuesdayLessonZeroTeacher.setOnClickListener(this);
        btnTuesdayLessonOneTeacher.setOnClickListener(this);
        btnTuesdayLessonTwoTeacher.setOnClickListener(this);
        btnTuesdayLessonThreeTeacher.setOnClickListener(this);
        btnTuesdayLessonFourTeacher.setOnClickListener(this);
        btnTuesdayLessonFiveTeacher.setOnClickListener(this);
        btnTuesdayLessonSixTeacher.setOnClickListener(this);
        btnTuesdayLessonSevenTeacher.setOnClickListener(this);
        btnTuesdayLessonEightTeacher.setOnClickListener(this);
        btnTuesdayLessonNineTeacher.setOnClickListener(this);

        btnTuesdayLessonZeroRoom = (Button) findViewById(R.id.btnTuesdayLessonZeroRoom);
        btnTuesdayLessonOneRoom = (Button) findViewById(R.id.btnTuesdayLessonOneRoom);
        btnTuesdayLessonTwoRoom = (Button) findViewById(R.id.btnTuesdayLessonTwoRoom);
        btnTuesdayLessonThreeRoom = (Button) findViewById(R.id.btnTuesdayLessonThreeRoom);
        btnTuesdayLessonFourRoom = (Button) findViewById(R.id.btnTuesdayLessonFourRoom);
        btnTuesdayLessonFiveRoom = (Button) findViewById(R.id.btnTuesdayLessonFiveRoom);
        btnTuesdayLessonSixRoom = (Button) findViewById(R.id.btnTuesdayLessonSixRoom);
        btnTuesdayLessonSevenRoom = (Button) findViewById(R.id.btnTuesdayLessonSevenRoom);
        btnTuesdayLessonEightRoom = (Button) findViewById(R.id.btnTuesdayLessonEightRoom);
        btnTuesdayLessonNineRoom = (Button) findViewById(R.id.btnTuesdayLessonNineRoom);

        btnTuesdayLessonZeroRoom.setOnClickListener(this);
        btnTuesdayLessonOneRoom.setOnClickListener(this);
        btnTuesdayLessonTwoRoom.setOnClickListener(this);
        btnTuesdayLessonThreeRoom.setOnClickListener(this);
        btnTuesdayLessonFourRoom.setOnClickListener(this);
        btnTuesdayLessonFiveRoom.setOnClickListener(this);
        btnTuesdayLessonSixRoom.setOnClickListener(this);
        btnTuesdayLessonSevenRoom.setOnClickListener(this);
        btnTuesdayLessonEightRoom.setOnClickListener(this);
        btnTuesdayLessonNineRoom.setOnClickListener(this);

        btnTuesdayLessonZeroPeriod = (Button) findViewById(R.id.btnTuesdayLessonZeroPeriod);
        btnTuesdayLessonOnePeriod = (Button) findViewById(R.id.btnTuesdayLessonOnePeriod);
        btnTuesdayLessonTwoPeriod = (Button) findViewById(R.id.btnTuesdayLessonTwoPeriod);
        btnTuesdayLessonThreePeriod = (Button) findViewById(R.id.btnTuesdayLessonThreePeriod);
        btnTuesdayLessonFourPeriod = (Button) findViewById(R.id.btnTuesdayLessonFourPeriod);
        btnTuesdayLessonFivePeriod = (Button) findViewById(R.id.btnTuesdayLessonFivePeriod);
        btnTuesdayLessonSixPeriod = (Button) findViewById(R.id.btnTuesdayLessonSixPeriod);
        btnTuesdayLessonSevenPeriod = (Button) findViewById(R.id.btnTuesdayLessonSevenPeriod);
        btnTuesdayLessonEightPeriod = (Button) findViewById(R.id.btnTuesdayLessonEightPeriod);
        btnTuesdayLessonNinePeriod = (Button) findViewById(R.id.btnTuesdayLessonNinePeriod);

        btnTuesdayLessonZeroPeriod.setOnClickListener(this);
        btnTuesdayLessonOnePeriod.setOnClickListener(this);
        btnTuesdayLessonTwoPeriod.setOnClickListener(this);
        btnTuesdayLessonThreePeriod.setOnClickListener(this);
        btnTuesdayLessonFourPeriod.setOnClickListener(this);
        btnTuesdayLessonFivePeriod.setOnClickListener(this);
        btnTuesdayLessonSixPeriod.setOnClickListener(this);
        btnTuesdayLessonSevenPeriod.setOnClickListener(this);
        btnTuesdayLessonEightPeriod.setOnClickListener(this);
        btnTuesdayLessonNinePeriod.setOnClickListener(this);

        btnTuesdaySave = (Button) findViewById(R.id.btnTuesdaySave);
        btnTuesdaySave.setOnClickListener(this);

        Intent configuredScheduleWeekIntent = getIntent();
        configuredScheduleWeek = configuredScheduleWeekIntent.getExtras().getParcelable(MainActivity.CONFIGURED_SCHEDULE_WEEK);

        initializeScheduleTuesday();
    }

    private void initializeScheduleTuesday() {
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames[0] = configuredScheduleWeek.getTuesdayLessonNames()[0];
            btnTuesdayLessonZeroLessonName.setText(configuredScheduleWeek.getTuesdayLessonNames()[0]);
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers[0] = configuredScheduleWeek.getTuesdayTeachers()[0];
            btnTuesdayLessonZeroTeacher.setText(configuredScheduleWeek.getTuesdayTeachers()[0]);
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms[0] = configuredScheduleWeek.getTuesdayRooms()[0];
            btnTuesdayLessonZeroRoom.setText(configuredScheduleWeek.getTuesdayRooms()[0]);
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods[0] = configuredScheduleWeek.getTuesdayPeriods()[0];
            btnTuesdayLessonZeroPeriod.setText(configuredScheduleWeek.getTuesdayPeriods()[0]);
        }
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames[1] = configuredScheduleWeek.getTuesdayLessonNames()[1];
            btnTuesdayLessonOneLessonName.setText(configuredScheduleWeek.getTuesdayLessonNames()[1]);
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers[1] = configuredScheduleWeek.getTuesdayTeachers()[1];
            btnTuesdayLessonOneTeacher.setText(configuredScheduleWeek.getTuesdayTeachers()[1]);
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms[1] = configuredScheduleWeek.getTuesdayRooms()[1];
            btnTuesdayLessonOneRoom.setText(configuredScheduleWeek.getTuesdayRooms()[1]);
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods[1] = configuredScheduleWeek.getTuesdayPeriods()[1];
            btnTuesdayLessonOnePeriod.setText(configuredScheduleWeek.getTuesdayPeriods()[1]);
        }
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames[2] = configuredScheduleWeek.getTuesdayLessonNames()[2];
            btnTuesdayLessonTwoLessonName.setText(configuredScheduleWeek.getTuesdayLessonNames()[2]);
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers[2] = configuredScheduleWeek.getTuesdayTeachers()[2];
            btnTuesdayLessonTwoTeacher.setText(configuredScheduleWeek.getTuesdayTeachers()[2]);
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms[2] = configuredScheduleWeek.getTuesdayRooms()[2];
            btnTuesdayLessonTwoRoom.setText(configuredScheduleWeek.getTuesdayRooms()[2]);
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods[2] = configuredScheduleWeek.getTuesdayPeriods()[2];
            btnTuesdayLessonTwoPeriod.setText(configuredScheduleWeek.getTuesdayPeriods()[2]);
        }
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames[3] = configuredScheduleWeek.getTuesdayLessonNames()[3];
            btnTuesdayLessonThreeLessonName.setText(configuredScheduleWeek.getTuesdayLessonNames()[3]);
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers[3] = configuredScheduleWeek.getTuesdayTeachers()[3];
            btnTuesdayLessonThreeTeacher.setText(configuredScheduleWeek.getTuesdayTeachers()[3]);
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms[3] = configuredScheduleWeek.getTuesdayRooms()[3];
            btnTuesdayLessonThreeRoom.setText(configuredScheduleWeek.getTuesdayRooms()[3]);
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods[3] = configuredScheduleWeek.getTuesdayPeriods()[3];
            btnTuesdayLessonThreePeriod.setText(configuredScheduleWeek.getTuesdayPeriods()[3]);
        }
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames[4] = configuredScheduleWeek.getTuesdayLessonNames()[4];
            btnTuesdayLessonFourLessonName.setText(configuredScheduleWeek.getTuesdayLessonNames()[4]);
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers[4] = configuredScheduleWeek.getTuesdayTeachers()[4];
            btnTuesdayLessonFourTeacher.setText(configuredScheduleWeek.getTuesdayTeachers()[4]);
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms[4] = configuredScheduleWeek.getTuesdayRooms()[4];
            btnTuesdayLessonFourRoom.setText(configuredScheduleWeek.getTuesdayRooms()[4]);
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods[4] = configuredScheduleWeek.getTuesdayPeriods()[4];
            btnTuesdayLessonFourPeriod.setText(configuredScheduleWeek.getTuesdayPeriods()[4]);
        }
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames[5] = configuredScheduleWeek.getTuesdayLessonNames()[5];
            btnTuesdayLessonFiveLessonName.setText(configuredScheduleWeek.getTuesdayLessonNames()[5]);
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers[5] = configuredScheduleWeek.getTuesdayTeachers()[5];
            btnTuesdayLessonFiveTeacher.setText(configuredScheduleWeek.getTuesdayTeachers()[5]);
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms[5] = configuredScheduleWeek.getTuesdayRooms()[5];
            btnTuesdayLessonFiveRoom.setText(configuredScheduleWeek.getTuesdayRooms()[5]);
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods[5] = configuredScheduleWeek.getTuesdayPeriods()[5];
            btnTuesdayLessonFivePeriod.setText(configuredScheduleWeek.getTuesdayPeriods()[5]);
        }
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames[6] = configuredScheduleWeek.getTuesdayLessonNames()[6];
            btnTuesdayLessonSixLessonName.setText(configuredScheduleWeek.getTuesdayLessonNames()[6]);
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers[6] = configuredScheduleWeek.getTuesdayTeachers()[6];
            btnTuesdayLessonSixTeacher.setText(configuredScheduleWeek.getTuesdayTeachers()[6]);
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms[6] = configuredScheduleWeek.getTuesdayRooms()[6];
            btnTuesdayLessonSixRoom.setText(configuredScheduleWeek.getTuesdayRooms()[6]);
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods[6] = configuredScheduleWeek.getTuesdayPeriods()[6];
            btnTuesdayLessonSixPeriod.setText(configuredScheduleWeek.getTuesdayPeriods()[6]);
        }
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames[7] = configuredScheduleWeek.getTuesdayLessonNames()[7];
            btnTuesdayLessonSevenLessonName.setText(configuredScheduleWeek.getTuesdayLessonNames()[7]);
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers[7] = configuredScheduleWeek.getTuesdayTeachers()[7];
            btnTuesdayLessonSevenTeacher.setText(configuredScheduleWeek.getTuesdayTeachers()[7]);
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms[7] = configuredScheduleWeek.getTuesdayRooms()[7];
            btnTuesdayLessonSevenRoom.setText(configuredScheduleWeek.getTuesdayRooms()[7]);
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods[7] = configuredScheduleWeek.getTuesdayPeriods()[7];
            btnTuesdayLessonSevenPeriod.setText(configuredScheduleWeek.getTuesdayPeriods()[7]);
        }
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames[8] = configuredScheduleWeek.getTuesdayLessonNames()[8];
            btnTuesdayLessonEightLessonName.setText(configuredScheduleWeek.getTuesdayLessonNames()[8]);
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers[8] = configuredScheduleWeek.getTuesdayTeachers()[8];
            btnTuesdayLessonEightTeacher.setText(configuredScheduleWeek.getTuesdayTeachers()[8]);
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms[8] = configuredScheduleWeek.getTuesdayRooms()[8];
            btnTuesdayLessonEightRoom.setText(configuredScheduleWeek.getTuesdayRooms()[8]);
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods[8] = configuredScheduleWeek.getTuesdayPeriods()[8];
            btnTuesdayLessonEightPeriod.setText(configuredScheduleWeek.getTuesdayPeriods()[8]);
        }
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames[9] = configuredScheduleWeek.getTuesdayLessonNames()[9];
            btnTuesdayLessonNineLessonName.setText(configuredScheduleWeek.getTuesdayLessonNames()[9]);
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers[9] = configuredScheduleWeek.getTuesdayTeachers()[9];
            btnTuesdayLessonNineTeacher.setText(configuredScheduleWeek.getTuesdayTeachers()[9]);
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms[9] = configuredScheduleWeek.getTuesdayRooms()[9];
            btnTuesdayLessonNineRoom.setText(configuredScheduleWeek.getTuesdayRooms()[9]);
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods[9] = configuredScheduleWeek.getTuesdayPeriods()[9];
            btnTuesdayLessonNinePeriod.setText(configuredScheduleWeek.getTuesdayPeriods()[9]);
        }
    }

    @Override
    public void onClick(View v) {
        Intent tuesdayLessonNameIntent = new Intent(this, ChooseLesson.class);
        Intent tuesdayTeacherIntent = new Intent(this, ChooseTeacher.class);
        Intent tuesdayRoomIntent = new Intent(this, ChooseRoom.class);
        Intent tuesdayPeriodIntent = new Intent(this, ChoosePeriod.class);
        switch (v.getId()) {
            case R.id.btnTuesdayLessonZeroLessonName:
                startActivityForResult(tuesdayLessonNameIntent, 10);
                break;
            case R.id.btnTuesdayLessonOneLessonName:
                startActivityForResult(tuesdayLessonNameIntent, 11);
                break;
            case R.id.btnTuesdayLessonTwoLessonName:
                startActivityForResult(tuesdayLessonNameIntent, 12);
                break;
            case R.id.btnTuesdayLessonThreeLessonName:
                startActivityForResult(tuesdayLessonNameIntent, 13);
                break;
            case R.id.btnTuesdayLessonFourLessonName:
                startActivityForResult(tuesdayLessonNameIntent, 14);
                break;
            case R.id.btnTuesdayLessonFiveLessonName:
                startActivityForResult(tuesdayLessonNameIntent, 15);
                break;
            case R.id.btnTuesdayLessonSixLessonName:
                startActivityForResult(tuesdayLessonNameIntent, 16);
                break;
            case R.id.btnTuesdayLessonSevenLessonName:
                startActivityForResult(tuesdayLessonNameIntent, 17);
                break;
            case R.id.btnTuesdayLessonEightLessonName:
                startActivityForResult(tuesdayLessonNameIntent, 18);
                break;
            case R.id.btnTuesdayLessonNineLessonName:
                startActivityForResult(tuesdayLessonNameIntent, 19);
                break;
            case R.id.btnTuesdayLessonZeroTeacher:
                startActivityForResult(tuesdayTeacherIntent, 20);
                break;
            case R.id.btnTuesdayLessonOneTeacher:
                startActivityForResult(tuesdayTeacherIntent, 21);
                break;
            case R.id.btnTuesdayLessonTwoTeacher:
                startActivityForResult(tuesdayTeacherIntent, 22);
                break;
            case R.id.btnTuesdayLessonThreeTeacher:
                startActivityForResult(tuesdayTeacherIntent, 23);
                break;
            case R.id.btnTuesdayLessonFourTeacher:
                startActivityForResult(tuesdayTeacherIntent, 24);
                break;
            case R.id.btnTuesdayLessonFiveTeacher:
                startActivityForResult(tuesdayTeacherIntent, 25);
                break;
            case R.id.btnTuesdayLessonSixTeacher:
                startActivityForResult(tuesdayTeacherIntent, 26);
                break;
            case R.id.btnTuesdayLessonSevenTeacher:
                startActivityForResult(tuesdayTeacherIntent, 27);
                break;
            case R.id.btnTuesdayLessonEightTeacher:
                startActivityForResult(tuesdayTeacherIntent, 28);
                break;
            case R.id.btnTuesdayLessonNineTeacher:
                startActivityForResult(tuesdayTeacherIntent, 29);
                break;
            case R.id.btnTuesdayLessonZeroRoom:
                startActivityForResult(tuesdayRoomIntent, 30);
                break;
            case R.id.btnTuesdayLessonOneRoom:
                startActivityForResult(tuesdayRoomIntent, 31);
                break;
            case R.id.btnTuesdayLessonTwoRoom:
                startActivityForResult(tuesdayRoomIntent, 32);
                break;
            case R.id.btnTuesdayLessonThreeRoom:
                startActivityForResult(tuesdayRoomIntent, 33);
                break;
            case R.id.btnTuesdayLessonFourRoom:
                startActivityForResult(tuesdayRoomIntent, 34);
                break;
            case R.id.btnTuesdayLessonFiveRoom:
                startActivityForResult(tuesdayRoomIntent, 35);
                break;
            case R.id.btnTuesdayLessonSixRoom:
                startActivityForResult(tuesdayRoomIntent, 36);
                break;
            case R.id.btnTuesdayLessonSevenRoom:
                startActivityForResult(tuesdayRoomIntent, 37);
                break;
            case R.id.btnTuesdayLessonEightRoom:
                startActivityForResult(tuesdayRoomIntent, 38);
                break;
            case R.id.btnTuesdayLessonNineRoom:
                startActivityForResult(tuesdayRoomIntent, 39);
                break;
            case R.id.btnTuesdayLessonZeroPeriod:
                startActivityForResult(tuesdayPeriodIntent, 40);
                break;
            case R.id.btnTuesdayLessonOnePeriod:
                startActivityForResult(tuesdayPeriodIntent, 41);
                break;
            case R.id.btnTuesdayLessonTwoPeriod:
                startActivityForResult(tuesdayPeriodIntent, 42);
                break;
            case R.id.btnTuesdayLessonThreePeriod:
                startActivityForResult(tuesdayPeriodIntent, 44);
                break;
            case R.id.btnTuesdayLessonFourPeriod:
                startActivityForResult(tuesdayPeriodIntent, 44);
                break;
            case R.id.btnTuesdayLessonFivePeriod:
                startActivityForResult(tuesdayPeriodIntent, 45);
                break;
            case R.id.btnTuesdayLessonSixPeriod:
                startActivityForResult(tuesdayPeriodIntent, 46);
                break;
            case R.id.btnTuesdayLessonSevenPeriod:
                startActivityForResult(tuesdayPeriodIntent, 47);
                break;
            case R.id.btnTuesdayLessonEightPeriod:
                startActivityForResult(tuesdayPeriodIntent, 48);
                break;
            case R.id.btnTuesdayLessonNinePeriod:
                startActivityForResult(tuesdayPeriodIntent, 49);
                break;
            case R.id.btnTuesdaySave:
                Intent configureScheduleIntent = new Intent(this, ConfigureWednesdayActivity.class);
                configuredScheduleWeek.setTuesdayLessonNames(tuesdayLessonNames);
                configuredScheduleWeek.setTuesdayTeachers(tuesdayTeachers);
                configuredScheduleWeek.setTuesdayRooms(tuesdayRooms);
                configuredScheduleWeek.setTuesdayPeriods(tuesdayPeriods);
                configureScheduleIntent.putExtra(MainActivity.CONFIGURED_SCHEDULE_WEEK, configuredScheduleWeek);
                startActivityForResult(configureScheduleIntent, 100);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 10:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnTuesdayLessonZeroLessonName.setText(tuesdayLessonName);
                    tuesdayLessonNames[0] = tuesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 11:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnTuesdayLessonOneLessonName.setText(tuesdayLessonName);
                    tuesdayLessonNames[1] = tuesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 12:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnTuesdayLessonTwoLessonName.setText(tuesdayLessonName);
                    tuesdayLessonNames[2] = tuesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 13:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnTuesdayLessonThreeLessonName.setText(tuesdayLessonName);
                    tuesdayLessonNames[3] = tuesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 14:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnTuesdayLessonFourLessonName.setText(tuesdayLessonName);
                    tuesdayLessonNames[4] = tuesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 15:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnTuesdayLessonFiveLessonName.setText(tuesdayLessonName);
                    tuesdayLessonNames[5] = tuesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 16:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnTuesdayLessonSixLessonName.setText(tuesdayLessonName);
                    tuesdayLessonNames[6] = tuesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 17:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnTuesdayLessonSevenLessonName.setText(tuesdayLessonName);
                    tuesdayLessonNames[7] = tuesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 18:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnTuesdayLessonEightLessonName.setText(tuesdayLessonName);
                    tuesdayLessonNames[8] = tuesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 19:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnTuesdayLessonNineLessonName.setText(tuesdayLessonName);
                    tuesdayLessonNames[9] = tuesdayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 20:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnTuesdayLessonZeroTeacher.setText(tuesdayTeacher);
                    tuesdayTeachers[0] = tuesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 21:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnTuesdayLessonOneTeacher.setText(tuesdayTeacher);
                    tuesdayTeachers[1] = tuesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 22:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnTuesdayLessonTwoTeacher.setText(tuesdayTeacher);
                    tuesdayTeachers[2] = tuesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 23:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnTuesdayLessonThreeTeacher.setText(tuesdayTeacher);
                    tuesdayTeachers[3] = tuesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 24:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnTuesdayLessonFourTeacher.setText(tuesdayTeacher);
                    tuesdayTeachers[4] = tuesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 25:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnTuesdayLessonFiveTeacher.setText(tuesdayTeacher);
                    tuesdayTeachers[5] = tuesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 26:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnTuesdayLessonSixTeacher.setText(tuesdayTeacher);
                    tuesdayTeachers[6] = tuesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 27:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnTuesdayLessonSevenTeacher.setText(tuesdayTeacher);
                    tuesdayTeachers[7] = tuesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 28:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnTuesdayLessonEightTeacher.setText(tuesdayTeacher);
                    tuesdayTeachers[8] = tuesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 29:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnTuesdayLessonNineTeacher.setText(tuesdayTeacher);
                    tuesdayTeachers[9] = tuesdayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 30:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnTuesdayLessonZeroRoom.setText(tuesdayRoom);
                    tuesdayRooms[0] = tuesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 31:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnTuesdayLessonOneRoom.setText(tuesdayRoom);
                    tuesdayRooms[1] = tuesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 32:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnTuesdayLessonTwoRoom.setText(tuesdayRoom);
                    tuesdayRooms[2] = tuesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 33:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnTuesdayLessonThreeRoom.setText(tuesdayRoom);
                    tuesdayRooms[3] = tuesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 34:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnTuesdayLessonFourRoom.setText(tuesdayRoom);
                    tuesdayRooms[4] = tuesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 35:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnTuesdayLessonFiveRoom.setText(tuesdayRoom);
                    tuesdayRooms[5] = tuesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 36:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnTuesdayLessonSixRoom.setText(tuesdayRoom);
                    tuesdayRooms[6] = tuesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 37:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnTuesdayLessonSevenRoom.setText(tuesdayRoom);
                    tuesdayRooms[7] = tuesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 38:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnTuesdayLessonEightRoom.setText(tuesdayRoom);
                    tuesdayRooms[8] = tuesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 39:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnTuesdayLessonNineRoom.setText(tuesdayRoom);
                    tuesdayRooms[9] = tuesdayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;

            case 40:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnTuesdayLessonZeroPeriod.setText(tuesdayPeriod);
                    tuesdayPeriods[0] = tuesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 41:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnTuesdayLessonOnePeriod.setText(tuesdayPeriod);
                    tuesdayPeriods[1] = tuesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 42:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnTuesdayLessonTwoPeriod.setText(tuesdayPeriod);
                    tuesdayPeriods[2] = tuesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 43:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnTuesdayLessonThreePeriod.setText(tuesdayPeriod);
                    tuesdayPeriods[3] = tuesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 44:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnTuesdayLessonFourPeriod.setText(tuesdayPeriod);
                    tuesdayPeriods[4] = tuesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 45:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnTuesdayLessonFivePeriod.setText(tuesdayPeriod);
                    tuesdayPeriods[5] = tuesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 46:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnTuesdayLessonSixPeriod.setText(tuesdayPeriod);
                    tuesdayPeriods[6] = tuesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 47:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnTuesdayLessonSevenPeriod.setText(tuesdayPeriod);
                    tuesdayPeriods[7] = tuesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 48:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnTuesdayLessonEightPeriod.setText(tuesdayPeriod);
                    tuesdayPeriods[8] = tuesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 49:
                if(resultCode == Activity.RESULT_OK){
                    String tuesdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnTuesdayLessonNinePeriod.setText(tuesdayPeriod);
                    tuesdayPeriods[9] = tuesdayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 100:
                if(resultCode == Activity.RESULT_OK){
                    setResult(Activity.RESULT_OK, data);
                    finish();
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, CANCEL_MSG_CONFIGURE_WEDNESDAY, Toast.LENGTH_LONG).show();}
                break;
        }
    }
}