package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.example.HAStundenplanApp.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity.ChooseLesson.createDynamicButtons;

/**
 * Created by Thilo S. on 18.07.2016.
 */
public class ChoosePeriod extends Activity {
    public static final String PERIOD = "Period";
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_period);

        ArrayList<String> period = new ArrayList<>(Arrays.asList("wöchentlich", "zwei wöchentlich", "monatlich"));

        LinearLayout layout = (LinearLayout) findViewById(R.id.periodContainer);

        createDynamicButtons(period, this, PERIOD, layout);
    }
}