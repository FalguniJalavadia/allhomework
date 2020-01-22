import java.util.Scanner;

public class salescommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int id;
        System.out.print("sales id: ");
        id = scanner.nextInt();
        System.out.print("name: ");
        name = scanner.next();
        System.out.println(id + " "+ name);
        double salesamount;
        System.out.print("salesamount: ");
        salesamount = scanner.nextInt();
        int salary;
        System.out.print("salary: ");
        salary = scanner.nextInt();
        double commission =0;
    if (salesamount >= 50000 ) {
        commission = salary * 0.35;
    }
    else if (salesamount >= 30000 ) {
        commission = salary * 0.20;
    }
    else if (salesamount >= 20000 ) {
        commission = salary * 0.10;
    }
    else if (salesamount >= 10000 ) {
        commission = salary * 0.05;
    }
    else if (salesamount < 10000 ) {
        commission = salary * 0.02;
        }
    System.out.println("commission: " + commission);

    }
}
