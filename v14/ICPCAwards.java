package v14;

import java.util.HashSet;
import java.util.Scanner;

public class ICPCAwards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),cn=0;
        HashSet<String> hs=new HashSet<>();
        for (int i=0;i<n;i++){
            String un=sc.next(),tm=sc.next();
            if(cn==12)
                break;
            if(hs.contains(un))
                continue;
            hs.add(un);
            System.out.println(un+" "+tm);
            cn++;
        }
    }
}
