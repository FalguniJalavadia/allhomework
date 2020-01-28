import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.Scanner;

public class Countoddevensum {
    private static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);

        int numbers[] = new int[5];
        int oddsum = 0;
        int evensum = 0;
        int oddtotal = 0;
        int eventotal = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("please enter number " + (i + 1) + " ");
            numbers[i] = sc.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0) {
                evensum = evensum + numbers[i];
                eventotal++;
            }
            else {
                oddsum = oddsum + numbers[i];
                oddtotal++;
            }
        }
        System.out.println("Number of odd = " + oddtotal);
        System.out.println("Number of even = " + eventotal);
        System.out.println("Sum of odd numbers = " + oddsum);
        System.out.println("Sum of even numbers = " + evensum);
    }
}
