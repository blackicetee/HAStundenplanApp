package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import com.example.HAStundenplanApp.ScheduleWeek;

/**
 * Created by Thilo S. on 22.07.2016.
 */
public interface OnScheduleWeekPass {
    ScheduleWeek getScheduleWeek();
    void setScheduleWeek(ScheduleWeek scheduleWeek);
}
