package model;

import java.util.List;
import java.util.Objects;

public class Task {

    private String name;
    private int priority; // de la 1 la 4
    private List<Task> subtasksList;

    public Task(String name, int priority){
        this.name = name;
        this.priority = priority;
        subtasksList = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public List<Task> getSubtasksList() {
        return subtasksList;
    }

    public void setSubtasksList(List<Task> subtasksList) {
        this.subtasksList = subtasksList;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", subtasksList=" + subtasksList +
                '}';
    }

    @Override
    public boolean equals(Object o) {   // am definit egalitatea intre Task-uri ca: "doua task-uri sunt de fapt acelasi task daca numele lor este acelasi"
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return name.equals(task.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
