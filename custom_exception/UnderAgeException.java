package custom_exception;

//          ectends RuntimeException creates Runtime Exception only
public class UnderAgeException extends RuntimeException{

    UnderAgeException(){
        super("You are not eligible to vote!!!!!");
    }
    UnderAgeException(String msg){
        super(msg);
    }
}
