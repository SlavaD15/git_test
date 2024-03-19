import java.util.Scanner;

public class Seventh2 {
    public static void main(String[] args) {
        //Seventh2.Biggest(255, 5);
        //Seventh2.IsEven(3);
        //Seventh2.square(5);
        //Seventh2.a(50);
        //Seventh2.square2(3, 2, 2, 6);
        //Seventh2.distance(2, 5, 6, 9);
        System.out.println(Seventh2.calc(Seventh2.getInt(), Seventh2.getOperation(), Seventh2.getInt()));
    }

    /*
    static void Biggest(int num1, int num2){
        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }

    static void IsEven(int num){
        System.out.println(num%2==0);
    }

    static void square(int num){
        System.out.println(num*num+4);
    }

    static void a(int num){
        System.out.println(num>69);
    }

    static void square2(int num1, int num2, int exp1, int exp2){
        int exp_num1 = num1;
        for(int i=0;i<exp1-1;i++){
            exp_num1 = exp_num1*num1;
        }
        int exp_num2 = num2;
        for(int i=0;i<exp2-1;i++){
            exp_num2 = exp_num2*num2;
        }
        System.out.println(exp_num1+exp_num2);
    }

    static void distance(int x1, int y1, int x2, int y2) {
        int a = y1 - y2;
        int b = x2 - x1;
        int c2 = a * a + b * b;
        int c = (int) Math.sqrt(c2);
        System.out.println(c);
    }
     */
    static int getInt() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    static String getOperation() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    static int calc(int num1, String operation, int num2) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num2 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }
}