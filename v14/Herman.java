package v14;

import java.util.Scanner;

public class Herman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n * n * Math.PI + "\n" + (double)n * n * 2);
    }
}
