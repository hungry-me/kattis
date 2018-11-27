package v12;
import java.util.Scanner;
public class Cold {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n],cn=0;
        for (int i=0;i<n ;i++ ) {
            ar[i]=sc.nextInt();
            if(ar[i]<0)
                cn++;
        }
        System.out.println(cn);
    }
}
