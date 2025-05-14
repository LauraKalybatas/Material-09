import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, contador = 1;
        int maior = 0;
        while (contador <= 5) {
            System.out.println("Digite um valor: ");
            valor = sc.nextInt();

            if (contador == 1 || valor > maior){
                maior = valor;
            }
            contador++;
        }
        System.out.println("O maior valor inserido é: " + maior);
    }
}
