public class OperadoresLogicos {
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = false;
        
        // && operador e
        // se as duas condições forem verdadeiras o resultado será true
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if ((condicao1) && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }
        // || operador ou
        // se pelo menos uma condição for verdadeira o resultado será true
        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma condição é verdadeira");
        }    


        
    }
}
