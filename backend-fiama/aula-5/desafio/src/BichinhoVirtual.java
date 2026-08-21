public class BichinhoVirtual {
    //Atributos
    private String nome;
    private int fome;
    private int energia;
    private String humor;

    //Construtores
    //Como os atributos são privados, não há necessidade de criar os construtores. Mas eu criei para efeito de treino
    public BichinhoVirtual(String nome) {
        this.nome = nome;
        energia = 50;
        fome = 50;
        humor = "Neutro";
    }

    public BichinhoVirtual() {

    }
    // Acesssores Geters e Seters
    //Geters
    public String getNome() {
        return nome;
    }


    public int getFome() {return fome;}
    public int getEnergia() {return energia;}

    public String getHumor() {
        setHumor();
        return humor;
    }



    //Seters
    public void setNome(String nome) {this.nome = nome;}
    public void setFome(int fome) {
       if (fome >= 0 && fome <= 100){
           this.fome = fome;
       }
    }
    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100) {this.energia = energia;}
    }

    private void setHumor() {
        if (energia < 50 && fome < 50) humor = "Faminto e triste";
        else if (energia < 50 && fome > 50) humor = "Sem fome, mas triste";
        else if (energia > 50 && fome < 50) humor = "Com fome, mas feliz";
        else humor = "Feliz e de pança cheia";
    }





    //Métodos
    public String passear() {
        return "Pet saiu para passeio";
    }
    public String dormir() {
        return "Pet está dormindo";
    }
}
