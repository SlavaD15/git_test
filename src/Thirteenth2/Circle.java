package Thirteenth2;

public class Circle extends Figure {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * (radius*radius);
    }

    public double calculatePerimeter(){
        return 2*Math.PI * radius;
    }

    public void say_parameters(){
        System.out.println("My radius is " + radius);
    }


}
