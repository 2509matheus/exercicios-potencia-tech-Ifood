public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTV = new SmartTv();

        System.out.println("Tv Ligada? "+smartTV.ligada);
        System.out.println("Canal atual : "+smartTV.canal);
        System.out.println("Volume atual : "+smartTV.volume);


        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarCanal();
        System.out.println("Novo status Tv Ligada? "+smartTV.ligada);
        System.out.println("Canal atual : "+smartTV.canal);
        System.out.println("Volume atual : "+smartTV.volume);

        smartTV.mudarCanal(15);
        System.out.println("Canal atual : "+smartTV.canal);
    }
}