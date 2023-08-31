public class OperadorTernario {
    public static void main(String[] args) {
        //<expressao condicional> ? <caso condição seja true> : <caso condição seja false>

        int a, b;
        String resultado = "";
       
        a = 6;
        b = 6;

        //exemplo de condicional utilizando estrutura if/else
        if(a == b)
            resultado =  "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        resultado = a < b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }

}
