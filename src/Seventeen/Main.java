package Seventeen;

import Sixteenth.Student;
import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        HashSet<Integer> hashSet = new HashSet<>(array);

        //task 1
        //ArrayList<Integer> array = new ArrayList<>();
        //countUnique(array);
        //task 2
//        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(1);
//        hashSet.add(2);
//        hashSet.add(3);
//        hashSet.add(4);
//        hashSet.add(5);
//        hashSet.add(6);
//        hashSet.add(7);
//        hashSet.add(8);
//        hashSet.add(9);
//        hashSet.add(10);
//        hashSet.add(1);
//        hashSet.add(4);
//        hashSet.add(5);
//        System.out.println(hashSet.size());
//        System.out.println(hashSet.contains(5));
//        hashSet.remove(5);
//        System.out.println(hashSet.contains(5));
//        for(Object o : hashSet){
//            System.out.println(o);
//        }
//        emptySet(hashSet);
//        System.out.println("--------------");
//        for(Object o : hashSet){
//            System.out.println(o);
//        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(0);
        treeSet.add(2);
        for(Object o : treeSet){
            System.out.println(o);
        }
        System.out.println("------------------");
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println("------------------");
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println("------");
        for(Object o : treeSet){
            System.out.println(o);
        }
    }
    public static void countUnique(ArrayList array){
        if(!array.isEmpty()) {
            HashSet<Integer> hashSet = new HashSet<>(array);
            System.out.println(hashSet.size());
        }else{
            System.out.println("0");
        }
    }
    public static void emptySet(HashSet set){
        if (!set.isEmpty()) set.clear();
    }
}

