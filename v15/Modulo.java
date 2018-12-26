package v15;

import java.util.HashSet;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hs=new HashSet<>();
        int ar[]=new int[10];
        for (int i=0;i<10;i++){
            ar[i]=sc.nextInt();
            hs.add(ar[i]%42);
        }
        System.out.println(hs.size());
    }
}
