import java.util.ArrayList;

public class MyTest {
    public static void main(String[] args){
        String[] myList = new String[2];
        String a = new String("whoohoo");
        myList[0] = a;

        String b = new String("Frog");
        myList[1] = b;

        int theSize = myList.length;

        Object o = myList[1];

        myList[1] = null;

        boolean isIn = false;

        for (String i:myList){
            if (b.equals(i)) {
                isIn = true;
                break;
            }
        }
    }
}
