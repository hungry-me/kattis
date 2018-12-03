package v14;
import java.util.Scanner;
public class LicenceToLaunch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),pos=999999999;
        long ar[]=new long[n],mn=999999999;
        for (int i=0;i<n;i++){
            ar[i]=sc.nextLong();
            if(ar[i]<mn){
                mn=ar[i];
                pos=i;
            }
        }
        System.out.println(pos);
    }
}
