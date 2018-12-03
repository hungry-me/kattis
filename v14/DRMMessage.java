package v14;

import java.util.HashMap;
import java.util.Scanner;

public class DRMMessage {
    public static String getRotatedString(String s,HashMap<Character,Integer> ci,HashMap<Integer,Character> ic){
        int sm=0;
        String res="";
        for (int i=0;i<s.length();i++)
            sm+=ci.get(s.charAt(i));
        while (sm>=26)
            sm-=26;
        for (int i=0;i<s.length();i++){
            res+=ic.get((ci.get(s.charAt(i))+sm)%26);
        }
        return res;
    }
    public static String getResultString(String f,String s,HashMap<Character,Integer> ci,HashMap<Integer,Character> ic){
        String res="";
        for (int i=0;i<s.length();i++){
            res+=ic.get((ci.get(s.charAt(i))+ci.get(f.charAt(i)))%26);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String fir=s.substring(0,s.length()/2),sec=s.substring(s.length()/2,s.length());
        HashMap<Character,Integer> ci=new HashMap<>();
        HashMap<Integer,Character> ic=new HashMap<>();
        int cn=0;
        for (char i='A';i<='Z';i++,cn++) {
            ci.put(i, cn);
            ic.put(cn,i);
        }
        String rfir=getRotatedString(fir,ci,ic),rsec=getRotatedString(sec,ci,ic);
        String res=getResultString(rfir,rsec,ci,ic);
        System.out.println(res);
    }
}
