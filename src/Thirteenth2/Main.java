package Thirteenth2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        FourSidedFigure figure = new FourSidedFigure(10, 50);
        Cylinder cylinder = new Cylinder(5, 15);
        Parallelepiped parallelepiped = new Parallelepiped(10, 5, 7);

        circle.say_parameters();
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        figure.say_parameters();
        System.out.println(figure.calculateArea());
        System.out.println(figure.calculatePerimeter());

        cylinder.say_parameters();
        System.out.println(cylinder.calculateArea());
        System.out.println(cylinder.calculatePerimeter());
        System.out.println(cylinder.calculateVolume());

        parallelepiped.say_parameters();
        System.out.println(parallelepiped.calculateArea());
        System.out.println(parallelepiped.calculatePerimeter());
        System.out.println(parallelepiped.calculateVolume());

        compare_TwoDimensional_figures(circle, figure);
        compare_ThreeDimensional_figures(cylinder, parallelepiped);
    }

    static void compare_TwoDimensional_figures(Figure figure1, Figure figure2){
        if(figure1.calculateArea() > figure2.calculateArea()){
            System.out.println("First is bigger");
        }else{
            System.out.println("Second is bigger");
        }
    }
    static void compare_ThreeDimensional_figures(ThreeDimensionalFigure figure1, ThreeDimensionalFigure figure2){
        if(figure1.calculateVolume() > figure2.calculateVolume()){
            System.out.println("First is bigger");
        }else{
            System.out.println("Second is bigger");
        }
    }
}
