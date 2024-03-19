package Twenty_forth;

public class Person implements Identifiable{
    private String name;
    private Integer age;
    public Integer number;

    public Person(String name, Integer age, Integer number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    @Override
    public String getUniqueData(){
        return String.format("%s with age %s,", name, age);
    }

    public String getName() {
        return name;
    }

    public Integer getAge(){
        return age;
    }
    private void print(String name){
        System.out.println(name);
    }
}
