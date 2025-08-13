//Ex 14 da apostila

import java.util.Scanner;

public class ForEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double y = 0;
        int cont, n;

        System.out.print("valor de n --> ");
        n = sc.nextInt();

        for(cont = 1; cont <= n; cont++){
            if (cont % 2 == 0) {
                y -= 1.0 / cont;
            } else {
                y += (double) 1 / cont;
            }
        }
        System.out.println(y);
    }
}
