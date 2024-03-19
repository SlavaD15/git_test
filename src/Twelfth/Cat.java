package Twelfth;

public class Cat extends Pet{
    public Cat(int age, float height, float weight, String color){
        super(age, height, weight, color);
    }

    @Override
    public void eat() {
        System.out.println("Я очень голоден, давайте перекусим травой!");
    }
}
