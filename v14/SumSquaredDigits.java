package v14;

import java.util.Scanner;

public class SumSquaredDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int k=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int sm=0;
            while (n!=0){
                int x=n%b;
                sm+=x*x;
                n=(n-x)/b;
            }
            System.out.println(k+" "+sm);
        }
    }
}
