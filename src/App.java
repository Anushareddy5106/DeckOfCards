public class App {

    public static void main(String[] args) {

        System.out.println("-----Welcome to DeckOfCards-----");

        Deck deck = new Deck();

        Players players = new Players();

        players.addPlayers();

        players.distributeCards(deck);

        players.sortCards();

        players.displayCards();

    }
}
