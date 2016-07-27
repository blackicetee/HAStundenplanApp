package com.example.HAStundenplanApp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Thilo S. on 26.07.2016.
 */
public class ImplHomework implements Homework {
    private Date date = null;
    private String lessonName = null;
    private String teacher = null;
    private String room = null;
    private int lesson = -1;
    private List<Pair<File, List<Integer>>> tasks = new ArrayList<>();
    private List<Pair<File, List<Integer>>> taskSolutions = new ArrayList<>();
    private int status = 0;

    public ImplHomework(Date date, String lessonName, String teacher, String room, int lesson) {
        this.date = date;
        this.lessonName = lessonName;
        this.teacher = teacher;
        this.room = room;
        this.setLesson(lesson);
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
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
    public String getRoom() {
        return room;
    }

    @Override
    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public int getLesson() {
        return lesson;
    }

    @Override
    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    @Override
    public List<Pair<File, List<Integer>>> getTasks() {
        return tasks;
    }

    @Override
    public void setTasks(List<Pair<File, List<Integer>>> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void addTask(Pair<File, List<Integer>> task) {
        tasks.add(task);
    }

    @Override
    public List<Pair<File, List<Integer>>> getTaskSolutions() {
        return taskSolutions;
    }

    @Override
    public void setTaskSolutions(List<Pair<File, List<Integer>>> taskSolutions) {
        this.taskSolutions = taskSolutions;
    }

    @Override
    public void addTaskSolution(Pair<File, List<Integer>> taskSolution) {
        taskSolutions.add(taskSolution);
    }

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public void setStatus(int status) {
        if (status == 0 || status == 1 || status == 2) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("The status needs to be 0 for Not Started yet or 1 for started yet or 2 for finished");
        }

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(lessonName);
        dest.writeString(teacher);
        dest.writeString(room);
        dest.writeInt(lesson);
        dest.writeList(tasks);
        dest.writeList(taskSolutions);
        dest.writeInt(status);
    }

    // this is used to regenerate your object. All Parcelables must have a CREATOR that implements these two methods
    public static final Parcelable.Creator<ImplHomework> CREATOR = new Parcelable.Creator<ImplHomework>() {
        public ImplHomework createFromParcel(Parcel in) {
            return new ImplHomework(in);
        }

        public ImplHomework[] newArray(int size) {
            return new ImplHomework[size];
        }
    };

    // example constructor that takes a Parcel and gives you an object populated with it's values
    public ImplHomework(Parcel in) {
        lessonName = in.readString();
        teacher = in.readString();
        room = in.readString();
        lesson = in.readInt();
        in.readList(tasks, List.class.getClassLoader());
        in.readList(taskSolutions, List.class.getClassLoader());
        status = in.readInt();
    }

}
