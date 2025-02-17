package loop_practice_questions;
/*
    Write a program to calculate the sum of first 10 natural number.
* */
public class Question_2 {
    public static void main(String[] args) {
        int sum =0;
        int sum2 =sum;

        for (int i =1;i<=10;i++){
            sum +=i;
        }
        System.out.println(sum);
        int i=1;
        while(i <=10){
            sum2 +=i;

            i++;
        }
        System.out.print( sum2+"  ");

        int sum3=0;
        int j=1;

        do {
            sum3 = sum3+j;
            j++;
        }
        while(j<=10);

        System.out.print("\n"+sum3);


    }
}
