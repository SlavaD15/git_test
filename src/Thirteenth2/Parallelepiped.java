package Thirteenth2;

public class Parallelepiped extends ThreeDimensionalFigure{
    double length, width, height;
    public Parallelepiped(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double calculateVolume(){
        return length * width * height;
    }
    public double calculatePerimeter(){
        return 4*length + 4*width + 4*height;
    }
    public double calculateArea(){
        return 2*length*width + 2*width*height + 2*length*height;
    }
    void say_parameters(){
        System.out.println("My length is " + length + ", my width is " + width + " and my height is " + height);
    }
}
