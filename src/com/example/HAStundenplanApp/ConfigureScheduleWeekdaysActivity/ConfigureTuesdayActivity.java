package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.HAStundenplanApp.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public class ConfigureTuesdayActivity extends Activity implements View.OnClickListener {
    private String[] tuesdayLessonNames = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] tuesdayTeachers = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] tuesdayRooms = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] tuesdayPeriods = new String[]{"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    private ScheduleWeek configuredScheduleWeek;
    private TextView[] tvTuesdayLessonTimes = new TextView[20];
    private int[] btnTuesdayIDs = new int[41];

    private static final String CANCEL_MSG_CONFIGURE_WEDNESDAY = "Der Vorgang: \"Erstellen des Stundenplans am Mittwoch\" wurde abgebrochen!";

    private Button[] lessonNameButtons = new Button[10];
    private Button[] teacherButtons = new Button[10];
    private Button[] roomButtons = new Button[10];
    private Button[] periodButtons = new Button[10];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_tuesday);

        lessonNameButtons[0] = (Button) findViewById(R.id.btnTuesdayLessonZeroLessonName);
        lessonNameButtons[1] = (Button) findViewById(R.id.btnTuesdayLessonOneLessonName);
        lessonNameButtons[2] = (Button) findViewById(R.id.btnTuesdayLessonTwoLessonName);
        lessonNameButtons[3] = (Button) findViewById(R.id.btnTuesdayLessonThreeLessonName);
        lessonNameButtons[4] = (Button) findViewById(R.id.btnTuesdayLessonFourLessonName);
        lessonNameButtons[5] = (Button) findViewById(R.id.btnTuesdayLessonFiveLessonName);
        lessonNameButtons[6] = (Button) findViewById(R.id.btnTuesdayLessonSixLessonName);
        lessonNameButtons[7] = (Button) findViewById(R.id.btnTuesdayLessonSevenLessonName);
        lessonNameButtons[8] = (Button) findViewById(R.id.btnTuesdayLessonEightLessonName);
        lessonNameButtons[9] = (Button) findViewById(R.id.btnTuesdayLessonNineLessonName);

        lessonNameButtons[0].setOnClickListener(this);
        lessonNameButtons[1].setOnClickListener(this);
        lessonNameButtons[2].setOnClickListener(this);
        lessonNameButtons[3].setOnClickListener(this);
        lessonNameButtons[4].setOnClickListener(this);
        lessonNameButtons[5].setOnClickListener(this);
        lessonNameButtons[6].setOnClickListener(this);
        lessonNameButtons[7].setOnClickListener(this);
        lessonNameButtons[8].setOnClickListener(this);
        lessonNameButtons[9].setOnClickListener(this);

        teacherButtons[0] = (Button) findViewById(R.id.btnTuesdayLessonZeroTeacher);
        teacherButtons[1] = (Button) findViewById(R.id.btnTuesdayLessonOneTeacher);
        teacherButtons[2] = (Button) findViewById(R.id.btnTuesdayLessonTwoTeacher);
        teacherButtons[3] = (Button) findViewById(R.id.btnTuesdayLessonThreeTeacher);
        teacherButtons[4] = (Button) findViewById(R.id.btnTuesdayLessonFourTeacher);
        teacherButtons[5] = (Button) findViewById(R.id.btnTuesdayLessonFiveTeacher);
        teacherButtons[6] = (Button) findViewById(R.id.btnTuesdayLessonSixTeacher);
        teacherButtons[7] = (Button) findViewById(R.id.btnTuesdayLessonSevenTeacher);
        teacherButtons[8] = (Button) findViewById(R.id.btnTuesdayLessonEightTeacher);
        teacherButtons[9] = (Button) findViewById(R.id.btnTuesdayLessonNineTeacher);

        teacherButtons[0].setOnClickListener(this);
        teacherButtons[1].setOnClickListener(this);
        teacherButtons[2].setOnClickListener(this);
        teacherButtons[3].setOnClickListener(this);
        teacherButtons[4].setOnClickListener(this);
        teacherButtons[5].setOnClickListener(this);
        teacherButtons[6].setOnClickListener(this);
        teacherButtons[7].setOnClickListener(this);
        teacherButtons[8].setOnClickListener(this);
        teacherButtons[9].setOnClickListener(this);

        roomButtons[0] = (Button) findViewById(R.id.btnTuesdayLessonZeroRoom);
        roomButtons[1] = (Button) findViewById(R.id.btnTuesdayLessonOneRoom);
        roomButtons[2] = (Button) findViewById(R.id.btnTuesdayLessonTwoRoom);
        roomButtons[3] = (Button) findViewById(R.id.btnTuesdayLessonThreeRoom);
        roomButtons[4] = (Button) findViewById(R.id.btnTuesdayLessonFourRoom);
        roomButtons[5] = (Button) findViewById(R.id.btnTuesdayLessonFiveRoom);
        roomButtons[6] = (Button) findViewById(R.id.btnTuesdayLessonSixRoom);
        roomButtons[7] = (Button) findViewById(R.id.btnTuesdayLessonSevenRoom);
        roomButtons[8] = (Button) findViewById(R.id.btnTuesdayLessonEightRoom);
        roomButtons[9] = (Button) findViewById(R.id.btnTuesdayLessonNineRoom);

        roomButtons[0].setOnClickListener(this);
        roomButtons[1].setOnClickListener(this);
        roomButtons[2].setOnClickListener(this);
        roomButtons[3].setOnClickListener(this);
        roomButtons[4].setOnClickListener(this);
        roomButtons[5].setOnClickListener(this);
        roomButtons[6].setOnClickListener(this);
        roomButtons[7].setOnClickListener(this);
        roomButtons[8].setOnClickListener(this);
        roomButtons[9].setOnClickListener(this);

        periodButtons[0] = (Button) findViewById(R.id.btnTuesdayLessonZeroPeriod);
        periodButtons[1] = (Button) findViewById(R.id.btnTuesdayLessonOnePeriod);
        periodButtons[2] = (Button) findViewById(R.id.btnTuesdayLessonTwoPeriod);
        periodButtons[3] = (Button) findViewById(R.id.btnTuesdayLessonThreePeriod);
        periodButtons[4] = (Button) findViewById(R.id.btnTuesdayLessonFourPeriod);
        periodButtons[5] = (Button) findViewById(R.id.btnTuesdayLessonFivePeriod);
        periodButtons[6] = (Button) findViewById(R.id.btnTuesdayLessonSixPeriod);
        periodButtons[7] = (Button) findViewById(R.id.btnTuesdayLessonSevenPeriod);
        periodButtons[8] = (Button) findViewById(R.id.btnTuesdayLessonEightPeriod);
        periodButtons[9] = (Button) findViewById(R.id.btnTuesdayLessonNinePeriod);

        periodButtons[0].setOnClickListener(this);
        periodButtons[1].setOnClickListener(this);
        periodButtons[2].setOnClickListener(this);
        periodButtons[3].setOnClickListener(this);
        periodButtons[4].setOnClickListener(this);
        periodButtons[5].setOnClickListener(this);
        periodButtons[6].setOnClickListener(this);
        periodButtons[7].setOnClickListener(this);
        periodButtons[8].setOnClickListener(this);
        periodButtons[9].setOnClickListener(this);

        Button btnTuesdaySave = (Button) findViewById(R.id.btnTuesdaySave);
        btnTuesdaySave.setOnClickListener(this);

        btnTuesdayIDs[0] = R.id.btnTuesdayLessonZeroLessonName;
        btnTuesdayIDs[1] = R.id.btnTuesdayLessonOneLessonName;
        btnTuesdayIDs[2] = R.id.btnTuesdayLessonTwoLessonName;
        btnTuesdayIDs[3] = R.id.btnTuesdayLessonThreeLessonName;
        btnTuesdayIDs[4] = R.id.btnTuesdayLessonFourLessonName;
        btnTuesdayIDs[5] = R.id.btnTuesdayLessonFiveLessonName;
        btnTuesdayIDs[6] = R.id.btnTuesdayLessonSixLessonName;
        btnTuesdayIDs[7] = R.id.btnTuesdayLessonSevenLessonName;
        btnTuesdayIDs[8] = R.id.btnTuesdayLessonEightLessonName;
        btnTuesdayIDs[9] = R.id.btnTuesdayLessonNineLessonName;
        btnTuesdayIDs[10] = R.id.btnTuesdayLessonZeroTeacher;
        btnTuesdayIDs[11] = R.id.btnTuesdayLessonOneTeacher;
        btnTuesdayIDs[12] = R.id.btnTuesdayLessonTwoTeacher;
        btnTuesdayIDs[13] = R.id.btnTuesdayLessonThreeTeacher;
        btnTuesdayIDs[14] = R.id.btnTuesdayLessonFourTeacher;
        btnTuesdayIDs[15] = R.id.btnTuesdayLessonFiveTeacher;
        btnTuesdayIDs[16] = R.id.btnTuesdayLessonSixTeacher;
        btnTuesdayIDs[17] = R.id.btnTuesdayLessonSevenTeacher;
        btnTuesdayIDs[18] = R.id.btnTuesdayLessonEightTeacher;
        btnTuesdayIDs[19] = R.id.btnTuesdayLessonNineTeacher;
        btnTuesdayIDs[20] = R.id.btnTuesdayLessonZeroRoom;
        btnTuesdayIDs[21] = R.id.btnTuesdayLessonOneRoom;
        btnTuesdayIDs[22] = R.id.btnTuesdayLessonTwoRoom;
        btnTuesdayIDs[23] = R.id.btnTuesdayLessonThreeRoom;
        btnTuesdayIDs[24] = R.id.btnTuesdayLessonFourRoom;
        btnTuesdayIDs[25] = R.id.btnTuesdayLessonFiveRoom;
        btnTuesdayIDs[26] = R.id.btnTuesdayLessonSixRoom;
        btnTuesdayIDs[27] = R.id.btnTuesdayLessonSevenRoom;
        btnTuesdayIDs[28] = R.id.btnTuesdayLessonEightRoom;
        btnTuesdayIDs[29] = R.id.btnTuesdayLessonNineRoom;
        btnTuesdayIDs[30] = R.id.btnTuesdayLessonZeroPeriod;
        btnTuesdayIDs[31] = R.id.btnTuesdayLessonOnePeriod;
        btnTuesdayIDs[32] = R.id.btnTuesdayLessonTwoPeriod;
        btnTuesdayIDs[33] = R.id.btnTuesdayLessonThreePeriod;
        btnTuesdayIDs[34] = R.id.btnTuesdayLessonFourPeriod;
        btnTuesdayIDs[35] = R.id.btnTuesdayLessonFivePeriod;
        btnTuesdayIDs[36] = R.id.btnTuesdayLessonSixPeriod;
        btnTuesdayIDs[37] = R.id.btnTuesdayLessonSevenPeriod;
        btnTuesdayIDs[38] = R.id.btnTuesdayLessonEightPeriod;
        btnTuesdayIDs[39] = R.id.btnTuesdayLessonNinePeriod;
        btnTuesdayIDs[40] = R.id.btnTuesdaySave;

        tvTuesdayLessonTimes[0] = (TextView) findViewById(R.id.tvTuesdayLessonZeroStart);
        tvTuesdayLessonTimes[1] = (TextView) findViewById(R.id.tvTuesdayLessonZeroEnd);
        tvTuesdayLessonTimes[2] = (TextView) findViewById(R.id.tvTuesdayLessonOneStart);
        tvTuesdayLessonTimes[3] = (TextView) findViewById(R.id.tvTuesdayLessonOneEnd);
        tvTuesdayLessonTimes[4] = (TextView) findViewById(R.id.tvTuesdayLessonTwoStart);
        tvTuesdayLessonTimes[5] = (TextView) findViewById(R.id.tvTuesdayLessonTwoEnd);
        tvTuesdayLessonTimes[6] = (TextView) findViewById(R.id.tvTuesdayLessonThreeStart);
        tvTuesdayLessonTimes[7] = (TextView) findViewById(R.id.tvTuesdayLessonThreeEnd);
        tvTuesdayLessonTimes[8] = (TextView) findViewById(R.id.tvTuesdayLessonFourStart);
        tvTuesdayLessonTimes[9] = (TextView) findViewById(R.id.tvTuesdayLessonFourEnd);
        tvTuesdayLessonTimes[10] = (TextView) findViewById(R.id.tvTuesdayLessonFiveStart);
        tvTuesdayLessonTimes[11] = (TextView) findViewById(R.id.tvTuesdayLessonFiveEnd);
        tvTuesdayLessonTimes[12] = (TextView) findViewById(R.id.tvTuesdayLessonSixStart);
        tvTuesdayLessonTimes[13] = (TextView) findViewById(R.id.tvTuesdayLessonSixEnd);
        tvTuesdayLessonTimes[14] = (TextView) findViewById(R.id.tvTuesdayLessonSevenStart);
        tvTuesdayLessonTimes[15] = (TextView) findViewById(R.id.tvTuesdayLessonSevenEnd);
        tvTuesdayLessonTimes[16] = (TextView) findViewById(R.id.tvTuesdayLessonEightStart);
        tvTuesdayLessonTimes[17] = (TextView) findViewById(R.id.tvTuesdayLessonEightEnd);
        tvTuesdayLessonTimes[18] = (TextView) findViewById(R.id.tvTuesdayLessonNineStart);
        tvTuesdayLessonTimes[19] = (TextView) findViewById(R.id.tvTuesdayLessonNineEnd);

        //Calculates the Start and End Times of a Lesson
        DummyConfiguration dc = new DummyConfiguration();
        Configuration configuration = dc.getConfiguration();
        Calendar lessonTime = Calendar.getInstance();
        lessonTime.setTime(configuration.getStartEarliestLesson());

        ConfigureWeekdays.calculateWeekdayLessonTimes(tvTuesdayLessonTimes, configuration.getBreaks(), lessonTime, configuration.getLessonDurationInMinutes());

        Intent configuredScheduleWeekIntent = getIntent();
        configuredScheduleWeek = configuredScheduleWeekIntent.getExtras().getParcelable(MainActivity.CONFIGURED_SCHEDULE_WEEK);
        
        if (configuredScheduleWeek != null && configuredScheduleWeek.getTuesdayRooms() != null &&
                configuredScheduleWeek.getTuesdayTeachers() != null && configuredScheduleWeek.getTuesdayRooms() != null &&
                configuredScheduleWeek.getTuesdayPeriods() != null) {
            ConfigureWeekdays.initializeScheduleWeekday(tuesdayLessonNames, tuesdayTeachers, tuesdayRooms, tuesdayPeriods,
                    configuredScheduleWeek.getTuesdayLessonNames(), configuredScheduleWeek.getTuesdayTeachers(),
                    configuredScheduleWeek.getTuesdayRooms(), configuredScheduleWeek.getTuesdayPeriods(),
                    lessonNameButtons, teacherButtons, roomButtons, periodButtons);
        }
    }


    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED, new Intent());
        finish();
    }

    @Override
    public void onClick(View v) {
        Intent intent = ConfigureWeekdays.onWeekdayButtonsClick(v, this, btnTuesdayIDs);
        int rc = intent.getIntExtra(ConfigureWeekdays.REQUEST_CODE, -1);
        if (rc == 50) {
            for (int i = 0; i < tuesdayLessonNames.length; i++) {
                ConfigureWeekdays.checkScheduleRow(i, tuesdayLessonNames, tuesdayTeachers, tuesdayRooms, tuesdayPeriods);
            }
            Intent configureScheduleIntent = new Intent(this, ConfigureWednesdayActivity.class);
            configuredScheduleWeek.setTuesdayLessonNames(tuesdayLessonNames);
            configuredScheduleWeek.setTuesdayTeachers(tuesdayTeachers);
            configuredScheduleWeek.setTuesdayRooms(tuesdayRooms);
            configuredScheduleWeek.setTuesdayPeriods(tuesdayPeriods);
            configureScheduleIntent.putExtra(MainActivity.CONFIGURED_SCHEDULE_WEEK, configuredScheduleWeek);
            startActivityForResult(configureScheduleIntent, rc);
        } else if (rc == -1) {
            throw new IllegalStateException("The REQUEST_CODE is -1 = Error Code");
        } else {
            startActivityForResult(intent, rc);
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK && requestCode == 50) {
            setResult(Activity.RESULT_OK, data);
            finish();
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 50) {
            Toast.makeText(this, CANCEL_MSG_CONFIGURE_WEDNESDAY, Toast.LENGTH_LONG).show();
        } else {
            ConfigureWeekdays.onWeekdayButtonsResult(requestCode, resultCode, data, this, tuesdayLessonNames, tuesdayTeachers, tuesdayRooms, tuesdayPeriods,
                    lessonNameButtons, teacherButtons, roomButtons, periodButtons);
        }
    }

}