package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.example.HAStundenplanApp.SchoolMetadata;
import com.example.HAStundenplanApp.DummySchoolMetadata;
import com.example.HAStundenplanApp.R;

import java.util.List;

/**
 * Created by Thilo S. on 18.07.2016.
 */
public class ChooseRoom extends Activity {
    public static final String ROOM = "room";
    private List<String> rooms;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_room);
        
        DummySchoolMetadata dc = new DummySchoolMetadata();
        SchoolMetadata schoolMetadata = dc.getSchoolMetadata();
        rooms = schoolMetadata.getRooms();
        rooms.add("Raum");


        LinearLayout layout = (LinearLayout) findViewById(R.id.roomsContainer);

        for (int i = 0; i < rooms.size(); i++) {
            Button btnTag = new Button(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0,2,0,0);
            btnTag.setLayoutParams(layoutParams);
            btnTag.setTextColor(0xff000000);
            btnTag.setBackgroundResource(R.drawable.button);
            String btnText = rooms.get(i);
            btnTag.setText(btnText);
            btnTag.setId(i);
            btnTag.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra(ROOM, rooms.get(v.getId()));
                    setResult(Activity.RESULT_OK, returnIntent);
                    finish();
                }
            });
            layout.addView(btnTag);
        }
    }
}