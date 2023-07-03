package Ex02_conversaoMoeda;

import java.math.BigDecimal;

public class MoedaDolarAmericano extends Moeda {
    public MoedaDolarAmericano() {
        super("Dólar americano", new BigDecimal("5.25"));
    }

    @Override
    public BigDecimal converterReal(BigDecimal valor) {
        return valor.multiply(getTaxaConversao());
    }

}
