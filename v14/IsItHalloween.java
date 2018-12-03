package v14;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");
        String mon=st.nextToken(),dt=st.nextToken();
        if( (mon.equals("OCT") && dt.equals("31")) || (mon.equals("DEC") && dt.equals("25")) )
            System.out.println("yup");
        else
            System.out.println("nope");
    }
}
