import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
         BigDecimal comparableValue = new BigDecimal("100000");
        if (amount.compareTo(comparableValue) < 0) { // first value is greater
            return amount.multiply(new BigDecimal("0.10"));
        } else { // second value is greater or equal
            return amount.multiply(new BigDecimal("0.15"));
        }
    }
}