package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.example.HAStundenplanApp.R;

import java.util.ArrayList;

import static com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity.ChooseLesson.createDynamicButtons;
import static com.example.HAStundenplanApp.DigitalScheduleMainActivity.METADATA_BUNDLE;
import static com.example.HAStundenplanApp.DigitalScheduleMainActivity.ROOMS;

/**
 * Created by Thilo S. on 18.07.2016.
 */
public class ChooseRoom extends Activity {
    public static final String ROOM = "room";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_room);

        ArrayList<String> rooms = getIntent().getBundleExtra(METADATA_BUNDLE).getStringArrayList(ROOMS);
        try {
            rooms.add("Raum");
        } catch (NullPointerException nE) {
            throw new NullPointerException("Room is Null: getIntent().getBundleExtra(METADATA_BUNDLE).getStringArrayList(ROOMS)");
        }

        LinearLayout layout = (LinearLayout) findViewById(R.id.roomsContainer);

        createDynamicButtons(rooms, this, ROOM, layout);
    }
}