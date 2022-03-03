import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        String c_name,loc;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter company name:");
        c_name=scanner.nextLine();
        System.out.println("enter location:");
        loc=scanner.nextLine();
        System.out.println(c_name+" technologies "+loc);
    }
}
