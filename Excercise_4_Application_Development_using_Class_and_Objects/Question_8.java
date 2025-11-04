import java.util.*;

class ExpenditureTracker {
    private String name;
    private double monthlyIncome;
    private double totalExpenses;
    private double remainingBalance;

    public ExpenditureTracker(String name, double monthlyIncome) {
        this.name = name;
        this.monthlyIncome = monthlyIncome;
        this.totalExpenses = 0.0;
        this.remainingBalance = monthlyIncome;
    }

    public void addExpense(double amount) {
        totalExpenses += amount;
    }

    public void calculateBalance() {
        remainingBalance = monthlyIncome - totalExpenses;
    }

    public void displayReport() {
        calculateBalance();

        System.out.println("\n--- Expenditure Report ---");
        System.out.println("User Name        : " + name);
        System.out.println("Monthly Income   : " + monthlyIncome);
        System.out.println("Total Expenses   : " + totalExpenses);
        System.out.println("Remaining Balance: " + remainingBalance);

        if (remainingBalance >= 0) {
            System.out.println("Status: Within Budget");
        } else {
            System.out.println("Status: Overspent");
        }
    }
}

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your monthly income: ");
        double income = sc.nextDouble();

        ExpenditureTracker tracker = new ExpenditureTracker(name, income);

        char choice;
        do {
            System.out.print("Enter an expense amount: ");
            double expense = sc.nextDouble();

            tracker.addExpense(expense);

            System.out.print("Do you want to add another expense? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        tracker.displayReport();
        sc.close();
    }
}
