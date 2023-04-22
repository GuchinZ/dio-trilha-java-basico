/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Gustavo Schimith
* @version 1.3
* @since   22/04/2023
*/
public class Calculadora {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
    public int multiplicar(int numeroUm, int numeroDois){
        return numeroUm * numeroDois;
    }
    public int dividir(int numeroUm, int numeroDois){
        return numeroUm / numeroDois;
    }
}