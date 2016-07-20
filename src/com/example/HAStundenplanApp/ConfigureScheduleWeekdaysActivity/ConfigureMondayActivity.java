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
public class ConfigureMondayActivity extends Activity implements View.OnClickListener {
    private String[] mondayLessonNames = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] mondayTeachers = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] mondayRooms = new String[]{"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] mondayPeriods = new String[]{"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    private ScheduleWeek configuredScheduleWeek;
    private TextView[] tvMondayLessonTimes = new TextView[20];
    private int[] btnMondayIDs = new int[41];

    private static final String CANCEL_MSG_CONFIGURE_TUESDAY = "Der Vorgang: \"Erstellen des Stundenplans am Dienstag\" wurde abgebrochen!";

    private Button[] lessonNameButtons = new Button[10];
    private Button[] teacherButtons = new Button[10];
    private Button[] roomButtons = new Button[10];
    private Button[] periodButtons = new Button[10];

    static final String CANCEL_MSG_CHOOSE_LESSON = "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!";
    static final String CANCEL_MSG_CHOOSE_TEACHER = "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!";
    static final String CANCEL_MSG_CHOOSE_ROOM = "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!";
    static final String CANCEL_MSG_CHOOSE_PERIOD = "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_monday);

        lessonNameButtons[0] = (Button) findViewById(R.id.btnMondayLessonZeroLessonName);
        lessonNameButtons[1] = (Button) findViewById(R.id.btnMondayLessonOneLessonName);
        lessonNameButtons[2] = (Button) findViewById(R.id.btnMondayLessonTwoLessonName);
        lessonNameButtons[3] = (Button) findViewById(R.id.btnMondayLessonThreeLessonName);
        lessonNameButtons[4] = (Button) findViewById(R.id.btnMondayLessonFourLessonName);
        lessonNameButtons[5] = (Button) findViewById(R.id.btnMondayLessonFiveLessonName);
        lessonNameButtons[6] = (Button) findViewById(R.id.btnMondayLessonSixLessonName);
        lessonNameButtons[7] = (Button) findViewById(R.id.btnMondayLessonSevenLessonName);
        lessonNameButtons[8] = (Button) findViewById(R.id.btnMondayLessonEightLessonName);
        lessonNameButtons[9] = (Button) findViewById(R.id.btnMondayLessonNineLessonName);

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

        teacherButtons[0] = (Button) findViewById(R.id.btnMondayLessonZeroTeacher);
        teacherButtons[1] = (Button) findViewById(R.id.btnMondayLessonOneTeacher);
        teacherButtons[2] = (Button) findViewById(R.id.btnMondayLessonTwoTeacher);
        teacherButtons[3] = (Button) findViewById(R.id.btnMondayLessonThreeTeacher);
        teacherButtons[4] = (Button) findViewById(R.id.btnMondayLessonFourTeacher);
        teacherButtons[5] = (Button) findViewById(R.id.btnMondayLessonFiveTeacher);
        teacherButtons[6] = (Button) findViewById(R.id.btnMondayLessonSixTeacher);
        teacherButtons[7] = (Button) findViewById(R.id.btnMondayLessonSevenTeacher);
        teacherButtons[8] = (Button) findViewById(R.id.btnMondayLessonEightTeacher);
        teacherButtons[9] = (Button) findViewById(R.id.btnMondayLessonNineTeacher);

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

        roomButtons[0] = (Button) findViewById(R.id.btnMondayLessonZeroRoom);
        roomButtons[1] = (Button) findViewById(R.id.btnMondayLessonOneRoom);
        roomButtons[2] = (Button) findViewById(R.id.btnMondayLessonTwoRoom);
        roomButtons[3] = (Button) findViewById(R.id.btnMondayLessonThreeRoom);
        roomButtons[4] = (Button) findViewById(R.id.btnMondayLessonFourRoom);
        roomButtons[5] = (Button) findViewById(R.id.btnMondayLessonFiveRoom);
        roomButtons[6] = (Button) findViewById(R.id.btnMondayLessonSixRoom);
        roomButtons[7] = (Button) findViewById(R.id.btnMondayLessonSevenRoom);
        roomButtons[8] = (Button) findViewById(R.id.btnMondayLessonEightRoom);
        roomButtons[9] = (Button) findViewById(R.id.btnMondayLessonNineRoom);

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

        periodButtons[0] = (Button) findViewById(R.id.btnMondayLessonZeroPeriod);
        periodButtons[1] = (Button) findViewById(R.id.btnMondayLessonOnePeriod);
        periodButtons[2] = (Button) findViewById(R.id.btnMondayLessonTwoPeriod);
        periodButtons[3] = (Button) findViewById(R.id.btnMondayLessonThreePeriod);
        periodButtons[4] = (Button) findViewById(R.id.btnMondayLessonFourPeriod);
        periodButtons[5] = (Button) findViewById(R.id.btnMondayLessonFivePeriod);
        periodButtons[6] = (Button) findViewById(R.id.btnMondayLessonSixPeriod);
        periodButtons[7] = (Button) findViewById(R.id.btnMondayLessonSevenPeriod);
        periodButtons[8] = (Button) findViewById(R.id.btnMondayLessonEightPeriod);
        periodButtons[9] = (Button) findViewById(R.id.btnMondayLessonNinePeriod);

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

        Button btnMondaySave = (Button) findViewById(R.id.btnMondaySave);
        btnMondaySave.setOnClickListener(this);

        btnMondayIDs[0] = R.id.btnMondayLessonZeroLessonName;
        btnMondayIDs[1] = R.id.btnMondayLessonOneLessonName;
        btnMondayIDs[2] = R.id.btnMondayLessonTwoLessonName;
        btnMondayIDs[3] = R.id.btnMondayLessonThreeLessonName;
        btnMondayIDs[4] = R.id.btnMondayLessonFourLessonName;
        btnMondayIDs[5] = R.id.btnMondayLessonFiveLessonName;
        btnMondayIDs[6] = R.id.btnMondayLessonSixLessonName;
        btnMondayIDs[7] = R.id.btnMondayLessonSevenLessonName;
        btnMondayIDs[8] = R.id.btnMondayLessonEightLessonName;
        btnMondayIDs[9] = R.id.btnMondayLessonNineLessonName;
        btnMondayIDs[10] = R.id.btnMondayLessonZeroTeacher;
        btnMondayIDs[11] = R.id.btnMondayLessonOneTeacher;
        btnMondayIDs[12] = R.id.btnMondayLessonTwoTeacher;
        btnMondayIDs[13] = R.id.btnMondayLessonThreeTeacher;
        btnMondayIDs[14] = R.id.btnMondayLessonFourTeacher;
        btnMondayIDs[15] = R.id.btnMondayLessonFiveTeacher;
        btnMondayIDs[16] = R.id.btnMondayLessonSixTeacher;
        btnMondayIDs[17] = R.id.btnMondayLessonSevenTeacher;
        btnMondayIDs[18] = R.id.btnMondayLessonEightTeacher;
        btnMondayIDs[19] = R.id.btnMondayLessonNineTeacher;
        btnMondayIDs[20] = R.id.btnMondayLessonZeroRoom;
        btnMondayIDs[21] = R.id.btnMondayLessonOneRoom;
        btnMondayIDs[22] = R.id.btnMondayLessonTwoRoom;
        btnMondayIDs[23] = R.id.btnMondayLessonThreeRoom;
        btnMondayIDs[24] = R.id.btnMondayLessonFourRoom;
        btnMondayIDs[25] = R.id.btnMondayLessonFiveRoom;
        btnMondayIDs[26] = R.id.btnMondayLessonSixRoom;
        btnMondayIDs[27] = R.id.btnMondayLessonSevenRoom;
        btnMondayIDs[28] = R.id.btnMondayLessonEightRoom;
        btnMondayIDs[29] = R.id.btnMondayLessonNineRoom;
        btnMondayIDs[30] = R.id.btnMondayLessonZeroPeriod;
        btnMondayIDs[31] = R.id.btnMondayLessonOnePeriod;
        btnMondayIDs[32] = R.id.btnMondayLessonTwoPeriod;
        btnMondayIDs[33] = R.id.btnMondayLessonThreePeriod;
        btnMondayIDs[34] = R.id.btnMondayLessonFourPeriod;
        btnMondayIDs[35] = R.id.btnMondayLessonFivePeriod;
        btnMondayIDs[36] = R.id.btnMondayLessonSixPeriod;
        btnMondayIDs[37] = R.id.btnMondayLessonSevenPeriod;
        btnMondayIDs[38] = R.id.btnMondayLessonEightPeriod;
        btnMondayIDs[39] = R.id.btnMondayLessonNinePeriod;
        btnMondayIDs[40] = R.id.btnMondaySave;

        tvMondayLessonTimes[0] = (TextView) findViewById(R.id.tvMondayLessonZeroStart);
        tvMondayLessonTimes[1] = (TextView) findViewById(R.id.tvMondayLessonZeroEnd);
        tvMondayLessonTimes[2] = (TextView) findViewById(R.id.tvMondayLessonOneStart);
        tvMondayLessonTimes[3] = (TextView) findViewById(R.id.tvMondayLessonOneEnd);
        tvMondayLessonTimes[4] = (TextView) findViewById(R.id.tvMondayLessonTwoStart);
        tvMondayLessonTimes[5] = (TextView) findViewById(R.id.tvMondayLessonTwoEnd);
        tvMondayLessonTimes[6] = (TextView) findViewById(R.id.tvMondayLessonThreeStart);
        tvMondayLessonTimes[7] = (TextView) findViewById(R.id.tvMondayLessonThreeEnd);
        tvMondayLessonTimes[8] = (TextView) findViewById(R.id.tvMondayLessonFourStart);
        tvMondayLessonTimes[9] = (TextView) findViewById(R.id.tvMondayLessonFourEnd);
        tvMondayLessonTimes[10] = (TextView) findViewById(R.id.tvMondayLessonFiveStart);
        tvMondayLessonTimes[11] = (TextView) findViewById(R.id.tvMondayLessonFiveEnd);
        tvMondayLessonTimes[12] = (TextView) findViewById(R.id.tvMondayLessonSixStart);
        tvMondayLessonTimes[13] = (TextView) findViewById(R.id.tvMondayLessonSixEnd);
        tvMondayLessonTimes[14] = (TextView) findViewById(R.id.tvMondayLessonSevenStart);
        tvMondayLessonTimes[15] = (TextView) findViewById(R.id.tvMondayLessonSevenEnd);
        tvMondayLessonTimes[16] = (TextView) findViewById(R.id.tvMondayLessonEightStart);
        tvMondayLessonTimes[17] = (TextView) findViewById(R.id.tvMondayLessonEightEnd);
        tvMondayLessonTimes[18] = (TextView) findViewById(R.id.tvMondayLessonNineStart);
        tvMondayLessonTimes[19] = (TextView) findViewById(R.id.tvMondayLessonNineEnd);

        //Calculates the Start and End Times of a Lesson
        DummyConfiguration dc = new DummyConfiguration();
        Configuration configuration = dc.getConfiguration();
        Calendar lessonTime = Calendar.getInstance();
        lessonTime.setTime(configuration.getStartEarliestLesson());

        ConfigureWeekdays.calculateWeekdayLessonTimes(tvMondayLessonTimes, configuration.getBreaks(), lessonTime, configuration.getLessonDurationInMinutes());

        Intent configuredScheduleWeekIntent = getIntent();
        configuredScheduleWeek = configuredScheduleWeekIntent.getExtras().getParcelable(MainActivity.CONFIGURED_SCHEDULE_WEEK);

        if (configuredScheduleWeek != null && configuredScheduleWeek.getMondayRooms() != null &&
                configuredScheduleWeek.getMondayTeachers() != null && configuredScheduleWeek.getMondayRooms() != null &&
                configuredScheduleWeek.getMondayPeriods() != null) {
            ConfigureWeekdays.initializeScheduleWeekday(mondayLessonNames, mondayTeachers, mondayRooms, mondayPeriods,
                    configuredScheduleWeek.getMondayLessonNames(), configuredScheduleWeek.getMondayTeachers(),
                    configuredScheduleWeek.getMondayRooms(), configuredScheduleWeek.getMondayPeriods(),
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
        Intent intent = ConfigureWeekdays.onWeekdayButtonsClick(v, this, btnMondayIDs);
        int rc = intent.getIntExtra(ConfigureWeekdays.REQUEST_CODE, -1);
        if (rc == 50) {
            for (int i = 0; i < mondayLessonNames.length; i++) {
                ConfigureWeekdays.checkScheduleRow(i, mondayLessonNames, mondayTeachers, mondayRooms, mondayPeriods);
            }
            Intent configureScheduleIntent = new Intent(this, ConfigureTuesdayActivity.class);
            configuredScheduleWeek.setMondayLessonNames(mondayLessonNames);
            configuredScheduleWeek.setMondayTeachers(mondayTeachers);
            configuredScheduleWeek.setMondayRooms(mondayRooms);
            configuredScheduleWeek.setMondayPeriods(mondayPeriods);
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
            Toast.makeText(this, CANCEL_MSG_CONFIGURE_TUESDAY, Toast.LENGTH_LONG).show();
        } else {
            ConfigureWeekdays.onWeekdayButtonsResult(requestCode, resultCode, data, this, mondayLessonNames, mondayTeachers, mondayRooms, mondayPeriods,
                    lessonNameButtons, teacherButtons, roomButtons, periodButtons);
        }
    }

}