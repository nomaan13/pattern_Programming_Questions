package pattern_Program;

import java.util.Scanner;

public class ReverseRightAngleTriangle {
/*      *   *   *   *   *
        *   *   *   *
        *   *   *
        *   *
        *

 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of triangle: ");
        int n = sc.nextInt();
//        for (int i =1;i<=n;i++){
//            for (int j = n ; j>=i; j--){
//                System.out.print(j + " " );
//
//            }
//            System.out.println();
//        }
        for (int i = n ; i>=1 ; i--){
            for (int j =1 ; j<=i ;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
