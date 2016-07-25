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
public class ConfigureWednesdayActivity extends Activity implements View.OnClickListener {
    private String[] wednesdayLessonNames = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] wednesdayTeachers = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] wednesdayRooms = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] wednesdayPeriods = new String[]{"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    private ScheduleWeek configuredScheduleWeek;
    private TextView[] tvWednesdayLessonTimes = new TextView[20];
    private int[] btnWednesdayIDs = new int[41];

    private static final String CANCEL_MSG_CONFIGURE_THURSDAY = "Der Vorgang: \"Erstellen des Stundenplans am Donnerstag\" wurde abgebrochen!";

    private Button[] lessonNameButtons = new Button[10];
    private Button[] teacherButtons = new Button[10];
    private Button[] roomButtons = new Button[10];
    private Button[] periodButtons = new Button[10];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_wednesday);

        lessonNameButtons[0] = (Button) findViewById(R.id.btnWednesdayLessonZeroLessonName);
        lessonNameButtons[1] = (Button) findViewById(R.id.btnWednesdayLessonOneLessonName);
        lessonNameButtons[2] = (Button) findViewById(R.id.btnWednesdayLessonTwoLessonName);
        lessonNameButtons[3] = (Button) findViewById(R.id.btnWednesdayLessonThreeLessonName);
        lessonNameButtons[4] = (Button) findViewById(R.id.btnWednesdayLessonFourLessonName);
        lessonNameButtons[5] = (Button) findViewById(R.id.btnWednesdayLessonFiveLessonName);
        lessonNameButtons[6] = (Button) findViewById(R.id.btnWednesdayLessonSixLessonName);
        lessonNameButtons[7] = (Button) findViewById(R.id.btnWednesdayLessonSevenLessonName);
        lessonNameButtons[8] = (Button) findViewById(R.id.btnWednesdayLessonEightLessonName);
        lessonNameButtons[9] = (Button) findViewById(R.id.btnWednesdayLessonNineLessonName);

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

        teacherButtons[0] = (Button) findViewById(R.id.btnWednesdayLessonZeroTeacher);
        teacherButtons[1] = (Button) findViewById(R.id.btnWednesdayLessonOneTeacher);
        teacherButtons[2] = (Button) findViewById(R.id.btnWednesdayLessonTwoTeacher);
        teacherButtons[3] = (Button) findViewById(R.id.btnWednesdayLessonThreeTeacher);
        teacherButtons[4] = (Button) findViewById(R.id.btnWednesdayLessonFourTeacher);
        teacherButtons[5] = (Button) findViewById(R.id.btnWednesdayLessonFiveTeacher);
        teacherButtons[6] = (Button) findViewById(R.id.btnWednesdayLessonSixTeacher);
        teacherButtons[7] = (Button) findViewById(R.id.btnWednesdayLessonSevenTeacher);
        teacherButtons[8] = (Button) findViewById(R.id.btnWednesdayLessonEightTeacher);
        teacherButtons[9] = (Button) findViewById(R.id.btnWednesdayLessonNineTeacher);

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

        roomButtons[0] = (Button) findViewById(R.id.btnWednesdayLessonZeroRoom);
        roomButtons[1] = (Button) findViewById(R.id.btnWednesdayLessonOneRoom);
        roomButtons[2] = (Button) findViewById(R.id.btnWednesdayLessonTwoRoom);
        roomButtons[3] = (Button) findViewById(R.id.btnWednesdayLessonThreeRoom);
        roomButtons[4] = (Button) findViewById(R.id.btnWednesdayLessonFourRoom);
        roomButtons[5] = (Button) findViewById(R.id.btnWednesdayLessonFiveRoom);
        roomButtons[6] = (Button) findViewById(R.id.btnWednesdayLessonSixRoom);
        roomButtons[7] = (Button) findViewById(R.id.btnWednesdayLessonSevenRoom);
        roomButtons[8] = (Button) findViewById(R.id.btnWednesdayLessonEightRoom);
        roomButtons[9] = (Button) findViewById(R.id.btnWednesdayLessonNineRoom);

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

        periodButtons[0] = (Button) findViewById(R.id.btnWednesdayLessonZeroPeriod);
        periodButtons[1] = (Button) findViewById(R.id.btnWednesdayLessonOnePeriod);
        periodButtons[2] = (Button) findViewById(R.id.btnWednesdayLessonTwoPeriod);
        periodButtons[3] = (Button) findViewById(R.id.btnWednesdayLessonThreePeriod);
        periodButtons[4] = (Button) findViewById(R.id.btnWednesdayLessonFourPeriod);
        periodButtons[5] = (Button) findViewById(R.id.btnWednesdayLessonFivePeriod);
        periodButtons[6] = (Button) findViewById(R.id.btnWednesdayLessonSixPeriod);
        periodButtons[7] = (Button) findViewById(R.id.btnWednesdayLessonSevenPeriod);
        periodButtons[8] = (Button) findViewById(R.id.btnWednesdayLessonEightPeriod);
        periodButtons[9] = (Button) findViewById(R.id.btnWednesdayLessonNinePeriod);

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

        Button btnWednesdaySave = (Button) findViewById(R.id.btnWednesdaySave);
        btnWednesdaySave.setOnClickListener(this);

        btnWednesdayIDs[0] = R.id.btnWednesdayLessonZeroLessonName;
        btnWednesdayIDs[1] = R.id.btnWednesdayLessonOneLessonName;
        btnWednesdayIDs[2] = R.id.btnWednesdayLessonTwoLessonName;
        btnWednesdayIDs[3] = R.id.btnWednesdayLessonThreeLessonName;
        btnWednesdayIDs[4] = R.id.btnWednesdayLessonFourLessonName;
        btnWednesdayIDs[5] = R.id.btnWednesdayLessonFiveLessonName;
        btnWednesdayIDs[6] = R.id.btnWednesdayLessonSixLessonName;
        btnWednesdayIDs[7] = R.id.btnWednesdayLessonSevenLessonName;
        btnWednesdayIDs[8] = R.id.btnWednesdayLessonEightLessonName;
        btnWednesdayIDs[9] = R.id.btnWednesdayLessonNineLessonName;
        btnWednesdayIDs[10] = R.id.btnWednesdayLessonZeroTeacher;
        btnWednesdayIDs[11] = R.id.btnWednesdayLessonOneTeacher;
        btnWednesdayIDs[12] = R.id.btnWednesdayLessonTwoTeacher;
        btnWednesdayIDs[13] = R.id.btnWednesdayLessonThreeTeacher;
        btnWednesdayIDs[14] = R.id.btnWednesdayLessonFourTeacher;
        btnWednesdayIDs[15] = R.id.btnWednesdayLessonFiveTeacher;
        btnWednesdayIDs[16] = R.id.btnWednesdayLessonSixTeacher;
        btnWednesdayIDs[17] = R.id.btnWednesdayLessonSevenTeacher;
        btnWednesdayIDs[18] = R.id.btnWednesdayLessonEightTeacher;
        btnWednesdayIDs[19] = R.id.btnWednesdayLessonNineTeacher;
        btnWednesdayIDs[20] = R.id.btnWednesdayLessonZeroRoom;
        btnWednesdayIDs[21] = R.id.btnWednesdayLessonOneRoom;
        btnWednesdayIDs[22] = R.id.btnWednesdayLessonTwoRoom;
        btnWednesdayIDs[23] = R.id.btnWednesdayLessonThreeRoom;
        btnWednesdayIDs[24] = R.id.btnWednesdayLessonFourRoom;
        btnWednesdayIDs[25] = R.id.btnWednesdayLessonFiveRoom;
        btnWednesdayIDs[26] = R.id.btnWednesdayLessonSixRoom;
        btnWednesdayIDs[27] = R.id.btnWednesdayLessonSevenRoom;
        btnWednesdayIDs[28] = R.id.btnWednesdayLessonEightRoom;
        btnWednesdayIDs[29] = R.id.btnWednesdayLessonNineRoom;
        btnWednesdayIDs[30] = R.id.btnWednesdayLessonZeroPeriod;
        btnWednesdayIDs[31] = R.id.btnWednesdayLessonOnePeriod;
        btnWednesdayIDs[32] = R.id.btnWednesdayLessonTwoPeriod;
        btnWednesdayIDs[33] = R.id.btnWednesdayLessonThreePeriod;
        btnWednesdayIDs[34] = R.id.btnWednesdayLessonFourPeriod;
        btnWednesdayIDs[35] = R.id.btnWednesdayLessonFivePeriod;
        btnWednesdayIDs[36] = R.id.btnWednesdayLessonSixPeriod;
        btnWednesdayIDs[37] = R.id.btnWednesdayLessonSevenPeriod;
        btnWednesdayIDs[38] = R.id.btnWednesdayLessonEightPeriod;
        btnWednesdayIDs[39] = R.id.btnWednesdayLessonNinePeriod;
        btnWednesdayIDs[40] = R.id.btnWednesdaySave;

        tvWednesdayLessonTimes[0] = (TextView) findViewById(R.id.tvWednesdayLessonZeroStart);
        tvWednesdayLessonTimes[1] = (TextView) findViewById(R.id.tvWednesdayLessonZeroEnd);
        tvWednesdayLessonTimes[2] = (TextView) findViewById(R.id.tvWednesdayLessonOneStart);
        tvWednesdayLessonTimes[3] = (TextView) findViewById(R.id.tvWednesdayLessonOneEnd);
        tvWednesdayLessonTimes[4] = (TextView) findViewById(R.id.tvWednesdayLessonTwoStart);
        tvWednesdayLessonTimes[5] = (TextView) findViewById(R.id.tvWednesdayLessonTwoEnd);
        tvWednesdayLessonTimes[6] = (TextView) findViewById(R.id.tvWednesdayLessonThreeStart);
        tvWednesdayLessonTimes[7] = (TextView) findViewById(R.id.tvWednesdayLessonThreeEnd);
        tvWednesdayLessonTimes[8] = (TextView) findViewById(R.id.tvWednesdayLessonFourStart);
        tvWednesdayLessonTimes[9] = (TextView) findViewById(R.id.tvWednesdayLessonFourEnd);
        tvWednesdayLessonTimes[10] = (TextView) findViewById(R.id.tvWednesdayLessonFiveStart);
        tvWednesdayLessonTimes[11] = (TextView) findViewById(R.id.tvWednesdayLessonFiveEnd);
        tvWednesdayLessonTimes[12] = (TextView) findViewById(R.id.tvWednesdayLessonSixStart);
        tvWednesdayLessonTimes[13] = (TextView) findViewById(R.id.tvWednesdayLessonSixEnd);
        tvWednesdayLessonTimes[14] = (TextView) findViewById(R.id.tvWednesdayLessonSevenStart);
        tvWednesdayLessonTimes[15] = (TextView) findViewById(R.id.tvWednesdayLessonSevenEnd);
        tvWednesdayLessonTimes[16] = (TextView) findViewById(R.id.tvWednesdayLessonEightStart);
        tvWednesdayLessonTimes[17] = (TextView) findViewById(R.id.tvWednesdayLessonEightEnd);
        tvWednesdayLessonTimes[18] = (TextView) findViewById(R.id.tvWednesdayLessonNineStart);
        tvWednesdayLessonTimes[19] = (TextView) findViewById(R.id.tvWednesdayLessonNineEnd);

        //Calculates the Start and End Times of a Lesson
        DummyConfiguration dc = new DummyConfiguration();
        Configuration configuration = dc.getConfiguration();
        Calendar lessonTime = Calendar.getInstance();
        lessonTime.setTime(configuration.getStartEarliestLesson());

        //ConfigureWeekdays.calculateWeekdayLessonTimes(tvWednesdayLessonTimes, configuration.getBreaks(), lessonTime, configuration.getLessonDurationInMinutes());

        Intent configuredScheduleWeekIntent = getIntent();
        configuredScheduleWeek = configuredScheduleWeekIntent.getExtras().getParcelable(MainActivity.CONFIGURED_SCHEDULE_WEEK);

        /**if (configuredScheduleWeek != null && configuredScheduleWeek.getWednesdayRooms() != null &&
                configuredScheduleWeek.getWednesdayTeachers() != null && configuredScheduleWeek.getWednesdayRooms() != null &&
                configuredScheduleWeek.getWednesdayPeriods() != null) {
            ConfigureWeekdays.initializeScheduleWeekday(wednesdayLessonNames, wednesdayTeachers, wednesdayRooms, wednesdayPeriods,
                    configuredScheduleWeek.getWednesdayLessonNames(), configuredScheduleWeek.getWednesdayTeachers(),
                    configuredScheduleWeek.getWednesdayRooms(), configuredScheduleWeek.getWednesdayPeriods(),
                    lessonNameButtons, teacherButtons, roomButtons, periodButtons);
        }*/
    }


    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED, new Intent());
        finish();
    }

    @Override
    public void onClick(View v) {
        //Intent intent = ConfigureWeekdays.onWeekdayButtonsClick(v, this, btnWednesdayIDs);
        Intent intent = new Intent();
        int rc = intent.getIntExtra(ConfigureWeekdays.REQUEST_CODE, -1);
        if (rc == 50) {
            for (int i = 0; i < wednesdayLessonNames.length; i++) {
                ConfigureWeekdays.checkScheduleRow(i, wednesdayLessonNames, wednesdayTeachers, wednesdayRooms, wednesdayPeriods);
            }
            Intent configureScheduleIntent = new Intent(this, ConfigureThursdayActivity.class);
            configuredScheduleWeek.setWednesdayLessonNames(wednesdayLessonNames);
            configuredScheduleWeek.setWednesdayTeachers(wednesdayTeachers);
            configuredScheduleWeek.setWednesdayRooms(wednesdayRooms);
            configuredScheduleWeek.setWednesdayPeriods(wednesdayPeriods);
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
            Toast.makeText(this, CANCEL_MSG_CONFIGURE_THURSDAY, Toast.LENGTH_LONG).show();
        } else {
            //ConfigureWeekdays.onWeekdayButtonsResult(requestCode, resultCode, data, this, wednesdayLessonNames, wednesdayTeachers, wednesdayRooms, wednesdayPeriods, lessonNameButtons, teacherButtons, roomButtons, periodButtons);
        }
    }

}