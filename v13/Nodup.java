package v13;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Nodup {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");
        LinkedList<String> l=new LinkedList<>();
        int f=0;
        while(st.hasMoreTokens()) {
            String tp=st.nextToken();
            if (l.contains(tp))
            {
                f=1;
                break;
            }
            l.add(tp);
        }
        if (f==1)
            System.out.println("no");
        else
            System.out.println("yes");
    }
}
