package Chapter1;

public class BeerSong {
    public static void main (String[] args){
        int beerN = 99;
        String word = "bottles";
        while (beerN > 0){
            System.out.println(beerN + " " + word + " of beer on the wall");
            System.out.println(beerN + " " + word + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerN -= 1;
            if (beerN == 1){
                word = "bottle";
            }
            if (beerN == 0){
                System.out.println("No more bottles of beer on the wall, no more bottlers of beer.");
            }


        }
    }

}
