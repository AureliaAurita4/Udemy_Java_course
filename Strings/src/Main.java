/**
 * Created by Svetik on 05.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2016";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55 +";
        numberString = numberString + " 49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // Java converts int 50 into a string
        System.out.println("LastString is equal to " + lastString);


    }
}