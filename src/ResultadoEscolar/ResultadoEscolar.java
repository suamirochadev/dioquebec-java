package ResultadoEscolar;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7) //essa condição precisa me retornar true
            System.out.println("Aprovado");

        else if (nota >=5 && nota <=7)
            System.out.println("Prova Recuperação");

        else if (nota >=5 && nota <=7) //essa expressão sempre tem que retornar ou true ou false
            System.out.println("Prova Recuperação");

        else
            System.out.println("Reprovado");
        /*
        Outra maneira de fazer isso de uma forma mais simples:
        int nota = 7;
        String resultado = nota >= 7 (? "Aprovado" : "Reprovado";) = Entre parenteses um exemplo de condição ternária
        Condição ternária é uma forma de otimizar o codigo.
        System.out.println(resultado);
         */
    }
}
