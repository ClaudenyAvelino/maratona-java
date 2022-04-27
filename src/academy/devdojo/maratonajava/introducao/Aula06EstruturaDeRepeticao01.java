package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        int cout =0;
       while (cout < 10){
           System.out.print(cout+" ");
           cout++;
       }
       do {
           System.out.println("dentro do do- while");
       }while (cout < 10);

       for (int i=0;i < 10 ; i++ ){
           System.out.print("for "+i);
       }
    }
}
