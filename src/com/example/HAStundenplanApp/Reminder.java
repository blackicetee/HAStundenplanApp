package com.example.HAStundenplanApp;

import java.util.Date;

/** A Reminder represents work(lesson events) that has to be done in a lesson
 *  and it represents the exact date when this work should be done.
 *  A Reminder shows for example at which date a homework should be finished,
 *  is the homework finished, is it just the beginning(initialisation),
 *  is it an example for this homework or some basic information for this homework.
 *  A Reminder is not necessarily a homework it also can be a test, an exam or an other type.
 *
 * Created by Thilo S. on 13.07.2016.
 */
public interface Reminder {
    /**
     * Returns the type of the Reminder(Homework, Test, Exam, Other).
     * @return Type of the Reminder.
     */
    ReminderType getType();

    /**
     * Sets the type of the Reminder.
     * @param type Type of the Reminder.
     */
    void setReminderType(ReminderType type);

    /**
     * Returns the status of the Reminder(initial = just started, info = just an information,
     * example = an example for the Reminder, finished = the solved and finished homework/test ..., unknown =
     * not specified Reminder)
     * @return The status of the Reminder.
     */
    ReminderStatus getStatus();

    /**
     * Sets the status of the Reminder.
     * @param status Status of the Reminder.
     */
    void setStatus(ReminderStatus status);

    /**
     * Returns the date where the homework/test/exam/other should be done or written.
     * @return Deadline of the homework/test/exam/other.
     */
    Date getDeadline();

    /**
     * Sets the deadline of a homework/test/exam/other.
     * @param deadline The deadline of a homework/test/exam/other.
     */
    void setDeadline(Date deadline);

}
