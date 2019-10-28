public class Pokemon {
    private String name;
    private String type;
    private int health;
    private static int numPokemon = 0;

    public void attack(Pokemon pokemon) {
        System.out.println("Attacking Pokemon " + pokemon.name + "...");
        pokemon.health -= 10;
    }
}