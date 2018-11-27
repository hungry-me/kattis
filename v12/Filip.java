package v12;
import java.util.Scanner;
public class Filip {
    public static int reverse(int n){
        int x,rev=0;
        while(n!=0){
            x=n%10;
            rev=(rev*10)+x;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int x=reverse(a),y=reverse(b);
        if(x>y)
            System.out.println(x);
        else
            System.out.println(y);
    }
}
