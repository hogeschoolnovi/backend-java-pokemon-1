package src.pokemon.kind;

import src.pokemon.Pokemon;

public class ElectricPokemon extends Pokemon {

    private int electricPower;
    private String specialAttack;

    public ElectricPokemon(String name, int level, int hp, int xp, double height, double weight, String food, String sound, String defence, String attack, int electricPower, String specialAttack) {
        super(name,level, hp, xp, height, weight, food, sound, defence, attack);
        this.electricPower = electricPower;
        this.specialAttack = specialAttack;
    }

    public void thunderShock() {
        System.out.println(getName() + " uses Thunder Shock!");
    }

    public void thunderBolt() {
        System.out.println(getName() + " uses Thunder Bolt!");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + ": Pi, ka!");
    }

    @Override
    public void eat(int amount) {
        System.out.println(getName() + " Eat "+ amount + " " + getFood());
        setHp(getHp() + amount);
    }

    public int getElectricPower() {
        return electricPower;
    }

    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }
}
