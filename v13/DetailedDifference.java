package v13;

import java.util.Scanner;

public class DetailedDifference {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++)
        {
            String s1=scanner.next(),s2=scanner.next();
            String tp="";
            int l1=s1.length(),l2=s2.length(),a=0,b=0;
            System.out.println(s1);
            System.out.println(s2);
            while (a<l1 || b<l2){
                if (s1.charAt(a)==s2.charAt(b))
                    tp+=".";
                else
                    tp+="*";
                a++;
                b++;
            }
            System.out.println(tp);
        }
    }
}
