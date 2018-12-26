package v15;

import java.util.HashSet;
import java.util.Scanner;

public class BoatParts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt(),n=sc.nextInt(),cn=0,d=0;
        boolean fl=false;
        HashSet<String> hs=new HashSet<>();
        for (int i=0;i<n;i++){
            String s=sc.next();
            if(!hs.contains(s)){
                hs.add(s);
                cn++;
                if(cn==p) {
                    fl=true;
                    break;
                }
            }
            d++;
        }
        if(fl)
            System.out.println(++d);
        else
            System.out.println("paradox avoided");
    }
}
