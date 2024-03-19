package Thirtieth;

import java.util.Arrays;
import java.util.Scanner;

public class Thirtieth {
    public static void main(String[] args) {
        System.out.println(isInt(5.0));
        System.out.println("--------------");
//        howMuchMoneyMain();
        System.out.println("--------------");
        System.out.println(isPalindrome("mavam")); // 3 задание доделал
        System.out.println("--------------");
        //multiplication_table();
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        double_array(array);
        System.out.println("--------------");
        daysToHoursMinutesSeconds(365);
        System.out.println("--------------");
        numberToArray(562);
    }
    public static boolean isInt(double double_num){
        return double_num % 1 == 0;
    }

    public static int howMuchMoney(int moneyPerHour, int hoursWorked){
//        if(hoursWorked <= 60 && moneyPerHour >= 8){
          return hoursWorked*moneyPerHour;
//        }else{
//            return 0;
//        }
    }

    public static void howMuchMoneyMain(){
        Scanner in = new Scanner(System.in);
        int moneyPerHour;
        int hoursWorked;
        do{
            moneyPerHour = in.nextInt();
            hoursWorked = in.nextInt();
        }while(moneyPerHour<8 || hoursWorked >60);
        System.out.println(howMuchMoney(moneyPerHour, hoursWorked));
    }

    public static boolean isPalindrome(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        return string.contentEquals(stringBuilder.reverse());
    }

    public static void multiplication_table(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = 0;i<=10;i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }

    public static void double_array(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "|");
            }
            System.out.println();
        }
    }

    public static void daysToHoursMinutesSeconds(int days){
        System.out.println("hours:" + days*24);
        System.out.println("minutes: " + days*24*60);
        System.out.println("seconds: " + days*24*60*60);
    }

    public static void numberToArray(int num){
        String string = String.valueOf(num);
        char[] chars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(i);
        }
        int[] nums = new int[string.length()];
        for(int i = 0;i < chars.length;i++){
            nums[i] = Character.getNumericValue(chars[i]);
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
