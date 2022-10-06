package bankingsytem;
public class CurrentAccount extends Account {
       private double deposit_amount;
       private double withdraw_amount;
       private double transaction_fees;
       private int     transaction_number;

    public void setDeposit_amount(double deposit_amount) {
        this.deposit_amount = deposit_amount;
    }

    public void setWithdraw_amount(double withdraw_amount) {
        this.withdraw_amount = withdraw_amount;
    }

    public void setTransaction_number(int transaction_number) {
        this.transaction_number = transaction_number;
    }

    public double getDeposit_amount() {
        return deposit_amount;
    }

    public double getWithdraw_amount() {
        return withdraw_amount;
    }

    public int getTransaction_number() {
        return transaction_number;
    }

    public CurrentAccount(String accountName, int accountNumber, double balance) {
        super(accountName, accountNumber, balance);
    }
    @Override
    void deposit(double a) {
        if(transaction_number <= 10){
        deposit_amount = a;
        }
        else if(transaction_number > 10){
          deposit_amount = deposit_amount-transaction_fees;
          deposit_amount = a;
        }
    }

    @Override
    void withdraw(double a) {
        withdraw_amount = a;
        if(transaction_number <= 10){
        deposit_amount = deposit_amount - withdraw_amount;
        }
        else if(transaction_number > 10){
          deposit_amount = deposit_amount-transaction_fees;
          deposit_amount = deposit_amount - withdraw_amount;
         }

    }
    void count_transaction(int a){
        transaction_number = a;
    }
    public void transaction_fees_calculation(){
        transaction_fees = deposit_amount * 0.01;
    }
    
}
