package adv_Pattern_Programming;
/*
    *                 *
    * *             * *
    * * *         * * *
    * * * *     * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * *     * * * *
    * * *         * * *
    * *             * *
    *                 *
 */

public class Butterfly {
    public static void main(String[] args) {

        int n = 5;
        for (int i =1 ;i<=n;i++){
            //Inner loop for printing stars of first half
            for (int j = 1;j<=i;j++){
                System.out.print(" * ");
            }
            //Second inner loop printing spaces of upper half
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            //Third loop printing stars of right upper part
            for (int j = 1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Second outter loop for printing reverse pattern

        for (int i =n ;i>=0;i--){
            //Inner loop for printing stars of first half
            for (int j = 1;j<=i;j++){
                System.out.print(" * ");
            }
            //Second inner loop printing spaces of upper half
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            //Third loop printing stars of right upper part
            for (int j = 1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
