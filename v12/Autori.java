package v12;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Autori {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringTokenizer st=new StringTokenizer(s,"-");
        String res="";
        while(st.hasMoreTokens())
        {
            res+=st.nextToken().charAt(0);
        }
        System.out.println(res);

    }
}
