package custom_exception;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount you have in your account : ");
        int amount = sc.nextInt();

        try {

            if (amount < 0) {
                throw new InsufficientFundsException();
            } else
                System.out.println("You have enough funds");


        }catch (InsufficientFundsException e ){
            e.printStackTrace();
        }
    }
}
