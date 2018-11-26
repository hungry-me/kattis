package v13;

import java.util.Scanner;

public class Grassseed {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float c= scanner.nextFloat();
        int n= scanner.nextInt();
        float sm=0.0f;
        for (int i=0;i<n;i++)
        {
            float w= scanner.nextFloat(),h= scanner.nextFloat();
            sm+=(w*h);
        }
        System.out.printf("%.7f",c*sm);
    }
}
