package br.com.dio.JAVAnapratica;

/** Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public class Calculadora {
    // public = definir a visibilidade ; static = é o tipo, o modificador do método; o retorno dele ( no caso ele não tem retorno, é o void); e os seus paramentros dentro dos parenteses.
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }
    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }
    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("A multiplicaçao de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }
    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }

}
