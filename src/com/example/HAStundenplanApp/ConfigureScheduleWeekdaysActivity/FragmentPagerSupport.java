package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.example.HAStundenplanApp.*;
import com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity.ConfigureMondayActivity;
import com.example.HAStundenplanApp.ImplScheduleWeek;
import com.example.HAStundenplanApp.com.example.android.customchoicelist.Cheeses;

import java.util.Calendar;

/**
 * Created by Thilo S. on 22.07.2016.
 */
public class FragmentPagerSupport extends FragmentActivity implements OnScheduleWeekPass {
    static final int NUM_ITEMS = 5;
    private ScheduleWeek configuredScheduleWeek = new ImplScheduleWeek();


    MyAdapter mAdapter;

    ViewPager mPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_pager);

        mAdapter = new MyAdapter(getSupportFragmentManager());

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        // Watch for button clicks.
        Button button = (Button) findViewById(R.id.goto_first);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPager.setCurrentItem(0);
            }
        });
        button = (Button) findViewById(R.id.goto_last);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPager.setCurrentItem(NUM_ITEMS - 1);
            }
        });

        //TODO Initiate configureScheduleWeek with getIntent(...) from MainActivity
        configuredScheduleWeek.setMondayLessonNames(new String[]{"Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach"});
        configuredScheduleWeek.setTuesdayLessonNames(new String[]{"Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach"});
        configuredScheduleWeek.setWednesdayLessonNames(new String[]{"Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach"});
        configuredScheduleWeek.setThursdayLessonNames(new String[]{"Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach"});
        configuredScheduleWeek.setFridayLessonNames(new String[]{"Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach", "Fach"});

        configuredScheduleWeek.setMondayTeachers(new String[]{"Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer"});
        configuredScheduleWeek.setTuesdayTeachers(new String[]{"Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer"});
        configuredScheduleWeek.setWednesdayTeachers(new String[]{"Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer"});
        configuredScheduleWeek.setThursdayTeachers(new String[]{"Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer"});
        configuredScheduleWeek.setFridayTeachers(new String[]{"Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer", "Lehrer"});

        configuredScheduleWeek.setMondayRooms(new String[]{"Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum"});
        configuredScheduleWeek.setTuesdayRooms(new String[]{"Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum"});
        configuredScheduleWeek.setWednesdayRooms(new String[]{"Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum"});
        configuredScheduleWeek.setThursdayRooms(new String[]{"Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum"});
        configuredScheduleWeek.setFridayRooms(new String[]{"Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum", "Raum"});

        configuredScheduleWeek.setMondayPeriods(new String[]{"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"});
        configuredScheduleWeek.setTuesdayPeriods(new String[]{"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"});
        configuredScheduleWeek.setWednesdayPeriods(new String[]{"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"});
        configuredScheduleWeek.setThursdayPeriods(new String[]{"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"});
        configuredScheduleWeek.setFridayPeriods(new String[]{"wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich", "wöchentlich"});
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_OK, new Intent().putExtra(MainActivity.CONFIGURED_SCHEDULE_WEEK, configuredScheduleWeek));
    }

    @Override
    public ScheduleWeek getScheduleWeek() {
        return configuredScheduleWeek;
    }

    @Override
    public void setScheduleWeek(ScheduleWeek scheduleWeek) {
        configuredScheduleWeek = scheduleWeek;
    }

    public static class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            return ArrayListFragment.newInstance(position);
        }
    }

    public static class ArrayListFragment extends Fragment implements View.OnClickListener {
        int mNum;
        OnScheduleWeekPass scheduleWeekPasser;
        Configuration dConfiguration = new DummyConfiguration().getConfiguration();

        Button btnWeekdayLessonZeroLessonName;
        Button btnWeekdayLessonOneLessonName;
        Button btnWeekdayLessonTwoLessonName;
        Button btnWeekdayLessonThreeLessonName;
        Button btnWeekdayLessonFourLessonName;
        Button btnWeekdayLessonFiveLessonName;
        Button btnWeekdayLessonSixLessonName;
        Button btnWeekdayLessonSevenLessonName;
        Button btnWeekdayLessonEightLessonName;
        Button btnWeekdayLessonNineLessonName;

        Button btnWeekdayLessonZeroTeacher;
        Button btnWeekdayLessonOneTeacher;
        Button btnWeekdayLessonTwoTeacher;
        Button btnWeekdayLessonThreeTeacher;
        Button btnWeekdayLessonFourTeacher;
        Button btnWeekdayLessonFiveTeacher;
        Button btnWeekdayLessonSixTeacher;
        Button btnWeekdayLessonSevenTeacher;
        Button btnWeekdayLessonEightTeacher;
        Button btnWeekdayLessonNineTeacher;

        Button btnWeekdayLessonZeroRoom;
        Button btnWeekdayLessonOneRoom;
        Button btnWeekdayLessonTwoRoom;
        Button btnWeekdayLessonThreeRoom;
        Button btnWeekdayLessonFourRoom;
        Button btnWeekdayLessonFiveRoom;
        Button btnWeekdayLessonSixRoom;
        Button btnWeekdayLessonSevenRoom;
        Button btnWeekdayLessonEightRoom;
        Button btnWeekdayLessonNineRoom;

        Button btnWeekdayLessonZeroPeriod;
        Button btnWeekdayLessonOnePeriod;
        Button btnWeekdayLessonTwoPeriod;
        Button btnWeekdayLessonThreePeriod;
        Button btnWeekdayLessonFourPeriod;
        Button btnWeekdayLessonFivePeriod;
        Button btnWeekdayLessonSixPeriod;
        Button btnWeekdayLessonSevenPeriod;
        Button btnWeekdayLessonEightPeriod;
        Button btnWeekdayLessonNinePeriod;

        /**
         * Create a new instance of CountingFragment, providing "num"
         * as an argument.
         */
        static ArrayListFragment newInstance(int num) {
            ArrayListFragment f = new ArrayListFragment();

            // Supply num input as an argument.
            Bundle args = new Bundle();
            args.putInt("num", num);
            f.setArguments(args);

            return f;
        }

        private String getScheduleWeekday(int numberOfWeekday) {
            if (numberOfWeekday == 0) return Weekday.Montag.toString();
            else if (numberOfWeekday == 1) return Weekday.Dienstag.toString();
            else if (numberOfWeekday == 2) return Weekday.Mittwoch.toString();
            else if (numberOfWeekday == 3) return Weekday.Donnerstag.toString();
            else if (numberOfWeekday == 4) return Weekday.Freitag.toString();
            else throw new IllegalArgumentException();
        }

        @Override
        public void onAttach(Context context) {
            super.onAttach(context);
            Activity activity = getActivity();
            scheduleWeekPasser = (OnScheduleWeekPass) activity;
        }

        /**
         * When creating, retrieve this instance's number from its arguments.
         */
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            mNum = getArguments() != null ? getArguments().getInt("num") : 1;
        }

        /**
         * The Fragment's UI is just a simple text view showing its
         * instance number.
         */
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View v = inflater.inflate(R.layout.fragment_pager_list, container, false);
            View tv = v.findViewById(R.id.tvScheduleWeekday);
            ((TextView) tv).setText(getScheduleWeekday(mNum));

            Calendar lessonTime = Calendar.getInstance();
            lessonTime.setTime(dConfiguration.getStartEarliestLesson());
            ConfigureWeekdays.calculateWeekdayLessonTimes(v, dConfiguration.getBreaks(), lessonTime, dConfiguration.getLessonDurationInMinutes());
            ScheduleWeek configuredScheduleWeek = scheduleWeekPasser.getScheduleWeek();
            if (mNum == 0 && configuredScheduleWeek.getMondayLessonNames() != null && configuredScheduleWeek.getMondayTeachers() != null
                    && configuredScheduleWeek.getMondayRooms() != null && configuredScheduleWeek.getMondayPeriods() != null) {
                ConfigureWeekdays.initializeScheduleWeekday(v, configuredScheduleWeek.getMondayLessonNames(),
                        configuredScheduleWeek.getMondayTeachers(), configuredScheduleWeek.getMondayRooms(),
                        configuredScheduleWeek.getMondayPeriods());
            }
            if (mNum == 1 && configuredScheduleWeek.getTuesdayLessonNames() != null && configuredScheduleWeek.getTuesdayTeachers() != null
                    && configuredScheduleWeek.getTuesdayRooms() != null && configuredScheduleWeek.getTuesdayPeriods() != null) {
                ConfigureWeekdays.initializeScheduleWeekday(v, configuredScheduleWeek.getTuesdayLessonNames(),
                        configuredScheduleWeek.getTuesdayTeachers(), configuredScheduleWeek.getTuesdayRooms(),
                        configuredScheduleWeek.getTuesdayPeriods());
            }
            if (mNum == 2 && configuredScheduleWeek.getWednesdayLessonNames() != null && configuredScheduleWeek.getWednesdayTeachers() != null
                    && configuredScheduleWeek.getWednesdayRooms() != null && configuredScheduleWeek.getWednesdayPeriods() != null) {
                ConfigureWeekdays.initializeScheduleWeekday(v, configuredScheduleWeek.getWednesdayLessonNames(),
                        configuredScheduleWeek.getWednesdayTeachers(), configuredScheduleWeek.getWednesdayRooms(),
                        configuredScheduleWeek.getWednesdayPeriods());
            }
            if (mNum == 3 && configuredScheduleWeek.getThursdayLessonNames() != null && configuredScheduleWeek.getThursdayTeachers() != null
                    && configuredScheduleWeek.getThursdayRooms() != null && configuredScheduleWeek.getThursdayPeriods() != null) {
                ConfigureWeekdays.initializeScheduleWeekday(v, configuredScheduleWeek.getThursdayLessonNames(),
                        configuredScheduleWeek.getThursdayTeachers(), configuredScheduleWeek.getThursdayRooms(),
                        configuredScheduleWeek.getThursdayPeriods());
            }
            if (mNum == 4 && configuredScheduleWeek.getFridayLessonNames() != null && configuredScheduleWeek.getFridayTeachers() != null
                    && configuredScheduleWeek.getFridayRooms() != null && configuredScheduleWeek.getFridayPeriods() != null) {
                ConfigureWeekdays.initializeScheduleWeekday(v, configuredScheduleWeek.getFridayLessonNames(),
                        configuredScheduleWeek.getFridayTeachers(), configuredScheduleWeek.getFridayRooms(),
                        configuredScheduleWeek.getFridayPeriods());
            }

            btnWeekdayLessonZeroLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonZeroLessonName);
            btnWeekdayLessonOneLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonOneLessonName);
            btnWeekdayLessonTwoLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonTwoLessonName);
            btnWeekdayLessonThreeLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonThreeLessonName);
            btnWeekdayLessonFourLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonFourLessonName);
            btnWeekdayLessonFiveLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonFiveLessonName);
            btnWeekdayLessonSixLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonSixLessonName);
            btnWeekdayLessonSevenLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonSevenLessonName);
            btnWeekdayLessonEightLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonEightLessonName);
            btnWeekdayLessonNineLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonNineLessonName);

            btnWeekdayLessonZeroTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonZeroTeacher);
            btnWeekdayLessonOneTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonOneTeacher);
            btnWeekdayLessonTwoTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonTwoTeacher);
            btnWeekdayLessonThreeTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonThreeTeacher);
            btnWeekdayLessonFourTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonFourTeacher);
            btnWeekdayLessonFiveTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonFiveTeacher);
            btnWeekdayLessonSixTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonSixTeacher);
            btnWeekdayLessonSevenTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonSevenTeacher);
            btnWeekdayLessonEightTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonEightTeacher);
            btnWeekdayLessonNineTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonNineTeacher);

            btnWeekdayLessonZeroRoom = (Button) v.findViewById(R.id.btnWeekdayLessonZeroRoom);
            btnWeekdayLessonOneRoom = (Button) v.findViewById(R.id.btnWeekdayLessonOneRoom);
            btnWeekdayLessonTwoRoom = (Button) v.findViewById(R.id.btnWeekdayLessonTwoRoom);
            btnWeekdayLessonThreeRoom = (Button) v.findViewById(R.id.btnWeekdayLessonThreeRoom);
            btnWeekdayLessonFourRoom = (Button) v.findViewById(R.id.btnWeekdayLessonFourRoom);
            btnWeekdayLessonFiveRoom = (Button) v.findViewById(R.id.btnWeekdayLessonFiveRoom);
            btnWeekdayLessonSixRoom = (Button) v.findViewById(R.id.btnWeekdayLessonSixRoom);
            btnWeekdayLessonSevenRoom = (Button) v.findViewById(R.id.btnWeekdayLessonSevenRoom);
            btnWeekdayLessonEightRoom = (Button) v.findViewById(R.id.btnWeekdayLessonEightRoom);
            btnWeekdayLessonNineRoom = (Button) v.findViewById(R.id.btnWeekdayLessonNineRoom);

            btnWeekdayLessonZeroPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonZeroPeriod);
            btnWeekdayLessonOnePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonOnePeriod);
            btnWeekdayLessonTwoPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonTwoPeriod);
            btnWeekdayLessonThreePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonThreePeriod);
            btnWeekdayLessonFourPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonFourPeriod);
            btnWeekdayLessonFivePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonFivePeriod);
            btnWeekdayLessonSixPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonSixPeriod);
            btnWeekdayLessonSevenPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonSevenPeriod);
            btnWeekdayLessonEightPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonEightPeriod);
            btnWeekdayLessonNinePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonNinePeriod);

            btnWeekdayLessonZeroLessonName.setOnClickListener(this);
            btnWeekdayLessonOneLessonName.setOnClickListener(this);
            btnWeekdayLessonTwoLessonName.setOnClickListener(this);
            btnWeekdayLessonThreeLessonName.setOnClickListener(this);
            btnWeekdayLessonFourLessonName.setOnClickListener(this);
            btnWeekdayLessonFiveLessonName.setOnClickListener(this);
            btnWeekdayLessonSixLessonName.setOnClickListener(this);
            btnWeekdayLessonSevenLessonName.setOnClickListener(this);
            btnWeekdayLessonEightLessonName.setOnClickListener(this);
            btnWeekdayLessonNineLessonName.setOnClickListener(this);

            btnWeekdayLessonZeroTeacher.setOnClickListener(this);
            btnWeekdayLessonOneTeacher.setOnClickListener(this);
            btnWeekdayLessonTwoTeacher.setOnClickListener(this);
            btnWeekdayLessonThreeTeacher.setOnClickListener(this);
            btnWeekdayLessonFourTeacher.setOnClickListener(this);
            btnWeekdayLessonFiveTeacher.setOnClickListener(this);
            btnWeekdayLessonSixTeacher.setOnClickListener(this);
            btnWeekdayLessonSevenTeacher.setOnClickListener(this);
            btnWeekdayLessonEightTeacher.setOnClickListener(this);
            btnWeekdayLessonNineTeacher.setOnClickListener(this);

            btnWeekdayLessonZeroRoom.setOnClickListener(this);
            btnWeekdayLessonOneRoom.setOnClickListener(this);
            btnWeekdayLessonTwoRoom.setOnClickListener(this);
            btnWeekdayLessonThreeRoom.setOnClickListener(this);
            btnWeekdayLessonFourRoom.setOnClickListener(this);
            btnWeekdayLessonFiveRoom.setOnClickListener(this);
            btnWeekdayLessonSixRoom.setOnClickListener(this);
            btnWeekdayLessonSevenRoom.setOnClickListener(this);
            btnWeekdayLessonEightRoom.setOnClickListener(this);
            btnWeekdayLessonNineRoom.setOnClickListener(this);

            btnWeekdayLessonZeroPeriod.setOnClickListener(this);
            btnWeekdayLessonOnePeriod.setOnClickListener(this);
            btnWeekdayLessonTwoPeriod.setOnClickListener(this);
            btnWeekdayLessonThreePeriod.setOnClickListener(this);
            btnWeekdayLessonFourPeriod.setOnClickListener(this);
            btnWeekdayLessonFivePeriod.setOnClickListener(this);
            btnWeekdayLessonSixPeriod.setOnClickListener(this);
            btnWeekdayLessonSevenPeriod.setOnClickListener(this);
            btnWeekdayLessonEightPeriod.setOnClickListener(this);
            btnWeekdayLessonNinePeriod.setOnClickListener(this);
            return v;
            /**
             View v = null;
             switch (mNum) {
             case 0:
             v = inflater.inflate(R.layout.configure_monday, container, false);
             Intent configureScheduleIntent = new Intent(getActivity(), ConfigureMondayActivity.class);
             configureScheduleIntent.putExtra(MainActivity.CONFIGURED_SCHEDULE_WEEK, configuredScheduleWeek);
             configureScheduleIntent.putExtra
             startActivity(configureScheduleIntent);
             //scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
             break;
             case 1:
             v = inflater.inflate(R.layout.configure_tuesday, container, false);
             break;
             case 2:
             v = inflater.inflate(R.layout.configure_wednesday, container, false);
             break;
             case 3:
             v = inflater.inflate(R.layout.configure_thursday, container, false);
             break;
             case 4:
             v = inflater.inflate(R.layout.configure_friday, container, false);
             break;
             }*/
        }

        @Override
        public void onActivityCreated(@Nullable Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);

        }

        @Override
        public void onClick(View v) {
            Intent weekdayLessonNameIntent = new Intent(getContext(), ChooseLesson.class);
            Intent weekdayTeacherIntent = new Intent(getContext(), ChooseTeacher.class);
            Intent weekdayRoomIntent = new Intent(getContext(), ChooseRoom.class);
            Intent weekdayPeriodIntent = new Intent(getContext(), ChoosePeriod.class);
            switch (v.getId()) {
                case R.id.btnWeekdayLessonZeroLessonName:
                    startActivityForResult(weekdayLessonNameIntent, 10);
                    break;
                case R.id.btnWeekdayLessonOneLessonName:
                    startActivityForResult(weekdayLessonNameIntent, 11);
                    break;
                case R.id.btnWeekdayLessonTwoLessonName:
                    startActivityForResult(weekdayLessonNameIntent, 12);
                    break;
                case R.id.btnWeekdayLessonThreeLessonName:
                    startActivityForResult(weekdayLessonNameIntent, 13);
                    break;
                case R.id.btnWeekdayLessonFourLessonName:
                    startActivityForResult(weekdayLessonNameIntent, 14);
                    break;
                case R.id.btnWeekdayLessonFiveLessonName:
                    startActivityForResult(weekdayLessonNameIntent, 15);
                    break;
                case R.id.btnWeekdayLessonSixLessonName:
                    startActivityForResult(weekdayLessonNameIntent, 16);
                    break;
                case R.id.btnWeekdayLessonSevenLessonName:
                    startActivityForResult(weekdayLessonNameIntent, 17);
                    break;
                case R.id.btnWeekdayLessonEightLessonName:
                    startActivityForResult(weekdayLessonNameIntent, 18);
                    break;
                case R.id.btnWeekdayLessonNineLessonName:
                    startActivityForResult(weekdayLessonNameIntent, 19);
                    break;
                case R.id.btnWeekdayLessonZeroTeacher:
                    startActivityForResult(weekdayTeacherIntent, 20);
                    break;
                case R.id.btnWeekdayLessonOneTeacher:
                    startActivityForResult(weekdayTeacherIntent, 21);
                    break;
                case R.id.btnWeekdayLessonTwoTeacher:
                    startActivityForResult(weekdayTeacherIntent, 22);
                    break;
                case R.id.btnWeekdayLessonThreeTeacher:
                    startActivityForResult(weekdayTeacherIntent, 23);
                    break;
                case R.id.btnWeekdayLessonFourTeacher:
                    startActivityForResult(weekdayTeacherIntent, 24);
                    break;
                case R.id.btnWeekdayLessonFiveTeacher:
                    startActivityForResult(weekdayTeacherIntent, 25);
                    break;
                case R.id.btnWeekdayLessonSixTeacher:
                    startActivityForResult(weekdayTeacherIntent, 26);
                    break;
                case R.id.btnWeekdayLessonSevenTeacher:
                    startActivityForResult(weekdayTeacherIntent, 27);
                    break;
                case R.id.btnWeekdayLessonEightTeacher:
                    startActivityForResult(weekdayTeacherIntent, 28);
                    break;
                case R.id.btnWeekdayLessonNineTeacher:
                    startActivityForResult(weekdayTeacherIntent, 29);
                    break;
                case R.id.btnWeekdayLessonZeroRoom:
                    startActivityForResult(weekdayRoomIntent, 30);
                    break;
                case R.id.btnWeekdayLessonOneRoom:
                    startActivityForResult(weekdayRoomIntent, 31);
                    break;
                case R.id.btnWeekdayLessonTwoRoom:
                    startActivityForResult(weekdayRoomIntent, 32);
                    break;
                case R.id.btnWeekdayLessonThreeRoom:
                    startActivityForResult(weekdayRoomIntent, 33);
                    break;
                case R.id.btnWeekdayLessonFourRoom:
                    startActivityForResult(weekdayRoomIntent, 34);
                    break;
                case R.id.btnWeekdayLessonFiveRoom:
                    startActivityForResult(weekdayRoomIntent, 35);
                    break;
                case R.id.btnWeekdayLessonSixRoom:
                    startActivityForResult(weekdayRoomIntent, 36);
                    break;
                case R.id.btnWeekdayLessonSevenRoom:
                    startActivityForResult(weekdayRoomIntent, 37);
                    break;
                case R.id.btnWeekdayLessonEightRoom:
                    startActivityForResult(weekdayRoomIntent, 38);
                    break;
                case R.id.btnWeekdayLessonNineRoom:
                    startActivityForResult(weekdayRoomIntent, 39);
                    break;
                case R.id.btnWeekdayLessonZeroPeriod:
                    startActivityForResult(weekdayPeriodIntent, 40);
                    break;
                case R.id.btnWeekdayLessonOnePeriod:
                    startActivityForResult(weekdayPeriodIntent, 41);
                    break;
                case R.id.btnWeekdayLessonTwoPeriod:
                    startActivityForResult(weekdayPeriodIntent, 42);
                    break;
                case R.id.btnWeekdayLessonThreePeriod:
                    startActivityForResult(weekdayPeriodIntent, 43);
                    break;
                case R.id.btnWeekdayLessonFourPeriod:
                    startActivityForResult(weekdayPeriodIntent, 44);
                    break;
                case R.id.btnWeekdayLessonFivePeriod:
                    startActivityForResult(weekdayPeriodIntent, 45);
                    break;
                case R.id.btnWeekdayLessonSixPeriod:
                    startActivityForResult(weekdayPeriodIntent, 46);
                    break;
                case R.id.btnWeekdayLessonSevenPeriod:
                    startActivityForResult(weekdayPeriodIntent, 47);
                    break;
                case R.id.btnWeekdayLessonEightPeriod:
                    startActivityForResult(weekdayPeriodIntent, 48);
                    break;
                case R.id.btnWeekdayLessonNinePeriod:
                    startActivityForResult(weekdayPeriodIntent, 49);
                    break;
            }
        }

        private String[] changeValueAtPositionInStringArray(String[] strArray, int position, String value) {
            if (strArray.length > position) {
                strArray[position] = value;
            } else throw new ArrayIndexOutOfBoundsException();
            return strArray;
        }

        private void setMondayLessonNames(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 0 && requestCode == (10 + requestPosition)) {
                String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                changeButtonText.setText(weekdayLessonName);
                configuredScheduleWeek.setMondayLessonNames(changeValueAtPositionInStringArray(configuredScheduleWeek.getMondayLessonNames(), requestPosition, weekdayLessonName));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setTuesdayLessonNames(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 1 && requestCode == (10 + requestPosition)) {
                String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                changeButtonText.setText(weekdayLessonName);
                configuredScheduleWeek.setTuesdayLessonNames(changeValueAtPositionInStringArray(configuredScheduleWeek.getTuesdayLessonNames(), requestPosition, weekdayLessonName));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setWednesdayLessonNames(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 2 && requestCode == (10 + requestPosition)) {
                String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                changeButtonText.setText(weekdayLessonName);
                configuredScheduleWeek.setWednesdayLessonNames(changeValueAtPositionInStringArray(configuredScheduleWeek.getWednesdayLessonNames(), requestPosition, weekdayLessonName));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setThursdayLessonNames(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 3 && requestCode == (10 + requestPosition)) {
                String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                changeButtonText.setText(weekdayLessonName);
                configuredScheduleWeek.setThursdayLessonNames(changeValueAtPositionInStringArray(configuredScheduleWeek.getThursdayLessonNames(), requestPosition, weekdayLessonName));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setFridayLessonNames(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 4 && requestCode == (10 + requestPosition)) {
                String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                changeButtonText.setText(weekdayLessonName);
                configuredScheduleWeek.setFridayLessonNames(changeValueAtPositionInStringArray(configuredScheduleWeek.getFridayLessonNames(), requestPosition, weekdayLessonName));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setMondayTeachers(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 0 && requestCode == (20 + requestPosition)) {
                String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                changeButtonText.setText(weekdayTeacher);
                configuredScheduleWeek.setMondayTeachers(changeValueAtPositionInStringArray(configuredScheduleWeek.getMondayTeachers(), requestPosition, weekdayTeacher));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setTuesdayTeachers(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 1 && requestCode == (20 + requestPosition)) {
                String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                changeButtonText.setText(weekdayTeacher);
                configuredScheduleWeek.setTuesdayTeachers(changeValueAtPositionInStringArray(configuredScheduleWeek.getTuesdayTeachers(), requestPosition, weekdayTeacher));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setWednesdayTeachers(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 2 && requestCode == (20 + requestPosition)) {
                String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                changeButtonText.setText(weekdayTeacher);
                configuredScheduleWeek.setWednesdayTeachers(changeValueAtPositionInStringArray(configuredScheduleWeek.getWednesdayTeachers(), requestPosition, weekdayTeacher));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setThursdayTeachers(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 3 && requestCode == (20 + requestPosition)) {
                String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                changeButtonText.setText(weekdayTeacher);
                configuredScheduleWeek.setThursdayTeachers(changeValueAtPositionInStringArray(configuredScheduleWeek.getThursdayTeachers(), requestPosition, weekdayTeacher));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setFridayTeachers(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 4 && requestCode == (20 + requestPosition)) {
                String weekdayTeacher = data.getStringExtra(ChooseTeacher.TEACHER_NAME);
                changeButtonText.setText(weekdayTeacher);
                configuredScheduleWeek.setFridayTeachers(changeValueAtPositionInStringArray(configuredScheduleWeek.getFridayTeachers(), requestPosition, weekdayTeacher));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setMondayRooms(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 0 && requestCode == (30 + requestPosition)) {
                String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                changeButtonText.setText(weekdayRoom);
                configuredScheduleWeek.setMondayRooms(changeValueAtPositionInStringArray(configuredScheduleWeek.getMondayRooms(), requestPosition, weekdayRoom));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setTuesdayRooms(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 1 && requestCode == (30 + requestPosition)) {
                String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                changeButtonText.setText(weekdayRoom);
                configuredScheduleWeek.setTuesdayRooms(changeValueAtPositionInStringArray(configuredScheduleWeek.getTuesdayRooms(), requestPosition, weekdayRoom));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setWednesdayRooms(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 2 && requestCode == (30 + requestPosition)) {
                String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                changeButtonText.setText(weekdayRoom);
                configuredScheduleWeek.setWednesdayRooms(changeValueAtPositionInStringArray(configuredScheduleWeek.getWednesdayRooms(), requestPosition, weekdayRoom));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setThursdayRooms(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 3 && requestCode == (30 + requestPosition)) {
                String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                changeButtonText.setText(weekdayRoom);
                configuredScheduleWeek.setThursdayRooms(changeValueAtPositionInStringArray(configuredScheduleWeek.getThursdayRooms(), requestPosition, weekdayRoom));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setFridayRooms(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 4 && requestCode == (30 + requestPosition)) {
                String weekdayRoom = data.getStringExtra(ChooseRoom.ROOM);
                changeButtonText.setText(weekdayRoom);
                configuredScheduleWeek.setFridayRooms(changeValueAtPositionInStringArray(configuredScheduleWeek.getFridayRooms(), requestPosition, weekdayRoom));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }
        private void setMondayPeriods(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 0 && requestCode == (40 + requestPosition)) {
                String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                changeButtonText.setText(weekdayPeriod);
                configuredScheduleWeek.setMondayPeriods(changeValueAtPositionInStringArray(configuredScheduleWeek.getMondayPeriods(), requestPosition, weekdayPeriod));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setTuesdayPeriods(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 1 && requestCode == (40 + requestPosition)) {
                String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                changeButtonText.setText(weekdayPeriod);
                configuredScheduleWeek.setTuesdayPeriods(changeValueAtPositionInStringArray(configuredScheduleWeek.getTuesdayPeriods(), requestPosition, weekdayPeriod));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setWednesdayPeriods(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 2 && requestCode == (40 + requestPosition)) {
                String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                changeButtonText.setText(weekdayPeriod);
                configuredScheduleWeek.setWednesdayPeriods(changeValueAtPositionInStringArray(configuredScheduleWeek.getWednesdayPeriods(), requestPosition, weekdayPeriod));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setThursdayPeriods(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 3 && requestCode == (40 + requestPosition)) {
                String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                changeButtonText.setText(weekdayPeriod);
                configuredScheduleWeek.setThursdayPeriods(changeValueAtPositionInStringArray(configuredScheduleWeek.getThursdayPeriods(), requestPosition, weekdayPeriod));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        private void setFridayPeriods(int resultCode, int requestCode, int requestPosition, Intent data, ScheduleWeek configuredScheduleWeek, Button changeButtonText) {
            if (resultCode == Activity.RESULT_OK && mNum == 4 && requestCode == (40 + requestPosition)) {
                String weekdayPeriod = data.getStringExtra(ChoosePeriod.PERIOD);
                changeButtonText.setText(weekdayPeriod);
                configuredScheduleWeek.setFridayPeriods(changeValueAtPositionInStringArray(configuredScheduleWeek.getFridayPeriods(), requestPosition, weekdayPeriod));
                scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
            }
        }

        @Override
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            ScheduleWeek configuredScheduleWeek = scheduleWeekPasser.getScheduleWeek();
            //____________________________LessonNames____________________________
            setMondayLessonNames(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroLessonName);
            setMondayLessonNames(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneLessonName);
            setMondayLessonNames(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoLessonName);
            setMondayLessonNames(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeLessonName);
            setMondayLessonNames(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourLessonName);
            setMondayLessonNames(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveLessonName);
            setMondayLessonNames(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixLessonName);
            setMondayLessonNames(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenLessonName);
            setMondayLessonNames(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightLessonName);
            setMondayLessonNames(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineLessonName);

            setTuesdayLessonNames(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroLessonName);
            setTuesdayLessonNames(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneLessonName);
            setTuesdayLessonNames(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoLessonName);
            setTuesdayLessonNames(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeLessonName);
            setTuesdayLessonNames(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourLessonName);
            setTuesdayLessonNames(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveLessonName);
            setTuesdayLessonNames(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixLessonName);
            setTuesdayLessonNames(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenLessonName);
            setTuesdayLessonNames(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightLessonName);
            setTuesdayLessonNames(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineLessonName);

            setWednesdayLessonNames(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroLessonName);
            setWednesdayLessonNames(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneLessonName);
            setWednesdayLessonNames(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoLessonName);
            setWednesdayLessonNames(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeLessonName);
            setWednesdayLessonNames(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourLessonName);
            setWednesdayLessonNames(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveLessonName);
            setWednesdayLessonNames(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixLessonName);
            setWednesdayLessonNames(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenLessonName);
            setWednesdayLessonNames(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightLessonName);
            setWednesdayLessonNames(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineLessonName);

            setThursdayLessonNames(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroLessonName);
            setThursdayLessonNames(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneLessonName);
            setThursdayLessonNames(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoLessonName);
            setThursdayLessonNames(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeLessonName);
            setThursdayLessonNames(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourLessonName);
            setThursdayLessonNames(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveLessonName);
            setThursdayLessonNames(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixLessonName);
            setThursdayLessonNames(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenLessonName);
            setThursdayLessonNames(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightLessonName);
            setThursdayLessonNames(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineLessonName);

            setFridayLessonNames(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroLessonName);
            setFridayLessonNames(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneLessonName);
            setFridayLessonNames(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoLessonName);
            setFridayLessonNames(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeLessonName);
            setFridayLessonNames(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourLessonName);
            setFridayLessonNames(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveLessonName);
            setFridayLessonNames(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixLessonName);
            setFridayLessonNames(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenLessonName);
            setFridayLessonNames(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightLessonName);
            setFridayLessonNames(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineLessonName);

            //____________________________Teachers____________________________
            setMondayTeachers(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroTeacher);
            setMondayTeachers(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneTeacher);
            setMondayTeachers(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoTeacher);
            setMondayTeachers(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeTeacher);
            setMondayTeachers(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourTeacher);
            setMondayTeachers(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveTeacher);
            setMondayTeachers(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixTeacher);
            setMondayTeachers(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenTeacher);
            setMondayTeachers(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightTeacher);
            setMondayTeachers(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineTeacher);

            setTuesdayTeachers(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroTeacher);
            setTuesdayTeachers(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneTeacher);
            setTuesdayTeachers(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoTeacher);
            setTuesdayTeachers(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeTeacher);
            setTuesdayTeachers(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourTeacher);
            setTuesdayTeachers(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveTeacher);
            setTuesdayTeachers(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixTeacher);
            setTuesdayTeachers(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenTeacher);
            setTuesdayTeachers(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightTeacher);
            setTuesdayTeachers(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineTeacher);

            setWednesdayTeachers(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroTeacher);
            setWednesdayTeachers(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneTeacher);
            setWednesdayTeachers(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoTeacher);
            setWednesdayTeachers(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeTeacher);
            setWednesdayTeachers(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourTeacher);
            setWednesdayTeachers(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveTeacher);
            setWednesdayTeachers(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixTeacher);
            setWednesdayTeachers(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenTeacher);
            setWednesdayTeachers(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightTeacher);
            setWednesdayTeachers(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineTeacher);

            setThursdayTeachers(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroTeacher);
            setThursdayTeachers(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneTeacher);
            setThursdayTeachers(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoTeacher);
            setThursdayTeachers(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeTeacher);
            setThursdayTeachers(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourTeacher);
            setThursdayTeachers(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveTeacher);
            setThursdayTeachers(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixTeacher);
            setThursdayTeachers(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenTeacher);
            setThursdayTeachers(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightTeacher);
            setThursdayTeachers(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineTeacher);

            setFridayTeachers(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroTeacher);
            setFridayTeachers(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneTeacher);
            setFridayTeachers(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoTeacher);
            setFridayTeachers(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeTeacher);
            setFridayTeachers(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourTeacher);
            setFridayTeachers(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveTeacher);
            setFridayTeachers(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixTeacher);
            setFridayTeachers(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenTeacher);
            setFridayTeachers(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightTeacher);
            setFridayTeachers(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineTeacher);

            //____________________________Rooms____________________________
            setMondayRooms(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroRoom);
            setMondayRooms(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneRoom);
            setMondayRooms(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoRoom);
            setMondayRooms(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeRoom);
            setMondayRooms(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourRoom);
            setMondayRooms(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveRoom);
            setMondayRooms(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixRoom);
            setMondayRooms(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenRoom);
            setMondayRooms(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightRoom);
            setMondayRooms(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineRoom);

            setTuesdayRooms(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroRoom);
            setTuesdayRooms(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneRoom);
            setTuesdayRooms(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoRoom);
            setTuesdayRooms(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeRoom);
            setTuesdayRooms(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourRoom);
            setTuesdayRooms(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveRoom);
            setTuesdayRooms(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixRoom);
            setTuesdayRooms(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenRoom);
            setTuesdayRooms(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightRoom);
            setTuesdayRooms(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineRoom);

            setWednesdayRooms(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroRoom);
            setWednesdayRooms(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneRoom);
            setWednesdayRooms(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoRoom);
            setWednesdayRooms(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeRoom);
            setWednesdayRooms(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourRoom);
            setWednesdayRooms(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveRoom);
            setWednesdayRooms(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixRoom);
            setWednesdayRooms(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenRoom);
            setWednesdayRooms(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightRoom);
            setWednesdayRooms(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineRoom);

            setThursdayRooms(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroRoom);
            setThursdayRooms(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneRoom);
            setThursdayRooms(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoRoom);
            setThursdayRooms(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeRoom);
            setThursdayRooms(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourRoom);
            setThursdayRooms(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveRoom);
            setThursdayRooms(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixRoom);
            setThursdayRooms(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenRoom);
            setThursdayRooms(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightRoom);
            setThursdayRooms(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineRoom);

            setFridayRooms(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroRoom);
            setFridayRooms(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOneRoom);
            setFridayRooms(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoRoom);
            setFridayRooms(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreeRoom);
            setFridayRooms(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourRoom);
            setFridayRooms(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFiveRoom);
            setFridayRooms(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixRoom);
            setFridayRooms(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenRoom);
            setFridayRooms(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightRoom);
            setFridayRooms(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNineRoom);

            //____________________________Periods____________________________
            setMondayPeriods(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroPeriod);
            setMondayPeriods(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOnePeriod);
            setMondayPeriods(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoPeriod);
            setMondayPeriods(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreePeriod);
            setMondayPeriods(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourPeriod);
            setMondayPeriods(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFivePeriod);
            setMondayPeriods(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixPeriod);
            setMondayPeriods(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenPeriod);
            setMondayPeriods(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightPeriod);
            setMondayPeriods(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNinePeriod);

            setTuesdayPeriods(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroPeriod);
            setTuesdayPeriods(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOnePeriod);
            setTuesdayPeriods(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoPeriod);
            setTuesdayPeriods(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreePeriod);
            setTuesdayPeriods(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourPeriod);
            setTuesdayPeriods(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFivePeriod);
            setTuesdayPeriods(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixPeriod);
            setTuesdayPeriods(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenPeriod);
            setTuesdayPeriods(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightPeriod);
            setTuesdayPeriods(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNinePeriod);

            setWednesdayPeriods(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroPeriod);
            setWednesdayPeriods(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOnePeriod);
            setWednesdayPeriods(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoPeriod);
            setWednesdayPeriods(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreePeriod);
            setWednesdayPeriods(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourPeriod);
            setWednesdayPeriods(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFivePeriod);
            setWednesdayPeriods(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixPeriod);
            setWednesdayPeriods(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenPeriod);
            setWednesdayPeriods(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightPeriod);
            setWednesdayPeriods(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNinePeriod);

            setThursdayPeriods(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroPeriod);
            setThursdayPeriods(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOnePeriod);
            setThursdayPeriods(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoPeriod);
            setThursdayPeriods(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreePeriod);
            setThursdayPeriods(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourPeriod);
            setThursdayPeriods(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFivePeriod);
            setThursdayPeriods(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixPeriod);
            setThursdayPeriods(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenPeriod);
            setThursdayPeriods(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightPeriod);
            setThursdayPeriods(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNinePeriod);

            setFridayPeriods(resultCode, requestCode, 0, data, configuredScheduleWeek, btnWeekdayLessonZeroPeriod);
            setFridayPeriods(resultCode, requestCode, 1, data, configuredScheduleWeek, btnWeekdayLessonOnePeriod);
            setFridayPeriods(resultCode, requestCode, 2, data, configuredScheduleWeek, btnWeekdayLessonTwoPeriod);
            setFridayPeriods(resultCode, requestCode, 3, data, configuredScheduleWeek, btnWeekdayLessonThreePeriod);
            setFridayPeriods(resultCode, requestCode, 4, data, configuredScheduleWeek, btnWeekdayLessonFourPeriod);
            setFridayPeriods(resultCode, requestCode, 5, data, configuredScheduleWeek, btnWeekdayLessonFivePeriod);
            setFridayPeriods(resultCode, requestCode, 6, data, configuredScheduleWeek, btnWeekdayLessonSixPeriod);
            setFridayPeriods(resultCode, requestCode, 7, data, configuredScheduleWeek, btnWeekdayLessonSevenPeriod);
            setFridayPeriods(resultCode, requestCode, 8, data, configuredScheduleWeek, btnWeekdayLessonEightPeriod);
            setFridayPeriods(resultCode, requestCode, 9, data, configuredScheduleWeek, btnWeekdayLessonNinePeriod);

        }
    }
}