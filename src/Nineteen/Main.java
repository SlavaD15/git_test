package Nineteen;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws DivisionByZeroException {
//        try{
//            String a = null;
//            a.equals(1);
//        }catch(NullPointerException ex){
//            ex.printStackTrace();
//        }finally {
//            System.out.println("123");
//        }

//        ArrayList <Integer> arrayList = new ArrayList<Integer>(3);
//        try{
//            int a = arrayList.get(4);
//        }catch(IndexOutOfBoundsException ex){
//            ex.printStackTrace();
//        }


//        try{
//            System.out.println(Equals.Equals_func("aaa", "a", "error message"));
//        } catch (EqualsException e) {
//            System.out.println(e.getMessage());
//        }

//        try{
//            System.out.println(9/0);
//        }catch(ArithmeticException e){
//            throw new DivisionByZeroException();
//        }

        boolean a = Math.random() < 0.5;
        try{
            if(a){
                System.out.println(9/0);
            }else{
                System.out.println(9/3);
            }
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("It works!");
        }
    }
}
