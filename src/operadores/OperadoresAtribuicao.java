package operadores;

public class OperadoresAtribuicao {
    public static void main(String[] args) {

        Integer numeroInteger = 7;
        Double numeroDouble = 7.0;

//      numeroInteger = numeroInteger + 4;
//      System.out.println("numero + 4.0: " + numero);

        numeroInteger += 4;
        System.out.println("numero += 4: " + numeroInteger);

        numeroInteger -= 4;
        System.out.println("numero -= 4: " + numeroInteger);

        numeroInteger *= 4;
        System.out.println("numero *= 4: " + numeroInteger);

//      numeroDouble /= 4;
//      System.out.println("numero /= 4: " + numeroDouble);

        numeroDouble %= 4;
        System.out.println("numero %= 4: " + numeroDouble);
    }
}
