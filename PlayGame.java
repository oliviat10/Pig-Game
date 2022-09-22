import java.util.*;

public class PlayGame {

  public static Player[] createPlayers() {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("How many players?");
    int num_players = keyboard.nextInt();
    keyboard.nextLine();

    if (num_players < 1) {
      return null;
    }
    
    Player[] players = new Player[num_players];

    for (int i = 0; i < num_players; i++) {
      System.out.printf("Enter a name for player %d: ", i+1);
      String name = keyboard.nextLine();
      players[i] = new Player(name);
    }

    return players;
  }

  public static void main(String[] args) {
    
    Player[] players = createPlayers();

    Scanner keyboard = new Scanner(System.in);
    System.out.println("\nHow many sides on the dice?");
    int num_sides = keyboard.nextInt();

    Die game_die = new Die(num_sides);

    System.out.println("\nPlay until what score?");
    int win_score = keyboard.nextInt();

    char play_again;

    do {
      Game g = new Game(players, game_die, win_score);

      g.play();

      System.out.print("\n\n");

      for (int i = 0; i < players.length; i++) {
        Player p = players[i];
        System.out.printf("%s: %d wins\n", p, p.getWins());
        p.resetScore();
      }

      System.out.println("\nPlay again? y/n");

      play_again = keyboard.next().charAt(0);
    } while (play_again == 'y' || play_again == 'Y');

  }
    
}
