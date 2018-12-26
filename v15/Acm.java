package v15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Acm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int ar[]=new int[26];
        while (true){
            int m=sc.nextInt();
            if(m==-1)
                break;
            char ch=sc.next().charAt(0);
            String res=sc.next();
            if (res.equals("right")) {
                int ind=(int)ch;
                ar[ind-65] = 1;
                if(hm.containsKey(ch))
                    hm.put(ch, hm.get(ch) + m);
                else
                    hm.put(ch,m);
            } else {
                if(hm.containsKey(ch))
                    hm.put(ch, hm.get(ch) + 20);
                else
                    hm.put(ch,20);
            }
        }
        int cn=0;
        for (int i=0;i<26;i++){
            if(ar[i]==1) {
                s+=hm.get((char)(65+i));
                cn++;
            }
        }
        System.out.println(cn+" "+s);
    }
}
