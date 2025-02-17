package loop_practice_questions;

public class Question_16 {
    /*Pyramid
        *
       * *
      * * *
     * * * *
    * * * * *
     */
    public static void main(String[] args) {
        for (int i =1;i<=5;i++){
            for (int j= 1;j<=5-i;j++){
                System.out.print(" ");
            }

            for (int k =1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }}}
