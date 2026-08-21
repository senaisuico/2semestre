public class ContaBancaria {
    //Atributos
    private String titular;
    private double saldo;
    private double limite;


    //Construtores
    public ContaBancaria(String titular) {
        this.titular = titular;
        saldo = 0;
        limite = 200;
    }


    //Criação dos métodos setters
    public String getTitular(String titular) {return this.titular;}
    public double getSaldo() {return saldo;}
    public double getLimite() {return limite;}

    public void setTitular(String titular) {this.titular = titular;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
    public void setLimite(double limite) {this.limite = limite;}


    //Métodos da classe
    public void consultar_saldo (double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            IO.println("O valor para depósito não pode ser negativo!");
        }

    }
    public void sacar(double valor) {
        if (saldo < valor) {
            IO.println("Você está tentando sacar um valor maior do que o saldo da conta!");
        } else  {
            saldo = saldo - valor;
        }
    }
    public void usar_limite(double valor) {
        if (saldo < valor) {
            saldo = saldo - valor;
        }
        if (valor < limite) {
            IO.println("Você está tentando sacar um valor maior do que o limite disponível para sua conta!");
        }
    }

}