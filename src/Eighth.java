import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
/*
        String a = "privet123.privet123";
        System.out.println(a.indexOf("."));

        Scanner in = new Scanner(System.in);
        int weight_earth = in.nextInt();
        System.out.println(weight_earth);
        System.out.println((int)(0.17*weight_earth));

        String a = "Я первый и только первый!";
        System.out.println(a.replaceAll("первый", "последний"));

        Scanner in = new Scanner(System.in);
        float interval = in.nextFloat();
        System.out.println(interval*1100);
  */
        //Eighth.game();
        Eighth.marathon_winner();
    }

    static void game() {
        char a = 'h';
        int numeric_value = Character.getNumericValue(a);
        while (true) {
            Scanner in = new Scanner(System.in);
            char input = in.next().charAt(0);
            int numeric_input = Character.getNumericValue(input);
            if (numeric_input == numeric_value) {
                System.out.println("Right");
                break;
            } else if (numeric_input > numeric_value) {
                System.out.println("You're too high");
            } else {
                System.out.println("You're too low");
            }
        }
    }

    static void marathon_winner() {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma",
                "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        int[] times_sorted = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        for (int j = 0; j < times_sorted.length; j++) {
            for (int i = 0; i < times_sorted.length - 1; i++) {
                if (times_sorted[i] > times_sorted[i + 1]) {
                    int a = times_sorted[i];
                    times_sorted[i] = times_sorted[i + 1];
                    times_sorted[i + 1] = a;
                }
            }
        }
        int min = times_sorted[0];
        int tmin = times[0];
        int tpos = 0;
        String[] winners = new String[3];
        int[] time = new int[3];
        for (int i = 0; i < winners.length; i++) {
            for (int j = 0; j < times.length; j++) {
                if (times[j] < tmin) {
                    tmin = times[j];
                    tpos = j;
                }
            }
        }
    }
}