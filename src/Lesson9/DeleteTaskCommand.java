package Lesson9;

public class DeleteTaskCommand implements Command {

    private TaskManager taskManager;
    private Task task;

    public DeleteTaskCommand(TaskManager taskManager, Task task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    @Override
    public void execute() {
        taskManager.removeTask(task.getId());
    }

    @Override
    public void undo() {
        taskManager.addTask(task);
    }
}





