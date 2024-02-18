package programacaoOrientadaObjetos.metodoinstancia;

public class Cliente {

    String nome;

    String sobreNome;

    String telefone;

    String email;

    String obterNomeCompleto() {
        String nomeCompleto = nome + " " + sobreNome;

        return nomeCompleto;
    }

    String obterDDD() {
        String ddd = telefone.substring(0, 2);

        return ddd;
    }
}
