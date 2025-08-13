//Ex 11 na apostila

import java.util.Scanner;

public class ForEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, cont, total = 0;

        System.out.print("Valor inteiro e positivo --> ");
        valor = sc.nextInt();

        if (valor < 0){
            System.out.println("O valor precisa ser positivo!!");
        } else {
            for(cont = 1; cont <= valor; cont++) {
                if (valor % cont == 0){
                    total++;
                }
            }
            if(total == 2){
                System.out.println("O numero inserido é primo! Portanto possue 2 divisores");
            } else {
                System.out.println("O numero possue " + total + " divisores! Portanto não é um numero primo");
            }
        }

    }
}
