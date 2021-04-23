package command.example2.button.code;

import command.example2.button.code.impl.CopyCommand;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private String clipboard;
    private List<Editor> editors;
    private Editor activeEditor;
    private CommandHistory history;

    public Application() {
        this.clipboard = "clipboard";
        this.activeEditor = new Editor();
        this.editors = new ArrayList<>();
        this.history = new CommandHistory();
    }

    public void createUI(){
        CopyCommand copyCommand = new CopyCommand(this, activeEditor);
        Button copyButton = Button.setCommand(copyCommand);
        copyButton.onClick();

        ShortCut.onKeypress("ctrl + c" , copyCommand);
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undoCommand() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    public List<Editor> getEditors() {
        return editors;
    }

    public void setEditors(List<Editor> editors) {
        this.editors = editors;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public Editor getActiveEditor() {
        return activeEditor;
    }

    public void setActiveEditor(Editor activeEditor) {
        this.activeEditor = activeEditor;
    }

    public CommandHistory getHistory() {
        return history;
    }

    public void setHistory(CommandHistory history) {
        this.history = history;
    }
}
