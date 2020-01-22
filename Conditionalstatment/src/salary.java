import java.util.Scanner;

public class salary {
        public static void main(String[] args) {
            float basic_salary;
            Scanner scan=new Scanner(System.in);
            String name;
            int id;
            System.out.print("employee id: ");
            id = scan.nextInt();
            System.out.print("name: ");
            name = scan.next();
            System.out.println(id + " "+ name);

            System.out.println("Enter Basic Salary Of Employee: ");
            basic_salary=scan.nextFloat();

            double HRA = (basic_salary*10)/100;
            double DA =  (basic_salary*8)/100;
            double TA = (basic_salary*9)/100;
            double PF = (basic_salary*20)/100;
             double GS = basic_salary + HRA + DA + TA - PF;

            System.out.println("HRA Salary of Employee: " + HRA);
            System.out.println("DA Salary of Employee: " + DA);
            System.out.println("TA Salary of Employee: " + TA);
            System.out.println("PF Salary of Employee: " + PF);
            System.out.println("Gross Salary of Employee: " + GS);







        }
}
