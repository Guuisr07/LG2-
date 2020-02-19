import exemplos.Aluno;
import exercicios.Correntista;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "João";
        a1.sobrenome = "da Silva";
        a1.telefone = "11-1111111";

        Aluno a2 = new Aluno();
        a2.nome = "Maria";
        a2.sobrenome = "do Santos";
        a2.telefone = "12-121212";

        Correntista c1 = new Correntista();
        c1.codigo = "5459";
        c1.nome = "Guilherme";
        c1.email = "guisantana0204@gmail.com";
        c1.telefone = "11-112234";

        System.out.println(c1.nome);
        System.out.println(c1.codigo);
        System.out.println(c1.getDadosCorrentista());

        System.out.println(a1.nome);
        System.out.println(a1.sobrenome);
        //System.out.println(a1.nome + " " + a1.sobrenome);
        System.out.println(a1.getNomeCompleto());

        System.out.println(a2.nome);
        System.out.println(a2.sobrenome);
        //System.out.println(a2.nome + " " + a2.sobrenome);
        System.out.println(a2.getNomeCompleto());


        System.out.println(calcularAreaQuadrado(15.0));
        System.out.println(calcularPerimetroQuadrado(15.0));


    }

    public static Double calcularAreaQuadrado(Double lado) {
        return lado * lado;
    }

    public static Double calcularPerimetroQuadrado(Double lado) {
        return 4 * lado;
    }
}
