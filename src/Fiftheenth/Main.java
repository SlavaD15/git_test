package Fiftheenth;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] bookArray = {new Book("War and Piece volume 4", "Lev Tolstoy", 202),
                new Book("War and Piece volume 1", "Lev Tolstoy", 308),
                new Book("War and Piece volume 3", "Lev Tolstoy", 346),
                new Book("War and Piece volume 2", "Lev Tolstoy", 322),
                new Book("War and Piece epilogue", "Lev Tolstoy", 96),
                new Book("Fahrenheit 451", "Ray Bradbury", 256)};

        Arrays.sort(bookArray);
        for(Book book : bookArray){
            System.out.println(book.name);
        }
    }
}
