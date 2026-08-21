public class Bicicleta {
    public String fabricante;
    public String modelo;
    public String aro;
    public String categoria;
    public int marchas;

    public Bicicleta (String fabricante, String modelo, String aro, String categoria, int marchas){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.aro = aro;
        this.categoria = categoria;
        this.marchas = marchas;
    }

    public String pedalar(){
        return "Bicicleta em movimento por pedaladas";
    }

    public String executar(){
        return "Manobra RL executada";
    }
    Bicicleta bicicleta= new Bicicleta("Caloi");



}
