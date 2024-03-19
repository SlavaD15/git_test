package Twenty_seventh_fight;

public class Zombie extends Enemy{

    public Zombie(int health) {
        super(health);
    }

    public void resurrect(){
        System.out.println("Zombie has resurrected");
        health = 100;
    }
}
