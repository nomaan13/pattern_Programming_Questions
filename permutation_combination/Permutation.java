package permutation_combination;

import java.util.Scanner;

public class Permutation {
    public static void getTotalNumberOfArrangement(int n , int b){
        int arr =1;
        for (int i =0;i<b;i++){
            arr= arr *(n-1);
        }
        System.out.println("Total numbers of arrangements are:  "+arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of total space: ");
        int n = sc.nextInt();
        System.out.print("Enter number of element: ");
        int r = sc.nextInt();

        getTotalNumberOfArrangement(n,r);


    }
}
