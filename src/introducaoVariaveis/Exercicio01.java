package introducaoVariaveis;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        System.out.println("******CALCULANDO O QUADRADO DE UM NÚMERO******");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer numero = scanner.nextInt();

        Integer calculoDoQuadrado = numero * numero;

        System.out.println("O quadrado de " + numero + " é " + calculoDoQuadrado + ".");

        scanner.close();
    }
}
