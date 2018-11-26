package v13;

import java.util.Scanner;

public class Judgingmoose {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt(),b= scanner.nextInt();
        if(a+b==0)
            System.out.println("Not a moose");
        else if(a==b)
            System.out.println("Even "+(a+b));
        else
        {
            int mx=(int)Math.max(a,b);
            System.out.println("Odd "+(mx*2));
        }
    }
}
