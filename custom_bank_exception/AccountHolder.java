package custom_bank_exception;

public class AccountHolder {
    public static void main(String[] args)  {

        BankAccount a1 = new BankAccount(1000);
        try{
            a1.withdraw(2500);
        }catch (InsufficientBalanceException e ){
            e.printStackTrace();
        }


    }
}
