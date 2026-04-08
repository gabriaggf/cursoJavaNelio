package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;


    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int productsToAdd) {
        this.quantity += productsToAdd;
        System.out.println("Updated data: " + name + ", " + quantity + " units, Total: $ " + totalValueInStock());

    }
    public void removeProducts(int productsToRemove) {
        this.quantity += productsToRemove;
        System.out.println("Updated data: " + name + ", " + quantity + " units, Total: $ " + totalValueInStock());

    }


}
