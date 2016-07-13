package com.example.HAStundenplanApp;

import net.sharksystem.sharknet.api.Chat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Thilo on 13.07.2016.
 */

public class ImplLesson implements Lesson {
    private String lessonName = null;
    private String teacher = null;
    private String location = null;
    private List<Appointment> appointments = new ArrayList<>();
    private Date lessonTerminationDate = null;
    private Chat chat = null;

    ImplLesson() {

    }

    //This constructor is for unique events/lessons like sports meeting or cake sale.
    //The Appointment should have a period of 0, in this case.
    ImplLesson(String location, Appointment appointment, Date lessonTerminationDate, Chat chat) {
        this.location = location;
        appointments.add(appointment);
        this.lessonTerminationDate = lessonTerminationDate;
        this.chat = chat;
    }

    ImplLesson(String lessonName, String teacher, String location, List<Appointment> appointments, Date lessonTerminationDate, Chat chat) {
        this.lessonName = lessonName;
        this.teacher = teacher;
        this.location = location;
        this.appointments = appointments;
        this.lessonTerminationDate = lessonTerminationDate;
        this.chat = chat;
    }

    @Override
    public String getLessonName() {
        return lessonName;
    }

    @Override
    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String getTeacher() {
        return teacher;
    }

    @Override
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public List<Appointment> getAppointments() {
        return appointments;
    }

    @Override
    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    @Override
    public Date getLessonTerminationDate() {
        return lessonTerminationDate;
    }

    @Override
    public void setLessonTerminationDate(Date lessonTerminationDate) {
        this.lessonTerminationDate = lessonTerminationDate;
    }

    @Override
    public Chat getChat() {
        return chat;
    }

    @Override
    public void setChat(Chat chat) {
        this.chat = chat;
    }
}
