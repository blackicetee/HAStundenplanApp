package com.example.HAStundenplanApp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Thilo S. on 19.07.2016.
 */
public class ImplScheduleWeek implements ScheduleWeek {

    private int maxHoursADay = 10;

    private String[] mondayLessonNames = new String[maxHoursADay];
    private String[] mondayTeachers = new String[maxHoursADay];
    private String[] mondayRooms = new String[maxHoursADay];
    private String[] mondayPeriods = new String[maxHoursADay];

    private String[] tuesdayLessonNames = new String[maxHoursADay];
    private String[] tuesdayTeachers = new String[maxHoursADay];
    private String[] tuesdayRooms = new String[maxHoursADay];
    private String[] tuesdayPeriods = new String[maxHoursADay];

    private String[] wednesdayLessonNames = new String[maxHoursADay];
    private String[] wednesdayTeachers = new String[maxHoursADay];
    private String[] wednesdayRooms = new String[maxHoursADay];
    private String[] wednesdayPeriods = new String[maxHoursADay];

    private String[] thursdayLessonNames = new String[maxHoursADay];
    private String[] thursdayTeachers = new String[maxHoursADay];
    private String[] thursdayRooms = new String[maxHoursADay];
    private String[] thursdayPeriods = new String[maxHoursADay];

    private String[] fridayLessonNames = new String[maxHoursADay];
    private String[] fridayTeachers = new String[maxHoursADay];
    private String[] fridayRooms = new String[maxHoursADay];
    private String[] fridayPeriods = new String[maxHoursADay];

    ImplScheduleWeek() {

    }

    @Override
    public String[] getMondayLessonNames() {
        return mondayLessonNames;
    }

    @Override
    public void setMondayLessonNames(String[] mondayLessonNames) {
        this.mondayLessonNames = mondayLessonNames;
    }

    @Override
    public String[] getMondayTeachers() {
        return mondayTeachers;
    }

    @Override
    public void setMondayTeachers(String[] mondayTeachers) {
        this.mondayTeachers = mondayTeachers;
    }

    @Override
    public String[] getMondayRooms() {
        return mondayRooms;
    }

    @Override
    public void setMondayRooms(String[] mondayRooms) {
        this.mondayRooms = mondayRooms;
    }

    @Override
    public String[] getMondayPeriod() {
        return mondayPeriods;
    }

    @Override
    public void setMondayPeriod(String[] mondayPeriods) {
        this.mondayPeriods = mondayPeriods;
    }

    @Override
    public String[] getTuesdayLessonNames() {
        return tuesdayLessonNames;
    }

    @Override
    public void setTuesdayLessonNames(String[] tuesdayLessonNames) {
        this.tuesdayLessonNames = tuesdayLessonNames;
    }

    @Override
    public String[] getTuesdayTeachers() {
        return tuesdayTeachers;
    }

    @Override
    public void setTuesdayTeachers(String[] tuesdayTeachers) {
        this.tuesdayTeachers = tuesdayTeachers;
    }

    @Override
    public String[] getTuesdayRooms() {
        return tuesdayRooms;
    }

    @Override
    public void setTuesdayRooms(String[] tuesdayRooms) {
        this.tuesdayRooms = tuesdayRooms;
    }

    @Override
    public String[] getTuesdayPeriod() {
        return tuesdayPeriods;
    }

    @Override
    public void setTuesdayPeriod(String[] tuesdayPeriods) {
        this.tuesdayPeriods = tuesdayPeriods;
    }

    @Override
    public String[] getWednesdayLessonNames() {
        return wednesdayLessonNames;
    }

    @Override
    public void setWednesdayLessonNames(String[] wednesdayLessonNames) {
        this.wednesdayLessonNames = wednesdayLessonNames;
    }

    @Override
    public String[] getWednesdayTeachers() {
        return wednesdayTeachers;
    }

    @Override
    public void setWednesdayTeachers(String[] wednesdayTeachers) {
        this.wednesdayTeachers = wednesdayTeachers;
    }

    @Override
    public String[] getWednesdayRooms() {
        return wednesdayRooms;
    }

    @Override
    public void setWednesdayRooms(String[] wednesdayRooms) {
        this.wednesdayRooms = wednesdayRooms;
    }

    @Override
    public String[] getWednesdayPeriod() {
        return wednesdayPeriods;
    }

    @Override
    public void setWednesdayPeriod(String[] wednesdayPeriods) {
        this.wednesdayPeriods = wednesdayPeriods;
    }

