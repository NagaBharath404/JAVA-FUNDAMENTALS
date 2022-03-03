import java.util.Scanner;

public class IF1b {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        a=a%10;
        b= sc.nextInt();
        b=b%10;
        if(a==b){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
