package Chapter1;

public class Shuffle1 {
    public static void main(String[] args){
        int x = 3;
        while (x > 0){
            if (x > 2) {
                System.out.print("a");
                System.out.print("-");
            }
            if (x == 2){
                System.out.print("b c");
                System.out.print("-");
            }
            x -= 1;
            if (x == 1){
                System.out.print("d");
            }
        }
    }
}
