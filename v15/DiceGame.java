package v15;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int g[]=new int[4],e[]=new int[4];
        for (int i=0;i<4;i++)
            g[i]=sc.nextInt();
        for (int i=0;i<4;i++)
            e[i]=sc.nextInt();
        double gs=0.0,es=0.0;
        gs=((g[0]+g[1])/2.0)+((g[2]+g[3])/2.0);
        es=((e[0]+e[1])/2.0)+((e[2]+e[3])/2.0);
        if(gs<es)
            System.out.println("Emma");
        else if (gs>es)
            System.out.println("Gunnar");
        else
            System.out.println("Tie");
    }
}
