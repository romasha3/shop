import java.util.ArrayList;
public class Cart  {
    private ArrayList<Product>products=new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product added to cart: "+product.name);
    }
    public void showCart(){
        if (products.isEmpty()) {
            System.out.println("Cart in empty.");
            return;
        }
        System.out.println("Items in your cart: ");
        for (Product product:products){
            product.showInfo();
        }
    }
}
