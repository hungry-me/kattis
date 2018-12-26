package v13;

import java.util.HashSet;
import java.util.Scanner;

public class FreeFood {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<n;i++){
            int s=sc.nextInt(),e=sc.nextInt();
            for (int j=s;j<=e;j++)
                hs.add(j);
        }
        System.out.println(hs.size());
    }
}
