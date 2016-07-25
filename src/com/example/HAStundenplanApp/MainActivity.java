package com.example.HAStundenplanApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity.*;
import com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity.FragmentPagerSupport;

public class MainActivity extends Activity {

    private static final int MENU_CREATE_PROFILE_ID = 0;
    private static final int MENU_CONFIGURE_SCHEDULE_WEEK_ID = 1;
    private static final int MENU_SETTINGS_ID = 5;
    private static final int MENU_QUIT_ID = 6;

    private ScheduleWeek configuredScheduleWeek = new ImplScheduleWeek();
    public static final String CONFIGURED_SCHEDULE_WEEK = "configuredScheduleWeek";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

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
}
