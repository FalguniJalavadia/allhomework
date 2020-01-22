import java.util.Scanner;

public class averageoffivenum {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int i, nos = 5, no1, no2, no3, no4,no5, total=0;
//        System.out.println("please enter number of numbers you want to average");
//        nos = sc.nextInt();
//        for (i = 0; i < nos; i++)
////        {
////            System.out.print(" Please Enter  No " + (i + 1) + " : " );
////            no = sc.nextInt();
////            total = total + no;
////        }
        System.out.println(" Please Enter  No 1 : " );
        no1 = sc.nextInt();
        total = total + no1;
        System.out.println(" Please Enter  No 2 : " );
        no2 = sc.nextInt();
        total = total + no2;
        System.out.println(" Please Enter  No 3 : " );
        no3 = sc.nextInt();
        total = total + no3;
        System.out.println(" Please Enter  No 4 : " );
        no4 = sc.nextInt();
        total = total + no4;
        System.out.println(" Please Enter  No 5 : " );
        no5 = sc.nextInt();
        total = total + no5;
        System.out.println(total/nos);
    }
}
