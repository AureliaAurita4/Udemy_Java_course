/**
 * Created by Svetik on 20.02.2016.
 */
public class Exercise {
    public static void main(String[] args) {

        byte anyByte = 10;
        short anyShort = 5;
        int anyInt = 20;

        long longSum = 50000L + 10L * (anyByte + anyShort + anyInt);
        short shortTotal = (short) (1000 + 10 * (anyByte + anyShort + anyInt));

        System.out.println(longSum);
        System.out.println(shortTotal);

    }
}
