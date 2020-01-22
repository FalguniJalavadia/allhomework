import java.util.Scanner;

public class cityname {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter letter from a-f");
        String letter = scanner.next();
        letter = letter.toLowerCase();
        switch(letter) {
            case "a" :
                System.out.println("Ahemdabad");
                break;
            case "b" :
                System.out.println("Bali");
                break;
            case "c" :
                System.out.println("Chile");
                break;
            case "d" :
                System.out.println("Dallas");
                break;
            case "e" :
                System.out.println("Egypt");
                break;
            case "f" :
                System.out.println("Finland");
                break;
            default :
                System.out.println("not in range");
                break;
        }

    }
}
