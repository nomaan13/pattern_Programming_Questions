package pattern_programmingQSP;


public class Pattern12 {
    public static void main(String[] args) {
        int  n =7;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("   ");
            }
            for (int k = i ;k<=n;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
