package command.example2.button.code;

public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void saveBackup(){
        backup = editor.getText();
    }

    public void undo(){
        editor.setText(backup);
    }

    protected abstract boolean execute();
}
