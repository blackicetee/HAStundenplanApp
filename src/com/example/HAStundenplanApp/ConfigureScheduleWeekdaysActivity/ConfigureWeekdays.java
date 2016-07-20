package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
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

    static void calculateWeekdayLessonTimes(TextView[] tvWeekdayLessonTimes, List<Pair<Integer, Integer>> breaks, Calendar lessonTime, int lessonDuration) {
        if (breaks.get(0).first == 0) {
            tvWeekdayLessonTimes[0].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonTimes[1].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(0).second);
        } else if (breaks.get(1).first == 1) {
            tvWeekdayLessonTimes[2].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonTimes[3].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(1).second);
        } else if (breaks.get(2).first == 2) {
            tvWeekdayLessonTimes[4].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonTimes[5].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(2).second);
        } else if (breaks.get(3).first == 3) {
            tvWeekdayLessonTimes[6].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonTimes[7].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(3).second);
        } else if (breaks.get(4).first == 4) {
            tvWeekdayLessonTimes[8].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonTimes[9].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(4).second);
        } else if (breaks.get(5).first == 5) {
            tvWeekdayLessonTimes[10].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonTimes[11].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(5).second);
        } else if (breaks.get(6).first == 6) {
            tvWeekdayLessonTimes[12].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonTimes[13].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(6).second);
        } else if (breaks.get(7).first == 7) {
            tvWeekdayLessonTimes[14].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonTimes[15].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(7).second);
        } else if (breaks.get(8).first == 8) {
            tvWeekdayLessonTimes[16].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, lessonDuration);
            tvWeekdayLessonTimes[17].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
            lessonTime.add(Calendar.MINUTE, breaks.get(8).second);
        }
        tvWeekdayLessonTimes[18].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
        lessonTime.add(Calendar.MINUTE, lessonDuration);
        tvWeekdayLessonTimes[19].setText(convertIntegerTimeToTimeString(lessonTime.get(Calendar.HOUR_OF_DAY) * 100 + lessonTime.get(Calendar.MINUTE)));
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

    static void initializeScheduleWeekday(Boolean[] configuredScheduleWeekNotNullConditions, ScheduleWeek configuredScheduleWeek, String[] weekdayLessonNames, String[] weekdayTeachers, String[] weekdayRooms, String[] weekdayPeriods,
                                          Button[] lessonNameButtons, Button[] teacherButtons, Button[] roomButtons, Button[] periodsButtons) {
        if (configuredScheduleWeekNotNullConditions[0]) {
            weekdayLessonNames[0] = configuredScheduleWeek.getMondayLessonNames()[0];
            lessonNameButtons[0].setText(configuredScheduleWeek.getMondayLessonNames()[0]);
        }
        if (configuredScheduleWeekNotNullConditions[1]) {
            weekdayTeachers[0] = configuredScheduleWeek.getMondayTeachers()[0];
            teacherButtons[0].setText(configuredScheduleWeek.getMondayTeachers()[0]);
        }
        if (configuredScheduleWeekNotNullConditions[2]) {
            weekdayRooms[0] = configuredScheduleWeek.getMondayRooms()[0];
            roomButtons[0].setText(configuredScheduleWeek.getMondayRooms()[0]);
        }
        if (configuredScheduleWeekNotNullConditions[3]) {
            weekdayPeriods[0] = configuredScheduleWeek.getMondayPeriods()[0];
            periodsButtons[0].setText(configuredScheduleWeek.getMondayPeriods()[0]);
        }
        if (configuredScheduleWeekNotNullConditions[0]) {
            weekdayLessonNames[1] = configuredScheduleWeek.getMondayLessonNames()[1];
            lessonNameButtons[1].setText(configuredScheduleWeek.getMondayLessonNames()[1]);
        }
        if (configuredScheduleWeekNotNullConditions[1]) {
            weekdayTeachers[1] = configuredScheduleWeek.getMondayTeachers()[1];
            teacherButtons[1].setText(configuredScheduleWeek.getMondayTeachers()[1]);
        }
        if (configuredScheduleWeekNotNullConditions[2]) {
            weekdayRooms[1] = configuredScheduleWeek.getMondayRooms()[1];
            roomButtons[1].setText(configuredScheduleWeek.getMondayRooms()[1]);
        }
        if (configuredScheduleWeekNotNullConditions[3]) {
            weekdayPeriods[1] = configuredScheduleWeek.getMondayPeriods()[1];
            periodsButtons[1].setText(configuredScheduleWeek.getMondayPeriods()[1]);
        }
        if (configuredScheduleWeekNotNullConditions[0]) {
            weekdayLessonNames[2] = configuredScheduleWeek.getMondayLessonNames()[2];
            lessonNameButtons[2].setText(configuredScheduleWeek.getMondayLessonNames()[2]);
        }
        if (configuredScheduleWeekNotNullConditions[1]) {
            weekdayTeachers[2] = configuredScheduleWeek.getMondayTeachers()[2];
            teacherButtons[2].setText(configuredScheduleWeek.getMondayTeachers()[2]);
        }
        if (configuredScheduleWeekNotNullConditions[2]) {
            weekdayRooms[2] = configuredScheduleWeek.getMondayRooms()[2];
            roomButtons[2].setText(configuredScheduleWeek.getMondayRooms()[2]);
        }
        if (configuredScheduleWeekNotNullConditions[3]) {
            weekdayPeriods[2] = configuredScheduleWeek.getMondayPeriods()[2];
            periodsButtons[2].setText(configuredScheduleWeek.getMondayPeriods()[2]);
        }
        if (configuredScheduleWeekNotNullConditions[0]) {
            weekdayLessonNames[3] = configuredScheduleWeek.getMondayLessonNames()[3];
            lessonNameButtons[3].setText(configuredScheduleWeek.getMondayLessonNames()[3]);
        }
        if (configuredScheduleWeekNotNullConditions[1]) {
            weekdayTeachers[3] = configuredScheduleWeek.getMondayTeachers()[3];
            teacherButtons[3].setText(configuredScheduleWeek.getMondayTeachers()[3]);
        }
        if (configuredScheduleWeekNotNullConditions[2]) {
            weekdayRooms[3] = configuredScheduleWeek.getMondayRooms()[3];
            roomButtons[3].setText(configuredScheduleWeek.getMondayRooms()[3]);
        }
        if (configuredScheduleWeekNotNullConditions[3]) {
            weekdayPeriods[3] = configuredScheduleWeek.getMondayPeriods()[3];
            periodsButtons[3].setText(configuredScheduleWeek.getMondayPeriods()[3]);
        }
        if (configuredScheduleWeekNotNullConditions[0]) {
            weekdayLessonNames[4] = configuredScheduleWeek.getMondayLessonNames()[4];
            lessonNameButtons[4].setText(configuredScheduleWeek.getMondayLessonNames()[4]);
        }
        if (configuredScheduleWeekNotNullConditions[1]) {
            weekdayTeachers[4] = configuredScheduleWeek.getMondayTeachers()[4];
            teacherButtons[4].setText(configuredScheduleWeek.getMondayTeachers()[4]);
        }
        if (configuredScheduleWeekNotNullConditions[2]) {
            weekdayRooms[4] = configuredScheduleWeek.getMondayRooms()[4];
            roomButtons[4].setText(configuredScheduleWeek.getMondayRooms()[4]);
        }
        if (configuredScheduleWeekNotNullConditions[3]) {
            weekdayPeriods[4] = configuredScheduleWeek.getMondayPeriods()[4];
            periodsButtons[4].setText(configuredScheduleWeek.getMondayPeriods()[4]);
        }
        if (configuredScheduleWeekNotNullConditions[0]) {
            weekdayLessonNames[5] = configuredScheduleWeek.getMondayLessonNames()[5];
            lessonNameButtons[5].setText(configuredScheduleWeek.getMondayLessonNames()[5]);
        }
        if (configuredScheduleWeekNotNullConditions[1]) {
            weekdayTeachers[5] = configuredScheduleWeek.getMondayTeachers()[5];
            teacherButtons[5].setText(configuredScheduleWeek.getMondayTeachers()[5]);
        }
        if (configuredScheduleWeekNotNullConditions[2]) {
            weekdayRooms[5] = configuredScheduleWeek.getMondayRooms()[5];
            roomButtons[5].setText(configuredScheduleWeek.getMondayRooms()[5]);
        }
        if (configuredScheduleWeekNotNullConditions[3]) {
            weekdayPeriods[5] = configuredScheduleWeek.getMondayPeriods()[5];
            periodsButtons[5].setText(configuredScheduleWeek.getMondayPeriods()[5]);
        }
        if (configuredScheduleWeekNotNullConditions[0]) {
            weekdayLessonNames[6] = configuredScheduleWeek.getMondayLessonNames()[6];
            lessonNameButtons[6].setText(configuredScheduleWeek.getMondayLessonNames()[6]);
        }
        if (configuredScheduleWeekNotNullConditions[1]) {
            weekdayTeachers[6] = configuredScheduleWeek.getMondayTeachers()[6];
            teacherButtons[6].setText(configuredScheduleWeek.getMondayTeachers()[6]);
        }
        if (configuredScheduleWeekNotNullConditions[2]) {
            weekdayRooms[6] = configuredScheduleWeek.getMondayRooms()[6];
            roomButtons[6].setText(configuredScheduleWeek.getMondayRooms()[6]);
        }
        if (configuredScheduleWeekNotNullConditions[3]) {
            weekdayPeriods[6] = configuredScheduleWeek.getMondayPeriods()[6];
            periodsButtons[6].setText(configuredScheduleWeek.getMondayPeriods()[6]);
        }
        if (configuredScheduleWeekNotNullConditions[0]) {
            weekdayLessonNames[7] = configuredScheduleWeek.getMondayLessonNames()[7];
            lessonNameButtons[7].setText(configuredScheduleWeek.getMondayLessonNames()[7]);
        }
        if (configuredScheduleWeekNotNullConditions[1]) {
            weekdayTeachers[7] = configuredScheduleWeek.getMondayTeachers()[7];
            teacherButtons[7].setText(configuredScheduleWeek.getMondayTeachers()[7]);
        }
        if (configuredScheduleWeekNotNullConditions[2]) {
            weekdayRooms[7] = configuredScheduleWeek.getMondayRooms()[7];
            roomButtons[7].setText(configuredScheduleWeek.getMondayRooms()[7]);
        }
        if (configuredScheduleWeekNotNullConditions[3]) {
            weekdayPeriods[7] = configuredScheduleWeek.getMondayPeriods()[7];
            periodsButtons[7].setText(configuredScheduleWeek.getMondayPeriods()[7]);
        }
        if (configuredScheduleWeekNotNullConditions[0]) {
            weekdayLessonNames[8] = configuredScheduleWeek.getMondayLessonNames()[8];
            lessonNameButtons[8].setText(configuredScheduleWeek.getMondayLessonNames()[8]);
        }
        if (configuredScheduleWeekNotNullConditions[1]) {
            weekdayTeachers[8] = configuredScheduleWeek.getMondayTeachers()[8];
            teacherButtons[8].setText(configuredScheduleWeek.getMondayTeachers()[8]);
        }
        if (configuredScheduleWeekNotNullConditions[2]) {
            weekdayRooms[8] = configuredScheduleWeek.getMondayRooms()[8];
            roomButtons[8].setText(configuredScheduleWeek.getMondayRooms()[8]);
        }
        if (configuredScheduleWeekNotNullConditions[3]) {
            weekdayPeriods[8] = configuredScheduleWeek.getMondayPeriods()[8];
            periodsButtons[8].setText(configuredScheduleWeek.getMondayPeriods()[8]);
        }
        if (configuredScheduleWeekNotNullConditions[0]) {
            weekdayLessonNames[9] = configuredScheduleWeek.getMondayLessonNames()[9];
            lessonNameButtons[9].setText(configuredScheduleWeek.getMondayLessonNames()[9]);
        }
        if (configuredScheduleWeekNotNullConditions[1]) {
            weekdayTeachers[9] = configuredScheduleWeek.getMondayTeachers()[9];
            teacherButtons[9].setText(configuredScheduleWeek.getMondayTeachers()[9]);
        }
        if (configuredScheduleWeekNotNullConditions[2]) {
            weekdayRooms[9] = configuredScheduleWeek.getMondayRooms()[9];
            roomButtons[9].setText(configuredScheduleWeek.getMondayRooms()[9]);
        }
        if (configuredScheduleWeekNotNullConditions[3]) {
            weekdayPeriods[9] = configuredScheduleWeek.getMondayPeriods()[9];
            periodsButtons[9].setText(configuredScheduleWeek.getMondayPeriods()[9]);
        }
    }

    static Intent onWeekdayButtonsClick(View v, Context c, int[] buttonIDs) {
        Intent weekdayLessonNameIntent = new Intent(c, ChooseLesson.class);
        Intent weekdayTeacherIntent = new Intent(c, ChooseTeacher.class);
        Intent weekdayRoomIntent = new Intent(c, ChooseRoom.class);
        Intent weekdayPeriodIntent = new Intent(c, ChoosePeriod.class);
        int id = v.getId();

        if (id == buttonIDs[0]) {
            return weekdayLessonNameIntent.putExtra(REQUEST_CODE, 10);
        } else if (id == buttonIDs[1]) {
            return weekdayLessonNameIntent.putExtra(REQUEST_CODE, 11);
        } else if (id == buttonIDs[2]) {
            return weekdayLessonNameIntent.putExtra(REQUEST_CODE, 12);
        } else if (id == buttonIDs[3]) {
            return weekdayLessonNameIntent.putExtra(REQUEST_CODE, 13);
        } else if (id == buttonIDs[4]) {
            return weekdayLessonNameIntent.putExtra(REQUEST_CODE, 14);
        } else if (id == buttonIDs[5]) {
            return weekdayLessonNameIntent.putExtra(REQUEST_CODE, 15);
        } else if (id == buttonIDs[6]) {
            return weekdayLessonNameIntent.putExtra(REQUEST_CODE, 16);
        } else if (id == buttonIDs[7]) {
            return weekdayLessonNameIntent.putExtra(REQUEST_CODE, 17);
        } else if (id == buttonIDs[8]) {
            return weekdayLessonNameIntent.putExtra(REQUEST_CODE, 18);
        } else if (id == buttonIDs[9]) {
            return weekdayLessonNameIntent.putExtra(REQUEST_CODE, 19);
        } else if (id == buttonIDs[10]) {
            return weekdayTeacherIntent.putExtra(REQUEST_CODE, 20);
        } else if (id == buttonIDs[11]) {
            return weekdayTeacherIntent.putExtra(REQUEST_CODE, 21);
        } else if (id == buttonIDs[12]) {
            return weekdayTeacherIntent.putExtra(REQUEST_CODE, 22);
        } else if (id == buttonIDs[13]) {
            return weekdayTeacherIntent.putExtra(REQUEST_CODE, 23);
        } else if (id == buttonIDs[14]) {
            return weekdayTeacherIntent.putExtra(REQUEST_CODE, 24);
        } else if (id == buttonIDs[15]) {
            return weekdayTeacherIntent.putExtra(REQUEST_CODE, 25);
        } else if (id == buttonIDs[16]) {
            return weekdayTeacherIntent.putExtra(REQUEST_CODE, 26);
        } else if (id == buttonIDs[17]) {
            return weekdayTeacherIntent.putExtra(REQUEST_CODE, 27);
        } else if (id == buttonIDs[18]) {
            return weekdayTeacherIntent.putExtra(REQUEST_CODE, 28);
        } else if (id == buttonIDs[19]) {
            return weekdayTeacherIntent.putExtra(REQUEST_CODE, 29);
        } else if (id == buttonIDs[20]) {
            return weekdayRoomIntent.putExtra(REQUEST_CODE, 30);
        } else if (id == buttonIDs[21]) {
            return weekdayRoomIntent.putExtra(REQUEST_CODE, 31);
        } else if (id == buttonIDs[22]) {
            return weekdayRoomIntent.putExtra(REQUEST_CODE, 32);
        } else if (id == buttonIDs[23]) {
            return weekdayRoomIntent.putExtra(REQUEST_CODE, 33);
        } else if (id == buttonIDs[24]) {
            return weekdayRoomIntent.putExtra(REQUEST_CODE, 34);
        } else if (id == buttonIDs[25]) {
            return weekdayRoomIntent.putExtra(REQUEST_CODE, 35);
        } else if (id == buttonIDs[26]) {
            return weekdayRoomIntent.putExtra(REQUEST_CODE, 36);
        } else if (id == buttonIDs[27]) {
            return weekdayRoomIntent.putExtra(REQUEST_CODE, 37);
        } else if (id == buttonIDs[28]) {
            return weekdayRoomIntent.putExtra(REQUEST_CODE, 38);
        } else if (id == buttonIDs[29]) {
            return weekdayRoomIntent.putExtra(REQUEST_CODE, 39);
        } else if (id == buttonIDs[30]) {
            return weekdayPeriodIntent.putExtra(REQUEST_CODE, 40);
        } else if (id == buttonIDs[31]) {
            return weekdayPeriodIntent.putExtra(REQUEST_CODE, 41);
        } else if (id == buttonIDs[32]) {
            return weekdayPeriodIntent.putExtra(REQUEST_CODE, 42);
        } else if (id == buttonIDs[33]) {
            return weekdayPeriodIntent.putExtra(REQUEST_CODE, 43);
        } else if (id == buttonIDs[34]) {
            return weekdayPeriodIntent.putExtra(REQUEST_CODE, 44);
        } else if (id == buttonIDs[35]) {
            return weekdayPeriodIntent.putExtra(REQUEST_CODE, 45);
        } else if (id == buttonIDs[36]) {
            return weekdayPeriodIntent.putExtra(REQUEST_CODE, 46);
        } else if (id == buttonIDs[37]) {
            return weekdayPeriodIntent.putExtra(REQUEST_CODE, 47);
        } else if (id == buttonIDs[38]) {
            return weekdayPeriodIntent.putExtra(REQUEST_CODE, 48);
        } else if (id == buttonIDs[39]) {
            return weekdayPeriodIntent.putExtra(REQUEST_CODE, 49);
        } else if (id == buttonIDs[40]) {
            return new Intent().putExtra(REQUEST_CODE, 50);
        } else {
            throw new IllegalStateException("Error, you should not pass here! Button IDs out of bound");
        }
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
