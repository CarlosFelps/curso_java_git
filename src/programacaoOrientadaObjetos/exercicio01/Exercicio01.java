package programacaoOrientadaObjetos.exercicio01;

public class Exercicio01 {
    // METODO QUE INFORMA NECESSIDADE DE REPOR ESTOQUE
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Mouse sem fio";
        produto.quantidadeEstoque = 10;

        System.out.println(
                "Necessário repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));
    }

    static Boolean eNecessarioReporEstoque(Produto produto) {
        if (produto.quantidadeEstoque < produto.QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }
        return false;
    }

}
