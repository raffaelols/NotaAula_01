import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Produto ===");
        System.out.print("Informe o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o tamanho/peso do produto: ");
        String tamanhoOuPeso = scanner.nextLine();

        System.out.print("Informe a cor do produto: ");
        String cor = scanner.nextLine();

        System.out.print("Informe o valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.print("Informe a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        Produto produto = new Produto(codigo, nome, tamanhoOuPeso, cor, valor, quantidadeEstoque);

        System.out.println("\n=== Dados do Produto Cadastrado ===");
        produto.exibirDadosProduto();

        System.out.println("\n=== Venda de Produto ===");
        System.out.print("Informe a quantidade a ser vendida: ");
        int quantidadeVendida = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Informe a forma de pagamento (Pix, Especie, Transferencia, Debito, Credito): ");
        String formaPagamento = scanner.nextLine();

        double valorPago = 0;
        if (formaPagamento.equalsIgnoreCase("Especie")) {
            System.out.print("Informe o valor pago: ");
            valorPago = scanner.nextDouble();
        }

        Venda.realizarVenda(produto, quantidadeVendida, formaPagamento, valorPago);

        scanner.close();
    }
}
