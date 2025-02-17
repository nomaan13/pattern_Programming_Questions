package pattern_Program;

public class DimondPattern {
    public static void main(String[] args) {
        int n =5;

        for (int i =1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("   ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
       /* for (int i =n-1;i>=0;i--){
            for(int j=i;j<=n;j++){
                System.out.print("   ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }*/
    }
}
