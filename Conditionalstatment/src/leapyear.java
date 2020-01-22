import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year");
        int yeartocheck = scanner.nextInt();
        if ( yeartocheck % 4 == 0) {
        System.out.println( "entered year " + yeartocheck + " is a leap year" );
        }
        else {
            System.out.println( "entered year " + yeartocheck + " is not leap year" );}
        }
    }








