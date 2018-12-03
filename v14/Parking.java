package v14;

import java.util.Arrays;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int ar[]=new int[n];
            for (int j=0;j<n;j++)
                ar[j]=sc.nextInt();
            Arrays.sort(ar);
            int mid=ar.length/2;
            int res=(ar[mid]-ar[0])*2 + (ar[ar.length-1]-ar[mid])*2;
            System.out.println(res);
        }
    }
}
