package Lesson9;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        Invoker invoker = new Invoker();

        Task task1 = new Task(1, "Task 1");
        Command createTask1 = new CreateTaskCommand(taskManager, task1);
        invoker.executeCommand(createTask1);

        Task task2 = new Task(2, "Task 2");
        Command createTask2 = new CreateTaskCommand(taskManager, task2);
        invoker.executeCommand(createTask2);

        Command updateTask1 = new UpdateTaskCommand(taskManager, task1, "Updated Task 1");
        invoker.executeCommand(updateTask1);

        Command deleteTask2 = new DeleteTaskCommand(taskManager, task2);
        invoker.executeCommand(deleteTask2);


        invoker.undoCommand();
        invoker.undoCommand();
        invoker.undoCommand();
        invoker.undoCommand();
    }
}
