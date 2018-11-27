package v12;
import java.util.Scanner;
public class QALY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sm=0.0f;
        for (int i=0;i<n;i++){
            float a=sc.nextFloat(),b=sc.nextFloat();
            sm+=(a*b);
        }
        System.out.println(sm);
    }
}
