package P6_Pokemon_Trainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemonList = new ArrayList<>();
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges() {
       this.numberOfBadges += 1;
    }

    public boolean containsPokemonElement (String element) {
        List<Pokemon> collect = pokemonList
                .stream()
                .filter(e -> e.getElement().equals(element))
                .collect(Collectors.toList());
        return collect.size() > 0;
    }

    public void filterPokemonByHealth () {
//       for (Pokemon pokemon : pokemonList) {
//           pokemon.reducePokemonHealth();
//           if (pokemon.getHealth() <= 0) {
//               getPokemonList().remove(pokemon);
//           }
//           getPokemonList().removeIf(p-> p.getHealth() <= 0);
        for (int i = 0; i < pokemonList.size(); i++) {
            Pokemon pokemon = pokemonList.get(i);
            pokemon.reducePokemonHealth();
            if (pokemon.getHealth() <= 0) {
               getPokemonList().remove(pokemon);
            }
        }
    }
}
