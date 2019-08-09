package exercicio2;

public class Quadrado {

     public Double lado;

     public void mudarLado(Double novoLado){
        lado = novoLado;
     }

     public Double mostraLado(){
         return lado;
     }

     public Double calcularArea(){
        Double valorArea = lado * lado;
        return valorArea;
     }

}
