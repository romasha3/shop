import java.util.ArrayList;
public class Cart  {
    private final ArrayList<Product>products=new ArrayList<>();

    public void addProduct(Product product, ProductCatalog catalog) throws ProductNotFindException {
        boolean productExists = false;
        for (Product pr : catalog.getProducts()) {
            if (pr.name.equals(product.name)) {
                productExists = true;
                break;
            }
    }
        if (!productExists) {
            throw new ProductNotFindException(product.name);
        }
        products.add(product);
        System.out.println("Product added to cart: " + product.name);
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
