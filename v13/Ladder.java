package v13;

import java.util.Scanner;
public class Ladder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int h= scanner.nextInt(),v= scanner.nextInt();
        int l=(int)Math.ceil(h/(Math.sin(Math.toRadians(v))));
        System.out.println(l);
    }
}
