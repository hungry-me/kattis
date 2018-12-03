package v14;

import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3],b[]=new int[3];
        for (int i=0;i<3;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int x=0,y=0;
        for (int i=0;i<3;i++){
            if(a[i]!=a[(i+1)%3] && a[i]!=a[(i+2)%3])
                x=a[i];
            if(b[i]!=b[(i+1)%3] && b[i]!=b[(i+2)%3])
                y=b[i];
        }
        System.out.println(x+" "+y);
    }
}
