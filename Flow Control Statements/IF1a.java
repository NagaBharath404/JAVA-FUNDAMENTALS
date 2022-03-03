import java.util.Scanner;

public class IF1a {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        if(a==0){
            System.out.println("the given number is Zero");
        }else if(a>0){
            System.out.println("the given number is positive");
        }else{
            System.out.println("the given number is negative");
        }
    }
}
