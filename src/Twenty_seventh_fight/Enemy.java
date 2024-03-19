package Twenty_seventh_fight;

public class Enemy implements Mortal{
    int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public boolean isAlive(){
        return health>0;
    }

    public void attackHero(Hero hero){
        System.out.println("Enemy attacks Hero");
        hero.takeDamage(20);
    }
}
