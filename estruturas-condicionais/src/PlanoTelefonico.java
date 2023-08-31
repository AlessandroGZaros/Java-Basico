//BASIC  100 minutos de ligação
//MIDIA  100 minutos de ligação + Wats e Instagram grátis
//TURBO  100 minutos de ligação + Wats e Instagram grátis + 5G de Youtube

public class PlanoTelefonico {
    public static void main(String[] args) {
        String plano = "T"; // B / M / T

        switch (plano) {
            case "T":   // sem o break ele vai executar as outras condições
                System.out.println("5G de Youtube");
            
            case "M":
                System.out.println("Wats e Instagram grátis");
                
            case "B":
                System.out.println("100 minutos de ligação");
                break;
        
            default:
                break;
        }
    }
}
