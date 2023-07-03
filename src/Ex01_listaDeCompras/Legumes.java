package Ex01_listaDeCompras;

public class Legumes implements Alimentos{
    private String nome;
    private double quantidade;

    public Legumes(String nome, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Legumes() {

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
