package Thirtieth_one;

public class Subject {
    String name;
    Material material;
    double volume;

    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public Subject(){
        this.name = "name_default";
        this.material = new Material("Steel", 15);
        this.volume = 50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass(){
        return volume* getMaterial().density;
    }

    public void toStrings(){
        System.out.println(name + ";" + material.name + ";" + getMaterial().density + ";" + volume + ";" + getMass());

    }
}
