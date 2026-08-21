import static java.lang.IO.*;
void main()  {
    String titular = readln("Por favor, informe seu nome: ");
    ContaBancaria contaBancaria = new ContaBancaria(titular);
    IO.println("--- Conta Bancária ---");

    println("Escolha uma opção no menu abaixo: ");
    println("0 - Sair");
    println("1 - Abertura de conta");
    println("2 - Consultar saldo de conta");
    println("3 - Realizar Depósito");
    println("4 - Realizar Saque");

    int opcao = Integer.parseInt(readln());

    while (opcao != 0) {
        switch (opcao) {
            case 1:
                println("Você está abrindo uma nova conta: ");
                println(contaBancaria.getTitular(titular) + " o saldo da sua conta é: " + contaBancaria.getSaldo() + " e o limite da conta é: " + contaBancaria.getLimite());
            case 2:
                println(contaBancaria.getSaldo());
            case 3:
                println("Informe um valor para depositar: ");
                contaBancaria.depositar(Double.parseDouble(readln()));
                println("Seu saldo atual é: " + contaBancaria.getSaldo());
            case 4:
                println("Informe um valor para sacar: ");
                contaBancaria.sacar(Double.parseDouble(readln()));
                println("Seu saldo atual é: " + contaBancaria.getSaldo());
        }
    }

}