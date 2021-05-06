import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        money = sc.nextDouble();
        System.out.println("Enter number of month:");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12;
            money = money +totalInterest;
        }
        System.out.println("Total Interest is: " + money);
    }
}
