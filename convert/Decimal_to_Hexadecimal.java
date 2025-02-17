package convert;
import java.util.Scanner;
public class Decimal_to_Hexadecimal {
    public static void getHexadecimal(int n ){
        String hex= "";
        while (n>0){
            int rem = n%16;
            if (rem<=9){
                hex=rem+hex;
            }
            else {
                hex=(char)(rem+87)+hex;
                }
            n=n/16;
        }
        System.out.println("Hexadecimal conversion is : " + hex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number here: ");
        int n = sc.nextInt();
        getHexadecimal(n);
    }
}
