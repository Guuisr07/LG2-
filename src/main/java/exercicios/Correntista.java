package exercicios;

public class Correntista {
    public String codigo;
    public String nome;
    public String email;
    public String telefone;

    public String getDadosCorrentista() {
        return nome + " " + codigo + " " + email + " " + telefone;
    }
}
