package v13;

import java.util.Scanner;

public class Nastyhacks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int r = scanner.nextInt(), e = scanner.nextInt(), c = scanner.nextInt();
            int sm = e - c;
            if (sm > r)
                System.out.println("advertise");
            else if (sm == r)
                System.out.println("does not matter");
            else
                System.out.println("do not advertise");
        }
    }
}
