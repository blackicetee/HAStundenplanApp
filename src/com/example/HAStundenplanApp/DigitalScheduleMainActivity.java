package com.example.HAStundenplanApp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.util.Pair;
import android.view.*;
import android.widget.*;
import com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity.ConfigureWeekdays;
import com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity.FragmentPagerSupport;
import com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity.OnScheduleWeekPass;
import com.example.HAStundenplanApp.com.example.android.customchoicelist.Cheeses;

import java.util.*;

public class DigitalScheduleMainActivity extends FragmentActivity implements OnScheduleWeekPass, OnConfigurationPass {

    private static final int MENU_CREATE_PROFILE_ID = 0;
    private static final int MENU_CONFIGURE_SCHEDULE_WEEK_ID = 1;
    private static final int MENU_SETTINGS_ID = 5;
    private static final int MENU_QUIT_ID = 6;

    private ScheduleWeek configuredScheduleWeek = new ImplScheduleWeek();
    public static final String CONFIGURED_SCHEDULE_WEEK = "configuredScheduleWeek";
    private static Configuration dc = new DummyConfiguration().getConfiguration();

    private static List<Pair<Integer, Date>> indexMatrixOfDaysWithoutWeekends = dc.getIndexMatrixOfDaysWithoutWeekdays(dc.getStartSummerSemester(), dc.getEndSummerSemester());

    static final int NUM_ITEMS = indexMatrixOfDaysWithoutWeekends.size();

    MyAdapter mAdapter;

