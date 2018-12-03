package v14;

import java.util.Scanner;

public class QuickEstimate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            String s=sc.next();
            System.out.println(s.length());
        }
    }
}
