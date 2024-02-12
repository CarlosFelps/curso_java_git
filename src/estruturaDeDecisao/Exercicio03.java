package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio03 {
    //IMPRIMA O DIA DA SEMANA (DOMINGO, SEGUNDA-FEIRA, ETC...)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número referente ao dia da semana: ");
        Integer diaDaSemana = scanner.nextInt();

        String dia;

        switch (diaDaSemana) {
            case 1: dia =  "Domingo";                
                break;
            case 2: dia =  "Segunda-feira";                
                break;
            case 3: dia =  "Terça-feira";                
                break;
            case 4: dia =  "Quarta-feira";                
                break;
            case 5: dia =  "Quinta-feira";                
                break;
            case 6: dia =  "Sexta-feira";                
                break;
            case 7: dia =  "Sábado";                
                break;        
            default: dia = "INVÁLIDO";
        }

        System.out.println("O dia escolhido foi: " + dia);
        
        scanner.close();
    }
}
