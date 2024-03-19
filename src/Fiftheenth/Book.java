package Fiftheenth;

public class Book implements Comparable<Book>{
    String name;
    String author;
    int countOfPages;

    public Book(String name, String author, int countOfPages) {
        this.name = name;
        this.author = author;
        this.countOfPages = countOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", countOfPages=" + countOfPages +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        int differenceName = this.name.compareTo(book.name);
        int differenceAuthor = this.author.compareTo(book.author);
        int differencePages = this.countOfPages - book.countOfPages;
        if(differenceName != 0){
            return differenceName;
        }if(differenceAuthor != 0){
            return differenceAuthor;
        }return differencePages;
    }

}
