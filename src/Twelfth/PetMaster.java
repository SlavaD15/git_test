package Twelfth;

import Twelfth.Pet;

public class PetMaster {
    public static void main(String[] args) {
        Pet myPet = new Pet(1, 52.0F, 12.5F, "pink");
        Dog myDog = new Dog(10, 64.7F, 25.4F, "black");
        Cat myCat = new Cat(7, 33.4F, 11.2F, "white");
        myPet.eat();
        System.out.println(myPet.say("Чик!! Чирик!!!"));
        System.out.println(myPet.getAge());
        System.out.println(myPet.getHeight());
        System.out.println(myPet.getWeight());
        System.out.println(myPet.getColor());
        myPet.sleep();

        myDog.eat();
        System.out.println(myDog.say(""));
    }
}
