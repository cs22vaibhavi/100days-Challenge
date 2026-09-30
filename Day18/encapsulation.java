class BankAccount {
    private int balance = 1000;

  //deposit
    void deposit(int amount) {
        balance = balance + amount;
    }

  //withdraw
    void withdraw(int amount) {
        balance = balance - amount;
    }

  //getbalance
    int getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Balance: " + account.getBalance());
    }
}
