package ss4_class_and_object.bai_tap.exercise_3;

public class Fan {
    final String SLOW = "slow";
    final String MEDIUM = "medium";
    final String FAST = "fast";
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(int speed, int radius, String color, boolean status) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = status;
    }

    public Fan(int speed) {
        getSpeed(speed);
        this.on = false;
        this.color = "blue";
        this.radius = 5;
    }

    public String getSpeed(int n) {
        switch (n) {
            case 1:
                return getSLOW();
            case 2:
                return getMEDIUM();
            case 3:
                return getFAST();
        }
        return "0";
    }

    public String getSLOW() {
        return SLOW;
    }

    public String getMEDIUM() {
        return MEDIUM;
    }

    public String getFAST() {
        return FAST;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                ", speed=" + getSpeed(speed) +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

