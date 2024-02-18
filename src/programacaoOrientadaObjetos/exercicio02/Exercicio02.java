package programacaoOrientadaObjetos.exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Lenço umidecido";
        produto.quantidadeEstoque = 8;

        Produto produto2 = new Produto();
        produto2.nome = "Pacote Fralda";
        produto2.quantidadeEstoque = 10;

        System.out.println(
                "Necessário repor estoque do produto " + produto.nome + "? " + produto.eNecessarioReporEstoque());
        System.out.println("Necessário repor estoque do produto " + produto2.nome + "? " + produto2.eNecessarioReporEstoque());
    }
}
