package v15;

import java.util.Scanner;

public class EstimatingAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double PI=3.141592654;
        while (true){
            double r=sc.nextDouble();
            int m=sc.nextInt(),c=sc.nextInt();
            if(m==0 && c==0 && r==0.0)
                break;
            double arc=PI*r*r;
            double exp=(Double.valueOf(c)/m)*4*r*r;
            System.out.println(arc+" "+exp);
        }
    }
}
