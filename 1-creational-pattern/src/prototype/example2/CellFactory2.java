package prototype.example2;

import java.util.HashMap;
import java.util.Map;

public class CellFactory2 {
    private static final Map<Color, Cell2> CELL_CACHE = new HashMap<>();

    private CellFactory2() {

    }

    public static Cell2 getCell(Color color) throws CloneNotSupportedException {
        if (!CELL_CACHE.containsKey(color)) {
            Cell2 cell2 = new Cell2(color.name());
            CELL_CACHE.put(color, cell2);
        }
        return CELL_CACHE.get(color).clone();
    }
}
