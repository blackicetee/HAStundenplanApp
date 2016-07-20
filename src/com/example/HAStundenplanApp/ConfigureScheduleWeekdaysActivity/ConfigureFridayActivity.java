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
public class ConfigureFridayActivity extends Activity implements View.OnClickListener {
    private String[] fridayLessonNames = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] fridayTeachers = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] fridayRooms = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] fridayPeriods = new String[]{"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    private ScheduleWeek configuredScheduleWeek;
    private TextView[] tvFridayLessonTimes = new TextView[20];
    private int[] btnFridayIDs = new int[41];

    private static final String CANCEL_MSG_CONFIGURE_FRIDAY = "Der Vorgang: \"Erstellen des Stundenplans am Freitag\" wurde abgebrochen!";

    private Button[] lessonNameButtons = new Button[10];
    private Button[] teacherButtons = new Button[10];
    private Button[] roomButtons = new Button[10];
    private Button[] periodButtons = new Button[10];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_friday);

        lessonNameButtons[0] = (Button) findViewById(R.id.btnFridayLessonZeroLessonName);
        lessonNameButtons[1] = (Button) findViewById(R.id.btnFridayLessonOneLessonName);
        lessonNameButtons[2] = (Button) findViewById(R.id.btnFridayLessonTwoLessonName);
        lessonNameButtons[3] = (Button) findViewById(R.id.btnFridayLessonThreeLessonName);
        lessonNameButtons[4] = (Button) findViewById(R.id.btnFridayLessonFourLessonName);
        lessonNameButtons[5] = (Button) findViewById(R.id.btnFridayLessonFiveLessonName);
        lessonNameButtons[6] = (Button) findViewById(R.id.btnFridayLessonSixLessonName);
        lessonNameButtons[7] = (Button) findViewById(R.id.btnFridayLessonSevenLessonName);
        lessonNameButtons[8] = (Button) findViewById(R.id.btnFridayLessonEightLessonName);
        lessonNameButtons[9] = (Button) findViewById(R.id.btnFridayLessonNineLessonName);

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

        teacherButtons[0] = (Button) findViewById(R.id.btnFridayLessonZeroTeacher);
        teacherButtons[1] = (Button) findViewById(R.id.btnFridayLessonOneTeacher);
        teacherButtons[2] = (Button) findViewById(R.id.btnFridayLessonTwoTeacher);
        teacherButtons[3] = (Button) findViewById(R.id.btnFridayLessonThreeTeacher);
        teacherButtons[4] = (Button) findViewById(R.id.btnFridayLessonFourTeacher);
        teacherButtons[5] = (Button) findViewById(R.id.btnFridayLessonFiveTeacher);
        teacherButtons[6] = (Button) findViewById(R.id.btnFridayLessonSixTeacher);
        teacherButtons[7] = (Button) findViewById(R.id.btnFridayLessonSevenTeacher);
        teacherButtons[8] = (Button) findViewById(R.id.btnFridayLessonEightTeacher);
        teacherButtons[9] = (Button) findViewById(R.id.btnFridayLessonNineTeacher);

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

        roomButtons[0] = (Button) findViewById(R.id.btnFridayLessonZeroRoom);
        roomButtons[1] = (Button) findViewById(R.id.btnFridayLessonOneRoom);
        roomButtons[2] = (Button) findViewById(R.id.btnFridayLessonTwoRoom);
        roomButtons[3] = (Button) findViewById(R.id.btnFridayLessonThreeRoom);
        roomButtons[4] = (Button) findViewById(R.id.btnFridayLessonFourRoom);
        roomButtons[5] = (Button) findViewById(R.id.btnFridayLessonFiveRoom);
        roomButtons[6] = (Button) findViewById(R.id.btnFridayLessonSixRoom);
        roomButtons[7] = (Button) findViewById(R.id.btnFridayLessonSevenRoom);
        roomButtons[8] = (Button) findViewById(R.id.btnFridayLessonEightRoom);
        roomButtons[9] = (Button) findViewById(R.id.btnFridayLessonNineRoom);

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

        periodButtons[0] = (Button) findViewById(R.id.btnFridayLessonZeroPeriod);
        periodButtons[1] = (Button) findViewById(R.id.btnFridayLessonOnePeriod);
        periodButtons[2] = (Button) findViewById(R.id.btnFridayLessonTwoPeriod);
        periodButtons[3] = (Button) findViewById(R.id.btnFridayLessonThreePeriod);
        periodButtons[4] = (Button) findViewById(R.id.btnFridayLessonFourPeriod);
        periodButtons[5] = (Button) findViewById(R.id.btnFridayLessonFivePeriod);
        periodButtons[6] = (Button) findViewById(R.id.btnFridayLessonSixPeriod);
        periodButtons[7] = (Button) findViewById(R.id.btnFridayLessonSevenPeriod);
        periodButtons[8] = (Button) findViewById(R.id.btnFridayLessonEightPeriod);
        periodButtons[9] = (Button) findViewById(R.id.btnFridayLessonNinePeriod);

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

        Button btnFridaySave = (Button) findViewById(R.id.btnFridaySave);
        btnFridaySave.setOnClickListener(this);

        btnFridayIDs[0] = R.id.btnFridayLessonZeroLessonName;
        btnFridayIDs[1] = R.id.btnFridayLessonOneLessonName;
        btnFridayIDs[2] = R.id.btnFridayLessonTwoLessonName;
        btnFridayIDs[3] = R.id.btnFridayLessonThreeLessonName;
        btnFridayIDs[4] = R.id.btnFridayLessonFourLessonName;
        btnFridayIDs[5] = R.id.btnFridayLessonFiveLessonName;
        btnFridayIDs[6] = R.id.btnFridayLessonSixLessonName;
        btnFridayIDs[7] = R.id.btnFridayLessonSevenLessonName;
        btnFridayIDs[8] = R.id.btnFridayLessonEightLessonName;
        btnFridayIDs[9] = R.id.btnFridayLessonNineLessonName;
        btnFridayIDs[10] = R.id.btnFridayLessonZeroTeacher;
        btnFridayIDs[11] = R.id.btnFridayLessonOneTeacher;
        btnFridayIDs[12] = R.id.btnFridayLessonTwoTeacher;
        btnFridayIDs[13] = R.id.btnFridayLessonThreeTeacher;
        btnFridayIDs[14] = R.id.btnFridayLessonFourTeacher;
        btnFridayIDs[15] = R.id.btnFridayLessonFiveTeacher;
        btnFridayIDs[16] = R.id.btnFridayLessonSixTeacher;
        btnFridayIDs[17] = R.id.btnFridayLessonSevenTeacher;
        btnFridayIDs[18] = R.id.btnFridayLessonEightTeacher;
        btnFridayIDs[19] = R.id.btnFridayLessonNineTeacher;
        btnFridayIDs[20] = R.id.btnFridayLessonZeroRoom;
        btnFridayIDs[21] = R.id.btnFridayLessonOneRoom;
        btnFridayIDs[22] = R.id.btnFridayLessonTwoRoom;
        btnFridayIDs[23] = R.id.btnFridayLessonThreeRoom;
        btnFridayIDs[24] = R.id.btnFridayLessonFourRoom;
        btnFridayIDs[25] = R.id.btnFridayLessonFiveRoom;
        btnFridayIDs[26] = R.id.btnFridayLessonSixRoom;
        btnFridayIDs[27] = R.id.btnFridayLessonSevenRoom;
        btnFridayIDs[28] = R.id.btnFridayLessonEightRoom;
        btnFridayIDs[29] = R.id.btnFridayLessonNineRoom;
        btnFridayIDs[30] = R.id.btnFridayLessonZeroPeriod;
        btnFridayIDs[31] = R.id.btnFridayLessonOnePeriod;
        btnFridayIDs[32] = R.id.btnFridayLessonTwoPeriod;
        btnFridayIDs[33] = R.id.btnFridayLessonThreePeriod;
        btnFridayIDs[34] = R.id.btnFridayLessonFourPeriod;
        btnFridayIDs[35] = R.id.btnFridayLessonFivePeriod;
        btnFridayIDs[36] = R.id.btnFridayLessonSixPeriod;
        btnFridayIDs[37] = R.id.btnFridayLessonSevenPeriod;
        btnFridayIDs[38] = R.id.btnFridayLessonEightPeriod;
        btnFridayIDs[39] = R.id.btnFridayLessonNinePeriod;
        btnFridayIDs[40] = R.id.btnFridaySave;

        tvFridayLessonTimes[0] = (TextView) findViewById(R.id.tvFridayLessonZeroStart);
        tvFridayLessonTimes[1] = (TextView) findViewById(R.id.tvFridayLessonZeroEnd);
        tvFridayLessonTimes[2] = (TextView) findViewById(R.id.tvFridayLessonOneStart);
        tvFridayLessonTimes[3] = (TextView) findViewById(R.id.tvFridayLessonOneEnd);
        tvFridayLessonTimes[4] = (TextView) findViewById(R.id.tvFridayLessonTwoStart);
        tvFridayLessonTimes[5] = (TextView) findViewById(R.id.tvFridayLessonTwoEnd);
        tvFridayLessonTimes[6] = (TextView) findViewById(R.id.tvFridayLessonThreeStart);
        tvFridayLessonTimes[7] = (TextView) findViewById(R.id.tvFridayLessonThreeEnd);
        tvFridayLessonTimes[8] = (TextView) findViewById(R.id.tvFridayLessonFourStart);
        tvFridayLessonTimes[9] = (TextView) findViewById(R.id.tvFridayLessonFourEnd);
        tvFridayLessonTimes[10] = (TextView) findViewById(R.id.tvFridayLessonFiveStart);
        tvFridayLessonTimes[11] = (TextView) findViewById(R.id.tvFridayLessonFiveEnd);
        tvFridayLessonTimes[12] = (TextView) findViewById(R.id.tvFridayLessonSixStart);
        tvFridayLessonTimes[13] = (TextView) findViewById(R.id.tvFridayLessonSixEnd);
        tvFridayLessonTimes[14] = (TextView) findViewById(R.id.tvFridayLessonSevenStart);
        tvFridayLessonTimes[15] = (TextView) findViewById(R.id.tvFridayLessonSevenEnd);
        tvFridayLessonTimes[16] = (TextView) findViewById(R.id.tvFridayLessonEightStart);
        tvFridayLessonTimes[17] = (TextView) findViewById(R.id.tvFridayLessonEightEnd);
        tvFridayLessonTimes[18] = (TextView) findViewById(R.id.tvFridayLessonNineStart);
        tvFridayLessonTimes[19] = (TextView) findViewById(R.id.tvFridayLessonNineEnd);

        //Calculates the Start and End Times of a Lesson
        DummyConfiguration dc = new DummyConfiguration();
        Configuration configuration = dc.getConfiguration();
        Calendar lessonTime = Calendar.getInstance();
        lessonTime.setTime(configuration.getStartEarliestLesson());

        ConfigureWeekdays.calculateWeekdayLessonTimes(tvFridayLessonTimes, configuration.getBreaks(), lessonTime, configuration.getLessonDurationInMinutes());

        Intent configuredScheduleWeekIntent = getIntent();
        configuredScheduleWeek = configuredScheduleWeekIntent.getExtras().getParcelable(MainActivity.CONFIGURED_SCHEDULE_WEEK);

        if (configuredScheduleWeek != null && configuredScheduleWeek.getFridayRooms() != null &&
                configuredScheduleWeek.getFridayTeachers() != null && configuredScheduleWeek.getFridayRooms() != null &&
                configuredScheduleWeek.getFridayPeriods() != null) {
            ConfigureWeekdays.initializeScheduleWeekday(fridayLessonNames, fridayTeachers, fridayRooms, fridayPeriods,
                    configuredScheduleWeek.getFridayLessonNames(), configuredScheduleWeek.getFridayTeachers(),
                    configuredScheduleWeek.getFridayRooms(), configuredScheduleWeek.getFridayPeriods(),
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
        Intent intent = ConfigureWeekdays.onWeekdayButtonsClick(v, this, btnFridayIDs);
        int rc = intent.getIntExtra(ConfigureWeekdays.REQUEST_CODE, -1);
        if (rc == 50) {
            for (int i = 0; i < fridayLessonNames.length; i++) {
                ConfigureWeekdays.checkScheduleRow(i, fridayLessonNames, fridayTeachers, fridayRooms, fridayPeriods);
            }
            Intent configureScheduleIntent = new Intent();
            configuredScheduleWeek.setFridayLessonNames(fridayLessonNames);
            configuredScheduleWeek.setFridayTeachers(fridayTeachers);
            configuredScheduleWeek.setFridayRooms(fridayRooms);
            configuredScheduleWeek.setFridayPeriods(fridayPeriods);
            configureScheduleIntent.putExtra(MainActivity.CONFIGURED_SCHEDULE_WEEK, configuredScheduleWeek);
            setResult(Activity.RESULT_OK, configureScheduleIntent);
            finish();
        } else if (rc == -1) {
            throw new IllegalStateException("The REQUEST_CODE is -1 = Error Code");
        } else {
            startActivityForResult(intent, rc);
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        ConfigureWeekdays.onWeekdayButtonsResult(requestCode, resultCode, data, this, fridayLessonNames, fridayTeachers, fridayRooms, fridayPeriods,
                lessonNameButtons, teacherButtons, roomButtons, periodButtons);
    }
}