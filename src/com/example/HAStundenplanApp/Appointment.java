package com.example.HAStundenplanApp;

import java.util.Date;

/**
 * Created by Thilo on 08.07.2016.
 */
public interface Appointment {
    ImplWeekdays getWeekdays();
    //boolean MONDAY, boolean TUESDAY, boolean WEDNESDAY, boolean THURSDAY, boolean FRIDAY, boolean SATURDAY, boolean SUNDAY
    void setWeekdays(ImplWeekdays weekdays);
    Date getStartTime();
    void setStartTime(Date startTime);
    int getDuration();
    void setDuration(int duration);
    int getPeriod();
    void setPeriod(int period);
}
