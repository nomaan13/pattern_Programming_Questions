package bitwise_operator;
/*
    Q.Substract two number without using - operator
 */
public class Substraction {
    public static void main(String[] args) {

        int a=52;
        int b = 25;

        int c= a+~b+1;
        System.out.println(c);

    }
}
