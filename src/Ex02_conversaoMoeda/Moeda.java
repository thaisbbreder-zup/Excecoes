package Ex02_conversaoMoeda;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Moeda {
    private String nome;
    private BigDecimal taxaConversao;

    private Date dataConversao = new Date();

    public Moeda(String nome, BigDecimal taxaConversao) {
        this.nome = nome;
        this.taxaConversao = taxaConversao;
        this.dataConversao = new Date();
    }

    public abstract BigDecimal converterReal(BigDecimal valor);

    public String getNome() {
        return nome;
    }

    public Date getDataConversao() {
        return dataConversao;
    }

    protected BigDecimal getTaxaConversao() {
        return taxaConversao;
    }
}

