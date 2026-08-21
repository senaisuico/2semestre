import static java.lang.IO.*;
void main() {
    print("Por favor, insira um número: ");
    int numero = Integer.parseInt(readln());
    int contador = 0;
    for (int i = 1; i <= numero; i++) {
        int resto = numero % i;
        int divisor = 0;
        if (resto == 0) {
            divisor = i;
            println(divisor + " é um divisor de " + numero);
            contador++;
        }
    }
    println(" ");
    if (contador == 2) {
        println("O número " + numero + " é primo, pois só tem " + contador + " divisores");
    } else {
        println("O número " + numero + " não é primo, pois ele tem " + contador + " divisores");
    }
}