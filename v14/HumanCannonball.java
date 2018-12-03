package v14;

import java.util.Scanner;

public class HumanCannonball {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            double v=sc.nextDouble(),ang=sc.nextDouble(),x=sc.nextDouble(),h1=sc.nextDouble(),h2=sc.nextDouble();
            double tm=x/(v*Math.cos(Math.toRadians(ang)));
            double y=(v*tm*Math.sin(Math.toRadians(ang)))-(0.5*9.81*tm*tm);
            if(y-h1>=1 && h2-y>=1)
                System.out.println("Safe");
            else
                System.out.println("Not Safe");
        }
    }
}
