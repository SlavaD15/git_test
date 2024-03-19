package Sixteenth;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student girl1 = new Student(11, "1g", "last1");
        Student girl2 = new Student(12, "1g", "last2");
        Student girl3 = new Student(13, "3g", "last3");
        Student girl4 = new Student(14, "4g", "last4");
        Student girl5 = new Student(15, "5g", "last5");
        Student girl6 = new Student(16, "6g", "last6");
        Student girl7 = new Student(17, "7g", "last7");
        Student girl8 = new Student(18, "1g", "last8");
        Student girl9 = new Student(19, "1g", "last9");
        Student girl10 = new Student(110, "10g", "last10");
        Student girl11 = new Student(111, "11g", "last11");
        Student girl12 = new Student(112, "1g", "last12");
        Student girl13 = new Student(113, "1g", "last13");
        Student girl14 = new Student(114, "14g", "last14");
        Student girl15 = new Student(115, "1g", "last15");
        Student girl16 = new Student(116, "1g", "last16");


        Student boy1 = new Student(21, "g1b", "last1");
        Student boy2 = new Student(22, "h2b", "last2");
        Student boy3 = new Student(23, "b3b", "last3");
        Student boy4 = new Student(24, "a4b", "last4");
        Student boy5 = new Student(25, "petr c5b", "petrov5");
        Student boy6 = new Student(26, "j6b", "last6");
        Student boy7 = new Student(27, "k7b", "last7");
        Student boy8 = new Student(28, "d8b", "last8");
        Student boy9 = new Student(29, "f9b", "last9");
        Student boy10 = new Student(210, "e10b", "last10");
        Student boy11 = new Student(211, "o11b", "last11");
        Student boy12 = new Student(212, "n12b", "last12");
        Student boy13 = new Student(213, "p13b", "last13");
        Student boy14 = new Student(214, "m14b", "last14");
        Student boy15 = new Student(215, "r15b", "last15");
        Student boy16 = new Student(216, "q16b", "last16");

        ArrayList<Student> girls = new ArrayList<>();
        girls.add(girl1);
        girls.add(girl2);
        girls.add(girl3);
        girls.add(girl4);
        girls.add(girl5);
        girls.add(girl6);
        girls.add(girl7);
        girls.add(girl8);
        girls.add(girl9);
        girls.add(girl10);
        girls.add(girl11);
        girls.add(girl12);
        girls.add(girl13);
        girls.add(girl14);
        girls.add(girl15);
        girls.add(girl16);
        ArrayList<Student> boys = new ArrayList<>();
        boys.add(boy1);
        boys.add(boy2);
        boys.add(boy3);
        boys.add(boy4);
        boys.add(boy5);
        boys.add(boy6);
        boys.add(boy7);
        boys.add(boy8);
        boys.add(boy9);
        boys.add(boy10);
        boys.add(boy11);
        boys.add(boy12);
        boys.add(boy13);
        boys.add(boy14);
        boys.add(boy15);
        boys.add(boy16);

        for(Student student : girls){
            System.out.println(student.name);
        }
        for(Student student : boys){
            System.out.println(student.name);
        }

        System.out.println("------------------------------------");

        ArrayList<Student> whole_class = new ArrayList<>(girls);
        whole_class.addAll(boys);

        for(Student student : whole_class){
            System.out.println(student.name);
        }

        System.out.println("--------------------");
        //task 2
        System.out.println(girls.size());
        Collections.sort(boys);
        for(int i = 0;i<=5;i++){
            System.out.println(boys.get(i).name);
        }
        System.out.println(boys.get(boys.size()-1).name);
        System.out.println("--------------------");
        //task 3
        //Scanner in = new Scanner(System.in);
        //String name_input = in.nextLine();
        //for(int i=0;i<=boys.size()-1;i++){
          //  if(boys.get(i).name.equals(name_input)){
          //      System.out.println(i+1);
         //   }
        //}
        System.out.println("--------------------");
        ArrayList<Student> first_half_the_class = new ArrayList<>();
        ArrayList<Student> second_half_the_class = new ArrayList<>();
        for(int i = 0;i<=whole_class.size()-1;i++){
            first_half_the_class.add(whole_class.get(i));
            whole_class.remove(i);
        }
        for(int i = 0;i<=whole_class.size()-1;i=i){
            second_half_the_class.add(whole_class.get(i));
            whole_class.remove(i);
        }
        for(Student student : first_half_the_class)
            System.out.println(student.name);
        System.out.println("---");
        for(Student student : second_half_the_class)
            System.out.println(student.name);
        System.out.println("--------------------");
        //task 4
        System.out.println(whole_class.isEmpty());
        System.out.println(boys.isEmpty());
        System.out.println(girls.isEmpty());
        boolean isPetrov_in_array = false;
        for(int j = 0;j<=first_half_the_class.size()-1;j++){
            if(first_half_the_class.get(j).name.equals("petr c5b")&&first_half_the_class.get(j).lastName.equals("petrov5")){
                isPetrov_in_array = true;
            }
        }
        if(isPetrov_in_array){
            Student thoedor_maximov = new Student(217, "theodor", "maximov");
            first_half_the_class.add(thoedor_maximov);
        }else{
            ArrayList<Student> temp_array = new ArrayList<>();
            for(int i = 8;i<=first_half_the_class.size()-1;i=i){
                temp_array.add(first_half_the_class.get(i));
                first_half_the_class.remove(i);
            }
            Student petr_petrov = new Student(25, "petr c5b", "petrov5");
            first_half_the_class.add(petr_petrov);
            for(int i = 0;i<=temp_array.size()-1;i++){
                first_half_the_class.add(temp_array.get(i));
            }
        }


        System.out.println("---");
        for(Student student : first_half_the_class)
            System.out.println(student.name);
        System.out.println("---");
        for(Student student : second_half_the_class)
            System.out.println(student.name);
        //task 5
        ArrayList<Student> temp_array_same_name = new ArrayList<>();
        for(int i=0;i<=second_half_the_class.size()-1;i++){
            for(int j=0;j<=second_half_the_class.size()-1;j++){
                if(i!=j && second_half_the_class.get(i).lastName.equals(second_half_the_class.get(j).lastName)){
                    temp_array_same_name.add(second_half_the_class.get(i));
                }
            }
        }
        System.out.println(temp_array_same_name.get(temp_array_same_name.size()-1).lastName);
        //task 6
        System.out.println("---");
        for(Student student : first_half_the_class)
            System.out.println(student.name);
        System.out.println("---");
        for(Student student : second_half_the_class)
            System.out.println(student.name);

        for(int i=0;i<=first_half_the_class.size();i++) {
            if (i == 7) {
                first_half_the_class.remove(i);
                second_half_the_class.add(first_half_the_class.get(i));
            }
        }

        System.out.println("------------------------");
        for(Student student : first_half_the_class)
            System.out.println(student.name);
        System.out.println("---");
        for(Student student : second_half_the_class)
            System.out.println(student.name);

        for(int i=0;i<first_half_the_class.size();i++){
            if(first_half_the_class.get(i).name.equals("petr c5b"))
                first_half_the_class.remove(i);
        }
        System.out.println("------------------------");
        for(Student student : first_half_the_class)
            System.out.println(student.name);
        //task 7
        first_half_the_class.clear();
        second_half_the_class.clear();
        whole_class.clear();
        System.out.println("---------------");
        for(Student student : first_half_the_class)
            System.out.println(student.name);System.out.println("---------------");
        for(Student student : second_half_the_class)
            System.out.println(student.name);System.out.println("---------------");
        for(Student student : whole_class)
            System.out.println(student.name);

    }
}
