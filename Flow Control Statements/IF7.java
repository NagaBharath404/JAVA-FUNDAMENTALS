import java.util.Scanner;

public class IF7 {
    public static void main(String[] args) {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        if(a.matches("[a-z]+")){
            System.out.println(a.toUpperCase());
        }else{
            System.out.println(a.toLowerCase());
        }
    }
}
