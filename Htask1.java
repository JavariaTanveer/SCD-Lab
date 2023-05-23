import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        double netSalary = salary;

        if (salary >= 0 && salary < 20000) {
            netSalary = salary;
        } else if (salary >= 20000 && salary < 40000) {
            netSalary = salary * 0.98; // 2% tax
        } else if (salary >= 40000 && salary < 60000) {
            netSalary = salary * 0.9; // 10% tax
        } else if (salary >= 60000 && salary < 80000) {
            netSalary = salary * 0.8; // 20% tax
        } else if (salary >= 80000) {
            netSalary = salary * 0.6; // 40% tax
        }

        System.out.println("Your net salary after tax deduction is: " + netSalary);
    }
}
