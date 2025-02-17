package pattern_Program;

public class Pattern2 {
    /*
                   *
                 * *
               * * *
             * * * *
           * * * * *
         * * * * * *


     */
    public static void main(String[] args) {
      int n = 5;

        for (int i = 1;i<=n;i++){


            for (int j =4;j>=i;j--){
                System.out.print(" ");
            }

            for (int k = 1; k<=i;k++){
                System.out.print( k +"");
            }

            System.out.println();


            //2nd Approach


        }
        System.out.println("=====================================SECOND TRIANGLE======================================");
        for (int i =1;i<=n;i++){

            for (int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k+"");
            }
            System.out.println();

        }
        System.out.println("=====================================THIRD TRIANGLE======================================");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=i;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        }
    }

