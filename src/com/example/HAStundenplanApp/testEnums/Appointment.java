package com.example.HAStundenplanApp.testEnums;

import java.util.Date;

/**
 * Created by Jason on 08.07.2016.
 */
public interface Appointment {
    Weekdays getWeekdays();
    //boolean MONDAY, boolean TUESDAY, boolean WEDNESDAY, boolean THURSDAY, boolean FRIDAY, boolean SATURDAY, boolean SUNDAY
    void setWeekdays(Weekdays weekdays);
    Date getStartTime();
    void setStartTime(Date startTime);
    int getDuration();
    void setDuration(int duration);
    int getPeriod();
    void setPeriod(int period);
}
