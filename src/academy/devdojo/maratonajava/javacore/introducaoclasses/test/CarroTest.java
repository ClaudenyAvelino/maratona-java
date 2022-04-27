package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carroPopular = new Carro();
        carroPopular.nome = "celta";
        carroPopular.modelo = "Popular";
        carroPopular.ano = 2022;

        Carro carroSedam = new Carro();
        carroSedam.nome = "Chevrolet Joy Plus";
        carroSedam.modelo = "Sedam";
        carroSedam.ano = 2022;

        System.out.println("----Carro Popular----");
        System.out.println(carroPopular.nome+"\nModelo :"+carroPopular.modelo+"\nAno :"+carroPopular.ano);
        System.out.println("----Carro Sedam----");
        System.out.println(carroSedam.nome+"\nModelo "+carroSedam.modelo+"\nAno "+carroSedam.ano);
    }
}
