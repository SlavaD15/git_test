package Twelfth;

public class Pet {
    private int age;
    private float height;
    private float weight;
    private String color;

    public Pet(int age, float height, float weight, String color){
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }
    public void eat(){
        System.out.println("Я очень голоден, давайте перекусим чипсами!");
    }
    public void sleep(){
        System.out.println("Спокойной ночи! До завтра!");
    }
    public String say(String aWord){
        return "Ну ладно! " + aWord;
    }

    public int getAge(){
        return age;
    }

    public float getHeight(){
        return height;
    }

    public float getWeight(){
        return weight;
    }

    public String getColor(){
        return color;
    }
}
