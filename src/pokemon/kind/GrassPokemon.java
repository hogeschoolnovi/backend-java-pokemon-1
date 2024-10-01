package src.pokemon.kind;

import src.pokemon.Pokemon;

public class GrassPokemon extends Pokemon {

    private int grassPower;
    private String specialAttack;

    public GrassPokemon(String name, int level, int hp, int xp, double height, double weight, String food, String sound, String defence, String attack, int grassPower, String specialAttack) {
        super(name,level, hp, xp, height, weight, food, sound, defence, attack);
        this.grassPower = grassPower;
        this.specialAttack = specialAttack;
    }


    public void razorLeaf() {
        System.out.println(getName() + " uses Razor Leaf!");
    }

    public void solarBeam() {
        System.out.println(getName() + " uses Solar Beam!");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " makes a grassy sound!");
    }

    @Override
    public void eat(int amount) {
        System.out.println(getName() + " Eat " + amount + " " + getFood());
        setHp(getHp() + amount);
    }

    public int getGrassPower() {
        return grassPower;
    }

    public void setGrassPower(int grassPower) {
        this.grassPower = grassPower;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }
}
