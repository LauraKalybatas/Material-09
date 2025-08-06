import java.util.Scanner;

public class ForEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorTotal = 0, valorProduto;
        int qtdProduto, cont, tipoPagamento;

        System.out.print("Quantidade de produtos --> ");
        qtdProduto = sc.nextInt();

        for(cont = 1; cont <= qtdProduto; cont++){
            System.out.print("Insira o valor do produto " + cont + " --> R$");
            valorProduto = sc.nextDouble();
            valorTotal += valorProduto;
        }
        System.out.println();
        System.out.println("O total da sua compra é --> R$" + valorTotal);
        System.out.print("Digite 1 para pagamento a vista ou 2 para parcelar: ");
        tipoPagamento = sc.nextInt();

        switch (tipoPagamento){
            case 1 -> valorTotal = valorTotal * 0.90;
            case 2 -> valorTotal = valorTotal * 1.155;
        }

        System.out.println("Valor a pagar --> R$" + valorTotal);
    }
}
