package v13;
import java.util.Scanner;
public class Oddities {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++)
        {
            int tp=scanner.nextInt();
            if (tp%2==0)
                System.out.println(tp+" is even");
            else
                System.out.println(tp+" is odd");
        }
    }
}
