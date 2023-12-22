import java.util.LinkedList;
import java.util.Queue;

public class Players {

    public Queue<Player> playersList;

    Players() {
        this.playersList = new LinkedList<>();
    }

    public void addPlayers() {
        for (int i = 0; i < 4; i++) {
            playersList.add(new Player("Player " + (i + 1)));
        }
    }

    public void distributeCards(Deck deck) {
        for (int card = 0; card < 9; card++) {
            for (Player player : playersList) {
                Card c = deck.getRandomCard();
                player.cards.add(c);
            }
        }
    }

    public void displayCards() {
        while (!playersList.isEmpty()) {
            Player currentPlayer = playersList.poll();
            currentPlayer.displayCards();
        }
    }

    public void sortCards() {
        for (Player player : playersList) {
            player.sortCardsByRank();
        }
    }
}
