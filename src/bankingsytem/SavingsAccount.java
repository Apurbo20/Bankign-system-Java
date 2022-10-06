package bankingsytem;
public class SavingsAccount extends Account{
    private double deposit_amount;
    private double interest_amount;
    private int    deposit_number;

    public void setDeposit_amount(double deposit_amount) {
        this.deposit_amount = deposit_amount;
    }

     public void setDeposit_number(int deposit_number) {
        this.deposit_number = deposit_number;
    }
                 
    
    public SavingsAccount(String accountName, int accountNumber, double balance) {
        super(accountName, accountNumber, balance);
    }
    @Override
    void deposit(double amount) {
        deposit_amount = amount;
    }

    @Override
    void withdraw(double withdraw_amount) {
        if(withdraw_amount >= 500 ){ 
        deposit_amount = deposit_amount - withdraw_amount; 
    }
    }
    
     public void calculate_interest(){
         if(deposit_number > 5){
         interest_amount = deposit_amount * 0.02;
         deposit_amount = deposit_amount+interest_amount;
         }
     }
     public void count_deposit_number(int number_of_transation){
         deposit_number = number_of_transation;
         if(deposit_number <= 5){
             System.out.println("No interest added");
         }
         else if(deposit_number > 5){
             System.out.println("Interest are being add");
         }
       }

    public double getDeposit_amount() {
        return deposit_amount;
    }

    public int getDeposit_number() {
        return deposit_number;
    }
     
     
}
