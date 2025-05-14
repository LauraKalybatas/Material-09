/*
    programa para ler dois numeros inteiros (o segundo valor deve ser obrigatoriamente maior que o primeiro)
    o programa deve imprimir todos os numeros dentro do intervalo
 */

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1, v2;

        System.out.println("Digite o valor 1: ");
        v1 = sc.nextInt();
        System.out.println("Digite o valor 2(maior que o primeiro): ");
        v2 = sc.nextInt();

        if(v2 > v1){
            while (v1 <= v2){
                v1++;
            }
        } else{
            System.out.println("o valor 2 precisa ser maior que o valor 1!");
        }
    }
}
