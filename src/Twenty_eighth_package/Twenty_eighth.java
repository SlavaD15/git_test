package Twenty_eighth_package;

import java.util.Scanner;

public class Twenty_eighth {
    public static void main(String[] args) {
        System.out.println(paintNecessary(2, 2));
        System.out.println(isGoingThought(7));
        System.out.println(howManyMonths());
        System.out.println(attempt(40, 30, 70));
        System.out.println("----------");
        Student student = new Student(7, 9, 10, 4);
        System.out.println(averageGrade(student));
    }
    public static double paintNecessary(int a, int b){
        return 0.1*(a*b);
    }

    public static boolean isGoingThought(int num){
        return 80+(num*2)<95;
    }

    public static int howManyMonths(){
        int start = 120;
        int count = 0;
        while(start<1060){
            start = start*2;
            count++;
        }
        return count;
    }

    public static boolean attempt(int a, int b, int c){
        return a==70||b==70||c==70;
    }

    public static int averageGrade(Student student){
        return (student.herbology+student.historyOfMagic+student.potionMaking+student.transfiguration)/4;
    }

}
