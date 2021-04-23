package command.example2.button.code;

public class Button {
    private Command command;

    private Button(Command command) {
        this.command = command;
    }

    public static Button setCommand(Command command){
        return new Button(command);
    };

    public boolean onClick(){
        System.out.println("button click = " + command.getClass());
        return command.execute();
    }

}
