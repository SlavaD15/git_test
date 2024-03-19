import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        // WhatIsIt();
        // WhatCaseIsIt();
        // AllEnglishLetters();
        HelloName();
    }
    static void WhatIsIt(){
        Scanner in = new Scanner(System.in);
        char symbol = in.next().charAt(0);
        if(Character.isLetter(symbol)){
            System.out.println("letter");
        }else if(Character.isDigit(symbol)){
            System.out.println("digit");
        }else if(Character.isWhitespace(symbol)){
            System.out.println("white space");
        }else{
            System.out.println("special symbol");
        }
    }
    static void WhatCaseIsIt(){
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if(Character.isLetter(ch)){
            if(Character.isUpperCase(ch)){
                System.out.println("Upper case");
            }else{
                System.out.println("Lower case");
            }
        }else{
            System.out.println("Not a letter");
        }
    }

    static void AllEnglishLetters(){
        for(int i = 97; i <= 122;i++){
            System.out.println(Character.getName(i) + " - " + i);
        }
    }

    static void HelloName(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("\tHello " + str + "\n" +
                " \tConsectetur adipiscing elit. Mauris luctus nisl vel turpis lacinia, vitae fringilla magna\n" +
                " porttitor. Sed rhoncus lectus quis rhoncus mollis. Pellentesque eget massa sit amet felis\n" +
                "accumsan egestas. Donec tempor placerat risus, ac dapibus mauris faucibus a. Ut metus felis,\n" +
                " consectetur eget nunc ac, ornare sodales / or this \\? ligula. \n" +
                "\tInteger eros tellus, porttitor id!");
    }
}