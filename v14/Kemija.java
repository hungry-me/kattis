package v14;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Kemija {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            String a=st.nextToken();
            for (int i=0;i<a.length();){
                if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
                {
                    System.out.print(a.charAt(i));
                    i+=3;
                }
                else {
                    System.out.print(a.charAt(i));
                    i++;
                }
            }
            System.out.print(" ");
        }
    }
}
