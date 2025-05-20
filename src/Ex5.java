import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador, termos, x = 1, y = 1, z;

        System.out.print("Insira a quantidade de termos da sequência: ");
        termos = sc.nextInt();

        if(termos == 1) {
            System.out.println(x);
        } else if(termos == 2){
            System.out.print(x + " " + " " + y);
        } else {
            System.out.print(x + "  " + y + "  ") ;
            contador = 3;

            while (contador <= termos) {
                z = x + y;
                System.out.print(z + "  ");
                x = y;
                y = z;

                contador++;
            }
        }
    }
}
