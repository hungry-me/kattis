package v13;
import java.util.Scanner;
public class Bela {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dom[]={11,4,3,20,10,14,0,0};
        int ndom[]={11,4,3,2,10,0,0,0};
        int n=sc.nextInt(),sm=0;
        char b=sc.next().charAt(0);
        for (int i=0;i<4*n;i++){
            String hand=sc.next();
            char nm=hand.charAt(0),suit=hand.charAt(1);
            switch (nm){
                case 'A':
                    if(b==suit)
                        sm+=dom[0];
                    else
                        sm+=ndom[0];
                    break;
                case 'K':
                    if(b==suit)
                        sm+=dom[1];
                    else
                        sm+=ndom[1];
                    break;
                case 'Q':
                    if(b==suit)
                        sm+=dom[2];
                    else
                        sm+=ndom[2];
                    break;
                case 'J':
                    if(b==suit)
                        sm+=dom[3];
                    else
                        sm+=ndom[3];
                    break;
                case 'T':
                    if(b==suit)
                        sm+=dom[4];
                    else
                        sm+=ndom[4];
                    break;
                case '9':
                    if(b==suit)
                        sm+=dom[5];
                    else
                        sm+=ndom[5];
                    break;
                case '8':
                    if(b==suit)
                        sm+=dom[6];
                    else
                        sm+=ndom[6];
                    break;
                case '7':
                    if(b==suit)
                        sm+=dom[7];
                    else
                        sm+=ndom[7];
                    break;
            }
        }
        System.out.println(sm);
    }
}
