package src;

import src.pokemon.kind.ElectricPokemon;
import src.pokemon.kind.FirePokemon;
import src.pokemon.kind.GrassPokemon;
import src.pokemon.kind.WaterPokemon;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------FirePokemon---------------\n");

        // Create a FirePokemon object
        FirePokemon charmander = new FirePokemon("Charmander", 1, 100, 0, 0.6, 8.5, "Fish", "Fiery sound", "Fire defence", "Fire attack", 50, "Fire Spin");
        charmander.eat(3);
        charmander.gainXp(50);
        System.out.println("Fire power: " + charmander.getFirePower());
        System.out.println("Special attack: " + charmander.getSpecialAttack());

        System.out.println("\n---------------ElectricPokemon---------------\n");

        // Create an ElectricPokemon object
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 2, 100, 0, 0.4, 6.0, "Berries", "Electric sound", "Electric defence", "Electric attack", 60, "Thunder Shock");
        pikachu.eat(5);
        pikachu.gainXp(55);
        System.out.println("Electric power: " + pikachu.getElectricPower());
        System.out.println("Special attack: " + pikachu.getSpecialAttack());


        System.out.println("\n---------------WaterPokemon---------------\n");

        // Create a WaterPokemon object
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 1, 100, 0, 0.5, 9.0, "Insects", "Water sound", "Water defence", "Water attack", 70, "Water Gun");
        squirtle.eat(6);
        squirtle.gainXp(55);

        System.out.println("\n---------------GrassPokemon---------------\n");

        // Create a GrassPokemon object
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 1, 100, 0, 0.7, 6.9, "Leaves", "Grass sound", "Grass defence", "Grass attack", 80, "Razor Leaf");
        bulbasaur.eat(7);
        bulbasaur.gainXp(50);
        System.out.println("Grass power: " + bulbasaur.getGrassPower());
        System.out.println("Special attack: " + bulbasaur.getSpecialAttack());


        System.out.println("\n---------------Charmander Vs Pikachu---------------\n");
        charmander.attack(pikachu);


        System.out.println("\n---------------Pikachu Vs Squirtle---------------\n");
        pikachu.attack(squirtle);
        pikachu.gainXp(50);
        pikachu.speaks();


        System.out.println("\n---------------Bulbasaur Vs Charmander---------------\n");
        bulbasaur.attack(charmander);


        System.out.println("\n---------------Healing...---------------\n");
        charmander.eat(20);
        System.out.println("Charmander's HP: " + charmander.getHp());
        pikachu.eat(22);
        System.out.println("Pikachu's HP: " + pikachu.getHp());
        squirtle.eat(50);
        System.out.println("Squirtle's HP: " + squirtle.getHp());
    }
}
