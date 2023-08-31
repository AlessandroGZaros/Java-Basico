public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Alessandro";
        String nomeDois = new String("Alessandro");

        System.out.println(nomeUm.equals(nomeDois));// equals compara conteúdos
        
        System.out.println(nomeUm == nomeDois); // entende que são objetos diferentes
        
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao;

        simNao = numero1 == numero2;
        System.out.println("numero1 é igual ao numero2  \n" + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2  " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numero1 é menor que o numero2  " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numero1 é menor ou igual ao numero2  " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior que numero2  " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numero1 é maior ou igual ao numero2  " + simNao);
    }
}
