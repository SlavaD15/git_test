package Thirteenth2;

public class Cylinder extends ThreeDimensionalFigure{
    double radius, height;
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double calculateVolume(){
        return Math.PI * (radius*radius) * height;
    }
    public double calculatePerimeter(){
        return 4*radius + 2*height;
    }
    public double calculateArea(){
        return 2*Math.PI*radius*(radius + height);
    }
    void say_parameters(){
        System.out.println("My radius is " + radius + " and height is " + height);
    }

}
