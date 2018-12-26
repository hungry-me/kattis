package v15;

import java.util.Scanner;

public class Areal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long ar=sc.nextLong();
        long ps=(long)Math.sqrt(ar);
        if(ps*ps==ar)
            System.out.println(4*ps);
        else
            System.out.println(4*Math.sqrt(ar));
    }
}
