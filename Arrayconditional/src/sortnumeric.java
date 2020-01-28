import java.lang.reflect.Array;
import java.util.Arrays;

public class sortnumeric {
    public static void main(String[] args) {

        // creat a java numeric array

        int[] numbers = new int[]{1, 101, 3, 32, 45, 78};
        // sort the array using method
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }


    }
}
