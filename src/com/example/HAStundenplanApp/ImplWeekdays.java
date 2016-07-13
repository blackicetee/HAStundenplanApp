package com.example.HAStundenplanApp;


import java.util.*;

/**
 * Created by Thilo on 06.07.2016.
 */
public class ImplWeekdays implements Weekdays {
    //Member variables
    private BitSet weekday = new BitSet(7);

    public static void main(String[] args) {
        new ImplWeekdays(true,false,true,false,true,true,true).printBitSet();
    }

    ImplWeekdays(boolean MONDAY, boolean TUESDAY, boolean WEDNESDAY, boolean THURSDAY, boolean FRIDAY, boolean SATURDAY, boolean SUNDAY) {
        weekday.clear();
        if (MONDAY) weekday.set(0);
        if (TUESDAY) weekday.set(1);
        if (WEDNESDAY)weekday.set(2);
        if (THURSDAY) weekday.set(3);
        if (FRIDAY) weekday.set(4);
        if (SATURDAY) weekday.set(5);
        if (SUNDAY) weekday.set(6);
    }
    public BitSet getWeekdays() {
        return weekday;
    }

    public void setWeekdays(boolean MONDAY, boolean TUESDAY, boolean WEDNESDAY, boolean THURSDAY, boolean FRIDAY, boolean SATURDAY, boolean SUNDAY) {
        weekday.clear();
        if (MONDAY) weekday.set(0);
        if (TUESDAY) weekday.set(1);
        if (WEDNESDAY)weekday.set(2);
        if (THURSDAY) weekday.set(3);
        if (FRIDAY) weekday.set(4);
        if (SATURDAY) weekday.set(5);
        if (SUNDAY) weekday.set(6);
    }
    private void printBitSet() {
        if (weekday.get(0)) System.out.println(Weekday.MONDAY.toString());
        if (weekday.get(1)) System.out.println(Weekday.TUESDAY.toString());
        if (weekday.get(2)) System.out.println(Weekday.WEDNESDAY.toString());
        if (weekday.get(3)) System.out.println(Weekday.THURSDAY.toString());
        if (weekday.get(4)) System.out.println(Weekday.FRIDAY.toString());
        if (weekday.get(5)) System.out.println(Weekday.SATURDAY.toString());
        if (weekday.get(6)) System.out.println(Weekday.SUNDAY.toString());
    }
}
