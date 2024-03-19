package Twenty_second;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Twenty_second {
    public static void main(String[] args) {
        //1
        List<Person> list = Arrays.asList(new Person("A", 5), new Person("B", 2), new Person("C", 8), new Person("D", 4));
//        //list.stream().sorted((p1, p2) -> p1.name.compareTo(p2.name)).forEach(x -> System.out.println(x.name));
//        list.stream().sorted(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.age-o2.age;
//            }
//        }).forEach(x -> System.out.println(x.age));

        //2
//      list.stream().forEach(x -> System.out.println("Person: name = \"" + x.name + "\" , age = " + x.age));

        //3
        List<Book> list_book = Arrays.asList(new Book("A", "A A", 300), new Book("B", "B B", 150), new Book("C", "A A", 400), new Book("D", "D D", 700));
        //System.out.println(list_book.stream().anyMatch(x -> x.pageCount>=500));
        //System.out.println(list_book.stream().allMatch(x -> x.pageCount>=500));

        //4
//        Optional<Book> one = list_book.stream().min(new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.pageCount-o2.pageCount;
//            }
//        });
        //one.stream().forEach(x -> System.out.println(x.pageCount));
        //list_book.stream().min((Book x, Book y) -> x.pageCount - y.pageCount).stream().forEach(System.out::println);
        //System.out.println(list_book.stream().min(Comparator.comparing(Book::getPageCount)));
        //System.out.println(list_book.stream().max(Comparator.comparing(Book::getPageCount)));
        //System.out.println(list_book.stream().map(x -> x.pageCount).min((x, y) -> x-y));
        //System.out.println(list_book.stream().min((x, y) -> x.pageCount-y.pageCount));

        //5
//        list_book.stream().map(x -> x.author).forEach(x -> System.out.println("Author: " + x));
//        System.out.println();
//        list_book.stream().map(x -> x.author).collect(Collectors.toList()).stream().forEach(x -> System.out.println("Author: " + x));

        //6
        //list_book.stream().map(x -> x.author).distinct().forEach(System.out::println);

        //7
        //Stream.of(new Author("A", 25), new Author("B", 49), new Author("C", 36)).filter(x -> x.age>=35).forEach(x -> System.out.println("Author: " + x.name + ", age - " + x.age));

        //8
        //System.out.println("Age sum is " + (Stream.of(new Author("A", 1), new Author("B", 4), new Author("C", 5)).mapToInt(x -> x.age).sum()));
    }
}
