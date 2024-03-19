package Fiftheenth;

public class Dog {
    String name;
    int age;
    int height;
    enum Breed{
        SHINTZU,
        POODLE,
        CHIHUAHUA
    }
    public Dog(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
