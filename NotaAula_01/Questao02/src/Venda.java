public class Venda {

    public static void realizarVenda(Produto produto, int quantidadeVendida, String formaPagamento, double valorPago) {
        if (quantidadeVendida > produto.getQuantidadeEstoque()) {
            System.out.println("Quantidade em estoque insuficiente!");
            return;
        }

        double valorTotal = produto.getValor() * quantidadeVendida;
        double valorFinal = valorTotal;

        if (formaPagamento.equalsIgnoreCase("Pix") || formaPagamento.equalsIgnoreCase("Especie") ||
                formaPagamento.equalsIgnoreCase("Transferencia") || formaPagamento.equalsIgnoreCase("Debito")) {
            valorFinal = valorTotal * 0.95;
            System.out.println("Desconto de 5% aplicado.");
        } else if (formaPagamento.equalsIgnoreCase("Credito")) {
            System.out.println("Compra parcelada em 3x sem juros.");
        }

        System.out.println("Valor final da compra: R$ " + valorFinal);

        if (formaPagamento.equalsIgnoreCase("Especie")) {
            if (valorPago >= valorFinal) {
                double troco = valorPago - valorFinal;
                System.out.println("Troco: R$ " + troco);
            } else {
                System.out.println("Valor pago é insuficiente!");
                return;
            }
        }

        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidadeVendida);
        System.out.println("Venda realizada com sucesso!");
        System.out.println("Estoque atual: " + produto.getQuantidadeEstoque());
    }
}
