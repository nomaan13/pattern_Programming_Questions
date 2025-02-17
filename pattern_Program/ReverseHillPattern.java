package pattern_Program;

public class ReverseHillPattern {
    public static void main(String[] args) {
        int n=7;
        for (int i =n;i>=0;i--){
            for (int j = i;j<=n;j++){
                System.out.print("   ");
            }
            for (int k= 1;k<i;k++){
                System.out.print(" * ");
            }
            for (int l = 1;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
