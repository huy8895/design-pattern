package prototype.example2;

public class Board3 {
    public static final int NO_OF_ROWS = 8;
    public static final int NO_OF_COLS = 8;

    private final Cell2[][] board;

    public Board3() throws CloneNotSupportedException {
        this.board = new Cell2[NO_OF_ROWS][NO_OF_COLS];
        Cell2 cell;
        for (int row = NO_OF_ROWS -1; row >= 0; row--){
            for (int col = NO_OF_COLS -1; col >= 0; col--){
                if ((row + col) % 2 == 0){
                    cell = CellFactory2.getCell(Color.WHITE);
                } else {
                    cell = CellFactory2.getCell(Color.BLACK);
                }
                cell.setCoordinate(String.format("%dx%d", row, col));
                board[row][col] = cell;
            }
        }
    }

    public void print() {
        for (int row = 0; row < NO_OF_ROWS; row++) {
            for (int col = 0; col < NO_OF_COLS; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
