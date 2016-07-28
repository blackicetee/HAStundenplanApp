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

/**
 * Created by Thilo S. on 18.07.2016.
 */
public class ChoosePeriod extends Activity {
    public static final String PERIOD = "Period";
    private List<String> period = new ArrayList<>(Arrays.asList("wöchentlich", "zwei wöchentlich", "monatlich"));
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_period);

        LinearLayout layout = (LinearLayout) findViewById(R.id.periodContainer);

        for (int i = 0; i < period.size(); i++) {
            Button btnTag = new Button(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0,2,0,0);
            btnTag.setLayoutParams(layoutParams);
            btnTag.setTextColor(0xff000000);
            btnTag.setBackgroundResource(R.drawable.button);
            String btnText = period.get(i);
            btnTag.setText(btnText);
            btnTag.setId(i);
            btnTag.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra(PERIOD, period.get(v.getId()));
                    setResult(Activity.RESULT_OK, returnIntent);
                    finish();
                }
            });
            layout.addView(btnTag);
        }
    }
}