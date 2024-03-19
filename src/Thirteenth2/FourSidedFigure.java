package Thirteenth2;

public class FourSidedFigure extends Figure {
    double length, width;
    public FourSidedFigure(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length*width;
    }

    public double calculatePerimeter(){
        return 2*(length+width);
    }
    public void say_parameters(){
        System.out.println("My length is " + length + " and width is " + width);
    }
}
