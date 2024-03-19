import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        //System.out.println(func(a));
        //data_types(a);
        System.out.println(Integer.toBinaryString(7));
    }
    static int func(String a){
        return Integer.valueOf(a, 2);
    }

    static void data_types(String a){
        switch(a){
            case "int":
                System.out.println("max - 2,147,483,647");
                System.out.println("min - -2,147,483,648");
                break;
            case "long":
                System.out.println("max - 9,223,372,036,654,775,807");
                System.out.println("min - -9,223,372,036,654,775,808");
                break;
            case "float":
                System.out.println("max - 0.0000001");
                System.out.println("min - -0.0000001");
                break;
            case "double":
                System.out.println("max - 0.000000000000001");
                System.out.println("min - -0.000000000000001");
                break;
        }
    }
}
