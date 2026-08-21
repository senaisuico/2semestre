public class Produto {
    // Atributos privados: ninguém fora da classe pode alterá-los diretamente
    private String nome;
    private double preco;

    // --- MÉTODO GETTER (Para ler o nome) ---
    public String getNome() {
        return nome;
    }

    // --- MÉTODO SETTER (Para definir o nome) ---
    public void setNome(String nome) {
        this.nome = nome; // "this.nome" refere-se ao atributo da classe
    }

    // --- MÉTODO GETTER (Para ler o preço) ---
    public double getPreco() {
        return preco;
    }

    // --- MÉTODO SETTER COM VALIDAÇÃO (Para proteger o dado) ---
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo!");
        }
    }
}