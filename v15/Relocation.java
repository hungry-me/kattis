package v15;

import java.util.Scanner;

public class Relocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),q=sc.nextInt();
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        for (int i=0;i<q;i++){
            int id=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
            if(id==1)
                ar[a-1]=b;
            else
                System.out.println((int)Math.abs(ar[a-1]-ar[b-1]));
        }
    }
}
