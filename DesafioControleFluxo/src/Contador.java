//O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes 
//dois números você deverá obter a quantidade de interações (for)  e realizar a impressão no console(system.
//out.println) dos números incrementados.

import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);;

        try {
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        contar(parametroUm, parametroDois);
        
        
        
        }catch (ParametrosInvalidosException e) {
            System.out.println("O Primeiro parâmetro não pode ser maior do que o Segundo parâmetro.");
        }
    }

        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if(parametroUm > parametroDois){
                throw new ParametrosInvalidosException();
            }
            else{
                int contagem = parametroDois - parametroUm;
                for(int i = parametroUm; i <= parametroDois ; i++){
                    System.out.println("Imprimindo o número " + (i + 1));
               }System.out.println("Foram imprimidos " + contagem + " números");
            }
        }
    }




    

