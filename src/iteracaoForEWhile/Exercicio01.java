package iteracaoForEWhile;

public class Exercicio01 {
    // ENCONTRE OS NÚMEROS DIVISÍVEIS POR 3

    static final Integer DIVISOR = 3; // Constante
    public static void main(String[] args) {
        
        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        /* for(int i = 0; i < numeros.length; i++) {
            Integer numero = numeros[i];

            if (numero % 3 == 0) {
                System.out.println(numero);
            }
        }*/

        // CORREÇÃO DO PROFESSOR ABAIXO

        for(int i =0; i < numeros.length; i++) {
                Integer numero = numeros[i];
                Integer moduloPorTres = numero % DIVISOR;

                if (moduloPorTres.equals(0)) {
                        System.out.println("Número " + numero + " é divisível por 3.");
                }
        }

        System.out.println("Fim.");
    }
}