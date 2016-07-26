package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.HAStundenplanApp.R;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Thilo S. on 20.07.2016.
 */
public class ConfigureWeekdays {

    public static final String REQUEST_CODE = "requestCode";

    public static void calculateWeekdayLessonTimes(View v, List<Pair<Integer, Integer>> breaks, Calendar lessonTime, int lessonDuration) {
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

    public static void initializeScheduleWeekday(View v, String[] weekdayLessonNames, String[] weekdayTeachers, String[] weekdayRooms, String[] weekdayPeriods) {

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

    public static void initializeDigitalSchedule(View v, String[] weekdayLessonNames, String[] weekdayTeachers, String[] weekdayRooms) {

        Button btnWeekdayLessonZeroLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonZeroLessonName);
        Button btnWeekdayLessonZeroTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonZeroTeacher);
        Button btnWeekdayLessonZeroRoom = (Button) v.findViewById(R.id.btnWeekdayLessonZeroRoom);

        Button btnWeekdayLessonOneLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonOneLessonName);
        Button btnWeekdayLessonOneTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonOneTeacher);
        Button btnWeekdayLessonOneRoom = (Button) v.findViewById(R.id.btnWeekdayLessonOneRoom);

        Button btnWeekdayLessonTwoLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonTwoLessonName);
        Button btnWeekdayLessonTwoTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonTwoTeacher);
        Button btnWeekdayLessonTwoRoom = (Button) v.findViewById(R.id.btnWeekdayLessonTwoRoom);

        Button btnWeekdayLessonThreeLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonThreeLessonName);
        Button btnWeekdayLessonThreeTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonThreeTeacher);
        Button btnWeekdayLessonThreeRoom = (Button) v.findViewById(R.id.btnWeekdayLessonThreeRoom);

        Button btnWeekdayLessonFourLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonFourLessonName);
        Button btnWeekdayLessonFourTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonFourTeacher);
        Button btnWeekdayLessonFourRoom = (Button) v.findViewById(R.id.btnWeekdayLessonFourRoom);

        Button btnWeekdayLessonFiveLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonFiveLessonName);
        Button btnWeekdayLessonFiveTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonFiveTeacher);
        Button btnWeekdayLessonFiveRoom = (Button) v.findViewById(R.id.btnWeekdayLessonFiveRoom);

        Button btnWeekdayLessonSixLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonSixLessonName);
        Button btnWeekdayLessonSixTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonSixTeacher);
        Button btnWeekdayLessonSixRoom = (Button) v.findViewById(R.id.btnWeekdayLessonSixRoom);

        Button btnWeekdayLessonSevenLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonSevenLessonName);
        Button btnWeekdayLessonSevenTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonSevenTeacher);
        Button btnWeekdayLessonSevenRoom = (Button) v.findViewById(R.id.btnWeekdayLessonSevenRoom);

        Button btnWeekdayLessonEightLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonEightLessonName);
        Button btnWeekdayLessonEightTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonEightTeacher);
        Button btnWeekdayLessonEightRoom = (Button) v.findViewById(R.id.btnWeekdayLessonEightRoom);

        Button btnWeekdayLessonNineLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonNineLessonName);
        Button btnWeekdayLessonNineTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonNineTeacher);
        Button btnWeekdayLessonNineRoom = (Button) v.findViewById(R.id.btnWeekdayLessonNineRoom);



        btnWeekdayLessonZeroLessonName.setText(weekdayLessonNames[0]);
        btnWeekdayLessonZeroTeacher.setText(weekdayTeachers[0]);
        btnWeekdayLessonZeroRoom.setText(weekdayRooms[0]);

        btnWeekdayLessonOneLessonName.setText(weekdayLessonNames[1]);
        btnWeekdayLessonOneTeacher.setText(weekdayTeachers[1]);
        btnWeekdayLessonOneRoom.setText(weekdayRooms[1]);

        btnWeekdayLessonTwoLessonName.setText(weekdayLessonNames[2]);
        btnWeekdayLessonTwoTeacher.setText(weekdayTeachers[2]);
        btnWeekdayLessonTwoRoom.setText(weekdayRooms[2]);

        btnWeekdayLessonThreeLessonName.setText(weekdayLessonNames[3]);
        btnWeekdayLessonThreeTeacher.setText(weekdayTeachers[3]);
        btnWeekdayLessonThreeRoom.setText(weekdayRooms[3]);

        btnWeekdayLessonFourLessonName.setText(weekdayLessonNames[4]);
        btnWeekdayLessonFourTeacher.setText(weekdayTeachers[4]);
        btnWeekdayLessonFourRoom.setText(weekdayRooms[4]);

        btnWeekdayLessonFiveLessonName.setText(weekdayLessonNames[5]);
        btnWeekdayLessonFiveTeacher.setText(weekdayTeachers[5]);
        btnWeekdayLessonFiveRoom.setText(weekdayRooms[5]);

        btnWeekdayLessonSixLessonName.setText(weekdayLessonNames[6]);
        btnWeekdayLessonSixTeacher.setText(weekdayTeachers[6]);
        btnWeekdayLessonSixRoom.setText(weekdayRooms[6]);

        btnWeekdayLessonSevenLessonName.setText(weekdayLessonNames[7]);
        btnWeekdayLessonSevenTeacher.setText(weekdayTeachers[7]);
        btnWeekdayLessonSevenRoom.setText(weekdayRooms[7]);

        btnWeekdayLessonEightLessonName.setText(weekdayLessonNames[8]);
        btnWeekdayLessonEightTeacher.setText(weekdayTeachers[8]);
        btnWeekdayLessonEightRoom.setText(weekdayRooms[8]);

        btnWeekdayLessonNineLessonName.setText(weekdayLessonNames[9]);
        btnWeekdayLessonNineTeacher.setText(weekdayTeachers[9]);
        btnWeekdayLessonNineRoom.setText(weekdayRooms[9]);
    }
}
