package Ex01_listaDeCompras;

public class Verdura implements Alimentos{
    private String nome;
    private double quantidade;

    public Verdura(String nome, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;

    }

    public Verdura() {

    }

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public double getQuantidade() {
        return quantidade;
    }
    @Override
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }


}
