public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        System.out.println("Enter amount number display:");
        int number = 2;
        while (number < 100) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(number+" ");
            }
            number++;
        }
    }
}
