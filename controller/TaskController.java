package controller;

import model.Task;
import model.TaskRepo;

public class TaskController {

    private TaskRepo taskRepo;

    public TaskController() {
        this.taskRepo = new TaskRepo();
    }

    public boolean addTask(Task t){
        for(Task t2: taskRepo.getTaskList()){
            if(t.equals(t2)) return false; // daca exista deja task-ul de adaugat, returnez false
        }
        taskRepo.getTaskList().add(t); // altfel, adaug noul task !!
        return true;
    }

    public boolean removeTask(Task t){
        for(Task t2: taskRepo.getTaskList()){
            if(t.equals(t2)) {
                taskRepo.getTaskList().remove(t2);
            }
            return true;
        }
        return false;
    }

    public boolean changeTask(Task oldTask, Task newTask){

        int indexOfTaskToBeChanged = taskRepo.getTaskList().indexOf(oldTask);
        if(indexOfTaskToBeChanged != -1) { // daca s-a gasit task-ul
            taskRepo.getTaskList().set(indexOfTaskToBeChanged, newTask);
            return true;
        }
        return false;
    }

}
