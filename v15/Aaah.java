package v15;

import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next();
        int la=a.length(),lb=b.length();
        if(la>=lb)
            System.out.println("go");
        else
            System.out.println("no");
    }
}
