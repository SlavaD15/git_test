package Nineteen;

import java.util.Scanner;

public class Equals{
    public static boolean Equals_func(String a, String b, String message) throws EqualsException {
        if(a.length()<=2) throw new EqualsException(message, a);
        if(b.length()<=2) throw new EqualsException(message, b);
        return a.equals(b);
    }
}

class EqualsException extends RuntimeException{
    private String a;
    String message = "";

    public String get_a(){return a;}
//    public void set_message(Scanner in){
//        this.message = in.next();
//    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EqualsException(String message, String a){
        setMessage(message);
        this.a = a;
    }

    @Override
    public String getMessage() {
        return message;
    }
}