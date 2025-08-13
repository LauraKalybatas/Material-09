//Versao mais otimizada e rapida do exercicio 3

import java.util.Scanner;

public class ForEx3V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, cont, total = 0;

        System.out.print("Valor inteiro e positivo --> ");
        valor = sc.nextInt();

        if (valor < 0){
            System.out.println("O valor precisa ser positivo!!");
        } else {
            for(cont = 2; cont < valor; cont++) {
                if (valor % cont == 0){
                    total++;
                    break;
                }
            }
            if(total == 0){
                System.out.println("O numero inserido é primo! Portanto possue 2 divisores");
            } else {
                System.out.println("O numero possue " + total + " divisores! Portanto não é um numero primo");
            }
        }
    }
}
