public class Pix extends Ecommerce {

    private double saldo;


    public Pix(String nome, String produto, double preco, int quantidade, double saldo) {
        super(nome, produto, preco, quantidade);
        this.saldo = saldo;
    }


    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }


    @Override
    public void pagar() {
        double total = getPreco() * getQuantidade();
        IO.println("Forma de pagamento: PIX");
        IO.println("Valor total  : R$ " + total);
        IO.println("Saldo conta  : R$ " + saldo);

        if (saldo < total) {
            IO.println("Pagamento recusado! Saldo insuficiente.");
        } else {
            saldo = saldo - total;
            IO.println("Pagamento aprovado!");
            IO.println("Saldo restante: R$ " + saldo);
        }
    }
}