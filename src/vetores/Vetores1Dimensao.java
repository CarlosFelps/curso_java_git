package vetores;

//import java.util.Scanner;

public class Vetores1Dimensao {
    public static void main(String[] args) {
    /*  String[] cardapio = new String[] { "Calabresa", "Queijo" , "Presunto", "Mineira"};

        System.out.println("Escolha o sabor:");

        for(int i = 0; i < cardapio.length; i++) {
            System.out.println("[" + i + "] " + cardapio[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número referente ao sabor: ");
        Integer saborEscolhido = scanner.nextInt();

        System.out.println("Sabor escolhido: " + cardapio[saborEscolhido]);

        scanner.close(); */

    /*  String[] cardapio = new String[] { "Calabresa", "Queijo" , "Presunto", "Mineira"};

        cardapio[3] = "Frango c/ catupiry";
        for(int i = 0; i < cardapio.length; i++) {
            System.out.println(cardapio[i]);
        } */

        String[] cardapio = new String[5];
        cardapio[0] = "Lombo canadense";
        cardapio[1] = "Calabresa";
        cardapio[2] = "Frango c/ catupiry";
        cardapio[3] = "4 Queijos";
        cardapio[4] = null;
        
        for(int i = 0; i < cardapio.length; i++) {
            System.out.println(cardapio[i]);
        }
    }
}
