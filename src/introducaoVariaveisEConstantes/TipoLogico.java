package introducaoVariaveisEConstantes;

public class TipoLogico {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variável verdadeira: " + variavelVerdadeira);

        Boolean varialvelFalsa = false;
        System.out.println("Variável Falsa: " + varialvelFalsa);

        System.out.println("------------------------------------------------------");

        Integer idade  = 21;

        boolean podeTirarHabilitacao = idade >= 18;

        //System.out.println("Pode tirar a CNH? " + podeTirarHabilitacao);

        // Utilizando estrutura de decisão
        if (podeTirarHabilitacao) {
                System.out.println("Sim! Ele(a) pode tirar a CNH.");
        } 
            else {
                System.out.println("Não! Ele(a) não pode tirar a CNH.");
            }
    }
}
