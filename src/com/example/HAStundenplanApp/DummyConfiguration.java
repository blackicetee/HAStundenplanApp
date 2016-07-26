package com.example.HAStundenplanApp;

import android.util.Pair;


import java.util.*;

/**
 * Created by Thilo S. on 15.07.2016.
 */
public class DummyConfiguration {

    public Configuration getConfiguration() {
        List<String> lessonNames = new ArrayList<>(Arrays.asList("Deutsch", "Mathe", "Englisch", "Biologie", "Physik", "Wirtschaft", "Arbeit", "Technik"));
        List<String> teacherNames = new ArrayList<>(Arrays.asList("Herr Mustermann", "Frau Mustermann", "Herr Müller",
                "Frau Müller", "Herr Matze", "Frau Matze", "Herr Martin", "Frau Lauf", "Herr Läufer", "Frau König", "Frau Kaiser",
                "Herr Kaiser", "Herr Malkow", "Herr Matnow", "Frau Biso", "Frau Säufert"));
        List<String> rooms = new ArrayList<>(Arrays.asList("Turnhalle", "Cafeteria", "Raum 001 Gebäude A", "Raum 002 Gebäude A", "Raum 003 Gebäude A",
                "Raum 004 Gebäude A", "Raum 005 Gebäude A", "Raum 006 Gebäude A", "Raum 007 Gebäude A", "Raum 008 Gebäude A","Raum 009 Gebäude A",
                "Raum 010 Gebäude A", "Raum 011 Gebäude A", "Raum 012 Gebäude B", "Raum 013 Gebäude B", "Raum 014 Gebäude B", "Raum 015 Gebäude B"));
        int lessonDurationInMinutes = 45;
        List<Pair<Integer, Integer>> breaks = new ArrayList<>(Arrays.asList(
                new Pair<>(0, 15),
                new Pair<>(1, 15),
                new Pair<>(2, 30),
                new Pair<>(3, 15),
                new Pair<>(4, 15),
                new Pair<>(5, 60),
                new Pair<>(6, 15),
                new Pair<>(7, 15),
                new Pair<>(8, 30)));

        List<Date> dayOff = new ArrayList<>();
        dayOff.add(getDate(9,4,2016));
        dayOff.add(getDate(10,5,2016));
        dayOff.add(getDate(27,7,2016));
        dayOff.add(getDate(7,2,2017));
        dayOff.add(getDate(8,3,2017));

        int summerOrWinterSemester = 1;

        Date startSummerSemester = getDate(1,4,2016);
        Date endSummerSemester = getDate(30,9,2016);
        Date startWinterSemester = getDate(1,10,2016);
        Date endWinterSemester = getDate(31,3,2017);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 6);
        cal.set(Calendar.MINUTE, 0);
        Date startEarliestLesson = cal.getTime();


        return new ImplConfiguration(lessonNames, teacherNames, rooms, lessonDurationInMinutes, breaks, dayOff, summerOrWinterSemester,
                startSummerSemester, endSummerSemester, startWinterSemester, endWinterSemester, startEarliestLesson);
    }

    private Date getDate(int day, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, (month - 1), day);
        return cal.getTime();
    }
}
