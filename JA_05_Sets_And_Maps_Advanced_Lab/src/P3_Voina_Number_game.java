import java.util.*;
import java.util.stream.Collectors;

public class P3_Voina_Number_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int counter = 50;

        while (counter-- > 0 && !firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty()) {
            int firstPlayerCard = firstPlayerDeck.iterator().next();
            firstPlayerDeck.remove(firstPlayerCard);
            int secondPlayerCard = secondPlayerDeck.iterator().next();
            secondPlayerDeck.remove(secondPlayerCard);
//            int firstCard = 0;
//            for (Integer card : firstPlayerDeck) {    another option but not so elegant
//                firstCard = card;
//            }
//            firstPlayerDeck.remove(firstCard);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerDeck.add(firstPlayerCard);
                secondPlayerDeck.add(secondPlayerCard);
            }
        }
        if (firstPlayerDeck.size() > secondPlayerDeck.size()) {
            System.out.println("First player win!");
        } else if (secondPlayerDeck.size() > firstPlayerDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
