package exercicio3;

public class Retangulo {

    Double ladoA;
    Double ladoB;

    public Retangulo() {}

    public Retangulo(Double ladoA, Double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    void mudarLadoA(Double novoLadoA) {
        ladoA = novoLadoA;
    }
    void mudarLadoB(Double novoLadoB) {
        ladoB = novoLadoB;
    }

    Double mostrarLadoA() {
        return ladoA;
    }

    Double mostrarLadoB() {
        return ladoB;
    }

    Double calcularArea() {
        return ladoA * ladoB;
    }

    Double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }


}
