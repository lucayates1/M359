package U9.Shapes;

public class Square extends Rectangle{
    private int sideLength;
    public Square(String shape, String color, int sideLength){
        super(shape, color);
        this.sideLength  = sideLength;
    }
    public double findArea(){
        return sideLength * sideLength;
    }
    public void scaleSize(double scale){
        this.sideLength =  (int) (sideLength * scale);
    }
    public int getSideLength(){
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
