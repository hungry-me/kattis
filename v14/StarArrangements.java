package v14;

import java.util.Scanner;

public class StarArrangements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println(s+":");
        for (int i=2;i<=(s/2)+1;i++){
            for (int j=i-1;j<=i;j++){
                int tp=s;
                while (true)
                {
                    tp=tp-i;
                    if(tp<=0)
                        break;
                    tp=tp-j;
                    if(tp<=0)
                        break;
                }
                if(tp==0)
                    System.out.println(i+","+j);
            }
        }
    }
}
