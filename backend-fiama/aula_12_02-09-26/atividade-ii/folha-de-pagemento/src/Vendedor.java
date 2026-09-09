public class Vendedor extends Funcionario {

    private double totalVendido;


    public Vendedor(String nome, String cpf, double salario, double totalVendido) {
        super(nome, cpf, salario);
        this.totalVendido = totalVendido;
    }


    public double getTotalVendido() { return totalVendido; }

    public void setTotalVendido(double totalVendido) {
        if (totalVendido < 0) {
            IO.println("Total vendido não pode ser negativo!");
        } else {
            this.totalVendido = totalVendido;
        }
    }


    public double calcularComissao() {
        return totalVendido * 0.05;
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.05 + calcularComissao();
    }

    @Override
    public void exibirHolerite() {
        IO.println("Funcionário   : " + getNome());
        IO.println("CPF           : " + getCpf());
        IO.println("Cargo         : Vendedor");
        IO.println(String.format("Salário       : R$ %.2f", getSalario()));
        IO.println(String.format("Total vendido : R$ %.2f", totalVendido));
        IO.println(String.format("Comissão      : R$ %.2f", calcularComissao()));
        IO.println(String.format("Bonificação   : R$ %.2f", calcularBonificacao()));
        IO.println(String.format("Total         : R$ %.2f", calcularRemuneracaoTotal()));
    }
}