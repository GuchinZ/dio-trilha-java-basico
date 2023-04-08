public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos

        String meuNome = "Gustavo Schimith";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        
        //para que isso seja possível, deve-se adicionar o casting "(short)" para afirmar que o desenvolvedor está ciente do que pode ocorrer com a variável
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        //final não permite que o valor da variável seja alterado e o nome da variável, por convenção, deve ser escrito em caixa alta
        final double VALOR_DE_PI = 3.14;
    }
}
