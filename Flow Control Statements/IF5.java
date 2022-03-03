import java.util.Scanner;

public class IF5 {
    public static void main(String[] args) {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        if(a.matches("[a-zA-Z]+")){
            System.out.println("the given character is Alphabet");
        }else if(a.matches("[0-9]+")){
            System.out.println("the given character is digit");
        }else{
            System.out.println("the given character is Special Character");
        }
    }
}
