import java.util.Scanner;

public class SWITCH1 {
    public static void main(String[] args) {
        String a;
        Scanner sc=new Scanner(System.in);
        a= sc.nextLine();
        switch (a){
            case "R":
                System.out.println("Red");
                break;
            case "Y":
                System.out.println("Yellow");
                break;
            case "O":
                System.out.println("Orange");
                break;
            case "B":
                System.out.println("Blue");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "W":
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid code");
                break;
        }
    }
}
