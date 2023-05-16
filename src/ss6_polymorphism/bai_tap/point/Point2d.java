package ss6_polymorphism.bai_tap.point;

import java.util.Arrays;

public class Point2d {
    private float x;
    private float y;

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2d() {

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float setY() {
        return y;
    }

    public float setX() {
        return x;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = new float[2];
        xy[0] = getX();
        xy[1] = getY();
        return xy;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x,y=" + Arrays.toString(getXY()) +
                '}';
    }
}
