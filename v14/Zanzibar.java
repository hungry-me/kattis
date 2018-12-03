package v14;

import java.util.ArrayList;
import java.util.Scanner;

public class Zanzibar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            ArrayList<Integer> al=new ArrayList<>();
            while (true){
                int n=sc.nextInt();
                if(n==0)
                    break;
                al.add(n);
            }
            int ovf=0;
            for (int j=0;j<al.size()-1;j++){
                if(al.get(j+1)>2*al.get(j))
                    ovf+=(al.get(j+1)-(2*al.get(j)));
            }
            System.out.println(ovf);
        }
    }
}
