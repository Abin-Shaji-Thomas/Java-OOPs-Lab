import java.util.Scanner;
class CashTree {
    String bankName, codeNo, location;
    String custName;
    int accNo;
    double balance;

    public CashTree(String bankName, String codeNo, String location, String custName, int accNo, double balance) {
        this.bankName = bankName;
        this.codeNo = codeNo;
        this.location = location;
        this.custName = custName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println("Customer: " + custName + " | Account No: " + accNo);
        System.out.println("Bank: " + bankName + " | Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

class SBI_Bank extends CashTree {
    public SBI_Bank(String custName, int accNo, double balance) {
        super("SBI Bank", "SBI001", "Coimbatore", custName, accNo, balance);
    }

    public void withdraw(double amount) {
        double serviceCharge = 5.0;
        if (amount + serviceCharge > balance) {
            System.out.println("Insufficient balance for withdrawal + service charge!");
        } else {
            balance -= (amount + serviceCharge);
            System.out.println("SBI Withdrawn: " + amount + " (Service Charge: ₹" + serviceCharge + ")");
        }
    }

    public void deposit(double amount) {
        double interest = amount * 0.06;
        balance += (amount + interest);
        System.out.println("SBI Deposited: " + amount + " (Interest Added: ₹" + interest + ")");
    }
}

class HDFC_Bank extends CashTree {
    public HDFC_Bank(String custName, int accNo, double balance) {
        super("HDFC Bank", "HDFC001", "Coimbatore", custName, accNo, balance);
    }

    public void withdraw(double amount) {
        double serviceCharge = 10.0;
        if (amount + serviceCharge > balance) {
            System.out.println("Insufficient balance for withdrawal + service charge!");
        } else {
            balance -= (amount + serviceCharge);
            System.out.println("HDFC Withdrawn: " + amount + " (Service Charge: ₹" + serviceCharge + ")");
        }
    }

    public void deposit(double amount) {
        double interest = amount * 0.05;
        balance += (amount + interest);
        System.out.println("HDFC Deposited: " + amount + " (Interest Added: ₹" + interest + ")");
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Welcome to CashTree ATM ---");
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.println("Select Bank: 1. SBI  2. HDFC");
        int choice = sc.nextInt();
        CashTree account;
        if (choice == 1) {
            account = new SBI_Bank(name, accNo, balance);
        } else {
            account = new HDFC_Bank(name, accNo, balance);
        }
        int option;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. View Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    account.viewBalance();
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double w = sc.nextDouble();
                    account.withdraw(w);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: ");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (option != 4);

        sc.close();
    }
}
