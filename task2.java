import java.util.Scanner;

public class task2 {

    private double balance;

    // Function to store the initial balance
    public void savingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        task2 account = new task2();

        // Initial balance
        account.savingAccount(1000.0);

        int choice;

        do {
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = scanner.nextDouble();
                    account.deposit(depAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmount = scanner.nextDouble();
                    account.withdraw(withAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println(
                            "Invalid choice! Please choose between 1-4."
                    );
            }

        } while (choice != 4);

        scanner.close();
    }
}