package Twenty_seventh_fight;

public abstract class Hero {
    String name;

    int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage){
        health -= damage;
    }

    public void showHealth(){
        System.out.println(health);
    }
}