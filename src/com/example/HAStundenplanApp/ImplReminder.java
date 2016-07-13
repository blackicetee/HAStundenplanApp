package com.example.HAStundenplanApp;

import java.util.Date;

/**
 * Created by Thilo S. on 13.07.2016.
 */
public class ImplReminder implements Reminder{
    private ReminderType type = null;
    private ReminderStatus status = null;
    private Date deadline = null;

    ImplReminder(ReminderType type, ReminderStatus status, Date deadline) {
        this.type = type;
        this.status = status;
        this.deadline = deadline;
    }

    @Override
    public ReminderType getType() {
        return type;
    }

    @Override
    public void setReminderType(ReminderType type) {
        this.type = type;
    }

    @Override
    public ReminderStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(ReminderStatus status) {
        this.status = status;
    }

    @Override
    public Date getDeadline() {
        return deadline;
    }

    @Override
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
