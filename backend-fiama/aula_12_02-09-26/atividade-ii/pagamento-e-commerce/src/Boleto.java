public class Boleto extends Ecommerce {

    private String dataVencimento;

    public Boleto(String nome, String produto, double preco, int quantidade, String dataVencimento) {
        super(nome, produto, preco, quantidade);
        this.dataVencimento = dataVencimento;
    }


    public String getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(String dataVencimento) { this.dataVencimento = dataVencimento; }


    @Override
    public void pagar() {
        double total = getPreco() * getQuantidade();
        IO.println("Forma de pagamento: Boleto");
        IO.println("Valor total     : R$ " +total);
        IO.println("Vencimento      : " + dataVencimento);
        IO.println("Pagamento aprovado! Boleto gerado com sucesso.");
        IO.println("Efetue o pagamento até a data de vencimento.");

    }
}