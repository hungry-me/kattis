package v15;

import java.util.Scanner;

public class SumKindOfProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        for (int i=0;i<p;i++){
            int k=sc.nextInt(),n=sc.nextInt();
            int sq=n*n;
            System.out.printf("%d %d %d %d\n",k,(sq+n)>>1,sq,sq+n);
        }
    }
}
