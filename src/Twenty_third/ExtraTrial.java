package Twenty_third;

public class ExtraTrial extends Trial{
    int mark3;

    public ExtraTrial(String name, int mark1, int mark2, int mark3) {
        super(name, mark1, mark2);
        this.mark3 = mark3;
    }

    @Override
    public boolean isPassed(){
        return mark1+mark2>=80 && mark3 >=50;
    }
}
