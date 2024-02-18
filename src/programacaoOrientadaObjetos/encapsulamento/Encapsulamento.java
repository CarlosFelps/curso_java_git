package programacaoOrientadaObjetos.encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        // Cliente cliente = new Cliente();
        // cliente.nome = "Carlos Felipe";
        // cliente.telefone = "2199999999";

        // System.out.println("Nome cliente: " + cliente.nome);

        Cliente cliente = new Cliente();
        cliente.setNome("Carlos Felipe");
        cliente.setTelefone("2199999999");

        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Último nome: " + cliente.getUltimoNome());
    }
}
