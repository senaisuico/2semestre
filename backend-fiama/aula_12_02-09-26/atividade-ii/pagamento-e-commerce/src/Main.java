import static java.lang.IO.*;

void main() {
    println("Sistema de e-commerce. Seja bem-vindo!");

    String nome     = readln("Informe seu nome: ");
    String produto  = readln("Informe o produto para compra: ");
    double preco    = Double.parseDouble(readln("Informe o preço unitário: "));
    int quantidade  = Integer.parseInt(readln("Informe a quantidade: "));

    println("\nEscolha a forma de pagamento:");
    println("1 - Pix");
    println("2 - Cartão de Crédito");
    println("3 - Boleto");
    println("0 - Cancelar");
    int opcao = Integer.parseInt(readln("Escolha uma opção: "));

    if (opcao == 1) {

        double saldo = Double.parseDouble(readln("Informe o saldo disponível na conta: "));
        Pix pix = new Pix(nome, produto, preco, quantidade, saldo);
        pix.exibirPedido();
        pix.pagar();

    } else if (opcao == 2) {

        double limite = Double.parseDouble(readln("Informe o limite disponível no cartão: "));
        CartaoCredito cartao = new CartaoCredito(nome, produto, preco, quantidade, limite);
        cartao.exibirPedido();
        cartao.pagar();

    } else if (opcao == 3) {

        String dataVencimento = readln("Informe a data de vencimento do boleto: ");
        Boleto boleto = new Boleto(nome, produto, preco, quantidade, dataVencimento);
        boleto.exibirPedido();
        boleto.pagar();

    } else if (opcao == 0) {

        println("Compra cancelada!");

    } else {
        println("Opção inválida!");
    }

    println("\nObrigado por comprar em nosso e-commerce!");
}