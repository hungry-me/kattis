package v12;
import java.util.Scanner;
public class Tarifa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt(),sm=0;
        int a[]=new int[n];
        for (int i=0;i<n ;i++ ) {
            a[i]=sc.nextInt();
            sm=sm+x-a[i];
        }
        System.out.println(sm+x);
    }
}
