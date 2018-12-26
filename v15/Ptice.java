package v15;

import java.util.Scanner;

public class Ptice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=0,b=0,g=0;
        String pa="ABC",pb="BABC",pg="CCAABB";
        String s=sc.next();
        for (int i=0;i<n;i++){
            if(s.charAt(i)==pa.charAt((i+3)%3))
                a++;
            if(s.charAt(i)==pb.charAt((i+4)%4))
                b++;
            if(s.charAt(i)==pg.charAt((i+6)%6))
                g++;
        }
        int mx=Math.max(a,Math.max(b,g));
        System.out.println(mx);
        if(a==mx)
            System.out.println("Adrian");
        if(b==mx)
            System.out.println("Bruno");
        if(g==mx)
            System.out.println("Goran");
    }
}
