package com.example.HAStundenplanApp;

import java.util.BitSet;

/**
 * Created by Jason on 08.07.2016.
 */
public interface Weekdays {
    enum Weekday {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
    BitSet getWeekdays();
    void setWeekdays(boolean MONDAY, boolean TUESDAY, boolean WEDNESDAY, boolean THURSDAY, boolean FRIDAY, boolean SATURDAY, boolean SUNDAY);
}
