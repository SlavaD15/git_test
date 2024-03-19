package Twenty_seventh_fight;

public class Archer extends Hero{
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer attacks Enemy");
        enemy.takeDamage(30);
    }
}
