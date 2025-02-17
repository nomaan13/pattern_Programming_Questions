package special_numbers;

public class Happy_range {
    public static void main(String[] args) {
        int count=0;
        for(int i =1;i<=100;i++){
            if (Happy_Number.checkHappy(i)){
                System.out.print(i+" ");
                count++;
            }


        }
        System.out.println();
        System.out.println("Total number of Happy number from range 1 to 100 is: "+count);
    }
}
