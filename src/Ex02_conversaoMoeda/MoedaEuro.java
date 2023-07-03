package Ex02_conversaoMoeda;

import java.math.BigDecimal;

public class MoedaEuro extends Moeda {
    public MoedaEuro() {
        super("Euro", new BigDecimal("6.15"));
    }

    @Override
    public BigDecimal converterReal(BigDecimal valor) {
        return valor.multiply(getTaxaConversao());
    }

}