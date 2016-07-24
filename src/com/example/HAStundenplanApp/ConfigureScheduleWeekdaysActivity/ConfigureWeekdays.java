package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.HAStundenplanApp.R;
import com.example.HAStundenplanApp.ScheduleWeek;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Thilo S. on 20.07.2016.
 */
class ConfigureWeekdays {

    static final String REQUEST_CODE = "requestCode";

    private static final String CANCEL_MSG_CHOOSE_LESSON = "Der Vorgang: \"Auswählen der Unterrichtsstunde\" wurde abgebrochen!";
    private static final String CANCEL_MSG_CHOOSE_TEACHER = "Der Vorgang: \"Auswählen des Lehrers\" wurde abgebrochen!";
    private static final String CANCEL_MSG_CHOOSE_ROOM = "Der Vorgang: \"Auswählen des Raums\" wurde abgebrochen!";
    private static final String CANCEL_MSG_CHOOSE_PERIOD = "Der Vorgang: \"Auswählen der Wiederholung\" wurde abgebrochen!";

    static void calculateWeekdayLessonTimes(View v, List<Pair<Integer, Integer>> breaks, Calendar lessonTime, int lessonDuration) {
        if (breaks.size() == 9) {
            TextView tvWeekdayLessonZeroStart = (TextView) v.findViewById(R.id.tvWeekdayLessonZeroStart);
            TextView tvWeekdayLessonZeroEnd = (TextView) v.findViewById(R.id.tvWeekdayLessonZeroEnd);
            TextView tvWeekdayLessonOneStart = (TextView) v.findViewById(R.id.tvWeekdayLessonOneStart);
            TextView tvWeekdayLessonOneEnd = (TextView) v.findViewById(R.id.tvWeekdayLessonOneEnd);
            TextView tvWeekdayLessonTwoStart = (TextView) v.findViewById(R.id.tvWeekdayLessonTwoStart);
            TextView tvWeekdayLessonTwoEnd = (TextView) v.findViewById(R.id.tvWeekdayLessonTwoEnd);
            TextView tvWeekdayLessonThreeStart = (TextView) v.findViewById(R.id.tvWeekdayLessonThreeStart);
            TextView tvWeekdayLessonThreeEnd = (TextView) v.findViewById(R.id.tvWeekdayLessonThreeEnd);
            TextView tvWeekdayLessonFourStart = (TextView) v.findViewById(R.id.tvWeekdayLessonFourStart);
            TextView tvWeekdayLessonFourEnd = (TextView) v.findViewById(R.id.tvWeekdayLessonFourEnd);
            TextView tvWeekdayLessonFiveStart = (TextView) v.findViewById(R.id.tvWeekdayLessonFiveStart);
            TextView tvWeekdayLessonFiveEnd = (TextView) v.findViewById(R.id.tvWeekdayLessonFiveEnd);
            TextView tvWeekdayLessonSixStart = (TextView) v.findViewById(R.id.tvWeekdayLessonSixStart);
            TextView tvWeekdayLessonSixEnd = (TextView) v.findViewById(R.id.tvWeekdayLessonSixEnd);
            TextView tvWeekdayLessonSevenStart = (TextView) v.findViewById(R.id.tvWeekdayLessonSevenStart);
            TextView tvWeekdayLessonSevenEnd = (TextView) v.findViewById(R.id.tvWeekdayLessonSevenEnd);
            TextView tvWeekdayLessonEightStart = (TextView) v.findViewById(R.id.tvWeekdayLessonEightStart);
            TextView tvWeekdayLessonEightEnd = (TextView) v.findViewById(R.id.tvWeekdayLessonEightEnd);
            TextView tvWeekdayLessonNineStart = (TextView) v.findViewById(R.id.tvWeekdayLessonNineStart);
            TextView tvWeekdayLessonNineEnd = (TextView) v.findViewById(R.id.tvWeekdayLessonNineEnd);

            tvWeekdayLessonZeroStart.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonZeroEnd.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(0).second);

            tvWeekdayLessonOneStart.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonOneEnd.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(1).second);

