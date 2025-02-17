package permutation_combination;
import java.util.Scanner;

public class Combination {

    public static void getTotalNumberOfSelection(int n, int r){
        int comb=1;
        for(int i=0;i<n-r;i++){
            comb =(comb*(n-i))/(i+1);
        }
        System.out.println("Total number of possible selection is " + comb);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total members: ");
        int n= sc.nextInt();
        System.out.print("Enter selection at a time: ");
        int r= sc.nextInt();

        getTotalNumberOfSelection(n,r);
    }


}
