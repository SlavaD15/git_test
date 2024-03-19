package Fourteenth;

public class Courier extends Person implements ComputerSupportable{
    Computer c;
    public Courier(Long id, String name, Computer c) {
        super(id, name);
        this.c = c;
    }

    @Override
    public Computer getComputer() {
        return c;
    }

    @Override
    public void setComputer(Computer c) {
        this.c = c;
    }
}
