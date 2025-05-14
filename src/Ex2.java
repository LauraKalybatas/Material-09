import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, contador = 0, resultado, resposta = 1;

        while (resposta == 1){
            contador = 0;

            System.out.println("Valor --> ");
            valor = sc.nextInt();

            while(contador <= 10){
                resultado = valor * contador;
                System.out.println(valor + " x " + contador + " = " + resultado);
                contador++;
            }

            System.out.println("Insira 1 para gerar nova tabuada, ou 0 para finalizar: ");
            resposta = sc.nextInt();
        }
    }
}
