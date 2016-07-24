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

    public static class ArrayListFragment extends Fragment implements View.OnClickListener {
        int mNum;
        OnScheduleWeekPass scheduleWeekPasser;
        Configuration dConfiguration = new DummyConfiguration().getConfiguration();

        Button btnWeekdayLessonZeroLessonName;
        Button btnWeekdayLessonOneLessonName;


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

            btnWeekdayLessonZeroLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonZeroLessonName);
            btnWeekdayLessonOneLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonOneLessonName);
            Button btnWeekdayLessonTwoLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonTwoLessonName);
            Button btnWeekdayLessonThreeLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonThreeLessonName);
            Button btnWeekdayLessonFourLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonFourLessonName);
            Button btnWeekdayLessonFiveLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonFiveLessonName);
            Button btnWeekdayLessonSixLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonSixLessonName);
            Button btnWeekdayLessonSevenLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonSevenLessonName);
            Button btnWeekdayLessonEightLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonEightLessonName);
            Button btnWeekdayLessonNineLessonName = (Button) v.findViewById(R.id.btnWeekdayLessonNineLessonName);

            Button btnWeekdayLessonZeroTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonZeroTeacher);
            Button btnWeekdayLessonOneTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonOneTeacher);
            Button btnWeekdayLessonTwoTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonTwoTeacher);
            Button btnWeekdayLessonThreeTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonThreeTeacher);
            Button btnWeekdayLessonFourTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonFourTeacher);
            Button btnWeekdayLessonFiveTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonFiveTeacher);
            Button btnWeekdayLessonSixTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonSixTeacher);
            Button btnWeekdayLessonSevenTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonSevenTeacher);
            Button btnWeekdayLessonEightTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonEightTeacher);
            Button btnWeekdayLessonNineTeacher = (Button) v.findViewById(R.id.btnWeekdayLessonNineTeacher);

            Button btnWeekdayLessonZeroRoom = (Button) v.findViewById(R.id.btnWeekdayLessonZeroRoom);
            Button btnWeekdayLessonOneRoom = (Button) v.findViewById(R.id.btnWeekdayLessonOneRoom);
            Button btnWeekdayLessonTwoRoom = (Button) v.findViewById(R.id.btnWeekdayLessonTwoRoom);
            Button btnWeekdayLessonThreeRoom = (Button) v.findViewById(R.id.btnWeekdayLessonThreeRoom);
            Button btnWeekdayLessonFourRoom = (Button) v.findViewById(R.id.btnWeekdayLessonFourRoom);
            Button btnWeekdayLessonFiveRoom = (Button) v.findViewById(R.id.btnWeekdayLessonFiveRoom);
            Button btnWeekdayLessonSixRoom = (Button) v.findViewById(R.id.btnWeekdayLessonSixRoom);
            Button btnWeekdayLessonSevenRoom = (Button) v.findViewById(R.id.btnWeekdayLessonSevenRoom);
            Button btnWeekdayLessonEightRoom = (Button) v.findViewById(R.id.btnWeekdayLessonEightRoom);
            Button btnWeekdayLessonNineRoom = (Button) v.findViewById(R.id.btnWeekdayLessonNineRoom);

            Button btnWeekdayLessonZeroPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonZeroPeriod);
            Button btnWeekdayLessonOnePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonOnePeriod);
            Button btnWeekdayLessonTwoPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonTwoPeriod);
            Button btnWeekdayLessonThreePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonThreePeriod);
            Button btnWeekdayLessonFourPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonFourPeriod);
            Button btnWeekdayLessonFivePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonFivePeriod);
            Button btnWeekdayLessonSixPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonSixPeriod);
            Button btnWeekdayLessonSevenPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonSevenPeriod);
            Button btnWeekdayLessonEightPeriod = (Button) v.findViewById(R.id.btnWeekdayLessonEightPeriod);
            Button btnWeekdayLessonNinePeriod = (Button) v.findViewById(R.id.btnWeekdayLessonNinePeriod);

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

        @Override
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            ScheduleWeek configuredScheduleWeek = scheduleWeekPasser.getScheduleWeek();
            if (resultCode == Activity.RESULT_OK && mNum == 0 && requestCode == 10) {
                if (configuredScheduleWeek.getMondayLessonNames() != null)  {
                    String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWeekdayLessonZeroLessonName.setText(weekdayLessonName);
                    configuredScheduleWeek.setMondayLessonNames(changeValueAtPositionInStringArray(configuredScheduleWeek.getMondayLessonNames(), 0, weekdayLessonName));
                    scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
                }
                else {
                    String[] mondayLessonNames = new String[]{"", "", "", "", "", "", "", "", "", ""};
                    String weekdayLessonName = data.getStringExtra(ChooseLesson.LESSON_NAME);
                    btnWeekdayLessonZeroLessonName.setText(weekdayLessonName);
                    configuredScheduleWeek.setMondayLessonNames(changeValueAtPositionInStringArray(mondayLessonNames, 0, weekdayLessonName));
                    scheduleWeekPasser.setScheduleWeek(configuredScheduleWeek);
                }
            }
        }
    }
}