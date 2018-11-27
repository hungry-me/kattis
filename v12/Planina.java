package v12;
import java.util.Scanner;
public class Planina {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long e=(long)Math.pow(2,n)+1;
        System.out.println(e*e);
    }
}
