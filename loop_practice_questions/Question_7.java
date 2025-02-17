package loop_practice_questions;
import java.util.Scanner;
/*Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
* */
public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int a= sc.nextInt();
        int Evensum =0;
        int Oddsum = 0;

        for (int i =1;i<=a;i++){
            System.out.print("Enter " + i +" element : ");
            int b =sc.nextInt();


            if (b%2==0){
                Evensum += b;
            }
            else Oddsum +=b;
        }
        System.out.println("Sum of even number is : "+Evensum);
        System.out.println("Sum of odd number is : " +Oddsum);

    }

}
