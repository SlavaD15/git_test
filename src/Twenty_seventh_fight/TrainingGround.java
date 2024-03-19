package Twenty_seventh_fight;

public class TrainingGround {
    public static void main(String[] args) {
        Hero mage1 = new Mage("hero1", 100);
        Enemy enemy1 = new Enemy(100);
        mage1.attackEnemy(enemy1);
    }
}
