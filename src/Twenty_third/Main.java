package Twenty_third;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Trial> arrayList = new ArrayList<Trial>();
        arrayList.add(new Trial("T.mat", 50, 30));
        arrayList.add(new Trial("T.chem", 70, 10));
        arrayList.add(new Trial("T.fiz", 40, 30));

        arrayList.add(new LightTrial("LT.mat", 50, 60));
        arrayList.add(new LightTrial("LT.fiz", 30, 40));

        arrayList.add(new StrongTrial("ST.mat", 40, 80));
        arrayList.add(new StrongTrial("ST.fiz", 10, 40));

        arrayList.add(new ExtraTrial("ET.mat", 50, 30, 60));
        arrayList.add(new ExtraTrial("ET.fiz", 50, 10, 60));

        arrayList.stream().forEach(System.out::println);
        System.out.println(arrayList.stream().count());
        System.out.println("--------------------");
        //arrayList.stream().sorted((o1, o2) -> (o1.mark1+o1.mark2)-(o2.mark1+o2.mark2)).forEach(x -> System.out.println(x.mark1+x.mark2));
        ArrayList<Trial> arrayList_sorted = new ArrayList<Trial>();
        arrayList_sorted = (ArrayList<Trial>) arrayList.stream().sorted((o1, o2) -> (o1.mark1+o1.mark2)-(o2.mark1+o2.mark2)).collect(Collectors.toList());
        arrayList_sorted.stream().forEach(x -> System.out.println(x.mark1+x.mark2));
        System.out.println("--------------------");
        arrayList.stream().forEach(x -> System.out.println(x.mark1+x.mark2));
        System.out.println("--------------------");
        //ArrayList<Trial> arrayList_NotPassed = new ArrayList<Trial>();
        arrayList.stream().filter(x -> !x.isPassed()).forEach(x -> System.out.printf("%d, %d \n", x.mark1, x.mark2));
        System.out.println("--------------------");
        arrayList.removeAll(arrayList);
        arrayList.trimToSize();
        arrayList.forEach(System.out::println);
    }
}
