package exercicio1;

public class TesteBola {
    public static void main(String[] args) {


        Bola bolaFutbol = new Bola();

        bolaFutbol.cor = "azul";
        bolaFutbol.circunferencia = 0.5;
        bolaFutbol.material = "couro";

        System.out.println(bolaFutbol.mostrarCor());

        bolaFutbol.trocaCor("vermelho");

        System.out.println(bolaFutbol.mostrarCor());

    }
}
