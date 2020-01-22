import java.util.Scanner;

public class alpabhetuppertolower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter uppercase letter");
        String letter = scanner.next();
        letter = letter.toLowerCase();
        System.out.println(letter);
    }
}