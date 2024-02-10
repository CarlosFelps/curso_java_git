package introducaoVariaveis;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // ENCONTRE O VALOR TOTAL BASEADO NA QUANTIDADE E NO DESCONTO

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        Integer quantidadeProduto = scanner.nextInt();

        Double valorSubtotal = valorProduto * quantidadeProduto;

        Boolean quantidadeMaiorOuIgualDez = quantidadeProduto >= 10;

        Double percentualDesconto = 0.0;

        if (quantidadeMaiorOuIgualDez) {
                percentualDesconto = 10.0;
        }
        
        Double desconto = valorSubtotal * percentualDesconto / 100;

        Double valorTotalComDesconto = valorSubtotal - desconto;

        System.out.println("Valor total: " + valorTotalComDesconto);
        
        
        scanner.close();
    }
}
