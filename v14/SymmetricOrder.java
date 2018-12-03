package v14;

import java.util.Scanner;
import java.util.Stack;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cn=1;
        while (true){
            int n=sc.nextInt();
            if(n==0)
                break;
            String ar[]=new String[n];
            for (int i=0;i<n;i++)
                ar[i]=sc.next();
            Stack<String> st=new Stack<>();
            System.out.println("SET "+(cn++));
            for (int i=0;i<n;i++){
                if(i%2!=0)
                    st.push(ar[i]);
                else
                    System.out.println(ar[i]);
            }
            while (!st.isEmpty())
                System.out.println(st.pop());
        }
    }
}
