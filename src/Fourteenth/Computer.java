package Fourteenth;

public class Computer implements Identifiable{
    Long id;
    String name;

    public Computer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getId() {
        return id;
    }


}
