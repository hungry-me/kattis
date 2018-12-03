package v14;

import java.util.Scanner;

public class Beavergnaw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            double D=sc.nextDouble(),v=sc.nextDouble();
            if(D==0)
                break;
            double vol=(D*D*D)-(6*v/Math.PI);
            double d=Math.pow(vol,(1/3.0));
            System.out.println(d);
        }
    }
}
