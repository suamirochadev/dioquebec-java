package SistemaMedida;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        if (sigla == "P")
            System.out.println("PEQUENO");
        else if (sigla == "M")
            System.out.println("MEDIO");
        else if (sigla == "G")
            System.out.println("GRANDE");
        else
            System.out.println("INDEFINIDO");

        }
        /* Vamos refatorar agora para o switch case
        public class SistemaMedida {
                public static void main(String[] args) {
                    String sigla = "M";

        switch (sigla) {
        case "P": {
            System.out.println("PEQUENO");
            break;
        }
        case "M":{
            System.out.println("MÉDIO");
            break;
        }
        default:
            System.ou.println("INDEFINIDO");
        }
         */
    }

