import java.util.Scanner;

public class FOR5 {
    public static void main(String[] args) {
        int number, sum;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        for(sum=0; number!=0; number=number/10)
        {
            sum = sum + number % 10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
