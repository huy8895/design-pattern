package command.example2.button.code;

public class Editor {
    private String text;

    public String getSelection(){
        return "Return selected text.";
    }

    public void deleteSelection(){
        // Delete selected text.

    }

    public void replaceSelection(){
        // Insert the clipboard's contents at the current
        // position.

    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
