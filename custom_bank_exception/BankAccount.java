package custom_bank_exception;

public class BankAccount {
    private double balance ;
    BankAccount(){
    }

    BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public void withdraw(double amount)throws InsufficientBalanceException{
        if (balance<amount){
            throw new InsufficientBalanceException();
        }
        else {
            balance = balance - amount;
            System.out.println("Successfully withdraw Rs." + amount+" \n Remaning Balance is : " + balance);
        }
    }

}
