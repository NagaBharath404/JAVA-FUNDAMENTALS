import java.util.Scanner;

public class IF2 {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("Number is even");
        }else
            System.out.println("Number is odd");
    }
}
