
/**
 * Write a description of class gameRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class gameRunner
{
    Scanner s = new Scanner(System.in);
    public boolean howToPlay = false;
    public boolean newGame = false;
    public int numPlayers;
    // create player class
    public gameRunner(){
        
        System.out.println("Welcome to Monopoly! Ready to own it all?");
        System.out.println("Would you like to see the 'How To Play'?");
        howToPlay = s.nextLine();
        if(howToPlay == true){
            System.out.print("Monopoly is a game where 2 to 8 players aim to own the board, climb your way to the top by conquering buying,
            adding homes/hotels, trading, and bankrupting your competitors! You start with $1500.");
        }
        System.out.print("Start a new game?");
        newGame = s.nextLine();
        if(startGame == true){
            System.out.println("Welcome! How many players would you like?");
            numPlayers = s.nextInt();
            System.out.println("Awesome! Which player is the banker?");
            // banker = s.nextInt();
            System.out.print("Great! Welcome to Monopoly.");
            startGame();
        }
        else{
            System.out.println("No problem! Thanks for playing!");
        }

    }
}
