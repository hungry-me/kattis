package v13;

import java.util.Scanner;
public class OddmanOut {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int g=scanner.nextInt();
            long a[]=new long[g];
            for (int j=0;j<g;j++){
                a[j]=scanner.nextLong();
            }
            long tp=a[0];
            for (int j=1;j<g;j++)
                tp=tp^a[j];
            System.out.println("Case #"+(i+1)+": "+tp);
        }
    }
}
