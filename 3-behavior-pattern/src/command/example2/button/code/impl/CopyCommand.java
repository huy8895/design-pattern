package command.example2.button.code.impl;

import command.example2.button.code.Application;
import command.example2.button.code.Command;
import command.example2.button.code.Editor;

public class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    protected boolean execute() {
        app.setClipboard(editor.getSelection());
        return false;
    }
}
