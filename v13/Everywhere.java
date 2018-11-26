package v13;

import java.util.HashSet;
import java.util.Scanner;

public class Everywhere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            HashSet<String> hs=new HashSet<>();
            for (int j=0;j<n;j++)
                hs.add(sc.next());
            System.out.println(hs.size());
        }
    }
}
