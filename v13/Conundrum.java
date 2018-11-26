package v13;
import java.util.Scanner;
public class Conundrum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String per="PER";
        int sm=0;
        for (int i=0,j=0;i<s.length();i++,j=(j+1)%3){
            if(s.charAt(i)!=per.charAt(j))
                sm++;
        }
        System.out.println(sm);
    }
}
