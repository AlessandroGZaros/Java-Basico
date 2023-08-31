public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSocicitado = 17;

        if(valorSocicitado < saldo){
            saldo = saldo - valorSocicitado;
            System.out.println("Novo saldo: " + saldo);
        }
            
        else
            System.out.println("Saldo Insuficiente!");
        
        
    }
}
