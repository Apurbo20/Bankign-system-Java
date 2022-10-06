package bankingsytem;

import java.util.Scanner;

public class BankingSytem {
    public static void main(String[] args) {
        int user_type;
        double deposit_amount;
        int deposit_number;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter User type:");
        System.out.println("Press 1 for Savings Account ");
        System.out.println("Press 2 for Current Account ");
        user_type = s.nextInt();
        switch(user_type)
        {
            case 1:
                SavingsAccount user1 = new SavingsAccount("Saif",191352629,10000);  
                 System.out.println("Enter Savings Num: ");
                    user1.setDeposit_number(s.nextInt());
                  System.out.println("Enter Deposit Amount:");
                         user1.setDeposit_amount(s.nextDouble());
                      System.out.println("Deposit amount"+user1.getDeposit_amount());     
                 break;
            case 2:  CurrentAccount user2 = new CurrentAccount("Saif",191352629,10000);
                                System.out.println("Current Balance"+user2.getDeposit_amount()
                                );
                               System.out.println("Enter Withdraw amount");
                               user2.setWithdraw_amount(s.nextDouble());
                               System.out.println("Enter transation Num");
                                user2.setTransaction_number(s.nextInt());
                                System.out.println("Total Balance : "+user2.getDeposit_amount());
                               break;
                
            default :System.out.println("Wrong Inputs");
        }
    }
    
}
