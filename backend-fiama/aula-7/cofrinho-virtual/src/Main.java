import static java.lang.IO.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    String nome = readln("Por favor, informe seu nome: ");
    double meta = Double.parseDouble(readln("Por favor, informe seu meta a ser guardada no cofrinho: "));

    CofrinhoVirtual cofrinhoVirtual = new CofrinhoVirtual(nome, meta);
    println("Bem vindo ao cofrinho virtual," + nome + "\n");

    println("Informe uma das opções abaixo: ");
    println("1 - Depositar");
    println("2 - Sacar");
    println("0 - Encerrar aplicação");

    int operacao = Integer.parseInt(readln("Informe qual das operações deseja realizar: "));
    while (operacao != 0) {

        if (operacao == 1) {
          print("Informe um valor para depositar: ");
          cofrinhoVirtual.adicionarDinheiro(Double.parseDouble(readln()));
//          println("Seu saldo do cofrinho é: " +  cofrinhoVirtual.getSaldo() + "\n");
          println(cofrinhoVirtual.getStatus());

        } else if (operacao == 2) {
            print("Informe um valor para saque: ");
            cofrinhoVirtual.retirarDinheiro(Double.parseDouble(readln()));
//            println("Seu saldo do cofrinho agora é: " +  cofrinhoVirtual.getSaldo() + "\n");
            println(cofrinhoVirtual.getStatus());

        } else if (operacao == 3) {
            println("Você conseguiu guardar: " + cofrinhoVirtual.getSaldo());
            println(cofrinhoVirtual.getStatus());

        } else if (operacao == 4) {
            println("Seu progresso perante a meta foi de " + cofrinhoVirtual.getProgresso() + "%");
            println(cofrinhoVirtual.getStatus());

        } else {
            println("Opção inválida!\n");
        }

        // Mostra o menu novamente para a próxima operação
        println("\nInforme uma das opções abaixo: ");
        println("1 - Depositar");
        println("2 - Sacar");
        println("3 - Consultar saldo");
        println("4 - Consultar progresso");
        println("0 - Encerrar aplicação");
        operacao = Integer.parseInt(readln("Escolha uma operação: "));
    }

    println("Você saiu do cofrinho!");



}
