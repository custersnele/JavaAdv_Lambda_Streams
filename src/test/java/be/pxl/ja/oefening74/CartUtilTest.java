package be.pxl.ja.oefening74;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartUtilTest {

    @Test
    void checkoutShouldReturnTheSumOfPriceOfAllItems() {
        List<CartItem> cartItems = Arrays.asList(
                new CartItem("hat", new BigDecimal(5)),
                new CartItem("shoes", new BigDecimal(10))
        );

        assertEquals(BigDecimal.valueOf(15), CartUtil.checkout(cartItems));
    }

    @Test
    void checkoutShouldReturnTheSumOfPriceOfAllItemsWithDiscount() {

    }
}