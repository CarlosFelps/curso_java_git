package vetores;

import java.util.Scanner;

public class Exercicio01 {
    // CADASTRANDO AS TAREFAS DO DIA

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tarefas = new String[6];

        for (int i = 1; i < tarefas.length; i++) {
            System.out.print("Tarefa " + i + ": ");
            tarefas[i] = scanner.nextLine();

        }

        System.out.println("Suas tarefas são: ");
        for (int i = 1; i < tarefas.length; i++) {
            System.out.println(i + ": " + tarefas[i]);
        }

        scanner.close();
    }

}
