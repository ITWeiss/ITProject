package Lesson9;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Added: " + task);
    }

    public void removeTask(int id) {
        Task task = findTaskById(id);
        if (task != null) {
            tasks.remove(task);
            System.out.println("Deleted: " + task);
        }
    }

    public void updateTask(int id, String newDescription) {
        Task task = findTaskById(id);
        if (task != null) {
            task.setDescription(newDescription);
            System.out.println("Updated: " + task);
        }
    }

    private Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
}
