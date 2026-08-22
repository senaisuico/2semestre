import static java.lang.IO.*;
void main()  {
    String titular = readln("Por favor, informe seu nome: ");
    ContaBancaria contaBancaria = new ContaBancaria(titular);
    println("--- Conta Bancária ---");
    println("Escolha uma opção abaixo pelo número: ");
    println("0 - Sair");
    println("1 - Abertura de conta");
    println("2 - Consultar saldo de conta");
    println("3 - Realizar Depósito");
    println("4 - Realizar Saque");

    int operacao = Integer.parseInt(readln("Informe o número da operação: "));
//    println("\n");
    while (operacao != 0) {

        if (operacao == 1) {
            println("Você está abrindo uma nova conta: ");
            println(contaBancaria.getTitular() + " o saldo da sua conta é: " + contaBancaria.getSaldo() + " e o limite da conta é: " + contaBancaria.getLimite() + "\n");
        }
        else if (operacao == 2) {
            println("O saldo em conta é: " + contaBancaria.getSaldo() + " e o limite da conta é: " + contaBancaria.getLimite() + "\n");
            }
        else if(operacao == 3) {
            print("Informe um valor para depositar: ");
            contaBancaria.depositar(Double.parseDouble(readln()));
            println("Seu saldo atual é: " + contaBancaria.getSaldo() + "\n");
            }
        else if (operacao == 4) {
            print("Informe um valor para sacar: ");
            double valor = Double.parseDouble(readln());

            if (valor <= contaBancaria.getSaldo() + contaBancaria.getLimite()) {
                contaBancaria.sacar(valor);
                println("Seu saldo atual é: " + contaBancaria.getSaldo() + " e seu limite agora é: " + contaBancaria.getLimite() + "\n");
            } else {
                println("Saldo da conta e limite insuficientes!\n");
            }
        }
        else {
                println("Opção inválida!\n");
            }

        // Mostra o menu novamente para a próxima operação
        println("Escolha uma opção abaixo pelo número: ");
        println("0 - Sair");
        println("1 - Abertura de conta");
        println("2 - Consultar saldo de conta");
        println("3 - Realizar Depósito");
        println("4 - Realizar Saque");
        operacao = Integer.parseInt(readln("Escolha uma operação: "));
    }

    println("Você saiu da sua conta!");

}