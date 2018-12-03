package v14;

import java.util.Scanner;

public class EncodedMessage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++) {
            char s[]=sc.next().toCharArray();
            int l = s.length;
            int step = (int) Math.sqrt(l);
            int j=0;
            char res[][]=new char[step][step];
            for (int x=0;x<step;x++)
                for (int y=0;y<step;y++)
                    res[x][y]=s[j++];
            for (int y=step-1;y>=0;y--) {
                for (int x = 0; x < step; x++)
                    System.out.print(res[x][y]);
            }
            System.out.println();
        }
    }
}
