package Lesson9;

public class UpdateTaskCommand implements Command {

    private TaskManager taskManager;
    private Task task;
    private String oldDescription;
    private String newDescription;

    public UpdateTaskCommand(TaskManager taskManager, Task task, String newDescription) {
        this.taskManager = taskManager;
        this.task = task;
        this.oldDescription = task.getDescription();
        this.newDescription = newDescription;
    }

    @Override
    public void execute() {
        taskManager.updateTask(task.getId(), newDescription);
    }

    @Override
    public void undo() {
        taskManager.updateTask(task.getId(), oldDescription);
    }
}
