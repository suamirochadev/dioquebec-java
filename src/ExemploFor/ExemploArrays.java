package ExemploFor;

public class ExemploArrays {
    public static void  main(String[] args){
        // wm Arrays o indice inicia em ZERO, por isso determinamos que a variavel iniciasse em zero;
        String alunos [] = {"FEIPE", "JONAS", "JULIA","MARCOS"};

        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno do indice x=" + x + " é " + alunos[x]);
        }
    }
}
