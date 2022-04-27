package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 /100;
        double seguindaFaixa = 35.25 /100;
        double terceiraFaixa = 49.50 /100;
        double valorImposto;

        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        }else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * seguindaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
