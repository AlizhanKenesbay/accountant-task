import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal(43000), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal(5000), new VATaxType(), taxService),
                new Bill(new BigDecimal(100500), new ProgressiveTaxType(), taxService),
        };

        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}