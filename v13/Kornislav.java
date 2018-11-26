package v13;

import java.util.Scanner;
import java.util.Arrays;
public class Kornislav {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[]=new int[4];
        for (int i=0;i<4;i++)
            a[i]=scanner.nextInt();
        Arrays.sort(a);
        System.out.println(a[0]*a[2]);
    }
}
