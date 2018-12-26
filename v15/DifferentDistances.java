package v15;

import java.util.Scanner;

public class DifferentDistances {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            double x1 = sc.nextDouble();
            if (x1==0.0)
                break;
            double y1=sc.nextDouble(),x2=sc.nextDouble(),y2=sc.nextDouble(),p=sc.nextDouble();
            double res=Math.pow(Math.pow((Math.abs(x1-x2)),p)+Math.pow((Math.abs(y1-y2)),p),1/p);
            System.out.println(res);
        }
    }
}
