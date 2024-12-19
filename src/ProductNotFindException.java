public class ProductNotFindException extends Exception{
    private final String productName;

    public ProductNotFindException(String productName) {
        this.productName = productName;
    }

    public String getName(){
        return "Product " + productName + " is not in the list ";}
    }

