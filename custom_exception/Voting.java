package custom_exception;

public class Voting {
    public static void main(String[] args) {
        int age= 17;
        try{if (age<18){
            throw new UnderAgeException();
        }
        else {
            System.out.println("You are eligible to vote!!!!!!!!");
        }
        }catch (UnderAgeException e){
            e.printStackTrace();
        }

    }
}
