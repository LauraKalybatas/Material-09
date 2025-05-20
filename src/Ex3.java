import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, cont = 1, fat = 1;

        System.out.println("Insira um valor POSITIVO a ser fatorado: ");
        valor = sc.nextInt();

        if (valor < 0){
            System.out.println("O numero precisa ser maior que zero!");
        } else {
            while (cont <= valor){
                fat = fat * cont;
                cont++;
            }
            System.out.print("Fatorial = " + fat);
        }
    }
}
