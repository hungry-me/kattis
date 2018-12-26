package v15;

import java.util.Scanner;

public class Pizza2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble(),c=sc.nextDouble();
        double chr=r-c;
        double res=(Math.pow(chr,2)/Math.pow(r,2))*100;
        System.out.println(res);
    }
}
