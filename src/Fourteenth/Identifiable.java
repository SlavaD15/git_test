package Fourteenth;

public interface Identifiable {


    String getName();

    void setName(String name);

    Long getId();

    void setId(Long id);

    default boolean equalTo(Identifiable identifiable){
        return this.getClass().equals(identifiable.getClass()) && getId().equals(identifiable.getId());
    }

    default void getInfo(){
        System.out.println(getId() + "  " + getName());
    }
}

