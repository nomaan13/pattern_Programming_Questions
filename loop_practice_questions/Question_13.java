package loop_practice_questions;

import java.util.Scanner;

public class Question_13 {
        /*    Write a program to print out all Armstrong numbers between 1 and 500.
              If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
              For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
            */
        public static int countDigit(int x ){
            int rem;
            int digitCount =0;
            while(x>0){
                rem=x%10;
                digitCount++;
                x/=10;

            }
            return digitCount;
        }
        public static int isArmstrong(int x){
            int sum=0;
            int rem;
            int a = countDigit(x);
            while(x>0){
                rem=x%10;
                sum = sum + (int)Math.pow(rem,a);
                x=x/10;
            }
            return sum;
        }


        public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);

   /*         System.out.print("Enter a number : ");
            int x = sc.nextInt();*/

            System.out.println("ALl armstrong number between 1 to 500 are : ");
            for (int i =1 ;i<=500;i++){


                if (isArmstrong(i)==i){
                    System.out.print(i +" ");

                }
                ;



            }



        }
    }

