import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount number display:");
        int numbers = sc.nextInt();
        int count = 0;
        int number = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(number+" ");
                count++;
            }
            number++;
        }
    }
}
