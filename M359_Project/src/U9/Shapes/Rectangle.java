package U9.Shapes;

public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(String shape, String color, int length, int width){
        super(shape, color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String shape, String color) {
        super(shape,color);
    }
    public double findArea(){
        return length * width;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
}
