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
public class ConfigureThursdayActivity extends Activity implements View.OnClickListener {
    private String[] thursdayLessonNames = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] thursdayTeachers = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] thursdayRooms = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] thursdayPeriods = new String[]{"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    private ScheduleWeek configuredScheduleWeek;
    private TextView[] tvThursdayLessonTimes = new TextView[20];
    private int[] btnThursdayIDs = new int[41];

    private static final String CANCEL_MSG_CONFIGURE_FRIDAY = "Der Vorgang: \"Erstellen des Stundenplans am Freitag\" wurde abgebrochen!";

    private Button[] lessonNameButtons = new Button[10];
    private Button[] teacherButtons = new Button[10];
    private Button[] roomButtons = new Button[10];
    private Button[] periodButtons = new Button[10];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_thursday);

        lessonNameButtons[0] = (Button) findViewById(R.id.btnThursdayLessonZeroLessonName);
        lessonNameButtons[1] = (Button) findViewById(R.id.btnThursdayLessonOneLessonName);
        lessonNameButtons[2] = (Button) findViewById(R.id.btnThursdayLessonTwoLessonName);
        lessonNameButtons[3] = (Button) findViewById(R.id.btnThursdayLessonThreeLessonName);
        lessonNameButtons[4] = (Button) findViewById(R.id.btnThursdayLessonFourLessonName);
        lessonNameButtons[5] = (Button) findViewById(R.id.btnThursdayLessonFiveLessonName);
        lessonNameButtons[6] = (Button) findViewById(R.id.btnThursdayLessonSixLessonName);
        lessonNameButtons[7] = (Button) findViewById(R.id.btnThursdayLessonSevenLessonName);
        lessonNameButtons[8] = (Button) findViewById(R.id.btnThursdayLessonEightLessonName);
        lessonNameButtons[9] = (Button) findViewById(R.id.btnThursdayLessonNineLessonName);

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

        teacherButtons[0] = (Button) findViewById(R.id.btnThursdayLessonZeroTeacher);
        teacherButtons[1] = (Button) findViewById(R.id.btnThursdayLessonOneTeacher);
        teacherButtons[2] = (Button) findViewById(R.id.btnThursdayLessonTwoTeacher);
        teacherButtons[3] = (Button) findViewById(R.id.btnThursdayLessonThreeTeacher);
        teacherButtons[4] = (Button) findViewById(R.id.btnThursdayLessonFourTeacher);
        teacherButtons[5] = (Button) findViewById(R.id.btnThursdayLessonFiveTeacher);
        teacherButtons[6] = (Button) findViewById(R.id.btnThursdayLessonSixTeacher);
        teacherButtons[7] = (Button) findViewById(R.id.btnThursdayLessonSevenTeacher);
        teacherButtons[8] = (Button) findViewById(R.id.btnThursdayLessonEightTeacher);
        teacherButtons[9] = (Button) findViewById(R.id.btnThursdayLessonNineTeacher);

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

        roomButtons[0] = (Button) findViewById(R.id.btnThursdayLessonZeroRoom);
        roomButtons[1] = (Button) findViewById(R.id.btnThursdayLessonOneRoom);
        roomButtons[2] = (Button) findViewById(R.id.btnThursdayLessonTwoRoom);
        roomButtons[3] = (Button) findViewById(R.id.btnThursdayLessonThreeRoom);
        roomButtons[4] = (Button) findViewById(R.id.btnThursdayLessonFourRoom);
        roomButtons[5] = (Button) findViewById(R.id.btnThursdayLessonFiveRoom);
        roomButtons[6] = (Button) findViewById(R.id.btnThursdayLessonSixRoom);
        roomButtons[7] = (Button) findViewById(R.id.btnThursdayLessonSevenRoom);
        roomButtons[8] = (Button) findViewById(R.id.btnThursdayLessonEightRoom);
        roomButtons[9] = (Button) findViewById(R.id.btnThursdayLessonNineRoom);

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

        periodButtons[0] = (Button) findViewById(R.id.btnThursdayLessonZeroPeriod);
        periodButtons[1] = (Button) findViewById(R.id.btnThursdayLessonOnePeriod);
        periodButtons[2] = (Button) findViewById(R.id.btnThursdayLessonTwoPeriod);
        periodButtons[3] = (Button) findViewById(R.id.btnThursdayLessonThreePeriod);
        periodButtons[4] = (Button) findViewById(R.id.btnThursdayLessonFourPeriod);
        periodButtons[5] = (Button) findViewById(R.id.btnThursdayLessonFivePeriod);
        periodButtons[6] = (Button) findViewById(R.id.btnThursdayLessonSixPeriod);
        periodButtons[7] = (Button) findViewById(R.id.btnThursdayLessonSevenPeriod);
        periodButtons[8] = (Button) findViewById(R.id.btnThursdayLessonEightPeriod);
        periodButtons[9] = (Button) findViewById(R.id.btnThursdayLessonNinePeriod);

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

        Button btnThursdaySave = (Button) findViewById(R.id.btnThursdaySave);
        btnThursdaySave.setOnClickListener(this);

        btnThursdayIDs[0] = R.id.btnThursdayLessonZeroLessonName;
        btnThursdayIDs[1] = R.id.btnThursdayLessonOneLessonName;
        btnThursdayIDs[2] = R.id.btnThursdayLessonTwoLessonName;
        btnThursdayIDs[3] = R.id.btnThursdayLessonThreeLessonName;
        btnThursdayIDs[4] = R.id.btnThursdayLessonFourLessonName;
        btnThursdayIDs[5] = R.id.btnThursdayLessonFiveLessonName;
        btnThursdayIDs[6] = R.id.btnThursdayLessonSixLessonName;
        btnThursdayIDs[7] = R.id.btnThursdayLessonSevenLessonName;
        btnThursdayIDs[8] = R.id.btnThursdayLessonEightLessonName;
        btnThursdayIDs[9] = R.id.btnThursdayLessonNineLessonName;
        btnThursdayIDs[10] = R.id.btnThursdayLessonZeroTeacher;
        btnThursdayIDs[11] = R.id.btnThursdayLessonOneTeacher;
        btnThursdayIDs[12] = R.id.btnThursdayLessonTwoTeacher;
        btnThursdayIDs[13] = R.id.btnThursdayLessonThreeTeacher;
        btnThursdayIDs[14] = R.id.btnThursdayLessonFourTeacher;
        btnThursdayIDs[15] = R.id.btnThursdayLessonFiveTeacher;
        btnThursdayIDs[16] = R.id.btnThursdayLessonSixTeacher;
        btnThursdayIDs[17] = R.id.btnThursdayLessonSevenTeacher;
        btnThursdayIDs[18] = R.id.btnThursdayLessonEightTeacher;
        btnThursdayIDs[19] = R.id.btnThursdayLessonNineTeacher;
        btnThursdayIDs[20] = R.id.btnThursdayLessonZeroRoom;
        btnThursdayIDs[21] = R.id.btnThursdayLessonOneRoom;
        btnThursdayIDs[22] = R.id.btnThursdayLessonTwoRoom;
        btnThursdayIDs[23] = R.id.btnThursdayLessonThreeRoom;
        btnThursdayIDs[24] = R.id.btnThursdayLessonFourRoom;
        btnThursdayIDs[25] = R.id.btnThursdayLessonFiveRoom;
        btnThursdayIDs[26] = R.id.btnThursdayLessonSixRoom;
        btnThursdayIDs[27] = R.id.btnThursdayLessonSevenRoom;
        btnThursdayIDs[28] = R.id.btnThursdayLessonEightRoom;
        btnThursdayIDs[29] = R.id.btnThursdayLessonNineRoom;
        btnThursdayIDs[30] = R.id.btnThursdayLessonZeroPeriod;
        btnThursdayIDs[31] = R.id.btnThursdayLessonOnePeriod;
        btnThursdayIDs[32] = R.id.btnThursdayLessonTwoPeriod;
        btnThursdayIDs[33] = R.id.btnThursdayLessonThreePeriod;
        btnThursdayIDs[34] = R.id.btnThursdayLessonFourPeriod;
        btnThursdayIDs[35] = R.id.btnThursdayLessonFivePeriod;
        btnThursdayIDs[36] = R.id.btnThursdayLessonSixPeriod;
        btnThursdayIDs[37] = R.id.btnThursdayLessonSevenPeriod;
        btnThursdayIDs[38] = R.id.btnThursdayLessonEightPeriod;
        btnThursdayIDs[39] = R.id.btnThursdayLessonNinePeriod;
        btnThursdayIDs[40] = R.id.btnThursdaySave;

        tvThursdayLessonTimes[0] = (TextView) findViewById(R.id.tvThursdayLessonZeroStart);
        tvThursdayLessonTimes[1] = (TextView) findViewById(R.id.tvThursdayLessonZeroEnd);
        tvThursdayLessonTimes[2] = (TextView) findViewById(R.id.tvThursdayLessonOneStart);
        tvThursdayLessonTimes[3] = (TextView) findViewById(R.id.tvThursdayLessonOneEnd);
        tvThursdayLessonTimes[4] = (TextView) findViewById(R.id.tvThursdayLessonTwoStart);
        tvThursdayLessonTimes[5] = (TextView) findViewById(R.id.tvThursdayLessonTwoEnd);
        tvThursdayLessonTimes[6] = (TextView) findViewById(R.id.tvThursdayLessonThreeStart);
        tvThursdayLessonTimes[7] = (TextView) findViewById(R.id.tvThursdayLessonThreeEnd);
        tvThursdayLessonTimes[8] = (TextView) findViewById(R.id.tvThursdayLessonFourStart);
        tvThursdayLessonTimes[9] = (TextView) findViewById(R.id.tvThursdayLessonFourEnd);
        tvThursdayLessonTimes[10] = (TextView) findViewById(R.id.tvThursdayLessonFiveStart);
        tvThursdayLessonTimes[11] = (TextView) findViewById(R.id.tvThursdayLessonFiveEnd);
        tvThursdayLessonTimes[12] = (TextView) findViewById(R.id.tvThursdayLessonSixStart);
        tvThursdayLessonTimes[13] = (TextView) findViewById(R.id.tvThursdayLessonSixEnd);
        tvThursdayLessonTimes[14] = (TextView) findViewById(R.id.tvThursdayLessonSevenStart);
        tvThursdayLessonTimes[15] = (TextView) findViewById(R.id.tvThursdayLessonSevenEnd);
        tvThursdayLessonTimes[16] = (TextView) findViewById(R.id.tvThursdayLessonEightStart);
        tvThursdayLessonTimes[17] = (TextView) findViewById(R.id.tvThursdayLessonEightEnd);
        tvThursdayLessonTimes[18] = (TextView) findViewById(R.id.tvThursdayLessonNineStart);
        tvThursdayLessonTimes[19] = (TextView) findViewById(R.id.tvThursdayLessonNineEnd);

        //Calculates the Start and End Times of a Lesson
        DummyConfiguration dc = new DummyConfiguration();
        Configuration configuration = dc.getConfiguration();
        Calendar lessonTime = Calendar.getInstance();
        lessonTime.setTime(configuration.getStartEarliestLesson());

        //ConfigureWeekdays.calculateWeekdayLessonTimes(tvThursdayLessonTimes, configuration.getBreaks(), lessonTime, configuration.getLessonDurationInMinutes());

        Intent configuredScheduleWeekIntent = getIntent();
        configuredScheduleWeek = configuredScheduleWeekIntent.getExtras().getParcelable(MainActivity.CONFIGURED_SCHEDULE_WEEK);

        if (configuredScheduleWeek != null && configuredScheduleWeek.getThursdayRooms() != null &&
                configuredScheduleWeek.getThursdayTeachers() != null && configuredScheduleWeek.getThursdayRooms() != null &&
                configuredScheduleWeek.getThursdayPeriods() != null) {
            ConfigureWeekdays.initializeScheduleWeekday(thursdayLessonNames, thursdayTeachers, thursdayRooms, thursdayPeriods,
                    configuredScheduleWeek.getThursdayLessonNames(), configuredScheduleWeek.getThursdayTeachers(),
                    configuredScheduleWeek.getThursdayRooms(), configuredScheduleWeek.getThursdayPeriods(),
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
        Intent intent = ConfigureWeekdays.onWeekdayButtonsClick(v, this, btnThursdayIDs);
        int rc = intent.getIntExtra(ConfigureWeekdays.REQUEST_CODE, -1);
        if (rc == 50) {
            for (int i = 0; i < thursdayLessonNames.length; i++) {
                ConfigureWeekdays.checkScheduleRow(i, thursdayLessonNames, thursdayTeachers, thursdayRooms, thursdayPeriods);
            }
            Intent configureScheduleIntent = new Intent(this, ConfigureFridayActivity.class);
            configuredScheduleWeek.setThursdayLessonNames(thursdayLessonNames);
            configuredScheduleWeek.setThursdayTeachers(thursdayTeachers);
            configuredScheduleWeek.setThursdayRooms(thursdayRooms);
            configuredScheduleWeek.setThursdayPeriods(thursdayPeriods);
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
            Toast.makeText(this, CANCEL_MSG_CONFIGURE_FRIDAY, Toast.LENGTH_LONG).show();
        } else {
            ConfigureWeekdays.onWeekdayButtonsResult(requestCode, resultCode, data, this, thursdayLessonNames, thursdayTeachers, thursdayRooms, thursdayPeriods,
                    lessonNameButtons, teacherButtons, roomButtons, periodButtons);
        }
    }

}