package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        String [] vetor = new String[3];
        for (int i = 0; i < vetor.length; i++) {
            vetor[0]= "claudeny";
            vetor[1] = "clotilde";
            vetor[2]= "José";
            System.out.println("posição :"+i+" "+vetor[i]);

        }

    }
}
