package Twenty_fifth;

import java.util.*;

public class HelloWorld1 {

    public static class Util {
        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList(2, 3);
        for (Object element : list) {
            System.out.println((int)(Util.getValue(element)) + 1);
        }
    }
}

