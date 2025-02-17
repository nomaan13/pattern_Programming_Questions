package pattern_programmingQSP;

public class Pattern10 {
    /*
                          *  i=1&j=5
                       *  *  i=2&j=4,5
                    *  *  *  i=3&j=3,4,5
                 *  *  *  *
              *  *  *  *  *
           *  *  *  *  *  *
     */
    public static void main(String[] args) {
        int n =6 ;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i+j<n+1){
                    System.out.print("   ");
                }
                else
                    System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
