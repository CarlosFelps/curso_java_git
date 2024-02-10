package introducaoVariaveisEConstantes;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        System.out.println("***** FAÇA A IMPRESSÃO DE NOME E SOBRENOME DO USUÁRIO *****");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("Resultado: " + nome + " " + sobreNome);

        scanner.close();
    }
}
