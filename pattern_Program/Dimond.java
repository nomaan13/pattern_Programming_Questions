package pattern_Program;
import java.util.*;
class Dimond {
    public static void main(String args[])
    {
        int n = 6;
        for (int i =1;i<n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k =1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i= n-2;i>0;i--){
            for (int j = 1 ;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k = 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}