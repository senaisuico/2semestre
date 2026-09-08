public class Personagem {

    // Atributos
    private String nome;
    private int vida;
    private double energia;
    private double nivel;


    // Construtor
    public Personagem(String nome) {
        this.nome    = nome;
        this.vida    = 100;
        this.energia = 100;
        this.nivel   = 1;
    }


    // Getters e Setters
    public String getNome()    { return nome; }
    public void setNome(String nome)    { this.nome  = nome; }

    public int    getVida()    { return vida; }
    public double getEnergia() { return energia; }

    public double getNivel()   { return nivel; }
    public void setNivel(double nivel)  { this.nivel = nivel; }

    public String getStatus() {
        if (vida <= 0) {
            return "Personagem derrotado";
        } else {
            return "Personagem vivo";
        }
    }


    // Métodos da classe
    public void receberDano(int dano) {
        vida = vida - dano;
        if (vida < 0) {
            vida = 0;
        }
        if (vida == 0) {
            IO.println(nome + " foi derrotado!");
        }
    }

    public void descansar() {
        energia = energia + 30;
        if (energia > 100) {
            energia = 100;
        }
        IO.println(nome + " descansou! Energia atual: " + energia);
    }

    public void atacar() {
        if (energia < 20) {
            IO.println(nome + " não tem energia suficiente para atacar!");
        } else {
            energia = energia - 20;
            IO.println(nome + " atacou! Energia restante: " + energia);
        }
    }

    public void exibirStatus() {
//        IO.println("Personagem : " + nome);
        IO.println("Status     : " + getStatus());
        IO.println("Vida       : " + vida + "%");
        IO.println("Energia    : " + energia + "%");
//        IO.println("Nível      : " + (int) nivel);
    }
}