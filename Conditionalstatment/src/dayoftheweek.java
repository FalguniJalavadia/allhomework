import java.util.Scanner;

public class dayoftheweek {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number 1 to 7");
        String number = scanner.next();

        switch(number) {
            case "1" :
                System.out.println("Monday");
                break;
            case "2" :
                System.out.println("Tuesday");
                break;
            case "3" :
                System.out.println("Wednesday");
                break;
            case "4" :
                System.out.println("Thursday");
                break;
            case "5" :
                System.out.println("Friday");
                break;
            case "6" :
                System.out.println("Saturday");
                break;
            case "7" :
                System.out.println("Sunday");
                break;

            default :
                System.out.println("not in range");
                break;
        }

    }
}
