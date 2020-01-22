import java.util.Scanner;
public class twodigitoperation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double number1,number2;
        String operation;
        System.out.println("please enter first number ");
        number1 = scanner.nextInt();
        System.out.println("please enter second number ");
        number2 = scanner.nextInt();
        System.out.println("please enter operation from + - * / ");
        operation = scanner.next();

        switch(operation) {
            case "+" :
                System.out.println(number1 + number2);
                break;
            case "-" :
                System.out.println(number1 - number2);
                break;
            case "/" :
                System.out.println(number1 / number2 );
                break;
            case "*" :
                System.out.println(number1 * number2);
                break;
            default :
                System.out.println("invalid operation");
                break;
        }

    }


}
