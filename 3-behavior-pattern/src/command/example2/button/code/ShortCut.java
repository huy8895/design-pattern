package command.example2.button.code;

public class ShortCut {

    public static boolean onKeypress(String key, Command command) {
        System.out.println("onKeypress :" + key + " command: " + command.getClass());
        return command.execute();
    }

}
