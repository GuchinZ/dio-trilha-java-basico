package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args) {
        String [] candidatos = {"Felipe","Márcia","Júlia","Augusto","Monica"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean atendeu = false;
        boolean continuarTentando = true;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado");
            }
        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu){
            System.out.println("Conseguimos contato com o/a candidato/a " + candidato + " em " + tentativasRealizadas + " tentativas\n");
        }else{
            System.out.println("Nao conseguimos contato com o/a candidato/a " + candidato + " \nNúmero de tentativas excedido" + "\n");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Márcia","Júlia","Augusto","Monica"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento:");
        
        for(int i = 0;i<candidatos.length;i++){
            System.out.println("O candidato de n° " + (i+1) + " é " + candidatos[i]);
        }
        System.out.println();
        System.out.println("Forma abreviada:");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }



    static void selecionaCandidatos(){
        String [] candidatos = {"Felipe","Márcia","Júlia","Augusto","Monica","Mirela","Daniela","José","Paulo"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato" + candidato + " solicitou este valor de salário" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
        };
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

}