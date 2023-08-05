package Chapter5;

public class SimpleDotComTestDrive {
    public static void main(String[] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCome = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCome.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCome.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
