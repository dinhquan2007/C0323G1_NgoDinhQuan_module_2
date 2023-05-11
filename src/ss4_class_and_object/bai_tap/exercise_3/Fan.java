package ss4_class_and_object.bai_tap.exercise_3;

public class Fan {
    final String SLOW = "slow";
    final String MEDIUM = "medium";
    final String FAST = "fast";
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(int speed,int radius,String color,boolean status){
        this.speed=speed;
        this.radius=radius;
        this.color=color;
        this.on=status;
    }
    public Fan(int speed){
        getSpeed(speed);
        this.on= false;
        this.color="blue";
        this.radius=5;
    }
    public String getSpeed(int n) {
        switch (n) {
            case 1:
                return SLOW;
            case 2:
                return MEDIUM;
            case 3:
                return FAST;
        }
        return "off";
    }
}

