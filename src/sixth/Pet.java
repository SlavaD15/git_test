package sixth;

public class Pet {
    int age;
    float height;
    float weight;
    String color;

    public static void eat(){
        System.out.println("Я очень голоден, давайте перекусим чипсами!");
    }
    public static void sleep(){
        System.out.println("Спокойной ночи! До завтра!");
    }
    public static String say(String aWord){
        String petResponse = "Ну ладно! " + aWord;
        return petResponse;
    }
}
