package v13;

import java.util.Scanner;
public class Zamka {
    public static boolean sum(int d,int x){
        int k,sm=0;
        while (d!=0){
            k=d%10;
            sm+=k;
            d/=10;
        }
        if (sm==x)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l= scanner.nextInt();
        int h=scanner.nextInt();
        int x= scanner.nextInt();
        int mn=999999, mx=-1;
        for (int i=l;i<=h;i++){
            if(sum(i,x)){
                if(i<mn)
                    mn=i;
                if (mx<i)
                    mx=i;
            }
        }
        System.out.println(mn);
        System.out.println(mx);
    }
}
