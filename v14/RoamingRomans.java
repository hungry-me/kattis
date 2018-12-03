package v14;

import java.util.Scanner;

public class RoamingRomans {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        long res=(long)Math.round(x*1000*5280.0/4854.0);
        System.out.println(res);
    }
}
