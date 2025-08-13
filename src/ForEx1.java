//Ex 10 na apostila

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, cont;

        System.out.print("Valor inteiro e positivo --> ");
        valor = sc.nextInt();

        if(valor>0){
            for(cont = 1; cont <= valor; cont++) {
                if (valor % cont == 0){
                   System.out.println(cont + " ");
                }
            }
        } else {
            System.out.println("O valor inserido precisa ser positivo!!");
        }
    }
}
