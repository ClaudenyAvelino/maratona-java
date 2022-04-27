package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            Double valorDaParcela = valorTotal / parcela;
            if (valorDaParcela < 1000) {
                break;
            }
            if (valorDaParcela % 2 == 0) {
                System.out.println("Parcela " + parcela + " R$ " + valorDaParcela);
            }


            System.out.println("Parcela " + parcela + " R$ " + valorDaParcela);
        }

    }
}
