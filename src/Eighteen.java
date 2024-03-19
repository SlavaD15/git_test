import java.util.*;

public class Eighteen {
    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(1, "n1 s1");
        people.put(2, "n2 s2");
        people.put(3, "n3 s3");
        people.put(4, "n4 s4");
        people.put(5, "n5 s5");
        people.put(6, "n6 s6");
        people.put(7, "n7 s7");
        people.put(8, "n8 s8");
        people.put(9, "n9 s9");
        people.put(10, "n10 s10");

        search_by_key(7, people);
        search_by_value("n8 s8", people);
        remove_by_key(8, people);
        search_by_value("n8 s8", people);
        isIn_by_key(7, people);
        isIn_by_value("n8 s8", people);
        System.out.println(people);
        System.out.println(change(people));
        List<String> list = new ArrayList<>();
        list.add("asdfasdf otyun zyb vu fff");
        list.add("i sgdf sddsf n");
        list.add("i sgdf sddsf n");
        list.add(" ");
        list.add("asdfasdf otyun zyb vu fff");
        list.add(" ");
        list.add("");
        System.out.println(listToMap(list));
    }
    public static void search_by_key(Integer key, HashMap<Integer, String> hashMap){
        System.out.println(hashMap.get(key));
    }

    public static void search_by_value(String value, HashMap<Integer, String> hashMap){
        if(hashMap.containsValue(value)){
            for(HashMap.Entry<Integer, String> item : hashMap.entrySet()){
                if(item.getValue().equals(value)){
                    System.out.println(item.getKey());
                }
            }
        }else{
            System.out.println("404 not found");
        }
    }

    public static void remove_by_key(Integer key, HashMap<Integer, String> hashMap){
        hashMap.remove(key);
    }

    public static void isIn_by_key(Integer key, HashMap<Integer, String> hashMap){
        System.out.println(hashMap.containsKey(key));
    }

    public static void isIn_by_value(String value, HashMap<Integer, String> hashMap){
        System.out.println(hashMap.containsValue(value));
    }

    public static Map<String, Integer> change(Map<Integer, String> map){
        Map<String, Integer> blank_map = new HashMap<>();
        for(Map.Entry<Integer, String> i: map.entrySet()){
            blank_map.put(i.getValue(), i.getKey());
        }
        return blank_map;
    }

    public static Map<String, Integer> listToMap(List<String> list){
        Set<String> stringSet = new HashSet<>(list);
        Map<String, Integer> hashMap = new HashMap<>();
        for(String i : stringSet){
            int count = 0;
            for (String j : list) {
                if (Objects.equals(j, i)) {
                    count++;
                }
            }
            hashMap.put(i, count);
        }
        return hashMap;
    }
}
