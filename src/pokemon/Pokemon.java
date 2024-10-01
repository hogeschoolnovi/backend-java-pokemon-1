package src.pokemon;

// Superclass for all Pokemon
public abstract class Pokemon {
    // Common attributes for all Pokemon
    private String name;
    private int level;
    private int hp; // Health Points
    private int xp; // Experience Points
    private double height;
    private double weight;
    private String food;
    private String sound;
    private String defence;
    private String attack;

    // Constructor
    public Pokemon(String name, int level, int hp, int xp, double height, double weight, String food, String sound, String defence, String attack) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.height = height;
        this.weight = weight;
        this.food = food;
        this.sound = sound;
        this.defence = defence;
        this.attack = attack;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getDefence() {
        return defence;
    }

    public String getAttack() {
        return attack;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    // Methods
    public abstract void eat(int amount);

    public abstract void speaks();

    public void attack(Pokemon pokemon) {
        int damage = xp * level;
        System.out.println(name + " attacks " + pokemon.getName() + " with " + damage + " damage!");
        pokemon.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
            System.out.println(name + " fainted!");
        } else {
            System.out.println(name + " has " + hp + " HP left!");
        }
    }

    public void gainXp(int xp) {
        this.xp += xp;
        System.out.println(name + " gained " + xp + " XP!");
    }

    public void levelUp() {
        level++;
        System.out.println(name + " leveled up to level " + level + "!");
    }

    public void heal() {
        hp = 100;
        System.out.println(name + " has been healed!");
    }

}
