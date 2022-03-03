import java.util.Scanner;

public class FOR3 {
    public static void main(String[] args) {
        int i,n;
        for(i=0;i<=10;i++) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }
    }
}
