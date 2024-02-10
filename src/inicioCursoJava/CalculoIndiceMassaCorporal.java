package inicioCursoJava;

import java.util.Scanner;

public class CalculoIndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");

        System.out.print("Digite o peso: ");
        Double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        //Double imc = peso / (altura * altura);

        //System.out.printf("%.2f", imc);

        Double alturaAoQuadrado = altura * altura;

        Double indiceMassaCorporal = peso / alturaAoQuadrado;

        System.out.println("Seu IMC é: " + indiceMassaCorporal);

        scanner.close();
    }
}
