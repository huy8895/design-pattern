package prototype.example1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Computer computer = new Computer("Window 10",
                "Word 2013",
                "BKAV",
                "Chrome v69",
                "Skype");

        Computer computer2 = computer.clone();
        computer2.setOthers("Skype, Teamviewer, FileZilla Client");

        System.out.println("computer = " + computer);
        System.out.println("computer2 = " + computer2);
    }
}
