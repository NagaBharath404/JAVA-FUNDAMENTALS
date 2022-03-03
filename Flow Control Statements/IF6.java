import java.util.Scanner;

public class IF6 {
    public static void main(String[] args) {
        int age;
        String gender;
        Scanner sc=new Scanner(System.in);
        gender= sc.nextLine();
        age= sc.nextInt();
        sc.nextLine();
        if(gender.equals("m")){
            if(age>=1 && age <=58) {
                System.out.println("Intrest = 8.4");
            }else{
                System.out.println("Interest = 10.5");
            }
        }
        else {
            if(age>=1 && age <=58){
                System.out.println("Interest = 8.2");
            }else{
                System.out.println("Interest = 9.2");
            }
        }
    }
}
