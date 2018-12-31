package v14;

import java.util.Scanner;

public class GoatRope {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt();
        double d=0.0;
        if(x>x1 && x<x2 && y>y2)
            d=y-y2;
        else if(x>x2 && y>y2)
            d=Math.hypot(x-x2,y-y2);
        else if (x>x2 && y>y1 && y<y2)
            d=x-x2;
        else if (x>x2 && y<y1)
            d=Math.hypot(x-x2,y1-y);
        else if (x>x1 && x<x2 && y<y1)
            d=y1-y;
        else if (x<x1 && y<y1)
            d=Math.hypot(x1-x,y1-y);
        else if (x<x1 && y>y1 && y<y2)
            d=x1-x;
        else if(x<x1 && y>y2)
            d=Math.hypot(x1-x,y-y2);
        System.out.println(d);
    }
}
