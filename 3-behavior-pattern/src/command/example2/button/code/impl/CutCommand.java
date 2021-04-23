package command.example2.button.code.impl;

import command.example2.button.code.Application;
import command.example2.button.code.Command;
import command.example2.button.code.Editor;

public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    protected boolean execute() {
        saveBackup();
        app.setClipboard(editor.getSelection());
        editor.deleteSelection();
        return true;
    }
}
