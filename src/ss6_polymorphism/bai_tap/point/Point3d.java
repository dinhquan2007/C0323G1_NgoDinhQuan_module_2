package ss6_polymorphism.bai_tap.point;

import java.util.Arrays;

public class Point3d extends Point2d {
    float z;
    float[] xyz = new float[3];

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3d() {

    }

    public float getZ() {
        return z;
    }

    void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        xyz[0] = getX();
        xyz[1] = getY();
        xyz[2] = getZ();
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "[x,y,z]=" + Arrays.toString(getXYZ()) +
                '}';
    }
}
