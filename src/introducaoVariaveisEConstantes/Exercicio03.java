package introducaoVariaveisEConstantes;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        System.out.println("***** Programa que informa se o aluno passou de ano *****");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        Double notaDoAluno = scanner.nextDouble();

        Boolean passouDeAno = notaDoAluno >= 70;

        if (passouDeAno) {
                System.out.println("Parabéns! Aluno aprovado para o próximo ano!");
        }   
            else {
                System.out.println("Aluno reprovado!");
            }

            scanner.close();
    }
}
