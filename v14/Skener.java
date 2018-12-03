package v14;

import java.util.Scanner;

public class Skener {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt(),zr=sc.nextInt(),zc=sc.nextInt();
        String ar[][]=new String[r][c];
        for (int i=0;i<r;i++){
            String s=sc.next();
            for (int j=0;j<c;j++){
                ar[i][j]=s.substring(j,j+1);
            }
        }
        for (int i=0;i<ar.length;i++){
            for (int j=0;j<zr;j++){
                for (int k=0;k<ar[0].length;k++){
                    for (int l=0;l<zc;l++){
                        System.out.print(ar[i][k]);
                    }
                }
                System.out.println();
            }
        }
    }
}
