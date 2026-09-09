import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    println("Folha de pagamento");
    println("1 - Cadastrar Gerente");
    println("2 - Cadastrar Desenvolvedor");
    println("3 - Cadastrar Vendedor");
    println("4 - Exibir holerite");
    println("0 - Sair");
    int opcao = Integer.parseInt(readln("Escolha uma opção: "));

    while (opcao != 0) {

        if (opcao == 1) {
            String nome = readln("Nome do gerente: ");
            if (nome.isBlank()) {
                println("Nome não pode estar em branco!");
            } else {
                String cpf = readln("CPF do gerente: ");
                if (cpf.isBlank()) {
                    println("CPF não pode estar em branco!");
                } else {
                    double salario = Double.parseDouble(readln("Salário do gerente: "));
                    if (salario <= 0) {
                        println("Salário deve ser maior que zero!");
                    } else {
                        funcionarios.add(new Gerente(nome, cpf, salario));
                        println("Gerente cadastrado com sucesso!");
                    }
                }
            }

        } else if (opcao == 2) {

            String nome = readln("Nome do desenvolvedor: ");
            if (nome.isBlank()) {
                println("Nome não pode estar em branco!");
            } else {
                String cpf = readln("CPF do desenvolvedor: ");
                if (cpf.isBlank()) {
                    println("CPF não pode estar em branco!");
                } else {
                    double salario = Double.parseDouble(readln("Salário do desenvolvedor: "));
                    if (salario <= 0) {
                        println("Salário deve ser maior que zero!");
                    } else {
                        funcionarios.add(new Desenvolvedor(nome, cpf, salario));
                        println("Desenvolvedor cadastrado com sucesso!");
                    }
                }
            }

        } else if (opcao == 3) {

            String nome = readln("Nome do vendedor: ");
            if (nome.isBlank()) {
                println("Nome não pode estar em branco!");
            } else {
                String cpf = readln("CPF do vendedor: ");
                if (cpf.isBlank()) {
                    println("CPF não pode estar em branco!");
                } else {
                    double salario = Double.parseDouble(readln("Salário do vendedor: "));
                    if (salario <= 0) {
                        println("Salário deve ser maior que zero!");
                    } else {
                        double totalVendido = Double.parseDouble(readln("Total vendido no mês: "));
                        if (totalVendido < 0) {
                            println("Total vendido não pode ser negativo!");
                        } else {
                            funcionarios.add(new Vendedor(nome, cpf, salario, totalVendido));
                            println("Vendedor cadastrado com sucesso!");
                        }
                    }
                }
            }

        } else if (opcao == 4) {

            if (funcionarios.isEmpty()) {
                println("Nenhum funcionário cadastrado ainda!");
            } else {
                println("\nHolerite");
                double totalFolha = 0;
                for (Funcionario f : funcionarios) {
                    f.exibirHolerite();
                    totalFolha = totalFolha + f.calcularRemuneracaoTotal();
                }
                println("Total da folha: R$ "+ totalFolha);
                println("\n");
            }

        } else {
            println("Opção inválida!");
        }

        println("\nSistema de pagamento");
        println("1 - Cadastrar Gerente");
        println("2 - Cadastrar Desenvolvedor");
        println("3 - Cadastrar Vendedor");
        println("4 - Exibir holerite");
        println("0 - Sair\n");
        opcao = Integer.parseInt(readln("Escolha uma opção: "));
    }

    println("Sistema encerrado!");
}