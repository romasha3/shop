public class Main {
    private static final ProductCatalog productCatalog = new ProductCatalog();

    public static void main(String[] args) {
        initializeProducts();

        Cart cart = new Cart();

        Shopping shopping = new Shopping(productCatalog, cart);
        shopping.start();
    }

    private static void initializeProducts() {
        productCatalog.addProduct(new Clothing(500, "T-Shirt", "M", "Cotton"));
        productCatalog.addProduct(new Clothing(500, "T-Shirt", "S", "Cotton"));
        productCatalog.addProduct(new Clothing(500, "T-Shirt", "L", "Cotton"));
        productCatalog.addProduct(new Clothing(800, "Pant", "M", "Jeans"));
        productCatalog.addProduct(new Clothing(900, "Jacket", "L", "Leather"));

        productCatalog.addProduct(new Shoes(800, "Sneakers", 42));
        productCatalog.addProduct(new Shoes(750, "Boots", 40));
        productCatalog.addProduct(new Shoes(600, "Sandals", 39));

        productCatalog.addProduct(new Accessories(300, "Belt", "Leather"));
        productCatalog.addProduct(new Accessories(150, "Cap", "Cotton"));
        productCatalog.addProduct(new Accessories(200, "Scarf", "Silk"));

        productCatalog.addProduct(new Cosmetics(90, "Lipstick", 2025, "Aloe Vera,Beeswax"));
        productCatalog.addProduct(new Cosmetics(50, "Cream", 2024, "Water, Glycerin, Stearic Acid, Natural Oils"));
        productCatalog.addProduct(new Cosmetics(250, "Perfume", 2023, "Floral"));
    }
}