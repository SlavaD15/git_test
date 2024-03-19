package Twenty_seventh_fight;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior attacks Enemy");
        enemy.takeDamage(75);
    }
}
