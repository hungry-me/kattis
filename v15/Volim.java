package v15;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Volim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),n=sc.nextInt(),cn=0,ftm=210;
        int ar[]=new int[n];
        char rt[]=new char[n];
        for (int i=0;i<n;i++){
            ar[i]=sc.nextInt();
            rt[i]=sc.next().charAt(0);
        }
        for (int i=0;i<n;i++){
            int tm=ar[i];
            char res=rt[i];
            if((cn+tm)<ftm){
                cn=cn+tm;
                if(res=='T')
                    k++;
            }
            else
                break;
        }
        k=k%8;
        k=(k==0)?8:k;
        System.out.println(k);
    }
}
