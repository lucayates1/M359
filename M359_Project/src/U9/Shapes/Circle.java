package U9.Shapes;

public class Circle extends Shape{
    private int radius;
    public Circle(String shape, String color, int radius){
        super(shape,color);
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * (radius * radius);
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
}
