package v13;

import java.util.Scanner;
public class Apaxian {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        char c=s.charAt(0);
        System.out.print(c);
        for (int i=1;i<s.length();i++){
            if (c!=s.charAt(i)) {
                c=s.charAt(i);
                System.out.print(c);
            }
        }
    }
}
