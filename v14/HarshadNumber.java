package v14;
import java.util.Scanner;
public class HarshadNumber {
    public static long getSum(long n){
        long sm=0,x;
        while (n!=0){
            x=n%10;
            sm+=x;
            n/=10;
        }
        return sm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        while (true){
            if(n%getSum(n)==0){
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
