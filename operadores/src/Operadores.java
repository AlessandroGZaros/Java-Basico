public class Operadores {

    public static void main(String[] args) {
        //Operadores
        //Atribuição
        String nome = "Alessandro";
        int idade = 46;
        double peso = 114.55;
        char sexo = 'M';
        boolean doadorOrgao = true;
        //Date dataNascimento = new Date();//criando um novo objeto na aplicação

        //Aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 *7) + (20 / 4);
        
        String nomeCompleto = "LINGUAGEM" + "JAVA";//concatena
        String concatenacao = "?";
        
        concatenacao = 1 + 1 + 1 +"1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 +"1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);


    }

}