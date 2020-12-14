package com.codegama.todolistapplication.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Task implements Serializable {

    @PrimaryKey(autoGenerate = true)
    int taskId;
    @ColumnInfo(name = "taskTitle")
    String taskTitle;
    @ColumnInfo(name = "date")
    String date;
    @ColumnInfo(name = "taskDescription")
    String taskDescrption;
    @ColumnInfo(name = "isComplete")
    boolean isComplete;
    @ColumnInfo(name = "firstAlarmTime")
    String firstAlarmTime;
    @ColumnInfo(name = "secondAlarmTime")
    String secondAlarmTime;
    @ColumnInfo(name = "lastAlarm")
    String lastAlarm;
    @ColumnInfo(name = "event")
    String event;

    public Task() {

    }

    public boolean isComplete() {
        return isComplete;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getFirstAlarmTime() {
        return firstAlarmTime;
    }

    public void setFirstAlarmTime(String firstAlarmTime) {
        this.firstAlarmTime = firstAlarmTime;
    }

    public String getSecondAlarmTime() {
        return secondAlarmTime;
    }

    public void setSecondAlarmTime(String secondAlarmTime) {
        this.secondAlarmTime = secondAlarmTime;
    }

    public String getLastAlarm() {
        return lastAlarm;
    }

    public void setLastAlarm(String lastAlarm) {
        this.lastAlarm = lastAlarm;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTaskDescrption() {
        return taskDescrption;
    }

    public void setTaskDescrption(String taskDescrption) {
        this.taskDescrption = taskDescrption;
    }
}
