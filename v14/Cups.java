package v14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Cups {
    public static boolean isInteger(String s){
        boolean res=false;
        try {
            Integer.parseInt(s);

            res=true;
        }
        catch (NumberFormatException e){

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String col[]=new String[n];
        int rad[]=new int[n];
        for (int i=0;i<n;i++){
            String a=sc.next(),b=sc.next();
            if(isInteger(a)){
                rad[i]=Integer.parseInt(a)/2;
                col[i]=b;
            }
            else {
                col[i]=a;
                rad[i]=Integer.parseInt(b);
            }
        }
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(rad[i]>rad[j]){
                    int tp=rad[i];
                    rad[i]=rad[j];
                    rad[j]=tp;
                    String tp1=col[i];
                    col[i]=col[j];
                    col[j]=tp1;
                }
            }
        }
        for (int i=0;i<n;i++)
            System.out.println(col[i]);
    }
}
