package v15;

import java.util.Scanner;

public class Easiest {
    public static long sumOfDig(long n){
        long sm=0;
        while (n!=0){
            long x=n%10;
            sm+=x;
            n/=10;
        }
        return sm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            long n=sc.nextInt();
            if(n==0)
                break;
            long sm=sumOfDig(n);
            for (long i=11;;i++){
                long sm1=sumOfDig(n*i);
                if(sm==sm1){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
