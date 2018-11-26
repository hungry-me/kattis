package v13;

import java.util.Scanner;

public class PokerHand {
    public static int maxElement(int ar[]){
        int mx=-999;
        for (int i=0;i<ar.length;i++){
            if(ar[i]>mx)
                mx=ar[i];
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[14];
        for (int i=0;i<5;i++){
            String s=sc.next();
            switch (s.charAt(0)){
                case 'A':ar[0]++;
                            break;
                case '1':ar[1]++;
                    break;
                case '2':ar[2]++;
                    break;
                case '3':ar[3]++;
                    break;
                case '4':ar[4]++;
                    break;
                case '5':ar[5]++;
                    break;
                case '6':ar[6]++;
                    break;
                case '7':ar[7]++;
                    break;
                case '8':ar[8]++;
                    break;
                case '9':ar[9]++;
                    break;
                case 'T':ar[10]++;
                    break;
                case 'J':ar[11]++;
                    break;
                case 'Q':ar[12]++;
                    break;
                case 'K':ar[13]++;
                    break;
            }
        }
        System.out.println(maxElement(ar));
    }
}
