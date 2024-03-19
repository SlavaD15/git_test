import java.util.Scanner;

public class FIrst {
    public static void main(String[] args) {

        /*
        String cat = "программист";
        int age = 99;
        String eat = "молоко";
        int number = 3;

        System.out.println("Наш кот великий " + cat);
        System.out.println("Мне исполнилось " + age + " лет");
        System.out.println("На обед было вкусное " + eat);
        System.out.println(number + " порции молока в день");


        int num = 45;
        int num2 = 9;
        String str = "Пончик";
        float num3 = 6.66f;

        Scanner in = new Scanner(System.in);
        boolean name = in.hasNext();
        System.out.println(name);

        byte num1 = 15, num2 = 5, num3 = 9;
        if(num1>num2 && num1>num3){
            System.out.println("num1");
        } else if(num2>num1 && num2>num3){
            System.out.println("num2");
        } else {
            System.out.println("num3");
        }

        byte x = 45;
        if (x%2==0){
            System.out.println("Число " + x + " является чётным");
        }else{
            System.out.println("Число " + x + " является нечётным");
        }

        byte x = 47;
        if (x%10==7){
            System.out.println("Последнее число " + x + " - это 7");
        }else{
            System.out.println("Последнее число " + x + " - это не 7");
        }

        Scanner in = new Scanner(System.in);
        short x = in.nextShort();
        if (x%4==0 && x%100!=0 || x%400==0){
            System.out.println("Год " + x + " является високосным");
        }else{
            System.out.println("Год " + x + " является не високосным");
        }

        short num1 = 15, num2 = 100, num3 = 101;
        if(num1<num2 && num1<num3){
            System.out.println("Минимальное число из чисел " + num1 + ", " + num2 + ", " + num3 + " - " + num1);
        } else if(num2<num1 && num2<num3){
            System.out.println("Минимальное число из чисел " + num1 + ", " + num2 + ", " + num3 + " - " + num2);
        } else {
            System.out.println("Минимальное число из чисел  " + num1 + ", " + num2 + ", " + num3 + " - " + num3);
        }

        Scanner in = new Scanner(System.in);
        short x = in.nextShort();
        if(x%10==0 || x%10<=9 && x%10>=5){
            System.out.println(x + " рублей");
        }else if(x%10==1){
            System.out.println(x + " рубль");
        }else{
            System.out.println(x + " рубля");
        }
         */
        Scanner in = new Scanner(System.in);
        byte n = in.nextByte();
        if(n==1){
            System.out.println("Номер 1 - понедельник");
        }else if(n==2){
            System.out.println("Номер 2 - вторник");
        }else if(n==3){
            System.out.println("Номер 3 - среда");
        }else if(n==4){
            System.out.println("Номер 4 - четверг");
        }else if(n==5){
            System.out.println("Номер 5 - пятница");
        }else if(n==6){
            System.out.println("Номер 6 - суббота");
        }else if(n==7){
            System.out.println("Номер 7 - воскресенье");
        }else{
            System.out.println("There is no such day");
        }
    }
}

