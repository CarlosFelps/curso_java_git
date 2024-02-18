package programacaoOrientadaObjetos.exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.codigo = "001";
        pedido.subTotal = 10.0;
        pedido.desconto = 0.1;
        // pedido.total = null;

        System.out.printf("Código: %s \nSubtotal: %.2f \nDesconto: %.2f \nTotal: %.2f", pedido.getCodigo(),
                pedido.getSubTotal(), pedido.getDesconto(), pedido.getTotal());

        // System.out.println("Código do pedido: " + pedido.getCodigo());
        // System.out.println("Subtotal do pedido: " + pedido.getSubTotal());
        // System.out.printf("Desconto do pedido: %.2f \n", pedido.getDesconto());
        // System.out.printf("Total do pedido: %.2f ", pedido.getTotal());
    }
}
