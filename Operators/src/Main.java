/**
 * Created by Svetik on 05.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previous_result = result;

        result = result - 1;
        System.out.println(previous_result + " - 1 = " + result);

        previous_result = result;

        result = result * 10;
        System.out.println(previous_result + " * 10 = "+ result);

        previous_result = result;

        result = result / 5;
        System.out.println(previous_result + " / 5 = "+ result);

        previous_result = result;
        result = result % 3;
        System.out.println(previous_result + " % 3 = "+ result);

        previous_result = result;
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 2;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true){    // if (true) {...}
            System.out.println("It is not an alien!");
        } else {
            System.out.println("ERROR!");
        }

        int topScore = 80;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("One of these tests is true");
        } else {
            System.out.println("None is true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar){ // isCar == true, because "=" is a variable assignment
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;




    }
}
