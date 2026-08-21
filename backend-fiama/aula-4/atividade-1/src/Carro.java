public class Carro {

    //atributos
    public String marca;
    public String modelo;
    public String versao;
    public String num_portas; //declaramos o tipo como String porque não iremos efetuar cálculo com esse valor. Por isso, tratamos como String.
    public String num_passageiros;

    //construtores
    public Carro(String marca, String modelo, String versao, String num_portas, String num_passageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.versao = versao;
        this.num_portas = num_portas;
        this.num_passageiros = num_passageiros;
    }

    //quando não é necessário chamar todos os métodos e atributos do objeto, podemos criar apenas com o que é necessário
    public Carro(String marca, String modelo, String num_portas){
        this.marca = marca;
        this.modelo = modelo;
        this.num_portas = num_portas;
    }



    //métodos
    public String acelar(){
        return "Estou acelerando o carro!";
    }

    public String frear(){
        return "Freio do carro acionado";
    }



}
