public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual :" + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual :" + smartTv.canal);
        

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual :" + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("NOVO STATUS : TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("NOVO STATUS : TV Ligada ? " + smartTv.ligada);


    }
}
