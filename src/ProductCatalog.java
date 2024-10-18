import java.util.ArrayList;
public class ProductCatalog{
    private final ArrayList<Product> products=new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }
    public ArrayList<Product>getProducts(){
        return products;
    }
}



