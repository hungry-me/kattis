package v15;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HelpaPhd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String s=sc.next();
            if(s.charAt(0)=='P'){
                System.out.println("skipped");
                continue;
            }
            StringTokenizer st=new StringTokenizer(s,"+");
            int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
    }
}
