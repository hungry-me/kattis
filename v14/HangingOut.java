package v14;

import java.util.Scanner;

public class HangingOut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int al=sc.nextInt(),t=sc.nextInt(),cn=0,rej=0;
        for (int i=0;i<t;i++){
            String s=sc.next();
            int n=sc.nextInt();
            if(s.equals("enter"))
            {
                if((cn+n)<=al)
                    cn+=n;
                else
                    rej++;
            }
            else
                cn-=n;
        }
        System.out.println(rej);
    }
}
