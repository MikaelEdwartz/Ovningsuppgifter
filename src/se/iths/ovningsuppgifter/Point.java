package se.iths.ovningsuppgifter;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Point other) {
        double distance;
        int xSqrt = (this.x - other.x) * (this.x - other.x);
        int ySqrt = (this.y - other.y) * (this.y - other.y);
        distance = Math.sqrt((xSqrt + ySqrt));
        return distance;
    }
}