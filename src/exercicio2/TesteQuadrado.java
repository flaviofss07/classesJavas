package exercicio2;

public class TesteQuadrado {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();

        quadrado.lado = 10.0;

        System.out.println(quadrado.mostraLado());

        quadrado.lado = 12.0;

        System.out.println(" Lado: " + quadrado.mostraLado());
        System.out.println(" Área: " + quadrado.calcularArea());
    }
}
