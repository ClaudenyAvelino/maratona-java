package academy.devdojo.maratonajava.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 =1;
        int num2 = 2;
        calculadora.alteraDoisNumero(num1,num2);
        System.out.println("dentro calculadora teste04");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);

    }
}
