package Fourteenth;

public class Person implements Identifiable{
    Long id;
    String name;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Person(Long id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }




}
