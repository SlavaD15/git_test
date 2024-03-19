package Thirtieth_one;

public class Material {
    String name;
    double density;

    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public Material(){
        this.name = "name_default";
        this.density = 1;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

    public void toStrings(){
        System.out.println(name + ";" + density);
    }
}
