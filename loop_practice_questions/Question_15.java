package loop_practice_questions;
/*
        Write a program to print following :
        1.
                * * * * * * * * * *
                * * * * * * * * * *
                * * * * * * * * * *
                * * * * * * * * * *
 */

public class Question_15 {
    public static void main(String[] args) {
        for (int i =1;i<=4;i++){
            for (int j= 1;j<=9;j++){
                System.out.print( " * ");
            }
            System.out.println();}
        System.out.println("============================================Pattern-2============================================");

/*
        2.  *
            *   *
            *   *   *
            *   *   *   *
            *   *   *   *   *
*/
        for (int i = 1; i <=5; i++){
            for (int j= 1 ; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
            }
        System.out.println("============================================Pattern-3============================================");


/*
                        *
                      * *
                    * * *
                  * * * *
                * * * * *
*/
        for (int i =1;i<=5;i++){
            for (int j = 1;j<=5-i;j++){
                System.out.print("   ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
