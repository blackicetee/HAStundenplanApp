package com.example.HAStundenplanApp;

import android.os.Parcel;
import android.os.Parcelable;
import net.sharksystem.sharknet.api.ScheduleWeek;

/**
 * Created by Thilo S. on 19.07.2016.
 */
public class ImplScheduleWeek implements ScheduleWeek, Parcelable {

    private String[] mondayLessonNames = null;
    private String[] mondayTeachers = null;
    private String[] mondayRooms = null;
    private String[] mondayPeriods = null;

    private String[] tuesdayLessonNames = null;
    private String[] tuesdayTeachers = null;
    private String[] tuesdayRooms = null;
    private String[] tuesdayPeriods = null;

    private String[] wednesdayLessonNames = null;
    private String[] wednesdayTeachers = null;
    private String[] wednesdayRooms = null;
    private String[] wednesdayPeriods = null;

    private String[] thursdayLessonNames = null;
    private String[] thursdayTeachers = null;
    private String[] thursdayRooms = null;
    private String[] thursdayPeriods = null;

    private String[] fridayLessonNames = null;
    private String[] fridayTeachers = null;
    private String[] fridayRooms = null;
    private String[] fridayPeriods = null;

    public ImplScheduleWeek() {

    }

    //This constructor is used when the ScheduleWeekObj needs to be passed through an activity
    public ImplScheduleWeek(ScheduleWeek configuredScheduleWeek) {
        if (configuredScheduleWeek.getMondayLessonNames() != null) {
            mondayLessonNames = configuredScheduleWeek.getMondayLessonNames();
        }
        if (configuredScheduleWeek.getMondayTeachers() != null) {
            mondayTeachers = configuredScheduleWeek.getMondayTeachers();
        }
        if (configuredScheduleWeek.getMondayRooms() != null) {
            mondayRooms = configuredScheduleWeek.getMondayRooms();
        }
        if (configuredScheduleWeek.getMondayPeriods() != null) {
            mondayPeriods = configuredScheduleWeek.getMondayPeriods();
        }
        if (configuredScheduleWeek.getTuesdayLessonNames() != null) {
            tuesdayLessonNames = configuredScheduleWeek.getTuesdayLessonNames();
        }
        if (configuredScheduleWeek.getTuesdayTeachers() != null) {
            tuesdayTeachers = configuredScheduleWeek.getTuesdayTeachers();
        }
        if (configuredScheduleWeek.getTuesdayRooms() != null) {
            tuesdayRooms = configuredScheduleWeek.getTuesdayRooms();
        }
        if (configuredScheduleWeek.getTuesdayPeriods() != null) {
            tuesdayPeriods = configuredScheduleWeek.getTuesdayPeriods();
        }
        if (configuredScheduleWeek.getWednesdayLessonNames() != null) {
            wednesdayLessonNames = configuredScheduleWeek.getWednesdayLessonNames();
        }
        if (configuredScheduleWeek.getWednesdayTeachers() != null) {
            wednesdayTeachers = configuredScheduleWeek.getWednesdayTeachers();
        }
        if (configuredScheduleWeek.getWednesdayRooms() != null) {
            wednesdayRooms = configuredScheduleWeek.getWednesdayRooms();
        }
        if (configuredScheduleWeek.getWednesdayPeriods() != null) {
            wednesdayPeriods = configuredScheduleWeek.getWednesdayPeriods();
        }
        if (configuredScheduleWeek.getThursdayLessonNames() != null) {
            thursdayLessonNames = configuredScheduleWeek.getThursdayLessonNames();
        }
        if (configuredScheduleWeek.getThursdayTeachers() != null) {
            thursdayTeachers = configuredScheduleWeek.getThursdayTeachers();
        }
        if (configuredScheduleWeek.getThursdayRooms() != null) {
            thursdayRooms = configuredScheduleWeek.getThursdayRooms();
        }
        if (configuredScheduleWeek.getThursdayPeriods() != null) {
            thursdayPeriods = configuredScheduleWeek.getThursdayPeriods();
        }
        if (configuredScheduleWeek.getFridayLessonNames() != null) {
            fridayLessonNames = configuredScheduleWeek.getFridayLessonNames();
        }
        if (configuredScheduleWeek.getFridayTeachers() != null) {
            fridayTeachers = configuredScheduleWeek.getFridayTeachers();
        }
        if (configuredScheduleWeek.getFridayRooms() != null) {
            fridayRooms = configuredScheduleWeek.getFridayRooms();
        }
        if (configuredScheduleWeek.getFridayPeriods() != null) {
            fridayPeriods = configuredScheduleWeek.getFridayPeriods();
        }
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
    public String[] getMondayPeriods() {
        return mondayPeriods;
    }

    @Override
    public void setMondayPeriods(String[] mondayPeriods) {
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
    public String[] getTuesdayPeriods() {
        return tuesdayPeriods;
    }

    @Override
    public void setTuesdayPeriods(String[] tuesdayPeriods) {
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
    public String[] getWednesdayPeriods() {
        return wednesdayPeriods;
    }

    @Override
    public void setWednesdayPeriods(String[] wednesdayPeriods) {
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
    public String[] getThursdayPeriods() {
        return thursdayPeriods;
    }

    @Override
    public void setThursdayPeriods(String[] thursdayPeriods) {
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
    public String[] getFridayPeriods() {
        return fridayPeriods;
    }

    @Override
    public void setFridayPeriods(String[] fridayPeriods) {
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
    public static final Parcelable.Creator<ImplScheduleWeek> CREATOR = new Parcelable.Creator<ImplScheduleWeek>() {
        public ImplScheduleWeek createFromParcel(Parcel in) {
            return new ImplScheduleWeek(in);
        }

        public ImplScheduleWeek[] newArray(int size) {
            return new ImplScheduleWeek[size];
        }
    };

    // example constructor that takes a Parcel and gives you an object populated with it's values
    public ImplScheduleWeek(Parcel in) {
        mondayLessonNames = in.createStringArray();
        mondayTeachers = in.createStringArray();
        mondayRooms = in.createStringArray();
        mondayPeriods = in.createStringArray();


        tuesdayLessonNames = in.createStringArray();
        tuesdayTeachers = in.createStringArray();
        tuesdayRooms = in.createStringArray();
        tuesdayPeriods = in.createStringArray();

        wednesdayLessonNames = in.createStringArray();
        wednesdayTeachers = in.createStringArray();
        wednesdayRooms = in.createStringArray();
        wednesdayPeriods = in.createStringArray();

        thursdayLessonNames = in.createStringArray();
        thursdayTeachers = in.createStringArray();
        thursdayRooms = in.createStringArray();
        thursdayPeriods = in.createStringArray();

        fridayLessonNames = in.createStringArray();
        fridayTeachers = in.createStringArray();
        fridayRooms = in.createStringArray();
        fridayPeriods = in.createStringArray();
    }
}
