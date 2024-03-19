package Twenty_third;

public class StrongTrial extends Trial{
    public StrongTrial(String name, int mark1, int mark2) {
        super(name, mark1, mark2);
    }

    @Override
    public boolean isPassed(){
        return (mark1/2)+mark2>=80;
    }
}
