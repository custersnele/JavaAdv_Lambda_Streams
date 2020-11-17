package be.pxl.ja.oefening74;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
//    public static BigDecimal checkoutWhitDiscount(List<CartItem> items) {
//        Map<String, List<CartItem>> listMap = items.stream()
//                .collect(Collectors.groupingBy(CartItem::getNaam));
//
//        if(listMap.containsKey("shoes")) {
//            listMap.get("shoes").stream().mapToInt(CartItem::getPrice).sum()
//        }
//
//
//    }

}
