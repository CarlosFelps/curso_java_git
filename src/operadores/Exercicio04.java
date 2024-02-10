package operadores;

import java.util.Scanner;

public class Exercicio04 {

    static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;

    static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
    public static void main(String[] args) {
        System.out.println("***** VARIFICAÇÃO DA POSSIBILIDADE DE APOSENTADORIA *****");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Digite o tempo de contribuição: ");
        Integer tempoDeContribuicao = scanner.nextInt();

        Boolean temIdadeParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;

        Boolean temTempoDeContribuicaoSuficiente = tempoDeContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;

        Boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicaoSuficiente;

        if (podeAposentar) {
                System.out.println("Sim! pode se aposentar.");
        } 
            else {
                System.out.println("Não pode se aposentar agora.");
        }

        scanner.close();

    }
}
