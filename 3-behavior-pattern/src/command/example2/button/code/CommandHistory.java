package command.example2.button.code;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> histories;

    public void push(Command command) {
        histories.push(command);
    }

    public Command pop() {
        Command command = histories.pop();
        return command;
    }
}
