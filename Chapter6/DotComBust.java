package Chapter6;


import java.util.*;
public class DotComBust {
    // declare and initialize the variables we'll need
    final ExpandedGameHelper helper = new ExpandedGameHelper();
    final ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        // make three DotCom objects, give 'em names, and stick 'em in the ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        // print brief instructions for user
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com.");
        System.out.println("Try to sink them all in the fewest number of guesses.");

        for (DotCom dotComToSet:dotComList){ // repeat with each DotCom in the list
            ArrayList<String> newLocation = helper.placeDotCom(3); // ask the helper for a DotCom location
            dotComToSet.setLocationCells(newLocation); // call the setter method on this DotCom to give it the location you just got from the helper
        }
    }

    private void startPlaying(){
        while(!dotComList.isEmpty()){ // as long as dotComList is NOT empty
            String userGuess = helper.getUserInput("Enter a guess"); // get user input
            checkUserGuess(userGuess); // call our own checkUserGuess method
        }
        finishGame(); // call out own finish game method
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++; // increment the number of guesses the user has made
        String result = "miss"; // assume it's a 'miss' until it otherwise

        for (DotCom dotComToTest:dotComList){ // repeat with all DotComs in the list
            result = dotComToTest.checkYourself(userGuess); // ask the DotCom to check the user guess, looking for a hit(or kill)
            if (result.equals("hit")){
                break; // get out of the loop early, no point in testing the others
            }
            if (result.equals("kill")){
                dotComList.remove(dotComToTest); // this guy's dead, so take him out of the DotComs then get it out of the loop
                break;
            }
        }
        System.out.println(result); // print result for the user
    }

    private void finishGame(){
        // print a message telling the user how he did in the game
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out your options sank.");
        }else{
            System.out.println("Took you long enough " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options. ");
        }

    }

    public static void main(String[] args){
        DotComBust game = new DotComBust(); // create the game object
        game.setUpGame(); // tell the game object to set up the game
        game.startPlaying(); // tell the game to start the main game loop (keeps asking for the user input and checking the guess)
    }
}
