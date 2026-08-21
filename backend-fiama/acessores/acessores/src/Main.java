public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto();

        // Alterando os valores usando os Setters
        prod.setNome("Teclado Mecânico");
        prod.setPreco(250.00);
        prod.setNome("Mouse sem fio");
        prod.setPreco(100);

        // Tentando injetar um dado inválido (O Setter irá bloquear)
        prod.setPreco(-50.00);

        // Lendo os valores usando os Getters
        System.out.println("Produto: " + prod.getNome());
        System.out.println("Preço: R$ " + prod.getPreco());
    }
}
