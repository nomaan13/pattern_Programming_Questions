package bitwise_operator;
/*
    Q. Multiply two numbers without using * operator
 */
public class Product {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int sum = 0;

        for (int i=1;i<=a;i++){
            sum = sum + b ;
        }

        System.out.println(sum);
    }
}
