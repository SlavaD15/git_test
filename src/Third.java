import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        /*
        int k = 0;
        int i = 1;
        while(k!=10){
            if (i%3==0){
                System.out.println(i);
                k++;
            }
            i++;
        }
        System.out.println(k);

        for(int i=1;i<=10;i++){
            if(i%1==0 && i%i==0){
                System.out.printf("%d - является простым\n", i);
            }else{
                System.out.printf("%d - не является простым\n", i);
            }
        }

        int a=0;
        for(int i=1;i<=10;i++){
            a+=i;
        }
        System.out.println(a);

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        for(int i=1;i<=a;i++){
            Scanner in1 = new Scanner(System.in);
            int b = in.nextInt();
            sum+=b;
        }
        System.out.println(sum);

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 1;
        for(int i=1;i<=a;i++){
            sum *= i;
        }
        System.out.println(sum);


        double nums[] = new double[10];
        for(int i=0;i<9;i++) {
            nums[i] = Math.floor(Math.random() * 10);
        }
        for(int j=0;j<nums.length;j++){
            System.out.println(nums[j]);
        }

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean tf = false;
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        for(int i : nums){
            if(i==input){
                tf = true;
            }
        }~
        System.out.println(tf);

        char[] array = {'i', 't', 'g', 'e', 'n', 'i', 'o'};
        array[6] = 'k';
        for(char i : array){
            System.out.print(i);
        }

        int[] array = new int[10];
        int q;
        for(int i=0;i<array.length;i++){
            array[i] = (int)(Math.random()*100);
        }
        for(int j : array){
            System.out.println(j);
        }

        for(int k=0;k<array.length-1;k+=2){
            q = array[k+1];
            array[k+1] = array[k];
            array[k] = q;
        }
        System.out.println("---------------------------------------------------------------------");
        for(int j : array){
            System.out.println(j);
        }

        int[] price_before = {1050, 2000, 900, 1500, 895, 2700, 1000};
        double[] discount = {0.1, 0.2, 0.05, 0.15, 0.02, 0.25, 0.02};
        double[] price_after = new double[7];
        for(int i=0;i<price_before.length;i++){
            price_after[i] = price_before[i]-(price_before[i] * discount[i]);
        }
        for(double i: price_after){
            System.out.println(i);
        }
        System.out.println("-----------------------------------");
        double min = price_after[0];
        for(int i=0;i<price_before.length;i++){
            if(min>price_after[i]) {
                min = price_after[i];
            }
        }
        System.out.println(min);
        */
        int a = 123123;
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            sum /= 10;
        }
        System.out.println(sum);
    }
}
