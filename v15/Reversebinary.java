package v15;
import java.util.Scanner;
public class Reversebinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String s=Long.toBinaryString(n);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        System.out.println(Integer.parseInt(s,2));
    }
}
