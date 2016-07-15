package com.example.HAStundenplanApp;

import android.util.Pair;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public class ImplConfiguration implements Configuration {
    private List<String> lessonNames = new ArrayList<>();
    private List<String> teacherNames = new ArrayList<>();
    private List<String> rooms = new ArrayList<>();
    private int lessonDurationInMinutes = 0;
    private List<Pair<String,Integer>> breaks = new ArrayList<>();
    private List<Date> dayOff = new ArrayList<>();
    private Date startSummerSemester = null;
    private Date endSummerSemester = null;
    private Date startWinterSemester = null;
    private Date endWinterSemester = null;
    private int startEarliestLesson = 0;

    ImplConfiguration(List<String> lessonNames, List<String> teacherNames, List<String> rooms,
                      int lessonDurationInMinutes, List<Pair<String,Integer>> breaks, List<Date> dayOff, Date startSummerSemester,
                      Date endSummerSemester, Date startWinterSemester, Date endWinterSemester, int startEarliestLesson) {
        this.lessonNames = lessonNames;
        this.teacherNames = teacherNames;
        this.rooms = rooms;
        this.lessonDurationInMinutes = lessonDurationInMinutes;
        this.breaks = breaks;
        this.dayOff = dayOff;
        this.startSummerSemester = startSummerSemester;
        this.endSummerSemester = endSummerSemester;
        this.startWinterSemester = startWinterSemester;
        this.endWinterSemester = endWinterSemester;
        this.startEarliestLesson = startEarliestLesson;
    }

    @Override
    public List<String> getLessonNames() {
        return lessonNames;
    }

    @Override
    public void setLessonNames(List<String> lessonNames) {
        this.lessonNames = lessonNames;
    }

    @Override
    public List<String> getTeacherNames() {
        return teacherNames;
    }

    @Override
    public void setTeacherNames(List<String> teacherNames) {
        this.teacherNames = teacherNames;
    }

    @Override
    public List<String> getRooms() {
        return rooms;
    }

    @Override
    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    @Override
    public int getLessonDurationInMinutes() {
        return lessonDurationInMinutes;
    }

    @Override
    public void setLessonDurationInMinutes(int lessonDurationInMinutes) {
        this.lessonDurationInMinutes = lessonDurationInMinutes;
    }

    @Override
    public List<Pair<String, Integer>> getBreaks() {
        return breaks;
    }

    @Override
    public void setBreaks(List<Pair<String, Integer>> breaks) {
        this.breaks = breaks;
    }

    @Override
    public List<Date> getDayOff() {
        return dayOff;
    }

    @Override
    public void setDayOff(List<Date> dayOff) {
        this.dayOff = dayOff;
    }

    @Override
    public Date getStartSummerSemester() {
        return startSummerSemester;
    }

    @Override
    public void setStartSummerSemester(Date startSummerSemester) {
        this.startSummerSemester = startSummerSemester;
    }

    @Override
    public Date getEndSummerSemester() {
        return endSummerSemester;
    }

    @Override
    public void setEndSummerSemester(Date endSummerSemester) {
        this.endSummerSemester = endSummerSemester;
    }

    @Override
    public Date getStartWinterSemester() {
        return startWinterSemester;
    }

    @Override
    public void setStartWinterSemester(Date startWinterSemester) {
        this.startWinterSemester = startWinterSemester;
    }

    @Override
    public Date getEndWinterSemester() {
        return endWinterSemester;
    }

    @Override
    public void setEndWinterSemester(Date endWinterSemester) {
        this.endWinterSemester = endWinterSemester;
    }

    @Override
    public int getStartEarliestLesson() {
        return startEarliestLesson;
    }

    @Override
    public void setStartEarliestLesson(int startEarliestLesson) {
        this.startEarliestLesson = startEarliestLesson;
    }
}
