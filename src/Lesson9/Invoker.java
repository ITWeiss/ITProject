package Lesson9;

import java.util.Stack;

public class Invoker {

    private Command[] history = new Command[10];
    private int currentIndex = 0;

    public void executeCommand(Command command) {
        command.execute();
        addToHistory(command);
    }

    public void undoCommand() {
        if (currentIndex > 0) {
            history[--currentIndex].undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }

    public void redoCommand() {
        if (currentIndex < history.length && history[currentIndex] != null) {
            history[currentIndex++].execute();
        } else {
            System.out.println("No commands to redo.");
        }
    }

    private void addToHistory(Command command) {
        if (currentIndex >= history.length) {
            System.out.println("History is full. Cannot add new command.");
            return;
        }
        history[currentIndex++] = command;
    }
}



