package v14;

import java.util.HashSet;
import java.util.Scanner;

public class HeirDilemma {
    public static boolean divisible(int n){
        int tp=n;
        while (n!=0){
            int x=n%10;
            if(tp%x!=0)
                return false;
            n/=10;
        }
        return true;
    }
    public static boolean containsZero(int n){
        String s=""+n;
        if(s.contains("0"))
            return true;
        return false;
    }
    public static boolean allDiff(int n){
        HashSet<Integer> hs=new HashSet<>();
        while (n!=0){
            int x=n%10;
            if(hs.contains(x))
                return false;
            else
                hs.add(x);
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt(),h=sc.nextInt(),cn=0;
        for (int i=l;i<=h;i++){
            if(!containsZero(i) && allDiff(i) && divisible(i))
                cn++;
        }
        System.out.println(cn);
    }
}
