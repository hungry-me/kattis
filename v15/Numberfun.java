package v15;

import java.util.Scanner;

public class Numberfun {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i=0;i<n;i++)
        {
            int a= scanner.nextInt(),b= scanner.nextInt(),c=scanner.nextInt();
            if((int)Math.abs(a-b)==c)
                System.out.println("Possible");
            else if ((a+b)==c)
                System.out.println("Possible");
            else if((a*b)==c)
                System.out.println("Possible");
            else if ((a/b==c && a%b==0) || (b/a==c && b%a==0))
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
    }
}
