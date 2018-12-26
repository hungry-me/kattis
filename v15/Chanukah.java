package v15;

import java.util.Scanner;

public class Chanukah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        for (int i=0;i<p;i++){
            int d=sc.nextInt(),n=sc.nextInt();
            int res=(n*(n+1)/2)+n;
            System.out.println(d+" "+res);
        }
    }
}
