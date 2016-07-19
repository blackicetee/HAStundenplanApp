package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.HAStundenplanApp.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public class ConfigureFridayActivity extends Activity implements View.OnClickListener {
    private String[] fridayLessonNames = new String[] {"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] fridayTeachers = new String[] {"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] fridayRooms = new String[] {"Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei", "Frei"};
    private String[] fridayPeriods = new String[] {"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"};

    private ScheduleWeek configuredScheduleWeek;

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

        TextView tvFridayLessonZeroStart = (TextView) findViewById(R.id.tvFridayLessonZeroStart);
        TextView tvFridayLessonZeroEnd = (TextView) findViewById(R.id.tvFridayLessonZeroEnd);
        TextView tvFridayLessonOneStart = (TextView) findViewById(R.id.tvFridayLessonOneStart);
        TextView tvFridayLessonOneEnd = (TextView) findViewById(R.id.tvFridayLessonOneEnd);
        TextView tvFridayLessonTwoStart = (TextView) findViewById(R.id.tvFridayLessonTwoStart);
        TextView tvFridayLessonTwoEnd = (TextView) findViewById(R.id.tvFridayLessonTwoEnd);
        TextView tvFridayLessonThreeStart = (TextView) findViewById(R.id.tvFridayLessonThreeStart);
        TextView tvFridayLessonThreeEnd = (TextView) findViewById(R.id.tvFridayLessonThreeEnd);
        TextView tvFridayLessonFourStart = (TextView) findViewById(R.id.tvFridayLessonFourStart);
        TextView tvFridayLessonFourEnd = (TextView) findViewById(R.id.tvFridayLessonFourEnd);
        TextView tvFridayLessonFiveStart = (TextView) findViewById(R.id.tvFridayLessonFiveStart);
        TextView tvFridayLessonFiveEnd = (TextView) findViewById(R.id.tvFridayLessonFiveEnd);
        TextView tvFridayLessonSixStart = (TextView) findViewById(R.id.tvFridayLessonSixStart);
        TextView tvFridayLessonSixEnd = (TextView) findViewById(R.id.tvFridayLessonSixEnd);
        TextView tvFridayLessonSevenStart = (TextView) findViewById(R.id.tvFridayLessonSevenStart);
        TextView tvFridayLessonSevenEnd = (TextView) findViewById(R.id.tvFridayLessonSevenEnd);
        TextView tvFridayLessonEightStart = (TextView) findViewById(R.id.tvFridayLessonEightStart);
        TextView tvFridayLessonEightEnd = (TextView) findViewById(R.id.tvFridayLessonEightEnd);
        TextView tvFridayLessonNineStart = (TextView) findViewById(R.id.tvFridayLessonNineStart);
        TextView tvFridayLessonNineEnd = (TextView) findViewById(R.id.tvFridayLessonNineEnd);

        //Calculates the Start and End Times of a Lesson
        DummyConfiguration dc = new DummyConfiguration();
        Configuration configuration = dc.getConfiguration();
        int lessonDuration = configuration.getLessonDurationInMinutes();
        Calendar lessonTime = Calendar.getInstance();
        lessonTime.setTime(configuration.getStartEarliestLesson());
        List<Pair<Integer, Integer>> breaks = configuration.getBreaks();
        if (breaks.get(0).first == 0) {
            tvFridayLessonZeroStart.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvFridayLessonZeroEnd.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(0).second);
        }
        if (breaks.get(1).first == 1) {
            tvFridayLessonOneStart.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvFridayLessonOneEnd.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(1).second);
        }
        if (breaks.get(2).first == 2) {
            tvFridayLessonTwoStart.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvFridayLessonTwoEnd.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(2).second);
        }
        if (breaks.get(3).first == 3) {
            tvFridayLessonThreeStart.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvFridayLessonThreeEnd.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(3).second);
        }
        if (breaks.get(4).first == 4) {
            tvFridayLessonFourStart.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvFridayLessonFourEnd.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(4).second);
        }
        if (breaks.get(5).first == 5) {
            tvFridayLessonFiveStart.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvFridayLessonFiveEnd.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(5).second);
        }
        if (breaks.get(6).first == 6) {
            tvFridayLessonSixStart.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvFridayLessonSixEnd.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(6).second);
        }
        if (breaks.get(7).first == 7) {
            tvFridayLessonSevenStart.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvFridayLessonSevenEnd.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(7).second);
        }
        if (breaks.get(8).first == 8) {
            tvFridayLessonEightStart.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvFridayLessonEightEnd.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(8).second);
        }
        tvFridayLessonNineStart.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));
        lessonTime.add(Calendar.MINUTE, lessonDuration);
        tvFridayLessonNineEnd.setText(ConfigureMondayActivity.convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY)*100 + lessonTime.get(Calendar.MINUTE)));


        Intent configuredScheduleWeekIntent = getIntent();
        configuredScheduleWeek = configuredScheduleWeekIntent.getExtras().getParcelable(MainActivity.CONFIGURED_SCHEDULE_WEEK);

        initializeScheduleFriday();
    }

    private void initializeScheduleFriday() {
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames[0] = configuredScheduleWeek.getFridayLessonNames()[0];
            btnFridayLessonZeroLessonName.setText(configuredScheduleWeek.getFridayLessonNames()[0]);
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers[0] = configuredScheduleWeek.getFridayTeachers()[0];
            btnFridayLessonZeroTeacher.setText(configuredScheduleWeek.getFridayTeachers()[0]);
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms[0] = configuredScheduleWeek.getFridayRooms()[0];
            btnFridayLessonZeroRoom.setText(configuredScheduleWeek.getFridayRooms()[0]);
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods[0] = configuredScheduleWeek.getFridayPeriods()[0];
            btnFridayLessonZeroPeriod.setText(configuredScheduleWeek.getFridayPeriods()[0]);
        }
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames[1] = configuredScheduleWeek.getFridayLessonNames()[1];
            btnFridayLessonOneLessonName.setText(configuredScheduleWeek.getFridayLessonNames()[1]);
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers[1] = configuredScheduleWeek.getFridayTeachers()[1];
            btnFridayLessonOneTeacher.setText(configuredScheduleWeek.getFridayTeachers()[1]);
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms[1] = configuredScheduleWeek.getFridayRooms()[1];
            btnFridayLessonOneRoom.setText(configuredScheduleWeek.getFridayRooms()[1]);
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods[1] = configuredScheduleWeek.getFridayPeriods()[1];
            btnFridayLessonOnePeriod.setText(configuredScheduleWeek.getFridayPeriods()[1]);
        }
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames[2] = configuredScheduleWeek.getFridayLessonNames()[2];
            btnFridayLessonTwoLessonName.setText(configuredScheduleWeek.getFridayLessonNames()[2]);
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers[2] = configuredScheduleWeek.getFridayTeachers()[2];
            btnFridayLessonTwoTeacher.setText(configuredScheduleWeek.getFridayTeachers()[2]);
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms[2] = configuredScheduleWeek.getFridayRooms()[2];
            btnFridayLessonTwoRoom.setText(configuredScheduleWeek.getFridayRooms()[2]);
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods[2] = configuredScheduleWeek.getFridayPeriods()[2];
            btnFridayLessonTwoPeriod.setText(configuredScheduleWeek.getFridayPeriods()[2]);
        }
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames[3] = configuredScheduleWeek.getFridayLessonNames()[3];
            btnFridayLessonThreeLessonName.setText(configuredScheduleWeek.getFridayLessonNames()[3]);
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers[3] = configuredScheduleWeek.getFridayTeachers()[3];
            btnFridayLessonThreeTeacher.setText(configuredScheduleWeek.getFridayTeachers()[3]);
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms[3] = configuredScheduleWeek.getFridayRooms()[3];
            btnFridayLessonThreeRoom.setText(configuredScheduleWeek.getFridayRooms()[3]);
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods[3] = configuredScheduleWeek.getFridayPeriods()[3];
            btnFridayLessonThreePeriod.setText(configuredScheduleWeek.getFridayPeriods()[3]);
        }
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames[4] = configuredScheduleWeek.getFridayLessonNames()[4];
            btnFridayLessonFourLessonName.setText(configuredScheduleWeek.getFridayLessonNames()[4]);
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers[4] = configuredScheduleWeek.getFridayTeachers()[4];
            btnFridayLessonFourTeacher.setText(configuredScheduleWeek.getFridayTeachers()[4]);
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms[4] = configuredScheduleWeek.getFridayRooms()[4];
            btnFridayLessonFourRoom.setText(configuredScheduleWeek.getFridayRooms()[4]);
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods[4] = configuredScheduleWeek.getFridayPeriods()[4];
            btnFridayLessonFourPeriod.setText(configuredScheduleWeek.getFridayPeriods()[4]);
        }
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames[5] = configuredScheduleWeek.getFridayLessonNames()[5];
            btnFridayLessonFiveLessonName.setText(configuredScheduleWeek.getFridayLessonNames()[5]);
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers[5] = configuredScheduleWeek.getFridayTeachers()[5];
            btnFridayLessonFiveTeacher.setText(configuredScheduleWeek.getFridayTeachers()[5]);
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms[5] = configuredScheduleWeek.getFridayRooms()[5];
            btnFridayLessonFiveRoom.setText(configuredScheduleWeek.getFridayRooms()[5]);
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods[5] = configuredScheduleWeek.getFridayPeriods()[5];
            btnFridayLessonFivePeriod.setText(configuredScheduleWeek.getFridayPeriods()[5]);
        }
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames[6] = configuredScheduleWeek.getFridayLessonNames()[6];
            btnFridayLessonSixLessonName.setText(configuredScheduleWeek.getFridayLessonNames()[6]);
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers[6] = configuredScheduleWeek.getFridayTeachers()[6];
            btnFridayLessonSixTeacher.setText(configuredScheduleWeek.getFridayTeachers()[6]);
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms[6] = configuredScheduleWeek.getFridayRooms()[6];
            btnFridayLessonSixRoom.setText(configuredScheduleWeek.getFridayRooms()[6]);
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods[6] = configuredScheduleWeek.getFridayPeriods()[6];
            btnFridayLessonSixPeriod.setText(configuredScheduleWeek.getFridayPeriods()[6]);
        }
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames[7] = configuredScheduleWeek.getFridayLessonNames()[7];
            btnFridayLessonSevenLessonName.setText(configuredScheduleWeek.getFridayLessonNames()[7]);
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers[7] = configuredScheduleWeek.getFridayTeachers()[7];
            btnFridayLessonSevenTeacher.setText(configuredScheduleWeek.getFridayTeachers()[7]);
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms[7] = configuredScheduleWeek.getFridayRooms()[7];
            btnFridayLessonSevenRoom.setText(configuredScheduleWeek.getFridayRooms()[7]);
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods[7] = configuredScheduleWeek.getFridayPeriods()[7];
            btnFridayLessonSevenPeriod.setText(configuredScheduleWeek.getFridayPeriods()[7]);
        }
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames[8] = configuredScheduleWeek.getFridayLessonNames()[8];
            btnFridayLessonEightLessonName.setText(configuredScheduleWeek.getFridayLessonNames()[8]);
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers[8] = configuredScheduleWeek.getFridayTeachers()[8];
            btnFridayLessonEightTeacher.setText(configuredScheduleWeek.getFridayTeachers()[8]);
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms[8] = configuredScheduleWeek.getFridayRooms()[8];
            btnFridayLessonEightRoom.setText(configuredScheduleWeek.getFridayRooms()[8]);
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods[8] = configuredScheduleWeek.getFridayPeriods()[8];
            btnFridayLessonEightPeriod.setText(configuredScheduleWeek.getFridayPeriods()[8]);
        }
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames[9] = configuredScheduleWeek.getFridayLessonNames()[9];
            btnFridayLessonNineLessonName.setText(configuredScheduleWeek.getFridayLessonNames()[9]);
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers[9] = configuredScheduleWeek.getFridayTeachers()[9];
            btnFridayLessonNineTeacher.setText(configuredScheduleWeek.getFridayTeachers()[9]);
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms[9] = configuredScheduleWeek.getFridayRooms()[9];
            btnFridayLessonNineRoom.setText(configuredScheduleWeek.getFridayRooms()[9]);
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods[9] = configuredScheduleWeek.getFridayPeriods()[9];
            btnFridayLessonNinePeriod.setText(configuredScheduleWeek.getFridayPeriods()[9]);
        }
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
                for (int i = 0; i < fridayLessonNames.length; i++) {
                    checkScheduleRow(i);
                }
                Intent resultIntent = new Intent();
                configuredScheduleWeek.setFridayLessonNames(fridayLessonNames);
                configuredScheduleWeek.setFridayTeachers(fridayTeachers);
                configuredScheduleWeek.setFridayRooms(fridayRooms);
                configuredScheduleWeek.setFridayPeriods(fridayPeriods);
                resultIntent.putExtra(MainActivity.CONFIGURED_SCHEDULE_WEEK, configuredScheduleWeek);
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
                break;
        }
    }

    private void checkScheduleRow(int row) {
        if (fridayLessonNames[row].equals("Frei") && fridayTeachers[row].equals("Frei") && fridayRooms[row].equals("Frei")) {
            fridayPeriods[row] = "Frei";
        } else if (!fridayLessonNames[row].equals("Frei") && fridayTeachers[row].equals("Frei") && fridayRooms[row].equals("Frei")) {
            fridayTeachers[row] = "";
            fridayRooms[row] = "";
        } else if (fridayLessonNames[row].equals("Frei") && !fridayTeachers[row].equals("Frei") && fridayRooms[row].equals("Frei")) {
            fridayLessonNames[row] = "";
            fridayRooms[row] = "";
        } else if (fridayLessonNames[row].equals("Frei") && fridayTeachers[row].equals("Frei") && !fridayRooms[row].equals("Frei")) {
            fridayLessonNames[row] = "";
            fridayTeachers[row] = "";
        } else if (!fridayLessonNames[row].equals("Frei") && !fridayTeachers[row].equals("Frei") && fridayRooms[row].equals("Frei")) {
            fridayRooms[row] = "";
        }else if (!fridayLessonNames[row].equals("Frei") && fridayTeachers[row].equals("Frei") && !fridayRooms[row].equals("Frei")) {
            fridayTeachers[row] = "";
        }else if (fridayLessonNames[row].equals("Frei") && !fridayTeachers[row].equals("Frei") && !fridayRooms[row].equals("Frei")) {
            fridayLessonNames[row] = "";
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
                    Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 11:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonOneLessonName.setText(fridayLessonName);
                    fridayLessonNames[1] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 12:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonTwoLessonName.setText(fridayLessonName);
                    fridayLessonNames[2] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 13:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonThreeLessonName.setText(fridayLessonName);
                    fridayLessonNames[3] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 14:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonFourLessonName.setText(fridayLessonName);
                    fridayLessonNames[4] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 15:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonFiveLessonName.setText(fridayLessonName);
                    fridayLessonNames[5] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 16:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonSixLessonName.setText(fridayLessonName);
                    fridayLessonNames[6] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 17:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonSevenLessonName.setText(fridayLessonName);
                    fridayLessonNames[7] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 18:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonEightLessonName.setText(fridayLessonName);
                    fridayLessonNames[8] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 19:
                if(resultCode == Activity.RESULT_OK){
                    String fridayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnFridayLessonNineLessonName.setText(fridayLessonName);
                    fridayLessonNames[9] = fridayLessonName;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();}
                break;
            case 20:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonZeroTeacher.setText(fridayTeacher);
                    fridayTeachers[0] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 21:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonOneTeacher.setText(fridayTeacher);
                    fridayTeachers[1] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 22:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonTwoTeacher.setText(fridayTeacher);
                    fridayTeachers[2] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 23:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonThreeTeacher.setText(fridayTeacher);
                    fridayTeachers[3] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 24:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonFourTeacher.setText(fridayTeacher);
                    fridayTeachers[4] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 25:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonFiveTeacher.setText(fridayTeacher);
                    fridayTeachers[5] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 26:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonSixTeacher.setText(fridayTeacher);
                    fridayTeachers[6] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 27:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonSevenTeacher.setText(fridayTeacher);
                    fridayTeachers[7] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 28:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonEightTeacher.setText(fridayTeacher);
                    fridayTeachers[8] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 29:
                if(resultCode == Activity.RESULT_OK){
                    String fridayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                    btnFridayLessonNineTeacher.setText(fridayTeacher);
                    fridayTeachers[9] = fridayTeacher;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();}
                break;
            case 30:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonZeroRoom.setText(fridayRoom);
                    fridayRooms[0] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 31:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonOneRoom.setText(fridayRoom);
                    fridayRooms[1] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 32:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonTwoRoom.setText(fridayRoom);
                    fridayRooms[2] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 33:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonThreeRoom.setText(fridayRoom);
                    fridayRooms[3] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 34:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonFourRoom.setText(fridayRoom);
                    fridayRooms[4] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 35:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonFiveRoom.setText(fridayRoom);
                    fridayRooms[5] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 36:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonSixRoom.setText(fridayRoom);
                    fridayRooms[6] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 37:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonSevenRoom.setText(fridayRoom);
                    fridayRooms[7] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 38:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonEightRoom.setText(fridayRoom);
                    fridayRooms[8] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;
            case 39:
                if(resultCode == Activity.RESULT_OK){
                    String fridayRoom = data.getStringExtra(ChooseRoom.ROOM);
                    btnFridayLessonNineRoom.setText(fridayRoom);
                    fridayRooms[9] = fridayRoom;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();}
                break;

            case 40:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonZeroPeriod.setText(fridayPeriod);
                    fridayPeriods[0] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 41:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonOnePeriod.setText(fridayPeriod);
                    fridayPeriods[1] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 42:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonTwoPeriod.setText(fridayPeriod);
                    fridayPeriods[2] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 43:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonThreePeriod.setText(fridayPeriod);
                    fridayPeriods[3] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 44:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonFourPeriod.setText(fridayPeriod);
                    fridayPeriods[4] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 45:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonFivePeriod.setText(fridayPeriod);
                    fridayPeriods[5] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 46:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonSixPeriod.setText(fridayPeriod);
                    fridayPeriods[6] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 47:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonSevenPeriod.setText(fridayPeriod);
                    fridayPeriods[7] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 48:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonEightPeriod.setText(fridayPeriod);
                    fridayPeriods[8] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
            case 49:
                if(resultCode == Activity.RESULT_OK){
                    String fridayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                    btnFridayLessonNinePeriod.setText(fridayPeriod);
                    fridayPeriods[9] = fridayPeriod;
                }
                if (resultCode == Activity.RESULT_CANCELED) {Toast.makeText(this, ConfigureMondayActivity.CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();}
                break;
        }
    }
}