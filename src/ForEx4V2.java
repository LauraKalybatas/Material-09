//Ex 14 da apostila versao sem If e Else

import java.util.Scanner;

public class ForEx4V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double y = 0;
        int cont, n, sinal = 1;

        System.out.print("valor de n --> ");
        n = sc.nextInt();

        for(cont = 1; cont <= n; cont++){
            y += (double) 1 / cont * sinal;
            sinal *= -1; //se for positivo fica negativo, se for negativo fica positivo
        }
        System.out.println(y);
    }
}
