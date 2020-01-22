import java.util.Scanner;

public class studentmarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("enter your name");
        name = scanner.next();
        System.out.println(name);
        System.out.println("enter your roll number");
        int rollnumber = scanner.nextInt();

        System.out.println(rollnumber);
        int marks = 65;
        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("c grade");
        } else if (marks >=70 && marks < 80) {
            System.out.println("B grade");
        } else {
            System.out.println("INvalid");
        }
    }

}



