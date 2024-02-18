package programacaoOrientadaObjetos.metodoinstancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Carlos";
        cliente.sobreNome = "Felipe";
        cliente.telefone = "229000000";
        cliente.email = "carlos.felipe@aluno.com";

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Rafaela";
        cliente2.sobreNome = "Conceição";
        cliente2.telefone = "349111222";
        cliente2.email = "rafaela.conceicao@aluno.com";

        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
        System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
        
    }
}
