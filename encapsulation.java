class BankAccount {

    private double balance = 5000;

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class encapsulation {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(2000);
        account.withdraw(1000);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
