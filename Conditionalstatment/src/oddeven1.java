import java.util.Scanner;

public class oddeven1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number a :" );
        int a = scanner.nextInt();

        String oddeven = (a%2 == 0)? " even" : "odd";
        System.out.println("entear number a is" + oddeven );



    }



}
