package Twenty_first;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Twenty_first {
    public static void main(String[] args) {
        //Stream.of(1, 2, 3, 4, 5).map(x -> x * 2).forEach(System.out::println);

        //Stream.of("asd",  "Hello", "Hello1").filter(x -> x.equals("Hello")).forEach(System.out::println);
        //Stream.of("",  "Hello", "Hello1").filter(x -> !x.isEmpty()).forEach(System.out::println);

        List<String> list = Arrays.asList("a1", "a2", "a3", "a4", "a8");
        //System.out.println(list.stream().filter(x -> Objects.equals(x, "a1")).count()); //a
        //b
//        if(list.stream().count() > 0){
//            list.stream().limit(1).forEach(System.out::println);
//       }else{
//            System.out.println(0);
//        }
        //c
        //list.stream().skip(list.stream().count()-1).limit(1).forEach(System.out::println);
        //d
        //list.stream().skip(2).limit(1).forEach(System.out::println);
        //e
        //list.stream().skip(2).limit(2).forEach(System.out::println);
        //f
        //list.stream().filter(x -> x.equals("a8")).forEach();
        //list.stream().forEach(x -> System.out.println(x.equals("a8")));
        //list.stream().filter(x -> x.equals("a8")).forEach(System.out.println(x));
        //list.stream().filter(x -> x.equals("a8")).forEach(x -> System.out.println(x.equals("a8")));
        //System.out.println(list.stream().anyMatch(x -> x.equals("a8")));
        //g
        List<People> array = Arrays.asList(new People("Vasya", 16, Sex.MAN), new People("Petya", 23, Sex.MAN), new People("Yelena", 41, Sex.WOMEN), new People("Ivan Ivanovich", 69, Sex.MAN));
        //1)
        //OptionalDouble avg = array.stream().filter(x -> x.sex == Sex.MAN).map(x -> x.age).mapToInt(x -> x).average();
        //System.out.println(avg);
        //2)
        array.stream().filter(x -> (x.sex == Sex.MAN && (x.age >= 18 && x.age<=60)) || x.sex == Sex.WOMEN && (x.age>= 18 && x.age <= 55)).forEach(x -> System.out.println(x.name));
    }
}

