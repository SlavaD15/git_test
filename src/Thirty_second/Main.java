package Thirty_second;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> prices = new ArrayList<>();
        String[] line_array = new String[5];
        try {
            File file = new File("C://Users//Slava//IdeaProjects//untitled//src//Thirty_second//in.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = "";
            while (line != null){
                line = reader.readLine();
                list.add(line);
            }
            list.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                line_array = list.get(i).split(" ");
            }
            prices.add(Integer.valueOf(line_array[2]));
        }
        System.out.println("---------");
        prices.forEach(System.out::println);

        int max = prices.get(0);
        for(int i : prices){
            if(i>max) max = i;
        }
        System.out.println("---------");
        System.out.println(max);
        System.out.println("---------");
        System.out.println(list.get(4).toString());
        System.out.println(list.get(5).toString());
        System.out.println(list.get(4).equals(list.get(5)));
    }
}