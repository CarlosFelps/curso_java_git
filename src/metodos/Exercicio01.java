package metodos;

import java.util.Scanner;

public class Exercicio01 {
    // CRIE UM SEGUNDO METODO NO ALGORITMO DA AULA PASSADA

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

        System.out.println("Escolha dentre os curso abaixo: ");

        for (int i = 0; i < cursos.length; i++) {
            System.out.println("[" + i + "]" + cursos[i]);
        }

        System.out.print("O curso que você deseja é: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();

        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

        if (!posicaoValida) {
            encerrarProgramaPorCausaDeposicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[] { "Cartão", "Boleto" };

        System.out.println("Escolha dentre as formas de pagamento abaixo:");

        for (int i = 0; i < formasPagamento.length; i++) {
            System.out.println("[" + i + "]" + formasPagamento[i]);
        }

        System.out.print("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

        posicaoValida = posicaoFormaPagamentoEscolhida >= 0
                && posicaoFormaPagamentoEscolhida < formasPagamento.length;

        if (!posicaoValida) {
            encerrarProgramaPorCausaDeposicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        System.out.println(
                "O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }

    static void imprimirTraco() {
        System.out.println("------------------------------------------------");
    }

    static void encerrarProgramaPorCausaDeposicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);

    }
}
