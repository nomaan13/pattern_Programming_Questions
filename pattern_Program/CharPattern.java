package pattern_Program;

import java.util.Collections;

public class CharPattern {

    public static void main(String[] args) {
        int n = 5;

        int x=65;
        for (int i =1;i<=n;i++){

            for (int j =1;j<=i;j++)
            {
                System.out.print((char)x+ " ");

            }
            x++;

            System.out.println();
        }


    }
}
