package Twenty_forth;

import Twenty_first.Twenty_first;
import com.sun.jdi.InterfaceType;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        Class c = Person.class;
        String name = c.getName();
        System.out.println(name);
        System.out.println("-------------------");
        //2
        Class [] interfaces = c.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);
        System.out.println("-------------------");
        //3
        Field[] fields = c.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);
        System.out.println("-------------------");
        //4
        Method[] methods = c.getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);
        System.out.println("-------------------");
        //5
        Person person = new Person("default name", 25, 12);
        try {
            Field field1 = c.getDeclaredField("name");
            field1.setAccessible(true);
            System.out.println(person.getName());
            field1.set(person, "changed name");
            System.out.println(person.getName());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-------------------");
        //6
        try {
            Method method_print = c.getDeclaredMethod("print", String.class);
            method_print.setAccessible(true);
            method_print.invoke(person, "printed");
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e){
            throw new RuntimeException(e);
        }
        //7 пропускаем
        //8
        //Class person_class = Person.class;
        Class person_class = null;
        try {
            person_class = Class.forName("Twenty_forth.Person");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(person_class);
    }
}

