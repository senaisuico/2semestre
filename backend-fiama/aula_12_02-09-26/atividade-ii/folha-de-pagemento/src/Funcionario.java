public abstract class Funcionario {

    // Atributos privados
    private String nome;
    private String cpf;
    private double salario;


    // Construtor
    public Funcionario(String nome, String cpf, double salario) {
        this.nome    = nome;
        this.cpf     = cpf;
        this.salario = salario;
    }


    // Getters e Setters
    public String getNome()    { return nome; }
    public void setNome(String nome) {
        if (nome.isBlank()) {
            IO.println("Nome não pode estar em branco!");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf()     { return cpf; }
    public void setCpf(String cpf) {
        if (cpf.isBlank()) {
            IO.println("CPF não pode estar em branco!");
        } else {
            this.cpf = cpf;
        }
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) {
        if (salario <= 0) {
            IO.println("Salário deve ser maior que zero!");
        } else {
            this.salario = salario;
        }
    }

    // Método abstrato qeu será sobrescrito nas classes específicas
    public abstract double calcularBonificacao();


    // Método de cálculo de remuneração para todas as classes
    public double calcularRemuneracaoTotal() {
        return salario + calcularBonificacao();
    }


    // Método exibirHolerite
    public void exibirHolerite() {
        IO.println("Funcionário : " + nome);
        IO.println("CPF         : " + cpf);
        IO.println("Cargo       : " + getClass().getSimpleName());
        IO.println("Salário     : R$ " + salario);
        IO.println("Bonificação : R$ "+ calcularBonificacao());
        IO.println("Total       : R$ " + calcularRemuneracaoTotal() + "\n");
    }
}