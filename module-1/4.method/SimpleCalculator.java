import java.util.Scanner;
class SimpleCalculator {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            int a = 0, b = 0;
            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter first number: ");
                a = scanner.nextInt();
                System.out.print("Enter second number: ");
                b = scanner.nextInt();
            }

            perform(choice, a, b);

        } while (choice != 8);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\n--- Simple Calculator ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Invalid choice");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }
    public static void perform(int choice, int a, int b) {
    switch (choice) {
        case 1:
            System.out.println("Addition: " + Math.addExact(a, b));
            break;

        case 2:
            System.out.println("Subtraction: " + Math.subtractExact(a, b));
            break;

        case 3:
            System.out.println("Multiplication: " + Math.multiplyExact(a, b));
            break;

        case 4:
            if (b != 0) {
                System.out.println("Division: " + (a / b));
            } else {
                System.out.println("Error: Division by zero!");
            }
            break;

        case 5:
            if (b != 0) {
                System.out.println("Modulus: " + (a % b));
            } else {
                System.out.println("Error: Modulus by zero!");
            }
            break;

        case 6:
            System.out.println("Invalid choice selected!");
            break;

        case 7:
            System.out.println("Exiting calculator. Thank you!");
            break;

        default:
            System.out.println("Invalid input! Try again.");
            break;
    }
}


   
}

