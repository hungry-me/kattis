package v13;

import java.util.Scanner;
public class Sevenwonders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int a[]=new int[3];
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='T')
                a[0]++;
            else if (s.charAt(i)=='C')
                a[1]++;
            else
                a[2]++;
        }
        int sm=0,n=999999;
        for (int i=0;i<3;i++)
            sm+=(int)Math.pow(a[i],2);
        for (int i=0;i<3;i++)
        {
            if(a[i]<n)
                n=a[i];
        }
        System.out.println(sm+7*n);
    }
}
