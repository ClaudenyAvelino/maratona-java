package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {

    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive","TV",12,"AÇÃO");

        anime.imprime();
    }

}