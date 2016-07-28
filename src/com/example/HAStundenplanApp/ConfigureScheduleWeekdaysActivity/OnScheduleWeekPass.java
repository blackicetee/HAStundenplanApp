package com.example.HAStundenplanApp.ConfigureScheduleWeekdaysActivity;

import com.example.HAStundenplanApp.ImplScheduleWeek;

/**
 * Created by Thilo S. on 22.07.2016.
 */
public interface OnScheduleWeekPass {
    ImplScheduleWeek getScheduleWeek();
    void setScheduleWeek(ImplScheduleWeek scheduleWeek);
}