            tvWeekdayLessonTwoStart.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonTwoEnd.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(2).second);

            tvWeekdayLessonThreeStart.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonThreeEnd.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(3).second);

            tvWeekdayLessonFourStart.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonFourEnd.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(4).second);

            tvWeekdayLessonFiveStart.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonFiveEnd.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(5).second);

            tvWeekdayLessonSixStart.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonSixEnd.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(6).second);

            tvWeekdayLessonSevenStart.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonSevenEnd.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(7).second);

            tvWeekdayLessonEightStart.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonEightEnd.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(8).second);

            tvWeekdayLessonNineStart.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonNineEnd.setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
        } else {
            throw new IllegalArgumentException("You need to specify 9 breaks in the Configuration to run this implementation!");
        }
    }

    private static String convertIntegerTimeToTimeString(int i) {
        String timeString = Integer.toString(i);
        if (timeString.length() == 1) {
            timeString = "00:0".concat(timeString);
        } else if (timeString.length() == 2) {
            timeString = "00:".concat(timeString);
        } else if (timeString.length() == 3) {
            timeString = "0".concat(Character.toString(timeString.charAt(0))).concat(":".concat(timeString.substring(1)));
        } else if (timeString.length() == 4) {
            timeString = timeString.substring(0, 2).concat(":").concat(timeString.substring(2));
        } else {
            throw new IllegalArgumentException();
        }
        return timeString;
    }

    static void checkScheduleRow(int row, String[] weekdayLessonNames, String[] weekdayTeachers, String[] weekdayRooms, String[] weekdayPeriods) {
        if (weekdayLessonNames[row].equals("Frei") && weekdayTeachers[row].equals("Frei") && weekdayRooms[row].equals("Frei")) {
            weekdayPeriods[row] = "Frei";
        } else if (!weekdayLessonNames[row].equals("Frei") && weekdayTeachers[row].equals("Frei") && weekdayRooms[row].equals("Frei")) {
            weekdayTeachers[row] = "";
            weekdayRooms[row] = "";
        } else if (weekdayLessonNames[row].equals("Frei") && !weekdayTeachers[row].equals("Frei") && weekdayRooms[row].equals("Frei")) {
            weekdayLessonNames[row] = "";
            weekdayRooms[row] = "";
        } else if (weekdayLessonNames[row].equals("Frei") && weekdayTeachers[row].equals("Frei") && !weekdayRooms[row].equals("Frei")) {
            weekdayLessonNames[row] = "";
            weekdayTeachers[row] = "";
        } else if (!weekdayLessonNames[row].equals("Frei") && !weekdayTeachers[row].equals("Frei") && weekdayRooms[row].equals("Frei")) {
            weekdayRooms[row] = "";
        } else if (!weekdayLessonNames[row].equals("Frei") && weekdayTeachers[row].equals("Frei") && !weekdayRooms[row].equals("Frei")) {
            weekdayTeachers[row] = "";
        } else if (weekdayLessonNames[row].equals("Frei") && !weekdayTeachers[row].equals("Frei") && !weekdayRooms[row].equals("Frei")) {
            weekdayLessonNames[row] = "";
        }
    }

    static void initializeScheduleWeekday(View v, String[] weekdayLessonNames, String[] weekdayTeachers, String[] weekdayRooms, String[] weekdayPeriods) {

        Button btnWeekdayLessonZeroLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonZeroLessonName);
        Button btnWeekdayLessonZeroTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonZeroTeacher);
        Button btnWeekdayLessonZeroRoom = (Button) v.findViewById(R.id.btnWeekdayLessonZeroRoom);
        Button btnWeekdayLessonZeroPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonZeroPeriod);
        Button btnWeekdayLessonOneLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonOneLessonName);
        Button btnWeekdayLessonOneTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonOneTeacher);
        Button btnWeekdayLessonOneRoom = (Button) v.findViewById(R.id.btnWeekdayLessonOneRoom);
        Button btnWeekdayLessonOnePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonOnePeriod);
        Button btnWeekdayLessonTwoLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonTwoLessonName);
        Button btnWeekdayLessonTwoTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonTwoTeacher);
        Button btnWeekdayLessonTwoRoom = (Button) v.findViewById(R.id.btnWeekdayLessonTwoRoom);
        Button btnWeekdayLessonTwoPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonTwoPeriod);
        Button btnWeekdayLessonThreeLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonThreeLessonName);
        Button btnWeekdayLessonThreeTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonThreeTeacher);
        Button btnWeekdayLessonThreeRoom = (Button) v.findViewById(R.id.btnWeekdayLessonThreeRoom);
        Button btnWeekdayLessonThreePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonThreePeriod);
        Button btnWeekdayLessonFourLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonFourLessonName);
        Button btnWeekdayLessonFourTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonFourTeacher);
        Button btnWeekdayLessonFourRoom = (Button) v.findViewById(R.id.btnWeekdayLessonFourRoom);
        Button btnWeekdayLessonFourPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonFourPeriod);
        Button btnWeekdayLessonFiveLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonFiveLessonName);
        Button btnWeekdayLessonFiveTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonFiveTeacher);
        Button btnWeekdayLessonFiveRoom = (Button) v.findViewById(R.id.btnWeekdayLessonFiveRoom);
        Button btnWeekdayLessonFivePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonFivePeriod);
        Button btnWeekdayLessonSixLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonSixLessonName);
        Button btnWeekdayLessonSixTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonSixTeacher);
        Button btnWeekdayLessonSixRoom = (Button) v.findViewById(R.id.btnWeekdayLessonSixRoom);
        Button btnWeekdayLessonSixPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonSixPeriod);
        Button btnWeekdayLessonSevenLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonSevenLessonName);
        Button btnWeekdayLessonSevenTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonSevenTeacher);
        Button btnWeekdayLessonSevenRoom = (Button) v.findViewById(R.id.btnWeekdayLessonSevenRoom);
        Button btnWeekdayLessonSevenPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonSevenPeriod);
        Button btnWeekdayLessonEightLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonEightLessonName);
        Button btnWeekdayLessonEightTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonEightTeacher);
        Button btnWeekdayLessonEightRoom = (Button) v.findViewById(R.id.btnWeekdayLessonEightRoom);
        Button btnWeekdayLessonEightPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonEightPeriod);
        Button btnWeekdayLessonNineLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonNineLessonName);
        Button btnWeekdayLessonNineTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonNineTeacher);
        Button btnWeekdayLessonNineRoom = (Button) v.findViewById(R.id.btnWeekdayLessonNineRoom);
        Button btnWeekdayLessonNinePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonNinePeriod);


        btnWeekdayLessonZeroLessonName.setText(weekdayLessonNames[0]);
        btnWeekdayLessonZeroTeacher.setText(weekdayTeachers[0]);
        btnWeekdayLessonZeroRoom.setText(weekdayRooms[0]);
        btnWeekdayLessonZeroPeriod.setText(weekdayPeriods[0]);

        btnWeekdayLessonOneLessonName.setText(weekdayLessonNames[1]);
        btnWeekdayLessonOneTeacher.setText(weekdayTeachers[1]);
        btnWeekdayLessonOneRoom.setText(weekdayRooms[1]);
        btnWeekdayLessonOnePeriod.setText(weekdayPeriods[1]);

        btnWeekdayLessonTwoLessonName.setText(weekdayLessonNames[2]);
        btnWeekdayLessonTwoTeacher.setText(weekdayTeachers[2]);
        btnWeekdayLessonTwoRoom.setText(weekdayRooms[2]);
        btnWeekdayLessonTwoPeriod.setText(weekdayPeriods[2]);

        btnWeekdayLessonThreeLessonName.setText(weekdayLessonNames[3]);
        btnWeekdayLessonThreeTeacher.setText(weekdayTeachers[3]);
        btnWeekdayLessonThreeRoom.setText(weekdayRooms[3]);
        btnWeekdayLessonThreePeriod.setText(weekdayPeriods[3]);

        btnWeekdayLessonFourLessonName.setText(weekdayLessonNames[4]);
        btnWeekdayLessonFourTeacher.setText(weekdayTeachers[4]);
        btnWeekdayLessonFourRoom.setText(weekdayRooms[4]);
        btnWeekdayLessonFourPeriod.setText(weekdayPeriods[4]);

        btnWeekdayLessonFiveLessonName.setText(weekdayLessonNames[5]);
        btnWeekdayLessonFiveTeacher.setText(weekdayTeachers[5]);
        btnWeekdayLessonFiveRoom.setText(weekdayRooms[5]);
        btnWeekdayLessonFivePeriod.setText(weekdayPeriods[5]);

        btnWeekdayLessonSixLessonName.setText(weekdayLessonNames[6]);
        btnWeekdayLessonSixTeacher.setText(weekdayTeachers[6]);
        btnWeekdayLessonSixRoom.setText(weekdayRooms[6]);
        btnWeekdayLessonSixPeriod.setText(weekdayPeriods[6]);

        btnWeekdayLessonSevenLessonName.setText(weekdayLessonNames[7]);
        btnWeekdayLessonSevenTeacher.setText(weekdayTeachers[7]);
        btnWeekdayLessonSevenRoom.setText(weekdayRooms[7]);
        btnWeekdayLessonSevenPeriod.setText(weekdayPeriods[7]);

        btnWeekdayLessonEightLessonName.setText(weekdayLessonNames[8]);
        btnWeekdayLessonEightTeacher.setText(weekdayTeachers[8]);
        btnWeekdayLessonEightRoom.setText(weekdayRooms[8]);
        btnWeekdayLessonEightPeriod.setText(weekdayPeriods[8]);

        btnWeekdayLessonNineLessonName.setText(weekdayLessonNames[9]);
        btnWeekdayLessonNineTeacher.setText(weekdayTeachers[9]);
        btnWeekdayLessonNineRoom.setText(weekdayRooms[9]);
        btnWeekdayLessonNinePeriod.setText(weekdayPeriods[9]);
    }

    static Intent onWeekdayButtonsClick(View v, Context c, int[] Ids) {
        return new Intent();
    }

    static Intent onWeekdayButtonsClick(View v, Context c) {
        Intent weekdayLessonNameIntent = new Intent(c, ChooseLesson.class);
        Intent weekdayTeacherIntent = new Intent(c, ChooseTeacher.class);
        Intent weekdayRoomIntent = new Intent(c, ChooseRoom.class);
        Intent weekdayPeriodIntent = new Intent(c, ChoosePeriod.class);

        Button btnWeekdayLessonZeroLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonZeroLessonName);
        Button btnWeekdayLessonOneLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonOneLessonName);
        Button btnWeekdayLessonTwoLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonTwoLessonName);
        Button btnWeekdayLessonThreeLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonThreeLessonName);
        Button btnWeekdayLessonFourLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonFourLessonName);
        Button btnWeekdayLessonFiveLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonFiveLessonName);
        Button btnWeekdayLessonSixLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonSixLessonName);
        Button btnWeekdayLessonSevenLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonSevenLessonName);
        Button btnWeekdayLessonEightLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonEightLessonName);
        Button btnWeekdayLessonNineLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonNineLessonName);

        Button btnWeekdayLessonZeroTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonZeroTeacher);
        Button btnWeekdayLessonOneTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonOneTeacher);
        Button btnWeekdayLessonTwoTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonTwoTeacher);
        Button btnWeekdayLessonThreeTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonThreeTeacher);
        Button btnWeekdayLessonFourTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonFourTeacher);
        Button btnWeekdayLessonFiveTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonFiveTeacher);
        Button btnWeekdayLessonSixTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonSixTeacher);
        Button btnWeekdayLessonSevenTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonSevenTeacher);
        Button btnWeekdayLessonEightTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonEightTeacher);
        Button btnWeekdayLessonNineTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonNineTeacher);

        Button btnWeekdayLessonZeroRoom = (Button) v.findViewById(R.id.btnWeekdayLessonZeroRoom);
        Button btnWeekdayLessonOneRoom = (Button) v.findViewById(R.id.btnWeekdayLessonOneRoom);
        Button btnWeekdayLessonTwoRoom = (Button) v.findViewById(R.id.btnWeekdayLessonTwoRoom);
        Button btnWeekdayLessonThreeRoom = (Button) v.findViewById(R.id.btnWeekdayLessonThreeRoom);
        Button btnWeekdayLessonFourRoom = (Button) v.findViewById(R.id.btnWeekdayLessonFourRoom);
        Button btnWeekdayLessonFiveRoom = (Button) v.findViewById(R.id.btnWeekdayLessonFiveRoom);
        Button btnWeekdayLessonSixRoom = (Button) v.findViewById(R.id.btnWeekdayLessonSixRoom);
        Button btnWeekdayLessonSevenRoom = (Button) v.findViewById(R.id.btnWeekdayLessonSevenRoom);
        Button btnWeekdayLessonEightRoom = (Button) v.findViewById(R.id.btnWeekdayLessonEightRoom);
        Button btnWeekdayLessonNineRoom = (Button) v.findViewById(R.id.btnWeekdayLessonNineRoom);

        Button btnWeekdayLessonZeroPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonZeroPeriod);
        Button btnWeekdayLessonOnePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonOnePeriod);
        Button btnWeekdayLessonTwoPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonTwoPeriod);
        Button btnWeekdayLessonThreePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonThreePeriod);
        Button btnWeekdayLessonFourPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonFourPeriod);
        Button btnWeekdayLessonFivePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonFivePeriod);
        Button btnWeekdayLessonSixPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonSixPeriod);
        Button btnWeekdayLessonSevenPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonSevenPeriod);
        Button btnWeekdayLessonEightPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonEightPeriod);
        Button btnWeekdayLessonNinePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonNinePeriod);


        btnWeekdayLessonZeroLessonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayLessonNameIntent.putExtra(REQUEST_CODE, 10);
            }
        });
        btnWeekdayLessonOneLessonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayLessonNameIntent.putExtra(REQUEST_CODE, 11);
            }
        });
        btnWeekdayLessonTwoLessonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayLessonNameIntent.putExtra(REQUEST_CODE, 12);
            }
        });
        btnWeekdayLessonThreeLessonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayLessonNameIntent.putExtra(REQUEST_CODE, 13);
            }
        });
        btnWeekdayLessonFourLessonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayLessonNameIntent.putExtra(REQUEST_CODE, 14);
            }
        });
        btnWeekdayLessonFiveLessonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayLessonNameIntent.putExtra(REQUEST_CODE, 15);
            }
        });
        btnWeekdayLessonSixLessonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayLessonNameIntent.putExtra(REQUEST_CODE, 16);
            }
        });
        btnWeekdayLessonSevenLessonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayLessonNameIntent.putExtra(REQUEST_CODE, 17);
            }
        });
        btnWeekdayLessonEightLessonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayLessonNameIntent.putExtra(REQUEST_CODE, 18);
            }
        });
        btnWeekdayLessonNineLessonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayLessonNameIntent.putExtra(REQUEST_CODE, 19);
            }
        });

        btnWeekdayLessonZeroTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayTeacherIntent.putExtra(REQUEST_CODE, 20);
            }
        });
        btnWeekdayLessonOneTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayTeacherIntent.putExtra(REQUEST_CODE, 21);
            }
        });
        btnWeekdayLessonTwoTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayTeacherIntent.putExtra(REQUEST_CODE, 22);
            }
        });
        btnWeekdayLessonThreeTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayTeacherIntent.putExtra(REQUEST_CODE, 23);
            }
        });
        btnWeekdayLessonFourTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayTeacherIntent.putExtra(REQUEST_CODE, 24);
            }
        });
        btnWeekdayLessonFiveTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayTeacherIntent.putExtra(REQUEST_CODE, 25);
            }
        });
        btnWeekdayLessonSixTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayTeacherIntent.putExtra(REQUEST_CODE, 26);
            }
        });
        btnWeekdayLessonSevenTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayTeacherIntent.putExtra(REQUEST_CODE, 27);
            }
        });
        btnWeekdayLessonEightTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayTeacherIntent.putExtra(REQUEST_CODE, 28);
            }
        });
        btnWeekdayLessonNineTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayTeacherIntent.putExtra(REQUEST_CODE, 29);
            }
        });
        btnWeekdayLessonZeroRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayRoomIntent.putExtra(REQUEST_CODE, 30);
            }
        });
        btnWeekdayLessonOneRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayRoomIntent.putExtra(REQUEST_CODE, 31);
            }
        });
        btnWeekdayLessonTwoRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayRoomIntent.putExtra(REQUEST_CODE, 32);
            }
        });
        btnWeekdayLessonThreeRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayRoomIntent.putExtra(REQUEST_CODE, 33);
            }
        });
        btnWeekdayLessonFourRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayRoomIntent.putExtra(REQUEST_CODE, 34);
            }
        });
        btnWeekdayLessonFiveRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayRoomIntent.putExtra(REQUEST_CODE, 35);
            }
        });
        btnWeekdayLessonSixRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayRoomIntent.putExtra(REQUEST_CODE, 36);
            }
        });
        btnWeekdayLessonSevenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayRoomIntent.putExtra(REQUEST_CODE, 37);
            }
        });
        btnWeekdayLessonEightRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayRoomIntent.putExtra(REQUEST_CODE, 38);
            }
        });
        btnWeekdayLessonNineRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayRoomIntent.putExtra(REQUEST_CODE, 39);
            }
        });

        btnWeekdayLessonZeroPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayPeriodIntent.putExtra(REQUEST_CODE, 40);
            }
        });
        btnWeekdayLessonOnePeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayPeriodIntent.putExtra(REQUEST_CODE, 41);
            }
        });
        btnWeekdayLessonTwoPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayPeriodIntent.putExtra(REQUEST_CODE, 42);
            }
        });
        btnWeekdayLessonThreePeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayPeriodIntent.putExtra(REQUEST_CODE, 43);
            }
        });
        btnWeekdayLessonFourPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayPeriodIntent.putExtra(REQUEST_CODE, 44);
            }
        });
        btnWeekdayLessonFivePeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayPeriodIntent.putExtra(REQUEST_CODE, 45);
            }
        });
        btnWeekdayLessonSixPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayPeriodIntent.putExtra(REQUEST_CODE, 46);
            }
        });
        btnWeekdayLessonSevenPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayPeriodIntent.putExtra(REQUEST_CODE, 47);
            }
        });
        btnWeekdayLessonEightPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayPeriodIntent.putExtra(REQUEST_CODE, 48);
            }
        });
        btnWeekdayLessonNinePeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weekdayPeriodIntent.putExtra(REQUEST_CODE, 49);
            }
        });
        if (weekdayLessonNameIntent.hasExtra(REQUEST_CODE)) {
            return weekdayLessonNameIntent;
        } else if (weekdayTeacherIntent.hasExtra(REQUEST_CODE)) {
            return weekdayTeacherIntent;
        } else if (weekdayRoomIntent.hasExtra(REQUEST_CODE)) {
            return weekdayRoomIntent;
        }else if (weekdayPeriodIntent.hasExtra(REQUEST_CODE)) {
            return weekdayPeriodIntent;
        } else return null;
    }

    static void onWeekdayButtonsResult(int requestCode, int resultCode, Intent data, Context c, String[] weekdayLessonNames, String[] weekdayTeachers,
                                       String[] weekdayRooms, String[] weekdayPeriods,
                                       Button[] lessonNameButtons, Button[] teacherButtons, Button[] roomButtons, Button[] periodsButtons) {
        if (resultCode == Activity.RESULT_OK && requestCode == 10) {
            String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
            lessonNameButtons[0].setText(weekdayLessonName);
            weekdayLessonNames[0] = weekdayLessonName;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 10) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 11) {
            String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
            lessonNameButtons[1].setText(weekdayLessonName);
            weekdayLessonNames[1] = weekdayLessonName;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 11) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 12) {
            String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
            lessonNameButtons[2].setText(weekdayLessonName);
            weekdayLessonNames[2] = weekdayLessonName;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 12) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 13) {
            String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
            lessonNameButtons[3].setText(weekdayLessonName);
            weekdayLessonNames[3] = weekdayLessonName;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 13) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 14) {
            String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
            lessonNameButtons[4].setText(weekdayLessonName);
            weekdayLessonNames[4] = weekdayLessonName;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 14) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 15) {
            String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
            lessonNameButtons[5].setText(weekdayLessonName);
            weekdayLessonNames[5] = weekdayLessonName;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 15) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 16) {
            String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
            lessonNameButtons[6].setText(weekdayLessonName);
            weekdayLessonNames[6] = weekdayLessonName;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 16) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 17) {
            String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
            lessonNameButtons[7].setText(weekdayLessonName);
            weekdayLessonNames[7] = weekdayLessonName;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 17) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 18) {
            String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
            lessonNameButtons[8].setText(weekdayLessonName);
            weekdayLessonNames[8] = weekdayLessonName;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 18) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 19) {
            String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
            lessonNameButtons[9].setText(weekdayLessonName);
            weekdayLessonNames[9] = weekdayLessonName;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 19) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_LESSON, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 20) {
            String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
            teacherButtons[0].setText(weekdayTeacher);
            weekdayTeachers[0] = weekdayTeacher;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 20) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 21) {
            String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
            teacherButtons[1].setText(weekdayTeacher);
            weekdayTeachers[1] = weekdayTeacher;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 21) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 22) {
            String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
            teacherButtons[2].setText(weekdayTeacher);
            weekdayTeachers[2] = weekdayTeacher;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 22) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 23) {
            String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
            teacherButtons[3].setText(weekdayTeacher);
            weekdayTeachers[3] = weekdayTeacher;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 23) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 24) {
            String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
            teacherButtons[4].setText(weekdayTeacher);
            weekdayTeachers[4] = weekdayTeacher;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 24) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 25) {
            String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
            teacherButtons[5].setText(weekdayTeacher);
            weekdayTeachers[5] = weekdayTeacher;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 25) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 26) {
            String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
            teacherButtons[6].setText(weekdayTeacher);
            weekdayTeachers[6] = weekdayTeacher;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 26) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 27) {
            String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
            teacherButtons[7].setText(weekdayTeacher);
            weekdayTeachers[7] = weekdayTeacher;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 27) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 28) {
            String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
            teacherButtons[8].setText(weekdayTeacher);
            weekdayTeachers[8] = weekdayTeacher;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 28) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 29) {
            String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
            teacherButtons[9].setText(weekdayTeacher);
            weekdayTeachers[9] = weekdayTeacher;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 29) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_TEACHER, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 30) {
            String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
            roomButtons[0].setText(weekdayRoom);
            weekdayRooms[0] = weekdayRoom;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 30) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 31) {
            String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
            roomButtons[1].setText(weekdayRoom);
            weekdayRooms[1] = weekdayRoom;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 31) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 32) {
            String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
            roomButtons[2].setText(weekdayRoom);
            weekdayRooms[2] = weekdayRoom;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 32) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 33) {
            String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
            roomButtons[3].setText(weekdayRoom);
            weekdayRooms[3] = weekdayRoom;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 33) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 34) {
            String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
            roomButtons[4].setText(weekdayRoom);
            weekdayRooms[4] = weekdayRoom;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 34) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 35) {
            String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
            roomButtons[5].setText(weekdayRoom);
            weekdayRooms[5] = weekdayRoom;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 35) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 36) {
            String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
            roomButtons[6].setText(weekdayRoom);
            weekdayRooms[6] = weekdayRoom;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 36) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 37) {
            String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
            roomButtons[7].setText(weekdayRoom);
            weekdayRooms[7] = weekdayRoom;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 37) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 38) {
            String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
            roomButtons[8].setText(weekdayRoom);
            weekdayRooms[8] = weekdayRoom;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 38) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 39) {
            String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
            roomButtons[9].setText(weekdayRoom);
            weekdayRooms[9] = weekdayRoom;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 39) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_ROOM, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 40) {
            String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
            periodsButtons[0].setText(weekdayPeriod);
            weekdayPeriods[0] = weekdayPeriod;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 40) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 41) {
            String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
            periodsButtons[1].setText(weekdayPeriod);
            weekdayPeriods[1] = weekdayPeriod;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 41) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 42) {
            String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
            periodsButtons[2].setText(weekdayPeriod);
            weekdayPeriods[2] = weekdayPeriod;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 42) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 43) {
            String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
            periodsButtons[3].setText(weekdayPeriod);
            weekdayPeriods[3] = weekdayPeriod;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 43) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 44) {
            String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
            periodsButtons[4].setText(weekdayPeriod);
            weekdayPeriods[4] = weekdayPeriod;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 44) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 45) {
            String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
            periodsButtons[5].setText(weekdayPeriod);
            weekdayPeriods[5] = weekdayPeriod;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 45) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 46) {
            String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
            periodsButtons[6].setText(weekdayPeriod);
            weekdayPeriods[6] = weekdayPeriod;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 46) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 47) {
            String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
            periodsButtons[7].setText(weekdayPeriod);
            weekdayPeriods[7] = weekdayPeriod;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 47) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 48) {
            String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
            periodsButtons[8].setText(weekdayPeriod);
            weekdayPeriods[8] = weekdayPeriod;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 48) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();
        } else if (resultCode == Activity.RESULT_OK && requestCode == 49) {
            String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
            periodsButtons[9].setText(weekdayPeriod);
            weekdayPeriods[9] = weekdayPeriod;
        } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 49) {
            Toast.makeText(c, CANCEL_MSG_CHOOSE_PERIOD, Toast.LENGTH_LONG).show();
        } else {
            throw new IllegalStateException();

        }
    }
}
