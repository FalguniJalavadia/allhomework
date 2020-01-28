import java.util.Scanner;

public class Multiplicationtable {

// Java Program to Print Multiplication Table


        private static Scanner sc;
        public static void main(String[] args){
        {
            int i, j;
            sc = new Scanner(System.in);

            System.out.print(" Please Enter any Number : ");
            i = sc.nextInt();

            while(i < 10)
            {
                j = 1;
                while(j <= 10)
                {
                    System.out.println(i +"  *  " + j + "  =  " + i * j);
                    j++;
                }
                System.out.println("================");
                i++;
            }
        }
    }










}
