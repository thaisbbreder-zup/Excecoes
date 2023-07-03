package Ex02_conversaoMoeda;

import java.math.BigDecimal;

public class MoedaDolarCanadense extends Moeda {
    public MoedaDolarCanadense() {
        super("Dólar canadense", new BigDecimal("4.15"));
    }

    @Override
    public BigDecimal converterReal(BigDecimal valor) {
        return valor.multiply(getTaxaConversao());
    }

}