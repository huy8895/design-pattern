package prototype.example2;

public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        long startTime = System.currentTimeMillis() ;
        Board chessBoard = new Board();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create a board" + (endTime - startTime));
        chessBoard.print();


        long startTime2 = System.currentTimeMillis() ;
        Board2 chessBoard2 = new Board2();
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time taken to create a board" + (startTime2 - endTime2));
        chessBoard2.print();

        long startTime3 = System.currentTimeMillis() ;
        Board3 chessBoard3 = new Board3();
        long endTime3 = System.currentTimeMillis();
        System.out.println("Time taken to create a board" + (startTime3 - endTime3));
        chessBoard3.print();

    }
}
