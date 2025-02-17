package basics;

public class number_in_range {
    public static void main(String[] args) {
        int count=0;

        for (int i =1;i<=200;i++){
            if (i%7==0 && i%10==7) {
                count++;
                System.out.print(i + " ");


            }

        }
        System.out.println("\nTotal number of numbers is " + count);
    }

}
