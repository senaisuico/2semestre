public class Ecommerce {

    // Atributos
    private String nome;
    private String produto;
    private double preco;
    private int quantidade;


    // Construtor
    public Ecommerce(String nome, String produto, double preco, int quantidade) {
        this.nome       = nome;
        this.produto    = produto;
        this.preco      = preco;
        this.quantidade = quantidade;
    }


    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getProduto() { return produto; }
    public void setProduto(String produto) { this.produto = produto; }

    public double getPreco() {return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int    getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }


    // Método da classe pai
    public void pagar() {
        IO.println("Forma de pagamento não definida.");
    }

    public void exibirPedido() {
        IO.println("Cliente  : " + nome);
        IO.println("Produto  : " + produto);
        IO.println("Preço    : R$ " + preco);
        IO.println("Qtd      : " + quantidade);
        IO.println("Total    : R$ " + preco * quantidade);
    }
}