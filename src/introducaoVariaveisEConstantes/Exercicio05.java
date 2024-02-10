package introducaoVariaveisEConstantes;

import java.util.Scanner;

public class Exercicio05 {

    static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 70;
    public static void main(String[] args) {
        
        System.out.println("***** Programa que informa se o aluno passou de ano *****");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        Double notaDoAluno = scanner.nextDouble();

        Boolean passouDeAno = notaDoAluno >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;

        if (passouDeAno) {
                System.out.println("Parabéns! Aluno aprovado para o próximo ano!");
        }   
            else {
                System.out.println("Aluno reprovado!");
            }

            scanner.close();
    }
}
