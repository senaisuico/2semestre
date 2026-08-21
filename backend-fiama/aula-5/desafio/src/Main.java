import static java.lang.IO.*;


void main() {

    String nome = readln("Favor informar o nome do bichinho!: ");
    BichinhoVirtual bichoVirtual = new BichinhoVirtual(nome);{
       //println(bichoVirtual.getHumor()); //Por padrão vai pegar os dados declarados no constutor BichoVirtual - dentro do setHumor

        //Altera os valore impressos na linha de cima
       // String nome = readln("Favor informar o nome do bichinho!: ");

        String fome = readln("Informe o tamanho da fome do bicho: ");
        int qtde_fome = Integer.parseInt(fome);
        String energia = readln("Informe um valor para a energia: ");
        int qtde_energia = Integer.parseInt(fome);

        bichoVirtual.setFome(qtde_fome);
        bichoVirtual.setEnergia(qtde_energia);
        println("O nome do bichinho é: " + bichoVirtual.getNome());
        println("A fome dele é: " + bichoVirtual.getFome());
        println("A energia dele é: " + bichoVirtual.getEnergia());
        println("O humor do " + bichoVirtual.getNome() + " com base na fome e humor dele é: " +  bichoVirtual.getHumor());
    }
}
