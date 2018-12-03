package v14;

import java.util.Scanner;

public class ProvincesAndGold {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vc[]={8,5,2},ct[]={6,3,0},bt[]={3,2,1};
        int card[]=new int[3];
        for (int i=0;i<3;i++)
            card[i]=sc.nextInt();
        int pow=0;
        for (int i=0;i<3;i++)
            pow+=card[i]*bt[i];
        if(pow>=vc[0])
            System.out.print("Province or ");
        else if(pow>=vc[1] && pow<vc[0])
            System.out.print("Duchy or ");
        else if(pow>=vc[2] && pow<vc[1])
            System.out.print("Estate or ");
        if(pow>=ct[0])
            System.out.println("Gold");
        else if(pow>=ct[1] && pow<ct[0])
            System.out.println("Silver");
        else if(pow>=ct[2] && pow<ct[1])
            System.out.println("Copper");
    }
}
