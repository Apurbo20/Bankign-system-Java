package bankingsytem;
abstract public class Account {

    public Account(String accountName, int accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
       String accountName;
       int accountNumber;
       double balance;
       
     abstract  void deposit(double a);
     abstract void withdraw(double a);
}
