package POO.Herança.exercicio2;

public class RodarAplicação {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        //Aqui ocorre o UPCAST diretamente para o funcionário (upcast implicito)
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario();
        //Aqui temos um exemplo de Downcast, mas com erro pois o que está dentro de funcionário é o vendedor e n o contrário, por isso recomenda-se que se seja evitado.
        Vendedor vendedor_ =(Vendedor) new Funcionario();
    }
}
