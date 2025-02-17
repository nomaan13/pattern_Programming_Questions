//You were given an integer number which contains only 0 & 1 WAJP to shift all the 0 to Left side & all the 1's to Right side & print *****
package shift_integer;

import java.util.Scanner;

public class shift0 {
    public static void getResult(int n ){
        String result = "";
        while (n>0){
            int rem = n%10;
            if (rem==0){
                result = rem + result;
            }
            else
            {
                result = result + rem ;
            }
            n=n/10;
        }
        System.out.println(result);

    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        getResult(10101011);

    }
}
