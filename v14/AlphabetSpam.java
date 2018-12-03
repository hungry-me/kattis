package v14;

import java.util.Scanner;
import java.util.StringTokenizer;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length(),w=0,l=0,u=0,sy=0;
        for (int i=0;i<n;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                l++;
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                u++;
            else if(s.charAt(i)=='_')
                w++;
            else
                sy++;
        }
        System.out.println((float)w/n);
        System.out.println((float)l/n);
        System.out.println((float)u/n);
        System.out.println((float)sy/n);
    }
}
