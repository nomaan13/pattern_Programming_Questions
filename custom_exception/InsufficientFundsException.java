package custom_exception;

// extends Exception create CompileTime Exception only
public class InsufficientFundsException extends Exception{
    InsufficientFundsException(){
        super("You don't have enough funds !!");
    }
    InsufficientFundsException(String msg){
        super(msg);
    }

}
