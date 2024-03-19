import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        //Eleventh.biggest_smallest();
        //Eleventh.sort_by_length();
        //Eleventh.middle();
        //Eleventh.unique_simbol();
        Eleventh.palindrome();

    }

    static void biggest_smallest() {
        Scanner in_n = new Scanner(System.in);
        int n = in_n.nextInt();
        int min = 999999999;
        int max = 0;
        String min_text = "";
        String max_text = "";
        for (int i = 0; i < n; i++) {
            Scanner in_str = new Scanner(System.in);
            String str = in_str.nextLine();
            int str_length = str.length();
            if (str_length < min) {
                min = str_length;
                min_text = str;
            }
            if (str_length > max) {
                max = str_length;
                max_text = str;
            }
        }
        System.out.println(min_text + " - " + min);
        System.out.println(max_text + " - " + max);
    }

    static void sort_by_length() {
        Scanner in_n = new Scanner(System.in);
        int n = in_n.nextInt();
        String[] array_min = new String[n];
        String[] array_max = new String[n];
        for (int i = 0; i < n; i++) {
            String str = in_n.next();
            array_min[i] = str;
            array_max[i] = str;
        }
        for (int j = 0; j < array_min.length; j++) {
            for (int i = 0; i < array_min.length - 1; i++) {
                if (array_min[i].length() < array_min[i + 1].length()) {
                    String temp = array_min[i];
                    array_min[i] = array_min[i + 1];
                    array_min[i + 1] = temp;
                }
            }
        }
        for (String s : array_min) System.out.println(s);

        System.out.println("--------------------------");
        for (int j = 0; j < array_min.length; j++) {
            for (int i = 0; i < array_max.length - 1; i++) {
                if (array_max[i].length() > array_max[i + 1].length()) {
                    String temp = array_max[i];
                    array_max[i] = array_max[i + 1];
                    array_max[i + 1] = temp;
                }
            }
        }
        for (String s : array_max) System.out.println(s);
    }

    static void middle() {
        Scanner in_n = new Scanner(System.in);
        int n = in_n.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            String str = in_n.next();
            array[i] = str;
        }

        int sum = 0;
        for (String s : array) {
            sum += s.length();
        }
        int middle = sum / n;

        for (String s : array) {
            if (s.length() < middle) {
                System.out.println(s + " (" + s.length() + ")");
            }
        }
        System.out.println("---------------------------------");
        for (String s : array) {
            if (s.length() > middle) {
                System.out.println(s + " (" + s.length() + ")");
            }
        }
    }

    static void unique_simbol() {
        Scanner in_n = new Scanner(System.in);
        int n = in_n.nextInt();
        String[] array = new String[n];
        int[] array_int = new int[n];
        for (int i = 0; i < n; i++) {
            String str = in_n.next();
            array[i] = str;
        }
        for (int i = 0; i < array.length; i++) {
            array_int[i] = check_word(array[i]);
        }
        /*
        int min = array_int[0];
        int pos = 0;
        for(int i=0;i<array_int.length;i++){
            if(array_int[i] < min){
                min = array_int[0];
                pos = i;
            }
        }
        System.out.println(array[pos]);
         */
        String word = "";
        boolean check = true;
        for (int i = 0; i < array_int.length && check != false; i++) {
            if (array_int[i] == 0) {
                word = array[i];
                check = false;
            }
        }
        System.out.println(word);


    }

    static int check_word(String a) {
        char array[] = a.toCharArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = '*';
                    sum++;
                }
            }
        }
        return sum;
    }

    static void palindrome(){
        Scanner in_n = new Scanner(System.in);
        int n = in_n.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            String str = in_n.next();
            array[i] = str;
        }

        int count = 0;
        String[] equal_words = new String[n];
        for(int i = 0;i<array.length;i++){
            if(array[i].equals(reverse_the_word(array[i]))){
                equal_words[count] = reverse_the_word(array[i]);
                count++;
            }
        }

        if(equal_words[1] != null){
            System.out.println(equal_words[1]);
        }else{
            System.out.println(equal_words[0]);
        }
    }

    static String reverse_the_word(String word){
        String check = "";
        char temp = ' ';
        for(int j = 0;j<word.length();j++){
            temp = word.charAt(j);
            check = temp + check;
        }
        return check;
    }
}

