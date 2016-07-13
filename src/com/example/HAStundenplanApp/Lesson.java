package com.example.HAStundenplanApp;

import net.sharksystem.sharknet.api.Chat;

import java.util.Date;
import java.util.List;


/**
 * A lesson is like a school lesson.
 * The lesson maintains:
 * -a lecturing teacher
 * -a location(often a room) where the lesson is located
 * -a list of appointments, a single Appointment looks like = (MONDAY, 8:00 AM, 90, 1)
 *   A list of these appointments maps all important information about when a lesson takes place,
 *   how long a lesson is and if a lesson reapeats weekly, monthly or 2 times a month.
 *   This list of appointments indicates:
 *   -->on what weekdays the lesson takes place(e.g. Math takes place on Mondays, Tuesdays and Fridays),
 *   -->on what times the lesson takes place(e.g. Math is at 8:00 AM),
 *   -->how long a lesson last(e.g. The duration of Math is 90 minutes),
 *   -->and the period of a lesson(e.g. unique appointment = 0, period weekly = 1, period every 2 weeks = 2, period one time in a month = 4)
 * -a lesson termination date, the lesson will finally end at this date
 * -a chat, this chat enables several features like sending content with messages and comments in feeds
 * Chat, Message, Content, Comment and Feed are parts of the package net.sharksystem.sharknet.api
 * read the documentation of these for better understanding
 *
 *
 * Created by Thilo on 13.07.2016.
 */
public interface Lesson {
    /**
     * Returns name of lesson(e.g. German).
     * @return Name of lesson.
     */
    String getLessonName();

    /**
     * Sets name of lesson.
     * @param lessonName Name of the lesson.
     */
    void setLessonName(String lessonName);
    /**
     * Returns class teacher of students.
     * @return Class teacher.
     */
    String getTeacher();

    /**
     * Sets class teacher of students.
     * @param teacher Class teacher.
     */
    void setTeacher(String teacher);

    /**
     * Returns location where lesson will be located.
     * @return Location of lesson.
     */
    String getLocation();

    /**
     * Sets location(often a room) of lesson.
     * @param  location Location of the lesson.
     */
    void setLocation(String location);

    /**
     * Returns a list of appointments.
     * @return List of appointments.
     */
    List<Appointment> getAppointments();

    /**
     * Sets a List of appointments.
     * @param appointments List of appointments.
     */
    void setAppointments(List<Appointment> appointments);

    /**
     * Returns date where lesson will terminate.
     * @return Termination date of lesson.
     */
    Date getLessonTerminationDate();

    /**
     * Sets termination date of a lesson.
     * @param lessonTerminationDate Termination date of a lesson.
     */
    void setLessonTerminationDate(Date lessonTerminationDate);

    /**
     * Returns Chat of this lesson.
     * @return Chat of this lesson.
     */
    Chat getChat();

    /**
     * Sets Chat of this lesson.
     * @param chat Chat of this lesson.
     */
    void setChat(Chat chat);
}
