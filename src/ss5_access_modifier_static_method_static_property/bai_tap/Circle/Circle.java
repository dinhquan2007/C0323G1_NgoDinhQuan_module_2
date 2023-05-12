package ss5_access_modifier_static_method_static_property.bai_tap.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){
    }
    public Circle(double r){
    this.radius=r;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ",area="+getArea()+
                '}';
    }
}
