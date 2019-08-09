package exercicio3;

public class TesteRetangulo {
    public static void main(String[] args) {

        Double ladoA = 7.0;
        Double ladoB = 7.0;

        Retangulo salaAula = new Retangulo(ladoA,ladoB);
        Retangulo pisoSala = new Retangulo(0.45,0.45);
        Retangulo rodapeSala = new Retangulo(0.45,0.15);

        Double qtdPisos = salaAula.calcularArea()/ pisoSala.calcularArea();
        Double qtdRodape = salaAula.calcularPerimetro()/ rodapeSala.mostrarLadoA();
        System.out.println("Qtd pisos: " + Math.ceil(qtdPisos));
        System.out.println("Qtd rodape: " + Math.ceil(qtdRodape));


    }
}
