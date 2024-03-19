package Twenty_ninth;

import java.util.ArrayList;
import java.util.Objects;

public class Twenty_ninth {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1, "surname1", "name1", "patronymic1",
                "1111", "Street 1", "+1 1", "School1", "Grade1"));
        arrayList.add(new Student(2, "surname2", "name2", "patronymic2",
                "2222", "Street 2", "+2 2", "School2", "Grade2"));
        arrayList.add(new Student(3, "surname3", "name3", "patronymic3",
                "3333", "Street 3", "+3 3", "School3", "Grade2"));
        for(int i = 0;i<3;i++){
            System.out.println(arrayList.get(i).name);
        }
        System.out.println("----------");
        for(int i = 0;i<3;i++){
            if(arrayList.get(i).grade.equals("Grade1")) System.out.println(arrayList.get(i).name);
        }
        System.out.println("----------");
        for(int i = 0;i<3;i++){
            if(arrayList.get(i).grade.equals("Grade2")) System.out.println(arrayList.get(i).name);
        }
        System.out.println("----------");
        list(2000, 3000);
    }
    public static void list(int y, int z){
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1, "surname1", "name1", "patronymic1",
                "1111", "Street 1", "+1 1", "School1", "Grade1"));
        arrayList.add(new Student(2, "surname2", "name2", "patronymic2",
                "2222", "Street 2", "+2 2", "School2", "Grade2"));
        arrayList.add(new Student(3, "surname3", "name3", "patronymic3",
                "3333", "Street 3", "+3 3", "School3", "Grade2"));
        arrayList.stream().filter(x -> Integer.parseInt(x.date_of_birth)>2000 && Integer.parseInt(x.date_of_birth)<3000).forEach(x -> System.out.println(x.name));
        System.out.println("----------");
        arrayList.stream().filter(x -> Integer.parseInt(x.date_of_birth)>y && x.id>2).forEach(x -> System.out.println(x.name));
    }
}
