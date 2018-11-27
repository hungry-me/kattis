package v12;
import java.util.Scanner;
public class TwoStones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n%2==1)
            System.out.println("Alice");
        else
            System.out.println("Bob");
    }
}
