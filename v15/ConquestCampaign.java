package v15;

import java.util.Scanner;

public class ConquestCampaign {
    static int ar[][];
    public static int surround1(int ar[][],int i,int j,int r,int c,int cn){
        if(j+1<c && ar[i][j+1]==0){
            ar[i][j+1]=1;
            cn++;
        }
        if((j-1)>=0 && ar[i][j-1]==0){
            ar[i][j-1]=1;
            cn++;
        }
        if(i+1<r && ar[i+1][j]==0){
            ar[i+1][j]=1;
            cn++;
        }
        if((i-1)>=0 && ar[i-1][j]==0){
            ar[i-1][j]=1;
            cn++;
        }
        return cn;
    }
    public static int getDays(int ar[][],int r,int c,int cn){
        int res=1;
        while (cn!=(r*c)){
            res++;
            for (int i=0;i<r;i++){
                for (int j=0;j<c;j++){
                    if(ar[i][j]==1)
                        cn=surround1(ar,i,j,r,c,cn);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt(),n=sc.nextInt();
        ar=new int[r][c];
        int cn=0;
        for (int i=0;i<n;i++){
            int x=sc.nextInt(),y=sc.nextInt();
            if(ar[x-1][y-1]==1)
                continue;
            ar[x-1][y-1]=1;
            cn++;
        }
        int day=getDays(ar,r,c,cn);
        System.out.println(day);
    }
}
