package Thirtieth_one;

public class Main {
    public static void main(String[] args) {
        Subject steel_wire = new Subject("Wire", new Material("copper", 8500), 0.03);
        steel_wire.toStrings();
        System.out.println("The wire mass is " + steel_wire.getMass() + " kg");
    }
}
