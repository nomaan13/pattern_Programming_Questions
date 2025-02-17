package basics;

public class SumOfSquareOfNumbers {
    public static void main(String[] args) {
        int a   =1;
        int sum =0;
        int sq  =0;

        while(a<=3){
            sq= a*a;
            sum+= sq;
            a++;
        }
        System.out.println(sum);


    }


}
