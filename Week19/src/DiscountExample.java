import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jimjohn_thornton on 02/03/15.
 */
public class DiscountExample {
    public static void main(String[] args) {
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"), new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("120"));
        //greater than 20 gets a 10% discount

        BigDecimal totalOfDiscountPrices = BigDecimal.ZERO;

        for (BigDecimal price : prices) {
            if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
                totalOfDiscountPrices = totalOfDiscountPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
            }
        }
        //final

        System.out.println("total of discounted prices = " + totalOfDiscountPrices);
    }
}
