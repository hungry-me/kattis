package v13;
import java.util.Scanner;
public class BabyBites {
    public static boolean isNumber(String n){
        try{
            int res=Integer.parseInt(n);
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),cn=0;
        String ar[]=new String[n];
        boolean fl=false;
        for (int i=0;i<n;i++){
            ar[i]=sc.next();
            cn++;
            if(isNumber(ar[i]))
            {
                int res=Integer.parseInt(ar[i]);
                if(res!=cn)
                    fl=true;
            }
        }
        if(fl)
            System.out.println("something is fishy");
        else
            System.out.println("makes sense");
    }
}