    @Override
    public String[] getThursdayLessonNames() {
        return thursdayLessonNames;
    }

    @Override
    public void setThursdayLessonNames(String[] thursdayLessonNames) {
        this.thursdayLessonNames = thursdayLessonNames;
    }

    @Override
    public String[] getThursdayTeachers() {
        return thursdayTeachers;
    }

    @Override
    public void setThursdayTeachers(String[] thursdayTeachers) {
        this.thursdayTeachers = thursdayTeachers;
    }

    @Override
    public String[] getThursdayRooms() {
        return thursdayRooms;
    }

    @Override
    public void setThursdayRooms(String[] thursdayRooms) {
        this.thursdayRooms = thursdayRooms;
    }

    @Override
    public String[] getThursdayPeriod() {
        return thursdayPeriods;
    }

    @Override
    public void setThursdayPeriod(String[] thursdayPeriods) {
        this.thursdayPeriods = thursdayPeriods;
    }

    @Override
    public String[] getFridayLessonNames() {
        return fridayLessonNames;
    }

    @Override
    public void setFridayLessonNames(String[] fridayLessonNames) {
        this.fridayLessonNames = fridayLessonNames;
    }

    @Override
    public String[] getFridayTeachers() {
        return fridayTeachers;
    }

    @Override
    public void setFridayTeachers(String[] fridayTeachers) {
        this.fridayTeachers = fridayTeachers;
    }

    @Override
    public String[] getFridayRooms() {
        return fridayRooms;
    }

    @Override
    public void setFridayRooms(String[] fridayRooms) {
        this.fridayRooms = fridayRooms;
    }

    @Override
    public String[] getFridayPeriod() {
        return fridayPeriods;
    }

    @Override
    public void setFridayPeriod(String[] fridayPeriods) {
        this.fridayPeriods = fridayPeriods;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // write your object's data to the passed-in Parcel
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(mondayLessonNames);
        dest.writeStringArray(mondayTeachers);
        dest.writeStringArray(mondayRooms);
        dest.writeStringArray(mondayPeriods);

        dest.writeStringArray(tuesdayLessonNames);
        dest.writeStringArray(tuesdayTeachers);
        dest.writeStringArray(tuesdayRooms);
        dest.writeStringArray(tuesdayPeriods);

        dest.writeStringArray(wednesdayLessonNames);
        dest.writeStringArray(wednesdayTeachers);
        dest.writeStringArray(wednesdayRooms);
        dest.writeStringArray(wednesdayPeriods);

        dest.writeStringArray(thursdayLessonNames);
        dest.writeStringArray(thursdayTeachers);
        dest.writeStringArray(thursdayRooms);
        dest.writeStringArray(thursdayPeriods);

        dest.writeStringArray(fridayLessonNames);
        dest.writeStringArray(fridayTeachers);
        dest.writeStringArray(fridayRooms);
        dest.writeStringArray(fridayPeriods);
    }

    // this is used to regenerate your object. All Parcelables must have a CREATOR that implements these two methods
    public static final Parcelable.Creator<ScheduleWeek> CREATOR = new Parcelable.Creator<ScheduleWeek>() {
        public ImplScheduleWeek createFromParcel(Parcel in) {
            return new ImplScheduleWeek(in);
        }

        public ImplScheduleWeek[] newArray(int size) {
            return new ImplScheduleWeek[size];
        }
    };

    // example constructor that takes a Parcel and gives you an object populated with it's values
    private ImplScheduleWeek(Parcel in) {
        in.readStringArray(mondayLessonNames);
        in.readStringArray(mondayTeachers);
        in.readStringArray(mondayRooms);
        in.readStringArray(mondayPeriods);

        in.readStringArray(tuesdayLessonNames);
        in.readStringArray(tuesdayTeachers);
        in.readStringArray(tuesdayRooms);
        in.readStringArray(tuesdayPeriods);

        in.readStringArray(wednesdayLessonNames);
        in.readStringArray(wednesdayTeachers);
        in.readStringArray(wednesdayRooms);
        in.readStringArray(wednesdayPeriods);

        in.readStringArray(thursdayLessonNames);
        in.readStringArray(thursdayTeachers);
        in.readStringArray(thursdayRooms);
        in.readStringArray(thursdayPeriods);

        in.readStringArray(fridayLessonNames);
        in.readStringArray(fridayTeachers);
        in.readStringArray(fridayRooms);
        in.readStringArray(fridayPeriods);
    }
}
