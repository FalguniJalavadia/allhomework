import java.util.Scanner;

public class timetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number first timetable");
        int a = scanner.nextInt();
        System.out.println(" enter the second number for timetable");
        int b = scanner.nextInt();
        System.out.println(" enter the nuber for timetable with end");
        int c = scanner.nextInt();

        for (int i = a; i <= a; i++) {

            for (int j = b; j <= c; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }

        }

    }

}







