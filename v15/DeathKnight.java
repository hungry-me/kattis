package v15;

import java.util.Scanner;

public class DeathKnight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),cn=0;
        for (int i=0;i<n;i++){
            String s=sc.next();
            if(!s.contains("CD"))
                cn++;
        }
        System.out.println(cn);
    }
}
