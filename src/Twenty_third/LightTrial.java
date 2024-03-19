package Twenty_third;

public class LightTrial extends Trial{
    public LightTrial(String name, int mark1, int mark2) {
        super(name, mark1, mark2);
    }

    @Override
    public boolean isPassed(){
        return mark1>=40 && mark2>=50;
    }
}
