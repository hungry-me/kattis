package v13;

import java.util.Scanner;

public class Reversebinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        String s=Long.toBinaryString(n);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        System.out.println(Integer.parseInt(s,2));
    }
}
