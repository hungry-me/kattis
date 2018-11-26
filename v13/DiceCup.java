package v13;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class DiceCup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int ar[]=new int[m+n];
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++)
                ar[i+j]++;
        }
        int mx=-9999;
        for (int i=0;i<ar.length;i++){
            if(mx<ar[i])
                mx=ar[i];
        }
        for (int i=0;i<ar.length;i++){
            if(ar[i]==mx)
                hs.add(i+2);
        }
        for (Integer i:hs){
            System.out.println(i);
        }
    }
}
