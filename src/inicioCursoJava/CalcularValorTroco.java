package inicioCursoJava;

import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite o valor passado pelo cliente: ");
        Double valorPassadoPeloCliente = scanner.nextDouble();

        Double resultado = valorPassadoPeloCliente - valorProduto;

        System.out.printf("Troco no valor R$ %.2f", resultado);

        scanner.close();
    }
}
