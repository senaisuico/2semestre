public class Moto  {
    //atributos
    public String marca;
    public String modelo;
    public String cilindrada;
    public  String cor;
    public String ano;



    //construtores
    public Moto(String marca, String modelo, String cilindrada, String cor, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.cor = cor;
        this.ano = ano;
    }


    //métodos
    public String ligar() {
        return "Moto ligada!";
    }
    public String iluminar(){
        return "Farol da moto aceso";
    }
}
