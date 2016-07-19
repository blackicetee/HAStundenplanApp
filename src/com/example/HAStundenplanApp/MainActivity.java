package com.example.HAStundenplanApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity.*;

import java.util.List;

public class MainActivity extends Activity {

    private static final int MENU_CREATE_PROFILE_ID = 0;
    private static final int MENU_SCHEDULE_ID = 1;
    private static final int MENU_CONFIGURE_SCHEDULE_ID = 2;
    private static final int MENU_SETTINGS_ID = 5;
    private static final int MENU_QUIT_ID = 6;

    private ScheduleWeek configuredScheduleWeek = new ImplScheduleWeek();
    public static final String CONFIGURED_SCHEDULE_WEEK = "configuredScheduleWeek";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity, menu);
        menu.add(0, MENU_CREATE_PROFILE_ID, 0, "Meine Daten");
        menu.add(0, MENU_SCHEDULE_ID, 0, "Stundenplan");
        menu.add(0, MENU_CONFIGURE_SCHEDULE_ID, 0, "Wochen Stundenplan");
        menu.add(0, MENU_SETTINGS_ID, 0, "Einstellungen");
        menu.add(0, MENU_QUIT_ID, 0, "Beenden");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_CREATE_PROFILE_ID:
                Intent createProfileIntent = new Intent(this, ProfileDataActivity.class);
                startActivityForResult(createProfileIntent, 0);
                break;
            case MENU_SCHEDULE_ID:
                Intent scheduleIntent = new Intent(this, ScheduleActivity.class);
                startActivityForResult(scheduleIntent, 0);
            case MENU_CONFIGURE_SCHEDULE_ID:
                Intent configureScheduleIntent = new Intent(this, ConfigureMondayActivity.class);
                configureScheduleIntent.putExtra(CONFIGURED_SCHEDULE_WEEK, configuredScheduleWeek);
                startActivityForResult(configureScheduleIntent, MENU_CONFIGURE_SCHEDULE_ID);
                break;
            case MENU_SETTINGS_ID:
                Intent settingsIntent = new Intent(this, SettingsActivity.class);
                startActivityForResult(settingsIntent, 0);
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
            case MENU_CONFIGURE_SCHEDULE_ID:
                if (resultCode == RESULT_OK) {
                    configuredScheduleWeek = data.getParcelableExtra(CONFIGURED_SCHEDULE_WEEK);
                }
                break;
        }
    }
}
