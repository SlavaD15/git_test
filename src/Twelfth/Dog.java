package Twelfth;

public class Dog extends Pet{
    public Dog(int age, float height, float weight, String color){
        super(age, height, weight, color);
    }

    @Override
    public void eat() {
        System.out.println("Я очень голоден, давайте перекусим мясом!");
    }
}
