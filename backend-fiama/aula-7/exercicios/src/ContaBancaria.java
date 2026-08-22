public class ContaBancaria {
    //Atributos
    private String titular;
    private double saldo;
    private double limite;

    //Construtor
    public ContaBancaria(String titular) {
        this.titular = titular;
        saldo = 0;
        limite = 200;
    }


    //Criação dos métodos setters
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public double getLimite() { return limite; }

    public void setTitular(String titular) { this.titular = titular; }
    public void setLimite(double limite) { this.limite = limite; }


    //Métodos da classe
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            IO.println("O valor para depósito não pode ser negativo!");
        }
    }

    public void sacar(double valor) {
        if (saldo + limite < valor) {
            IO.println("Saldo e limite insuficientes!");
        } else if (saldo < valor) {
            limite = limite - (valor - saldo);
            saldo = 0;
            IO.println("Saldo insuficiente. Limite utilizado!");
        } else {
            saldo = saldo - valor;
        }
    }
}