package v13;

import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            int b = sc.nextInt();
            float p = sc.nextFloat();
            float bp=60.0f/p;
            float abp=bp*b;
            System.out.println((abp-bp)+" "+abp+" "+(abp+bp));
        }
    }
}
