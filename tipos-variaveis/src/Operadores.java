public class Operadores {
    public static void main(String[] args) {
        //String nomeCompleto = "Linguagem" + "Java";
        //System.out.println(nomeCompleto);

        String concatenacao ="?";
        System.out.println("Concatenaçao");

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        System.out.println();
        System.out.println("Inversao");

        int numero = 5;

        numero = - numero;
        
        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        System.out.println();

        System.out.println("Incremento: ");
        System.out.print("Primeiro número: ");
        int numero2 = 5;
        System.out.println(numero2);
        System.out.print("Segundo número: ");
        int numero3 = 5;
        System.out.println(numero3);
        System.out.print("Terceiro número: ");
        int numero4 = 5;
        System.out.println(numero4);
        System.out.println();
        //x repetição
        //numero = numero + 1;
        int numero5 = 5;
        int numero6 = 5;
        //ocorre incremento após a impressão
        System.out.println("Incremento depois a impressao: ");
        System.out.println(numero2++);
        System.out.println(numero2);
        System.out.println();

        //ocorre o incremento previamente a impressão
        System.out.println("Incremento antes da impressao: ");
        System.out.println(++numero3);
        System.out.println(numero3);
        System.out.println();

        System.out.println("Decremento depois da impressao:");
        System.out.println(numero5--);
        System.out.println(numero5);
        System.out.println();

        System.out.println("Decremento antes da impressao:");
        System.out.println(--numero6);
        System.out.println(numero6);

        boolean variavel = true;
        System.out.println();
        System.out.println("Inversao booleana: ");
        System.out.print("Original: ");
        System.err.println(variavel);
        System.out.print("Invertido: ");
        System.out.println(!variavel);
        System.out.println();

        System.out.println("Condiçao ternária: ");
        int a, b;

        //originalemente a valia 5 e b valia 6
        a = 6;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";

        /*if(a==b){
            resultado = "Verdadeiro";
        }else{
            resultado = "Falso";
        }*/
        System.out.println(resultado);

        System.out.println();
        System.out.println("Operadores relacionais: ");
        System.out.println("==, !=, <, <=, >, >=");
        System.out.println("==: compara se possuem o mesmo valor;");
        System.out.println("!=: compara se os valores são diferentes;");
        System.out.println("<: compara se o primeiro valor é menor que o segundo;");
        System.out.println("<=: compara se o primeiro valor é menor ou igual o segundo;");
        System.out.println(">: compara se o primeiro valor é maior que o segundo");
        System.out.println(">=: compara se o primeiro valor é maior ou igual o segundo");
        System.out.println();

        int numero1 = 1;
        int numer0 = 2;

        boolean simNao = numero1 == numer0;

        System.out.println("NumeroUm é igual a numeroDois? "+ simNao);
        
        simNao = numero1 != numer0;

        System.out.println("NumeroUm é difente a numeroDois? "+ simNao);

        simNao = numero1 > numer0;

        System.out.println("NumeroUm é maior que numeroDois? "+ simNao);

        simNao = numero1 >= numer0;

        System.out.println("NumeroUm é maior ou igual a numeroDois? "+ simNao);

        simNao = numero1 < numer0;

        System.out.println("NumeroUm é menor que numeroDois? "+ simNao);

        simNao = numero1 <= numer0;

        System.out.println("NumeroUm é menor ou igual a numeroDois? "+ simNao);

        System.out.println();
        System.out.println("Outro Exemplo: ");
        if(numero1 > numero2)
	System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
	        System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
	        System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
	        System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
	        System.out.println("Numero 1 é diferente de numero 2");

        System.out.println("Também funcional com String");

        System.out.println();
        System.out.println("Operadores lógicos: ");
        System.out.println("&&, ||:");
        System.out.println("&&: E;");
        System.out.println("||: OU;");

        boolean condicao1 = true;
        boolean condicao2 = false;
        boolean condicao3 = true;
        boolean condicao4 = true;
        System.out.println();

        if(condicao3 && condicao4){
            System.out.println("As duas condições sao verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condicões é verdadeira");
        }

        System.out.println("fim");
    }
}
