package Thirty_second;

import java.util.Objects;
import java.util.Scanner;

public abstract class Purchase {
    private String name;
    private Dollar price;
    private int amount;

    public Purchase(String name, Dollar price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Purchase(){
        this.name = "Purchase";
        this.price = new Dollar(100);
        this.amount = 1;
    }

    public Purchase(Scanner in){
        String string = in.nextLine();
        String[] string_array = string.split(" ");
        this.name = string_array[0];
        this.price = new Dollar(Integer.parseInt(string_array[1]));
        this.amount = Integer.parseInt(string_array[2]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price.cents;
    }

    public void setPrice(int price) {
        this.price.cents = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCost(){
        return getAmount()*getPrice();
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public boolean equals(Purchase purchase){
        return Objects.equals(this.getName(), purchase.getName()) && this.getPrice() == purchase.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return amount == purchase.amount && Objects.equals(name, purchase.name) && Objects.equals(price, purchase.price);
    }
}