package operadores;

import java.util.Scanner;

public class Exercicio02 {

    static final Double VALOR_DO_FRETE = 15.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        Boolean precisaCobrarFrete = valorProduto < 100;

        Double valorFinal = valorProduto;

        if (precisaCobrarFrete) {  
                valorFinal += VALOR_DO_FRETE;
        }

        System.out.println("Valor final: " + valorFinal);

        scanner.close();
    }
}
