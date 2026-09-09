public class CartaoCredito extends Ecommerce {

    private double limite;


    public CartaoCredito(String nome, String produto, double preco, int quantidade, double limite) {
        super(nome, produto, preco, quantidade);
        this.limite = limite;
    }



    public double getLimite() { return limite; }
    public void setLimite(double limite) { this.limite = limite; }


    @Override
    public void pagar() {
        double total = getPreco() * getQuantidade();
        IO.println("Forma de pagamento: Cartão de Credito");
        IO.println("Valor total  : R$ " + total);
        IO.println("Limite disponível: R$ " + limite);

        if (limite < total) {
            IO.println("Pagamento reusado! Limite insuficiente.");
        } else {
            limite = limite - total;
            IO.println("Pagamento aprovado!");
            IO.println("Limite restante: R$ " + limite);
        }
    }
}