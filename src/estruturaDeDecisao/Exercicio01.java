package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio01 {
    // VERIFICAR SE A PESSOA PASSOU NO CONCURSO PÚBLICO

    static final Double NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
    static final Double NOTA_MINIMA_POR_MATERIA = 60.0;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota em Português: ");
        Double notaPortugues = scanner.nextDouble();

        System.out.print("Digite sua nota em Matemática: ");
        Double notaMatematica = scanner.nextDouble();

        Boolean estaAcimaDoMinimoEmPortugues = notaPortugues >= NOTA_MINIMA_POR_MATERIA;
        Boolean estaAcimaDoMinimoEmMatematica= notaMatematica >= NOTA_MINIMA_POR_MATERIA;

        Double notaTotal = notaPortugues + notaMatematica;

        Boolean temNotaParaPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL;

        Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;

        if (passou) {
                System.out.println("Parabéns! Você passou.");
        } 
            else {
                System.out.println("Infelizmente, não foi dessa vez.");
            }

        scanner.close();
    }
}
