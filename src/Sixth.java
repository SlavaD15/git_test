import java.util.Scanner;

public class Sixth {
    /*
    void biggest(int a, int b){
        if(a>b) System.out.println(a); else System.out.println(b);
    }
    void isEven(int a){
        System.out.println(a%2==0);
    }
    void just(int a){
        System.out.printf("%d %d", a*a, a*a+4);
    }
    void compare(int a){
        System.out.println(a > 69);
    }
    void exponential(int num1, int num2, int exp1, int exp2){
        int first = (int)Math.pow(num1, exp1);
        int second = (int)Math.pow(num2, exp2);
        int sum = first + second;
        System.out.printf("%d + %d = %d", first, second, sum);
    }
    void distance(int x1, int y1, int x2, int y2){
        int a = y1-y2;
        int b = x2-x1;
        int c2 = a*a + b*b;
        int c = (int)Math.sqrt(c2);
        System.out.println(c);
    }
    */
    int getInt(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    String getOperation(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    int calc(int num1, String operation, int num2){
        switch(operation){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num2*num2;
            case "/":
                return num1/num2;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {

        // Sixth one = new Sixth();
        // one.biggest(2, 1);
        // one.isEven(8);
        // one.just(7);
        // one.compare(90);
        // one.exponential(3, 2, 2, 6);
        /* Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        one.distance(x1, y1, x2, y2);
        Sixth calculator = new Sixth();
        System.out.println(calculator.calc(calculator.getInt(), calculator.getOperation(), calculator.getInt()));
         */
        int num = 2;
        int exp = 3;
        int exp_num = num;
        for(int i=0;i<exp-1;i++){
            exp_num = exp_num*num;
        }
        System.out.println(exp_num);

    }
}
