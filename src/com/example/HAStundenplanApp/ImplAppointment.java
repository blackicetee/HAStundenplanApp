package com.example.HAStundenplanApp;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Thilo on 08.07.2016.
 */

//How to use Date code example

/**
 *
 Calendar start = Calendar.getInstance();
 Calendar end = Calendar.getInstance();
 start.set(Calendar.HOUR_OF_DAY,8);
 start.set(Calendar.MINUTE,0);
 start.set(Calendar.SECOND,0);
 start.set(2016, 7, 23);
 end.set(2016, 8, 26);
 Date startDate = start.getTime();
 Date endDate = end.getTime();
 Calendar cal = Calendar.getInstance();
 cal.setTime(startDate);
 System.out.println("uhrzeit: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));
 System.out.println(startDate.toString());
 long startTime = startDate.getTime();
 long endTime = endDate.getTime();
 long diffTime = endTime - startTime;
 long diffDays = diffTime / (1000 * 60 * 60 * 24);
 DateFormat dateFormat = DateFormat.getDateInstance();
 System.out.println("The difference between "+
 dateFormat.format(startDate)+" and "+
 dateFormat.format(endDate)+" is "+
 diffDays+" days.");
 */
public class ImplAppointment implements Appointment {
/**
    public static void digital_schedule_main(String[] args) {
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        start.set(Calendar.HOUR_OF_DAY,8);
        start.set(Calendar.MINUTE,0);
        start.set(Calendar.SECOND,0);
        start.set(2016, 7, 23);
        end.set(2016, 8, 26);
        Date startDate = start.getTime();
        long timeAsString = startDate.getTime();
        Date newDate = new Date(timeAsString);
        Date endDate = end.getTime();
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        System.out.println("date:" + newDate.toString());
        System.out.println("uhrzeit: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));
    }*/

    //Weekday where the Appointment takes place
    private Weekday weekday = null;
    //start time of a lesson: Math starts at 08:00
    private Date startTime = null;
    //Duration of a lesson: Math lasts 90 minutes
    private int duration = 0;
    //period of a lesson: 0 = unique Appointment like sports meeting, 1 = occurs every week, 2 = occurs every 2 weeks, 4 occurs one time in a month
    private int period = 1;

    public ImplAppointment(Weekday weekday, Date startTime, int duration, int period) {
        this.weekday = weekday;
        this.startTime = startTime;
        this.duration = duration;
        this.period = period;
    }

    @Override
    public Weekday getWeekday() {
        return weekday;
    }

    @Override
    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }

    @Override
    public Date getStartTime() {
        return startTime;
    }

    @Override
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int getPeriod() {
        return period;
    }

    @Override
    public void setPeriod(int period) {
        this.period = period;
    }
}
