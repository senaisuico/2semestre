import static java.lang.IO.*;

void main() {

    String nome = readln("Informe o nome do seu personagem: ");
    Personagem personagem = new Personagem(nome);

    println("\nPersonagem criado com sucesso!");
    personagem.exibirStatus();

    println("Escolha uma ação:");
    println("1 - Atacar");
    println("2 - Descansar");
    println("3 - Receber dano");
    println("4 - Ver status");
    println("0 - Sair");

    int acao = Integer.parseInt(readln("Informe uma ação: "));

    while (acao != 0) {

        if (acao == 1) {
            personagem.atacar();

        } else if (acao == 2) {
            personagem.descansar();

        } else if (acao == 3) {
            int dano = Integer.parseInt(readln("Informe o valor do dano recebido: "));
            personagem.receberDano(dano);

        } else if (acao == 4) {
            personagem.exibirStatus();

        } else {
            println("Opção inválida!");
        }

        if (personagem.getVida() <= 0) {
            personagem.exibirStatus();
            println("Fim do jogo!");
            break;
        }

        println("\nEscolha uma ação:");
        println("1 - Atacar");
        println("2 - Descansar");
        println("3 - Receber dano");
        println("4 - Ver status");
        println("0 - Sair");
        acao = Integer.parseInt(readln("Informe uma ação: "));
    }

    println("Jogo encerrado!");
}