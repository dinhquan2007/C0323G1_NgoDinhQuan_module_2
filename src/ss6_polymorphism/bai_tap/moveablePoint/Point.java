package ss6_polymorphism.bai_tap.moveablePoint;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;
    private float [] xy= new float[2];
    public Point(){

    }
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }
    public float [] getXY(){
        xy[0]=this.x;
        xy[1]=this.y;
        return xy;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXy() {
        xy[0]=x;
        xy[1]=y;
        return xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xy=" + Arrays.toString(getXY()) +
                '}';
    }
}
