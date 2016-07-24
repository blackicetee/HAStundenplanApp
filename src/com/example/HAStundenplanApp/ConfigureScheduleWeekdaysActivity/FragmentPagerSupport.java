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

    public static class ArrayListFragment extends Fragment {
        int mNum;
        OnScheduleWeekPass scheduleWeekPasser;
        Configuration dConfiguration = new DummyConfiguration().getConfiguration();


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
            if (mNum == 0) {
                if (scheduleWeekPasser.getScheduleWeek().getMondayLessonNames() != null) {
                    ConfigureWeekdays.initializeScheduleWeekday(v, scheduleWeekPasser.getScheduleWeek().getMondayLessonNames(),
                            scheduleWeekPasser.getScheduleWeek().getMondayTeachers(), scheduleWeekPasser.getScheduleWeek().getMondayRooms(),
                            scheduleWeekPasser.getScheduleWeek().getMondayPeriods());
                }
            } else if (mNum == 1) {
                if (scheduleWeekPasser.getScheduleWeek().getTuesdayLessonNames() != null) {
                    ConfigureWeekdays.initializeScheduleWeekday(v, scheduleWeekPasser.getScheduleWeek().getTuesdayLessonNames(),
                            scheduleWeekPasser.getScheduleWeek().getTuesdayTeachers(), scheduleWeekPasser.getScheduleWeek().getTuesdayRooms(),
                            scheduleWeekPasser.getScheduleWeek().getTuesdayPeriods());
                }

            } else if (mNum == 2) {
                if (scheduleWeekPasser.getScheduleWeek().getWednesdayLessonNames() != null) {
                    ConfigureWeekdays.initializeScheduleWeekday(v, scheduleWeekPasser.getScheduleWeek().getWednesdayLessonNames(),
                            scheduleWeekPasser.getScheduleWeek().getWednesdayTeachers(), scheduleWeekPasser.getScheduleWeek().getWednesdayRooms(),
                            scheduleWeekPasser.getScheduleWeek().getWednesdayPeriods());
                }
            } else if (mNum == 3) {
                if (scheduleWeekPasser.getScheduleWeek().getThursdayLessonNames() != null) {
                    ConfigureWeekdays.initializeScheduleWeekday(v, scheduleWeekPasser.getScheduleWeek().getThursdayLessonNames(),
                            scheduleWeekPasser.getScheduleWeek().getThursdayTeachers(), scheduleWeekPasser.getScheduleWeek().getThursdayRooms(),
                            scheduleWeekPasser.getScheduleWeek().getThursdayPeriods());
                }
            } else if (mNum == 4) {
                if (scheduleWeekPasser.getScheduleWeek().getFridayLessonNames() != null) {
                    ConfigureWeekdays.initializeScheduleWeekday(v, scheduleWeekPasser.getScheduleWeek().getFridayLessonNames(),
                            scheduleWeekPasser.getScheduleWeek().getFridayTeachers(), scheduleWeekPasser.getScheduleWeek().getFridayRooms(),
                            scheduleWeekPasser.getScheduleWeek().getFridayPeriods());
                }
            }
            Intent weekdayButtonsClickIntent = ConfigureWeekdays.onWeekdayButtonsClick(v, getContext());
            if (weekdayButtonsClickIntent != null) {
                startActivityForResult(weekdayButtonsClickIntent, weekdayButtonsClickIntent.getIntExtra(ConfigureWeekdays.REQUEST_CODE, 0));
            }
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
    }
}