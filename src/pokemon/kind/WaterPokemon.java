package src.pokemon.kind;

import src.pokemon.Pokemon;

public class WaterPokemon extends Pokemon {

    private int waterPower;
    private String specialAttack;

    public WaterPokemon(String name, int level, int hp, int xp, double height, double weight, String food, String sound, String defence, String attack, int waterPower, String specialAttack) {
        super(name,level, hp, xp, height, weight, food, sound, defence, attack);
        this.waterPower = waterPower;
        this.specialAttack = specialAttack;
    }

    public void waterGun() {
        System.out.println(getName() + " uses Water Gun!");
    }

    public void hydroPump() {
        System.out.println(getName() + " uses Hydro Pump!");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " makes a watery sound!");
    }

    @Override
    public void eat(int amount) {
        System.out.println(getName() + " Eat " + amount + " " + getFood());
        setHp(getHp() + amount);
    }

    public int getWaterPower() {
        return waterPower;
    }

    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }
}
