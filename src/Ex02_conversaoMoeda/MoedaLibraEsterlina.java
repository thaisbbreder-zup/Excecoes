package Ex02_conversaoMoeda;

import java.math.BigDecimal;

public class MoedaLibraEsterlina extends Moeda {
    public MoedaLibraEsterlina() {
        super("Libra Esterlina", new BigDecimal("7.50"));
    }

    @Override
    public BigDecimal converterReal(BigDecimal valor) {
        return valor.multiply(getTaxaConversao());
    }

}
