package assignment.SuperStore;


import java.util.List;

public class Customers extends User{
    private Cart shoppingCart;
    private List<Billing> info;


    public Customers() {

    }
    public Cart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Cart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Billing> getInfo() {
        return info;
    }

    public void setInfo(List<Billing> info) {
        this.info = info;
    }
}
