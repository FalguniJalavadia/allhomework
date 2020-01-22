import java.util.Scanner;

public class positivenegzero
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number ");
        int digit = scanner.nextInt();
        if (digit > 0)
        {
            System.out.println("entered digit " + digit + " positive");
        }
        else if (digit < 0)
        {
            System.out.println("entered digit " + digit + " negative");
        }
        else
        {
            System.out.println("entered digit " + digit + " is zero");
        }
    }
}

