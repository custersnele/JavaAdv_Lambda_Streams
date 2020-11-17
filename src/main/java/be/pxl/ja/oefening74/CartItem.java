package be.pxl.ja.oefening74;

import java.math.BigDecimal;

public class CartItem {

    String naam;
    BigDecimal price;

    public CartItem(String naam, BigDecimal price) {
        this.naam = naam;
        this.price = price;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
