package academy.devdojo.maratonajava.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calculadora test01");

        calculadora.subtraiDoaisNumeros();
    }

}
