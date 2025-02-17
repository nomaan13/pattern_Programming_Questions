package atm_machine;

import java.util.Scanner;

public class ATM {
    float balance = 10000;
    int PIN= 5005 ;

    public void checkPin(){
        System.out.print("Please enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();

        if(pin == PIN){
            System.out.println();
            menu();
        }
        else {
            System.out.println("Entered pin is invalid");
        }

    }

    public void menu(){
        System.out.println("Please chose an option: ");
        System.out.println("Press 1 to check Account-Balance ");
        System.out.println("Press 2 to withdraw money ");
        System.out.println("Press 3 to deposit ");
        System.out.println("Press 4 to exit ");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

       if (option==1){
           checkBalance();
       }
       else if (option==2){
           withdrawMoney();
       }
       else if (option==3){
           depositMoney();
       }
       else {
           exit();
       }
    }

    public void checkBalance(){
        System.out.print("Current balance is : " +  balance +"\n");
        menu();
    }

    public void withdrawMoney(){
        System.out.print("Enter amount to withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();

        if (amount>balance){
            System.out.println("Insufficient Balance");
        }
        else {
            balance = balance - amount;
            System.out.println(amount + " Successfully withdrawn");
            menu();
        }
    }

    public void depositMoney(){
        System.out.print("Enter money to deposit : ");
        Scanner sc = new Scanner(System.in);
        float deposit =  sc.nextFloat();
        balance = balance + deposit;
        System.out.println("Money successfully deposited");
        menu();

    }
    public void exit(){
        System.out.println("Thank you!!!!!!");
    }

}