    ViewPager mPager;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digital_schedule_main);

        mAdapter = new MyAdapter(getSupportFragmentManager());

        mPager = (ViewPager) findViewById(R.id.main_pager);
        mPager.setAdapter(mAdapter);

        Calendar today = Calendar.getInstance();
        int indexOfToday = dc.searchIndexOfDayInIndexMatrix(today.getTime(), indexMatrixOfDaysWithoutWeekends);

        mPager.setCurrentItem(indexOfToday);

        // Watch for button clicks.
        Button button = (Button) findViewById(R.id.goto_first);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPager.setCurrentItem(0);
            }
        });
        button = (Button) findViewById(R.id.goto_today);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPager.setCurrentItem(indexOfToday);
                Log.d("LOG_TAG", "IndexOfToday: " + indexOfToday);
            }
        });
        button = (Button) findViewById(R.id.goto_last);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPager.setCurrentItem(NUM_ITEMS - 1);
            }
        });
        Log.d("LOG_TAG", "Length of the summer semester: " + Integer.toString(dc.calculateLengthOfSummerSemester()));
        fillConfiguredScheduleWeekWithDummyData();
    }

    @Override
    public ScheduleWeek getScheduleWeek() {
        return configuredScheduleWeek;
    }

    @Override
    public void setScheduleWeek(ScheduleWeek scheduleWeek) {
        configuredScheduleWeek = scheduleWeek;
    }

    @Override
    public Configuration getConfiguration() {
        return dc;
    }

    @Override
    public void setConfiguration(Configuration configuration) {
        dc = configuration;
    }

    public static class MyAdapter extends FragmentStatePagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            return ScheduleFragment.newInstance(position);
        }
    }

    public static class ScheduleFragment extends Fragment {
        int mNum;
        OnScheduleWeekPass scheduleWeekPasser;
        OnConfigurationPass configurationPasser;

        /**
         * Create a new instance of CountingFragment, providing "num"
         * as an argument.
         */
        static ScheduleFragment newInstance(int num) {
            ScheduleFragment f = new ScheduleFragment();

            // Supply num input as an argument.
            Bundle args = new Bundle();
            args.putInt("num", num);
            f.setArguments(args);

            return f;
        }

        @Override
        public void onAttach(Context context) {
            super.onAttach(context);
            Activity activity = getActivity();
            scheduleWeekPasser = (OnScheduleWeekPass) activity;
            configurationPasser = (OnConfigurationPass) activity;
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


            View v = inflater.inflate(R.layout.digital_schedule_fragment_object, container, false);
            Configuration dc = configurationPasser.getConfiguration();
            List<Pair<Integer, Date>> im = dc.getIndexMatrixOfDaysWithoutWeekdays(dc.getStartSummerSemester(), dc.getEndSummerSemester());
            Calendar c = Calendar.getInstance();
            c.setTime(im.get(mNum).second);
            Boolean free = false;
            for (int i = 0; i < dc.getDayOff().size(); i++) {
                Calendar c2 = Calendar.getInstance();
                c2.setTime(dc.getDayOff().get(i));
                if (c.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH) && c.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c.get(Calendar.YEAR) == c2.get(Calendar.YEAR)) {
                    free = true;
                }
            }
            String date;
            if (free) {
                date = "Kein Unterricht am " + getWeekday(c.get(Calendar.DAY_OF_WEEK)) + " den " + c.get(Calendar.DAY_OF_MONTH) + "." + (c.get(Calendar.MONTH) + 1) + "." + c.get(Calendar.YEAR);
            } else {
                date = getWeekday(c.get(Calendar.DAY_OF_WEEK)) + " der " + c.get(Calendar.DAY_OF_MONTH) + "." + (c.get(Calendar.MONTH) + 1) + "." + c.get(Calendar.YEAR);
            }
            View tv = v.findViewById(R.id.tvWeekdayDate);
            ((TextView) tv).setText(date);

            Calendar lessonTime = Calendar.getInstance();
            lessonTime.setTime(dc.getStartEarliestLesson());
            ConfigureWeekdays.calculateWeekdayLessonTimes(v, dc.getBreaks(), lessonTime, dc.getLessonDurationInMinutes());

            ScheduleWeek configuredScheduleWeek = scheduleWeekPasser.getScheduleWeek();
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
                ConfigureWeekdays.initializeDigitalSchedule(v, configuredScheduleWeek.getMondayLessonNames(), configuredScheduleWeek.getMondayTeachers(),
                        configuredScheduleWeek.getMondayRooms());
            } else if (c.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
                ConfigureWeekdays.initializeDigitalSchedule(v, configuredScheduleWeek.getTuesdayLessonNames(), configuredScheduleWeek.getTuesdayTeachers(),
                        configuredScheduleWeek.getTuesdayRooms());
            } else if (c.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
                ConfigureWeekdays.initializeDigitalSchedule(v, configuredScheduleWeek.getWednesdayLessonNames(), configuredScheduleWeek.getWednesdayTeachers(),
                        configuredScheduleWeek.getWednesdayRooms());
            } else if (c.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
                ConfigureWeekdays.initializeDigitalSchedule(v, configuredScheduleWeek.getThursdayLessonNames(), configuredScheduleWeek.getThursdayTeachers(),
                        configuredScheduleWeek.getThursdayRooms());
            } else if (c.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                ConfigureWeekdays.initializeDigitalSchedule(v, configuredScheduleWeek.getFridayLessonNames(), configuredScheduleWeek.getFridayTeachers(),
                        configuredScheduleWeek.getFridayRooms());
            }
            return v;
        }

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity, menu);
        menu.add(0, MENU_CREATE_PROFILE_ID, 0, "Meine Daten");
        menu.add(0, MENU_CONFIGURE_SCHEDULE_WEEK_ID, 0, "Wochen Stundenplan anpassen");
        menu.add(0, MENU_SETTINGS_ID, 0, "Einstellungen");
        menu.add(0, MENU_QUIT_ID, 0, "Beenden");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_CREATE_PROFILE_ID:
                Intent createProfileIntent = new Intent(this, ProfileDataActivity.class);
                startActivityForResult(createProfileIntent, MENU_CREATE_PROFILE_ID);
                break;
            case MENU_CONFIGURE_SCHEDULE_WEEK_ID:
                Intent configureScheduleWeekIntent = new Intent(this, FragmentPagerSupport.class);
                configureScheduleWeekIntent.putExtra(CONFIGURED_SCHEDULE_WEEK, configuredScheduleWeek);
                startActivityForResult(configureScheduleWeekIntent, MENU_CONFIGURE_SCHEDULE_WEEK_ID);
                break;
            case MENU_SETTINGS_ID:
                Intent settingsIntent = new Intent(this, SettingsActivity.class);
                startActivityForResult(settingsIntent, MENU_SETTINGS_ID);
                break;
            case MENU_QUIT_ID:
                //exit
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case MENU_CONFIGURE_SCHEDULE_WEEK_ID:
                if (resultCode == RESULT_OK) {
                    configuredScheduleWeek = data.getParcelableExtra(CONFIGURED_SCHEDULE_WEEK);
                }
                break;
        }
    }

    private void fillConfiguredScheduleWeekWithDummyData() {
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

    private static String getWeekday(int numberOfWeekday) {
        if (numberOfWeekday == 1) return Weekday.Sonntag.toString();
        else if (numberOfWeekday == 2) return Weekday.Montag.toString();
        else if (numberOfWeekday == 3) return Weekday.Dienstag.toString();
        else if (numberOfWeekday == 4) return Weekday.Mittwoch.toString();
        else if (numberOfWeekday == 5) return Weekday.Donnerstag.toString();
        else if (numberOfWeekday == 6) return Weekday.Freitag.toString();
        else if (numberOfWeekday == 7) return Weekday.Samstag.toString();
        else throw new IllegalArgumentException();
    }
}
