package basics;

public class SumOfCubeOfNumbers {
    public static void main(String[] args) {
        int i =1;
        int sum =0;
        int cube = 0;

        while(i<=3){
            sum += i*i*i;
            i++;
        }
        System.out.println(sum);
    }
}
