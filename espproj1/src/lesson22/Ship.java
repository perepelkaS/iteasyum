package lesson22;

public class Ship {
    private Point startPoint;
    private int length;
    private boolean horizontal;

    public Ship(Point startPoint, int length, boolean horizontal) {
        this.startPoint = startPoint;
        this.length = length;
        this.horizontal = horizontal;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "startPoint=" + startPoint +
                ", length=" + length +
                ", horizontal=" + horizontal +
                '}';
    }
}
