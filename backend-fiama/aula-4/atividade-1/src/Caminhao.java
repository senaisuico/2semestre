public class Caminhao {
    //atributos
    public String marca;
    public String modelo;
    public String ano;
    public String capacidade_carga;
    public String cor;

    //contrutores
    public Caminhao(String marca, String modelo, String ano, String capacidade_carga, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade_carga = capacidade_carga;
        this.cor = cor;
    }

    //métodos
    public String transportar (){
        return "Na rota de entrega para o destinatário";
    }

    public String ligar(){
        return "Caminhão ligado";
    }


}