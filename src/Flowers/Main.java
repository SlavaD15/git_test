package Flowers;

import java.awt.event.HierarchyBoundsAdapter;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet(5);

        Flower rose = new Rose();
        Flower lily = new Lily();
        Flower chrysanthemum = new Chrysanthemum();
        Flower peony = new Peony();
        Flower orchid = new Orchid();

        bouquet.addFlower(rose);
        bouquet.addFlower(lily);
        bouquet.addFlower(chrysanthemum);
        bouquet.addFlower(peony);
        bouquet.addFlower(orchid);

        Printer.printBouquet(bouquet.getFlowers());
        Printer.printPrice(bouquet.getBouquetCost());
    }
}
