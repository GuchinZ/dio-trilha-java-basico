public class Usuario {
    public static void main(String[] args) {
        
        SmartTV smartTv = new SmartTV();

        smartTv.ligar();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(28);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.desligar();
    
        System.out.println("TV ligada? " + smartTv.ligada);
        
    }
}
