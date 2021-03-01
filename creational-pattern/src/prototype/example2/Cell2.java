package prototype.example2;

import java.util.concurrent.TimeUnit;

public class Cell2 implements Cloneable {
    private String color;
    private String coordinate;

    public Cell2(String color) {
        this.color = color;
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return "Cell2{" +
                "color='" + color + '\'' +
                ", coordinate='" + coordinate + '\'' +
                '}';
    }


    @Override
    protected Cell2 clone() throws CloneNotSupportedException {
        try {
            return (Cell2) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
}
