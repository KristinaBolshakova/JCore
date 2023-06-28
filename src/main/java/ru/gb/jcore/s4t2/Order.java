package main.java.ru.gb.jcore.s4t2;

public class Order {

    private Customer customer;
    private Product product;
    private int amount;
    private float totalPrice;


    public Order(Customer customer, Product product, int amount, float totalPrice) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
