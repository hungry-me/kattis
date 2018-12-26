package v15;

import java.util.Scanner;

public class MixedFraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int num=sc.nextInt(),den=sc.nextInt();
            if(num==0 && den==0)
                break;
            int q=num/den;
            int rem=num%den;
            System.out.println(q+" "+rem+" / "+den);
        }
    }
}
