import java.util.Scanner;

public class IF3 {
    public static void main(String[] args) {
        String loc1,loc2;
        Scanner sc=new Scanner(System.in);
        loc1=sc.next();
        loc2=sc.next();
        if(loc1==null  &&  loc2==null){
            System.out.println("No values");
        }else
            System.out.println(loc1+","+loc2);
    }
}
