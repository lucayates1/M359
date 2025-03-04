package U9.Shapes;

public class Shape {
    private String shape;
    private String color;
    public Shape(String shape, String color){
        this.shape = shape;
        this.color = color;
    }
    public String toString(){
        return color + " " + shape;
    }
    public double findArea(){
        return 0.0;
    }

    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
