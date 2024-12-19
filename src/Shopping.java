import java.util.Scanner;
import java.util.ArrayList;

public class Shopping {
    private ProductCatalog productCatalog;
    private Cart cart;
    private Scanner scanner;

    public Shopping(ProductCatalog productCatalog, Cart cart){
        this.productCatalog=productCatalog;
        this.cart=cart;
        this.scanner=new Scanner(System.in);
    }
    public void start(){
        boolean go=true;

        while (go){
            System.out.println("\nChoose a category:");
            System.out.println("1. Clothing");
            System.out.println("2. Shoes");
            System.out.println("3. Accessories");
            System.out.println("4. Cosmetics");
            System.out.println("5. Show cart");
            System.out.println("6. Exit");

            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    selectProducts("Clothing");
                    break;
                case 2:
                    selectProducts("Shoes");
                    break;
                case 3:
                    selectProducts("Accessories");
                    break;
                case 4:
                    selectProducts("Cosmetics");
                    break;
                case 5:
                    cart.showCart();
                    break;
                case 6:
                    go= false;
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice.Please select again.");
            }
        }
    }
    private void selectProducts(String category){
        System.out.println("Available "+category+" products: ");

        ArrayList<Product> availableProducts = new ArrayList<>();

        for (Product product : productCatalog.getProducts()){
            if (category.equals("Clothing") && product instanceof Clothing){
                product.showInfo();
                availableProducts.add(product);
            } else if (category.equals("Shoes") && product instanceof Shoes){
                product.showInfo();
                availableProducts.add(product);
            } else if (category.equals("Accessories") && product instanceof Accessories) {
                product.showInfo();
                availableProducts.add(product);
            } else if (category.equals("Cosmetics") && product instanceof Cosmetics) {
                product.showInfo();
                availableProducts.add(product);
            }
        }
        System.out.println("Select a product by number: ");
        int productIndex=scanner.nextInt()-1;

        if (productIndex>=0 && productIndex<availableProducts.size()){
            try {c
                cart.addProduct(availableProducts.get(productIndex),productCatalog);
            }catch (ProductNotFindException e){
                System.out.println("Wrong product choice");
            }
        }else {
            System.out.println("Invalid product selection.");
        }

    }
}

