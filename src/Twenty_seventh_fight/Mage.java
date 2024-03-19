package Twenty_seventh_fight;

public class Mage extends Hero{
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage attacks Enemy");
        enemy.takeDamage(50);
    }
}
