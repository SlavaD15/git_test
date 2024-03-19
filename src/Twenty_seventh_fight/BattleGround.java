package Twenty_seventh_fight;

public class BattleGround {
    public static void main(String[] args) {
        Hero mage1 = new Mage("hero1", 100);
        Enemy enemy1 = new Enemy(100);
        Zombie zombie1 = new Zombie(100);
        zombie1.attackHero(mage1);
        mage1.showHealth();
        mage1.attackEnemy(zombie1);
        System.out.println(zombie1.isAlive());
        enemy1.attackHero(mage1);
        mage1.showHealth();
        mage1.attackEnemy(enemy1);
        System.out.println(enemy1.isAlive());
        enemy1.attackHero(mage1);
        mage1.showHealth();
        mage1.attackEnemy(enemy1);
        System.out.println(enemy1.isAlive());
        mage1.attackEnemy(zombie1);
        System.out.println(zombie1.isAlive());
    }
}
