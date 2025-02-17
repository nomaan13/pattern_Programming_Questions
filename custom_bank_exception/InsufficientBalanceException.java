package custom_bank_exception;

public class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(){
        super("You don't have enough fund in your account!!");
    }
    InsufficientBalanceException(String msg){
        super(msg);
    }

}
