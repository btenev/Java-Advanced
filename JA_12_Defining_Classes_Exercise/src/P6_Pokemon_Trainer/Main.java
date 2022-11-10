package P6_Pokemon_Trainer;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            if (!trainers.containsKey(trainerName)) {
                Trainer trainer = new Trainer(trainerName);
                trainers.put(trainerName, trainer);
            }
            trainers.get(trainerName).getPokemonList().add(pokemon);

            input = scanner.nextLine();
        }

        String element = scanner.nextLine();

        while (!element.equals("End")) {
            for (Trainer current : trainers.values()) {
                if (current.containsPokemonElement(element)) {
                    current.setNumberOfBadges();
                } else {
                    current.filterPokemonByHealth();
                }
            }
            element = scanner.nextLine();
        }
        trainers
                .entrySet()
                .stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue().getNumberOfBadges(), e1.getValue().getNumberOfBadges()))
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue().getNumberOfBadges() + " " +
                        entry.getValue().getPokemonList().size()));
    }
}
