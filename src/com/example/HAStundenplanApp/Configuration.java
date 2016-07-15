package com.example.HAStundenplanApp;

import android.util.Pair;

import java.util.Date;
import java.util.List;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public interface Configuration {

    List<String> getLessonNames();
    void setLessonNames(List<String> lessonNames);

    List<String> getTeacherNames();
    void setTeacherNames(List<String> teacherNames);

    List<String> getRooms();
    void setRooms(List<String> rooms);

    int getLessonDurationInMinutes();
    void setLessonDurationInMinutes(int lessonDurationInMinutes);

    List<Pair<String, Integer>> getBreaks();
    void setBreaks(List<Pair<String, Integer>> breaks);

    List<Date> getDayOff();
    void setDayOff(List<Date> dayOff);

    Date getStartSummerSemester();
    void setStartSummerSemester(Date startSummerSemester);

    Date getEndSummerSemester();
    void setEndSummerSemester(Date endSummerSemester);

    Date getStartWinterSemester();
    void setStartWinterSemester(Date startWinterSemester);

    Date getEndWinterSemester();
    void setEndWinterSemester(Date endWinterSemester);

    int getStartEarliestLesson();
    void setStartEarliestLesson(int startEarliestLesson);
}
