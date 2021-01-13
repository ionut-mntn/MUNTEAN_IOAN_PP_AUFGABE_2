package model;

import java.util.ArrayList;
import java.util.List;

public class TaskRepo {
    private List<Task> taskList;

    public TaskRepo(){
        this.taskList = new ArrayList<>();
    }

    public TaskRepo(List<Task> taskList) {
        this.taskList = taskList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public String toString() {
        return "TaskRepo{" +
                "taskList=" + taskList +
                '}';
    }





}
