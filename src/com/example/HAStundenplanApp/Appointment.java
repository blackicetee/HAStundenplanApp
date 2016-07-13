package com.example.HAStundenplanApp;

import java.util.Date;

/**
 * Created by Thilo on 08.07.2016.
 */
public interface Appointment {
    Weekday getWeekday();
    void setWeekday(Weekday weekday);
    Date getStartTime();
    void setStartTime(Date startTime);
    int getDuration();
    void setDuration(int duration);
    int getPeriod();
    void setPeriod(int period);
}
