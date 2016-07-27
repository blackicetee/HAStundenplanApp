package com.example.HAStundenplanApp;

import android.os.Parcelable;
import android.util.Pair;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * Created by Thilo S. on 26.07.2016.
 */
public interface Homework extends Parcelable {

    Date getDate();
    void setDate(Date date);

    String getLessonName();
    void setLessonName(String lessonName);

    String getTeacher();
    void setTeacher(String teacher);

    String getRoom();
    void setRoom(String room);

    int getLesson();
    void setLesson(int lesson);

    List<Pair<File, List<Integer>>> getTasks();
    void setTasks(List<Pair<File, List<Integer>>> tasks);
    void addTask(Pair<File, List<Integer>> task);

    List<Pair<File, List<Integer>>> getTaskSolutions();
    void setTaskSolutions(List<Pair<File, List<Integer>>> taskSolutions);
    void addTaskSolution(Pair<File, List<Integer>> taskSolution);

    int getStatus();
    void setStatus(int status);


}
