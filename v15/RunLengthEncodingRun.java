package v15;

import java.util.Scanner;
import java.util.StringTokenizer;

public class RunLengthEncodingRun {
    public static void encode(String s){
        String res="";
        char ar[]=s.toCharArray();
        char cur=ar[2];
        int cn=0;
        res+=String.valueOf(cur);
        for (int i=2;i<ar.length;i++){
            if(ar[i]==cur)
                cn++;
            else{
                res+=String.valueOf(cn);
                cur=ar[i];
                res+=String.valueOf(cur);
                cn=1;
            }
        }
        res+=String.valueOf(cn);
        System.out.println(res);
    }
    public static void decode(String s){
        String res="";
        for (int i=2;i<s.length()-1;i+=2){
            char c=s.charAt(i);
            int cn=s.charAt(i+1)-'0';
            for (int j=0;j<cn;j++)
                res+=String.valueOf(c);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        switch (s.charAt(0)){
            case 'E':encode(s);
                    break;
            case 'D':decode(s);
                    break;
        }
    }
}
