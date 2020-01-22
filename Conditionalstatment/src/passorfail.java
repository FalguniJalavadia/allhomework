// Java program to find Total Average and percentage of Five Subjects
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class passorfail  {
    private static Scanner sc;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("Enter your name :" );
        name = scanner.next();
        System.out.println(name);
        System.out.println("Enter your roll number  :" );
        int rollNumber = scanner.nextInt();
        System.out.println(rollNumber);

        int totalSubjects, i;
        float Marks, total = 0, Percentage, Average;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter the Total Number of Subjects : ");
        totalSubjects = sc.nextInt();
        Boolean isFail = false;

        for (i = 0; i < totalSubjects; i++)
        {
            System.out.print(" Please Enter  Subject " + (i + 1) + " mark: " );
            Marks = sc.nextInt();
            if ( Marks < 35) {
                isFail = true;
            }
            total = total + Marks;
        }

        Average = total / totalSubjects;
        Percentage = (total / (totalSubjects * 100)) * 100;

        System.out.println(" Total Marks =  " + total);
        System.out.println(" Average Marks =  " + Average);
        System.out.println(" Marks Percentage =  " + Percentage);

        if (isFail) {
            System.out.println("fail");
        }
        else {
            System.out.println("pass");
        }
        if ( Percentage >= 80) {
            System.out.println( "Grade A+ " );
        }
        else if ( Percentage >= 60) {
            System.out.println( "Grade A " );
        }
        else if ( Percentage >= 50) {
            System.out.println("Grade B ");
        }
        else if ( Percentage >= 35) {
            System.out.println("Grade C ");
        }
        else {
            System.out.println( "Fail " );
        }
    }
}

