package Twenty_third;

public class Trial {
    String name;
    int mark1;
    int mark2;
    public Trial(String name, int mark1, int mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public boolean isPassed(){
        return mark1+mark2>=80;
    }
}
