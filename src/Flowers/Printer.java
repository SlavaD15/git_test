package Flowers;

public class Printer {
    public static void printBouquet(Flower[] flowers){
        StringBuilder str = new StringBuilder(flowers.length);
        str.append("The bouquet consists of the following flowers: [ ");
        for(Flower flower : flowers){
            str.append(flower.getName());
            str.append(", ");
        }
        str.append("]");
        System.out.println(str.toString());
    }
    public static void printPrice(int price){
        System.out.println("Price of this bouquet:" + price);
    }
}
