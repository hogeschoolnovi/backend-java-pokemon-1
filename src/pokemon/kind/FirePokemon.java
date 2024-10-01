package src.pokemon.kind;

import src.pokemon.Pokemon;

public class FirePokemon extends Pokemon {
    private int firePower;
    private String specialAttack;

    public FirePokemon(String name, int level, int hp, int xp, double height, double weight, String food, String sound, String defence, String attack, int firePower, String specialAttack) {
        super(name,level, hp, xp, height, weight, food, sound, defence, attack);
        this.firePower = firePower;
        this.specialAttack = specialAttack;
    }

    public void flameThrower() {
        System.out.println(getName() + " uses Flamethrower!");
    }


    public void fireBlast() {
        System.out.println(getName() + " uses Fire Blast!");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " makes a fiery sound!");
    }

    @Override
    public void eat(int amount) {
        System.out.println(getName() + " Eat " + amount + " " + getFood());
        setHp(getHp() + amount);
    }

    public int getFirePower() {
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }
}
