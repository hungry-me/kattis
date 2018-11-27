package v12;
import java.util.Scanner;
public class LastFactorialDigit {
    public static long getFactorial(int n){
        long f=1;
        for (int i=n;i>=2;i--)
            f*=i;
        return f;
    }
    public static int getLastDigit(long n){
        return (int)n%10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            System.out.println(getLastDigit(getFactorial(n)));
        }
    }
}
