import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1. Print the Rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the Rectangle:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Enter your choice:");
                    System.out.println("1. Top-left");
                    System.out.println("2. Top-right");
                    System.out.println("3. Bottom-left");
                    System.out.println("4. Bottom-right");
                    System.out.println("0. Exit");
                    int choiceNext = sc.nextInt();
                    switch (choiceNext) {
                        case 1:
                            System.out.println("Top-left:");
                            for (int i = 6; i >= 1; i--) {
                                for (int j = 1; j < i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            System.out.println("Top-right:");
                            for (int i =6;i>=1;i--){
                                for (int k =5;k>=i;k--){
                                    System.out.print("  ");
                                }
                                for (int j =1; j<i;j++){
                                    System.out.print(" *");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("Bottom-left");
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 4:
                            System.out.println("Bottom-right:");
                            for(int i=0;i<6;i++){
                                for (int k=6-i;k>0;k--){
                                    System.out.print("  ");
                                }
                                for (int j=0;j<=i;j++){
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 0:
                            System.exit(0);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Isosceles triangle:");
                    for(int i=0;i<6;i++){
                        for (int k=6-i;k>0;k--){
                            System.out.print(" ");
                        }
                        for (int j=0;j<=i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
