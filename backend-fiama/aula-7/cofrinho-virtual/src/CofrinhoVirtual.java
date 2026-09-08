public class CofrinhoVirtual {

    // Atributos da classe
    private String nome;
    private double saldo;
    private double meta;


    // Construtores da classe

    public CofrinhoVirtual(String nome, double meta) {
        this.nome = nome;
        saldo = 0;
        this.meta = meta;
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public double getProgresso() {
       return (saldo / meta) * 100;
    }

    public String getStatus() {
        if (saldo > 0 && saldo < meta) {
            return ("Economizando!");
        } else if (saldo >= meta) {
            return ("Meta de economia alcançada!");
        } else {
            return ("Meta não iniciada!");
        }
    }


    // Métodos

    public void adicionarDinheiro(double valor_deposito) {
        if (valor_deposito < 0) {
            IO.println("O valor para depósito deve ser positivo!\n");
        } else {
            saldo += valor_deposito;
        }
    }

    public void retirarDinheiro(double valor_saque) {

        if (valor_saque > saldo) {
            IO.println("Saldo insuficiente!");
        } else {
            saldo -= valor_saque;
        }
    }




}
