package ifs.estrutura.vetores.Inicio.test;

import ifs.estrutura.vetores.Inicio.Vetor;

public class Aula05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

            vetor.adiciona("elemento1 ");
            vetor.adiciona("elemento2 ");
            vetor.adiciona("elemento3 ");

            System.out.println(vetor.busca(2));
        }
    }

