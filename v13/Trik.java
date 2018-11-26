package v13;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ar[]={1,0,0};
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                int tp=ar[0];
                ar[0]=ar[1];
                ar[1]=tp;
            }
            else if(s.charAt(i)=='B'){
                int tp=ar[1];
                ar[1]=ar[2];
                ar[2]=tp;
            }
            else{
                int tp=ar[0];
                ar[0]=ar[2];
                ar[2]=tp;
            }
        }
        for (int i=0;i<3;i++){
            if(ar[i]==1){
                System.out.println(i+1);
                break;
            }
        }
    }
}
