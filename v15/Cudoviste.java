package v15;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Cudoviste {
    public static boolean allow(char ar[][],int i,int j){
        if(ar[i][j]=='#')
            return false;
        if(ar[i+1][j]=='#')
            return false;
        if(ar[i][j+1]=='#')
            return false;
        if(ar[i+1][j+1]=='#')
            return false;
        return true;
    }
    public static int crush(char ar[][],int i,int j){
        int cn=0;
        if(ar[i][j]=='X')
            cn++;
        if(ar[i][j+1]=='X')
            cn++;
        if(ar[i+1][j]=='X')
            cn++;
        if(ar[i+1][j+1]=='X')
            cn++;
        return cn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");
        int r=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());
        char ar[][]=new char[r][];
        for (int i=0;i<r;i++){
            String row=sc.nextLine();
            ar[i]=new char[c];
            ar[i]=row.toCharArray();
        }
        int a=0,b=0,cn=0,d=0,e=0;
        for (int i=0;i<r-1;i++){
            for (int j=0;j<c-1;j++){
                if(allow(ar,i,j)){
                    int cnt=crush(ar,i,j);
                    if(cnt==0)
                        a++;
                    if(cnt==1)
                        b++;
                    if(cnt==2)
                        cn++;
                    if(cnt==3)
                        d++;
                    if(cnt==4)
                        e++;
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(cn);
        System.out.println(d);
        System.out.println(e);

    }
}
