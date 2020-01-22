import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class numberalphabetsymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any character : ");
        char temp = scanner.next().charAt(0);
        if ((temp >= '0') && (temp <= '9')) {
            System.out.println(" charactor is number");
        } else if (((temp >= 'a') && (temp <= 'z')) || ((temp >= 'A') && (temp <= 'Z'))) {
            System.out.println(" character is alphabets ");
        } else {
            System.out.println("character is symbol");
        }
    }
}