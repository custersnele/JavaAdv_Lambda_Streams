package be.pxl.ja.oefening74;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CartUtil {

    public static BigDecimal checkout(List<CartItem> items) {
        return items.stream()
                .map(CartItem::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Sum up all prices and take in account discounts
     * Discount 1 : total price for 'shoes' more than 100 -> 20% discount on total price of shoes
     * Discount 2 : more than 2 hats AND total price of 'hat' more than 50 -> discount of -10
     * @param items
     * @return
     */
    public static BigDecimal checkoutWhitDiscount(List<CartItem> items) {
        Map<String, Double> itemTotalsMap = items.stream()
                .collect(
                        Collectors.groupingBy(
                                CartItem::getNaam,
                                Collectors.summingDouble(c -> c.getPrice().doubleValue())));

        // shoes discount
        itemTotalsMap.computeIfPresent("shoes", (key, value) -> {
            if(value>=100) {
                return value - (value*0.2);
            } else {
                return value;
            }
        });

        // hat discount
        itemTotalsMap.computeIfPresent("hat", (key, value) -> {
            if(items.stream()
                    .filter(c -> c.getNaam().equals("hat"))
                    .count() >= 2) {
                return value - 10;
            } else {
                return value;
            }
        });

        return BigDecimal.valueOf(itemTotalsMap.values().stream().mapToDouble(Double::doubleValue).sum());

    }

}
