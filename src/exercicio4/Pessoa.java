package exercicio4;
//https://github.com/eliass95/Exercicios-Python/blob/master/classes/ex04_Pessoa.py
public class Pessoa {
    private String nome;
    private Integer idade;
    private Double peso;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(Integer qtdAnos){
        idade += qtdAnos;
    }
    public void engordar(){
        if(imc() < 29.9 && imc() > 25.0){
            System.out.println("Sobrepeso");
        }else if(imc() > 30.0) {
            System.out.println("Obesidade");
        }
    }
    void emagrecer(){
        if(imc() < 24.9 && imc() > 18.5){
            System.out.println("Peso Normal");
        }else if(imc() < 18.5) {
            System.out.println("Abaixo do peso");
        }
    }

    void crescer(Integer idade){
        if (idade < 21){
            Double crescendo = 0.80 + (idade * 0.5);
        }
    }

    Double imc(){
        Double resultadoImc = peso/(altura * altura);
        return  resultadoImc;
    }

}
