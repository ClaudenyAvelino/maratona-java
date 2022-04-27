package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivos {
    public static void main(String[] args) {
        String nome = " Claudeny";
        String endereco = "Rua 1";
        double salario = 2500;
        String data = "31/03/2022";
        String relatorio = ("Eu <"+nome+">, morando no endereço <"+endereco+ ">,\n" +
                " confirmo que recebi o salário de R$ "+salario+", na data "+data);

        System.out.println(relatorio);
    }
}
